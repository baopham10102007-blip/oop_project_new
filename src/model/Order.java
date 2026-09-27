package model;
import java.util.ArrayList;
import java.util.List;
import enums.OrderStatus;
public class Order {
    private String orderId;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus status = OrderStatus.PENDING;
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }
    public void addItem (ClothingItem item, int quantity){
        items.add(new OrderItem(item, quantity));
    }
    public double calculateSubtotal(){
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();

    }
    public double calculateTotal(){
        double subtotal = calculateSubtotal();
        double discount = 0.0;
        if (customer != null) {
            discount = subtotal * customer.getDiscountRate();
        }
        return subtotal - discount;
    }
    public String getOrderId() {
        return orderId;
    }
    public Customer getCustomer(){
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
