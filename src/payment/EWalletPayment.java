package payment;

public class EWalletPayment implements Payment {
    private String walletId;

    public EWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("[Thanh toán] Thanh toán qua ví điện tử (%s): %,.0f VNĐ - Thành công.\n", walletId, amount);
        return true;
    }
}