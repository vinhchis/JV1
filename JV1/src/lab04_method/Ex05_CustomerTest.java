package lab04_method;

public class Ex05_CustomerTest {
    public static void main(String[] args) {
        var c = new Customer("C-01", "Bean", "0122908202");
        c.setPinCode(7000);

        System.out.println("Customer Information:");
        System.out.printf("Customer Id: %s\n", c.id);
        System.out.printf("Customer Name: %s\n", c.name);

        // because phone is protected property + Customer vs Ex5 has namespace
        // System.out.printf("Customer Phone: %s\n", c.phone);
        System.out.printf("Customer Phone: %s\n", c.getPhone());
        System.out.printf("Customer pin code: %d\n", c.getPinCode());

    }
}
