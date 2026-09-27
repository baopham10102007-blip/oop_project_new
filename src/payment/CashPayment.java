package payment;

public class CashPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("[Thanh toán] Xử lý thanh toán tiền mặt: %,.0f VNĐ - Thành công.\n", amount);
        return true;
    }
}