package model;

public class OrderItem {
    private ClothingItem item;
    private int quantity;
    private double purchasePrice;

    public OrderItem(ClothingItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
        this.purchasePrice = item.getPrice();
    }
    public ClothingItem getItem(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPurchasePrice(){
        return purchasePrice;
    }
    public double getTotalPrice(){
        return purchasePrice * quantity;
    }

}
