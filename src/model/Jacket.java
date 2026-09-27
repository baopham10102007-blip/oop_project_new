package model;

import discount.Promotional;
import discount.Returnable;
import enums.Color;
import enums.Size;

public class Jacket extends ClothingItem implements Returnable, Promotional {

    public Jacket(String id, String name, double price, int quantity, Size size, Color color) {
        super(id, name, price, quantity, size, color);
    }

    @Override
    public boolean canReturn(int daysSincePurchase) {
        return daysSincePurchase <= 14; // Áo khoác hỗ trợ đổi trả trong 14 ngày
    }

    @Override
    public double calculateReturnFee(int daysSincePurchase) {
        return daysSincePurchase > 5 ? getPrice() * 0.10 : 0.0;
    }

    @Override
    public double getPromotionDiscount() {
        return getPrice() * 0.12;
    }

    @Override
    public boolean isEligibleForPromo() {
        return true;
    }

    @Override
    public void displayInfo() {
        System.out.printf("  [Áo khoác] ID: %-6s | Tên: %-20s | Giá: %,10.0f VNĐ | Tồn: %-3d | Size: %-3s | Màu: %s\n",
                getId(), getName(), getPrice(), getQuantity(), getSize(), getColor());
    }
}
