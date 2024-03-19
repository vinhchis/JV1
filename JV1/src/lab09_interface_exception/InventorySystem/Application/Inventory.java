package lab09_interface_exception.InventorySystem.Application;

import java.util.Scanner;

import lab09_interface_exception.InventorySystem.Electronics.TelevisionCatalog;



public class Inventory {
    public static void main(String[] args) {
        var app = new TelevisionCatalog();
        app.addRawData();
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Television");
            System.out.println("\t2. Search by name");
            System.out.println("\t3. Display all televisions");
            System.out.println("\t4. Display high-valued television");
            System.out.println("\t5. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> app.add();
                case 2 -> {
                    System.out.print("Enter Laptop \'name\' you want to search: ");
                    String sBrand = sc.nextLine().trim();
                    app.searchByBrand(sBrand);
                }
                case 3 -> app.displayAll();
                case 4 -> app.displayHighValue();
                default -> System.out.println("Invalid choice");
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
