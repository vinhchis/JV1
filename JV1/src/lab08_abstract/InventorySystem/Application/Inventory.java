package lab08_abstract.InventorySystem.Application;

import java.util.Scanner;

import lab08_abstract.InventorySystem.Goods.LaptopCatalog;

public class Inventory {
    public static void main(String[] args) {
        LaptopCatalog app = new LaptopCatalog();
        app.addRawData();
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Laptop");
            System.out.println("\t2. Search by name");
            System.out.println("\t3. Display all available Laptop");
            System.out.println("\t4. Remove laptop by id");
            System.out.println("\t5. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    app.addLaptop();
                    break;
                case 2:
                    System.out.print("Enter Laptop \'name\' you want to search: ");
                    String name = sc.nextLine().trim();
                    app.search(name);
                    break;
                case 3:
                    app.displayAll();
                    break;
                case 4:
                    System.out.print("Enter Laptop \'id\' you want to remove: ");
                    String id = sc.nextLine().trim();
                    app.remove(id);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Are you want to continue");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            System.out.print("Your choice is: ");
            int c = Integer.parseInt(sc.nextLine());

            if (c == 2) {
                System.exit(0);
            }

        } while (choice != 5);
    }
}
