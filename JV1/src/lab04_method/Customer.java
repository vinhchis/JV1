package lab04_method;

public class Customer {
    public String id, name;
    protected String phone;
    private int pinCode;

    public Customer() {
        id = "C-01";
        name = "Me";
    }

    public Customer(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return this.pinCode;
    }

    public String getPhone(){
        return this.phone;
    }


}
