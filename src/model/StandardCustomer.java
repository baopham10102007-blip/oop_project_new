package model;
import enums.CustomerType;

public class StandardCustomer extends Customer{
    public StandardCustomer(String customerId, String name, String phone, String address) {
        super(customerId, name, phone, address, CustomerType.STANDARD);
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public CustomerType getCustomerType() {
        return CustomerType.STANDARD;
    }
    @Override
    public void displayInfo() {
        System.out.print("[Khách Thường] ");
        super.displayInfo();
    }
}

