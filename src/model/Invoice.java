package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private String invoiceId;
    private Order order;
    private LocalDateTime createdDate;

    public Invoice(String invoiceId, Order order) {
        this.invoiceId = invoiceId;
        this.order = order;
        this.createdDate = LocalDateTime.now();
    }

    public String getInvoiceId() {
        return invoiceId;
    }
    public Order getOrder() {
        return order;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void printInvoice() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("------------------------------------------");
        System.out.println("            HÓA ĐƠN BÁN HÀNG              ");
        System.out.println("------------------------------------------");
        System.out.println("Mã hóa đơn: " + invoiceId);
        System.out.println("Mã đơn hàng: " + order.getOrderId());
        System.out.println("Thời gian: " + createdDate.format(dtf));
        System.out.println("Khách hàng: " + (order.getCustomer() != null ? order.getCustomer().getName() : "Khách vãng lai"));
        System.out.println("------------------------------------------");
        System.out.printf("%-18s %-5s %-12s %-12s\n", "Sản phẩm", "SL", "Đơn giá", "Thành tiền");
        System.out.println("------------------------------------------");
        for (OrderItem oi : order.getItems()) {
            System.out.printf("%-18s %-5d %,12.0f %,12.0f\n",
                    oi.getItem().getName(),
                    oi.getQuantity(),
                    oi.getPurchasePrice(),
                    oi.getTotalPrice());
        }
        System.out.println("------------------------------------------");
        double subtotal = order.calculateSubtotal();
        double total = order.calculateTotal();
        double discount = subtotal - total;
        System.out.printf("Tạm tính:               %,15.0f VNĐ\n", subtotal);
        if (discount > 0) {
            System.out.printf("Giảm giá VIP:        -%,15.0f VNĐ\n", discount);
        }
        System.out.printf("TỔNG CỘNG THANH TOÁN:   %,15.0f VNĐ\n", total);
        System.out.println("Trạng thái đơn: " + order.getStatus());
        System.out.println("==========================================\n");
    }
}
