package model;

public class CartItem {
    private ClothingItem item;
    private int quantity;

    public CartItem (ClothingItem item, int quantity){
        if (quantity <= 0) throw new IllegalArgumentException("Số lượng phải lớn hơn 0");
        this.item = item;
        this.quantity = quantity;
    }

    public ClothingItem getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Số lượng phải lớn hơn 0");
        this.quantity = quantity;
    }
    public double getTotalPrice(){
        return item.getPrice()*quantity;

    }
}
