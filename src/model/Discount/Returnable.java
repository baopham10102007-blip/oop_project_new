package Discount;

public interface Returnable {
    boolean canReturn (int daysSincePurchase);
    double calculateReturnFee(int daysSincePurchase);
}
