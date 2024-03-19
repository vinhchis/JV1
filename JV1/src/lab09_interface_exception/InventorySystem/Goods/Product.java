package lab09_interface_exception.InventorySystem.Goods;

import java.util.Scanner;

public abstract class Product {
    public String id;
    public String name;

    public Product() {
        this.id = "0";
        this.name = "NONE";
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    protected void accept() {
        var sc = new Scanner(System.in);

        do {
            System.out.println("Enter id: ");
            this.id = sc.nextLine().trim();
        } while (this.id == null);

        do {
            System.out.println("Enter name: ");
            this.name = sc.nextLine().trim();
        } while (this.name == null);

       
    }

    public abstract void printInfo();

}
