
import discount.*;
import enums.*;
import event.*;
import manager.*;
import model.*;
import payment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================================");
        System.out.println("                   HỆ THỐNG QUẢN LÝ CỬA HÀNG THỜI TRANG                   ");
        System.out.println("==========================================================================");

        // Khởi tạo các quản lý hệ thống
        InventoryManager inventory = new InventoryManager();
        EventManager eventManager = new EventManager();

        // Đăng ký nhận sự kiện
        eventManager.subscribe(event ->
                System.out.printf("  📢 [EVENT LOG] %-15s | %s\n", event.getEventType(), event.getMessage())
        );

       // Khởi tạo ds sản phẩm
        Shirt s1 = new Shirt("S001", "Áo Sơ Mi Trắng", 350000, 10, Size.M, Color.WHITE);
        Shirt s2 = new Shirt("S002", "Áo Thun Polo", 250000, 5, Size.L, Color.BLUE);
        Pants p1 = new Pants("P001", "Quần Jean Slimfit", 550000, 8, Size.M, Color.BLACK);
        Jacket j1 = new Jacket("J001", "Áo Khoác Denim", 890000, 4, Size.XL, Color.BLUE);
        Dress d1 = new Dress("D001", "Đầm Dạ Hội Luxury", 1200000, 3, Size.S, Color.RED);
        Skirt sk1 = new Skirt("SK01", "Chân Váy Xếp Ly", 380000, 6, Size.S, Color.PINK);

        inventory.addStock(s1);
        inventory.addStock(s2);
        inventory.addStock(p1);
        inventory.addStock(j1);
        inventory.addStock(d1);
        inventory.addStock(sk1);

        // Hiển thị tồn kho ban đầu
        inventory.displayInventory();

        // Khởi tạo Khách hàng
        StandardCustomer c1 = new StandardCustomer("C001", "Nguyễn Văn A", "0901234567", "Hà Nội");
        VipCustomer c2 = new VipCustomer("C002", "Trần Thị B (VIP)", "0987654321", "TP.HCM");

        //Xử lý giỏ hàng và đơn hàng
        System.out.println("\n--- TẠO GIỎ HÀNG & MUA HÀNG ---");
        Cart cart = new Cart();
        cart.addItem(s1, 2);
        cart.addItem(p1, 1);
        cart.addItem(j1, 1);

        Order order = new Order("ORD-2026-001", c2);
        for (CartItem ci : cart.getItems()) {
            if (inventory.checkStock(ci.getItem().getId(), ci.getQuantity())) {
                inventory.removeStock(ci.getItem().getId(), ci.getQuantity());
                order.addItem(ci.getItem(), ci.getQuantity());
            }
        }
        order.setStatus(OrderStatus.COMPLETED);

        // Thanh toán qua Ví điện tử
        Payment payment = new EWalletPayment("0987654321");
        payment.processPayment(order.calculateTotal());

        // In Hóa đơn
        Invoice invoice = new Invoice("INV-2026-001", order);
        invoice.printInvoice();

        // Phát sự kiện hệ thống
        eventManager.publish(new ShopEvent("ORDER_CREATED", "Tạo đơn ORD-2026-001 thành công cho khách " + c2.getName()));
        eventManager.publish(new ShopEvent("PAYMENT_SUCCESS", "Thanh toán hóa đơn INV-2026-001 thành công!"));

        // Lọc sản phầm
        System.out.println("--- LỌC SẢN PHẨM CÓ GIÁ > 400.000 VNĐ ---");
        ProductFilter filter = new ProductFilter();
        var expensiveItems = filter.filter(inventory.getAllItems(), item -> item.getPrice() > 400000);
        expensiveItems.forEach(ClothingItem::displayInfo);
    }
}
