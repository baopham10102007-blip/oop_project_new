package model;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(ClothingItem item, int quantity) {
        for (CartItem ci : items) {
            if (ci.getItem().getId().equals(item.getId())) {
                ci.setQuantity(ci.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(item, quantity));
    }

    public void removeItem(int itemId) {
        items.removeIf(ci -> ci.getItem().getId().equals(itemId));

    }

    public void updateQuantity(int itemId, int quantity) {
        for (CartItem ci : items) {
            if (ci.getItem().getId().equals(itemId)) {
                if (quantity <= 0) {
                    removeItem(itemId);
                } else {
                    ci.setQuantity(quantity);
                }
                return;
            }
        }
    }

    public void clear() {
        items.clear();
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }
}