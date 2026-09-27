package model;

import enums.Color;
import enums.Size;

public class Dress extends ClothingItem {

    public Dress(String id, String name, double price, int quantity, Size size, Color color) {
        super(id, name, price, quantity, size, color);
    }

    @Override
    public void displayInfo() {
        System.out.printf("  [Đầm/Váy liền] ID: %-6s | Tên: %-20s | Giá: %,10.0f VNĐ | Tồn: %-3d | Size: %-3s | Màu: %s\n",
                getId(), getName(), getPrice(), getQuantity(), getSize(), getColor());
    }
}
