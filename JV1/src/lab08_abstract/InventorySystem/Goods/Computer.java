package lab08_abstract.InventorySystem.Goods;

import java.util.Scanner;

public abstract class Computer {
    public String id;
    public String name;
    public int price;

    public Computer() {
        this.id = "0";
        this.name = "NONE";
        this.price = 0;
    }

    public Computer(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void accept() {
        var sc = new Scanner(System.in);

        do {
            System.out.println("Enter id: ");
            this.id = sc.nextLine().trim();
        } while (this.id == null);

        do {
            System.out.println("Enter name: ");
            this.name = sc.nextLine().trim();
        } while (this.name == null);

        do {
            System.out.println("Enter price: ");
            this.price = Integer.parseInt(sc.nextLine().trim());
        } while (this.price <= 0);
    }

    public abstract void printInfo();

}
