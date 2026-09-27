package model;
import enums.CustomerType;
public abstract class Customer {
    private String customerId;
    private String name;
    private String phone;
    private String address;
    private CustomerType type;
    //Constructer
    public Customer(String customerId, String name, String phone, String address, CustomerType type){
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.type = type;
    }
    //Getter
    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public CustomerType getType(){
        return type;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //Trả về tỷ lệ giảm giá
    public abstract double getDiscountRate();
    //Trả về loại khách hàng
    public abstract CustomerType getCustomerType();
    public void displayInfo() {
        System.out.printf("[%s] Mã KH: %s | Tên: %s | SĐT: %s | Địa chỉ: %s\n",
                type, customerId, name, phone, address);
    }
}
