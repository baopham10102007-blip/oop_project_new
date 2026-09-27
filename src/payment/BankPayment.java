package payment;

public class BankPayment implements Payment {
    private String accountNumber;

    public BankPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("[Thanh toán] Chuyển khoản ngân hàng (STK: %s): %,.0f VNĐ - Thành công.\n", accountNumber, amount);
        return true;
    }
}