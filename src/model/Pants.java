package model;

import discount.Promotional;
import discount.Returnable;
import enums.Color;
import enums.Size;

public class Pants extends ClothingItem implements Returnable, Promotional {

    public Pants(String id, String name, double price, int quantity, Size size, Color color) {
        super(id, name, price, quantity, size, color);
    }

    @Override
    public boolean canReturn(int daysSincePurchase) {
        return daysSincePurchase <= 7;
    }

    @Override
    public double calculateReturnFee(int daysSincePurchase) {
        return daysSincePurchase > 3 ? getPrice() * 0.05 : 0.0;
    }

    @Override
    public double getPromotionDiscount() {
        return getPrice() * 0.08;
    }

    @Override
    public boolean isEligibleForPromo() {
        return true;
    }

    @Override
    public void displayInfo() {
        System.out.printf("  [Quần] ID: %-6s | Tên: %-20s | Giá: %,10.0f VNĐ | Tồn: %-3d | Size: %-3s | Màu: %s\n",
                getId(), getName(), getPrice(), getQuantity(), getSize(), getColor());
    }
}
