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

    public void removeItem(String itemId) {
        items.removeIf(ci -> ci.getItem().getId().equals(itemId));

    }

    public void updateQuantity(String itemId, int quantity) {
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
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng hiện đang trống.");
            return;
        }

        System.out.println("========================= GIỎ HÀNG =========================");
        System.out.printf("%-10s %-20s %-12s %-10s %-15s\n",
                "Mã SP", "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền");
        System.out.println("------------------------------------------------------------");

        for (CartItem ci : items) {
            System.out.printf("%-10s %-20s %-12.2f %-10d %-15.2f\n",
                    ci.getItem().getId(),
                    ci.getItem().getName(),
                    ci.getItem().getPrice(),
                    ci.getQuantity(),
                    ci.getTotalPrice());
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("TỔNG TIỀN PHẢI THANH TOÁN: %,.2f\n", calculateTotal());
        System.out.println("============================================================");
    }
}