
package model;

import discount.Discountable;
import enums.CustomerType;

public class VipCustomer extends Customer implements Discountable {
    private double discountRate = 0.15; //

    public VipCustomer(String customerId, String name, String phone, String address) {
        super(customerId, name, phone, address, CustomerType.VIP);
    }

    public double getDiscountRate(){
        return discountRate;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    @Override
    public CustomerType getCustomerType() {
        return CustomerType.VIP;
    }

    @Override
    public double calculateDiscount(double price) {
        return price * discountRate;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[Khách VIP] Mã KH: %s | Tên: %s | SĐT: %s | Địa chỉ: %s | Chiết khấu: %.0f%%\n",
                getCustomerId(), getName(), getPhone(), getAddress(), discountRate * 100);
    }
}