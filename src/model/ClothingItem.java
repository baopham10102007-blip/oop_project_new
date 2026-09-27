package model;

import enums.Color;
import enums.Size;

public abstract class ClothingItem {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private Size size;
    private Color color;

    public ClothingItem(String id, String name, double price, int quantity, Size size, Color color) {
        if (price <= 0) throw new IllegalArgumentException("Giá phải lớn hơn 0");
        if (quantity < 0) throw new IllegalArgumentException("Số lượng không được âm");
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public Size getSize() { return size; }
    public Color getColor() { return color; }

    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Giá phải lớn hơn 0");
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Số lượng không được âm");
        this.quantity = quantity;
    }

    public abstract void displayInfo();
}
