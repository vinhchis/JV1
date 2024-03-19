package lab07_ihr_poly.Vehicle_System.ui;

import java.util.Scanner;

import lab07_ihr_poly.Vehicle_System.app.VehicleCatalog;

public class Test {
    public static void main(String[] args) {
        VehicleCatalog catalog = new VehicleCatalog();
        catalog.addRawData();
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Car");
            System.out.println("\t2. Display All Cars");
            System.out.println("\t3. Search car by brand name");
            System.out.println("\t4. Display all cars having GPS module");
            System.out.println("\t5. Display high-rank car");
            System.out.println("\t6. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> catalog.addCar();
                case 2 -> catalog.displayAll();
                case 3 -> {
                    System.out.print("Enter brand \'name\' you want to search: ");
                    String sBrand = sc.nextLine().trim();
                    catalog.searchByBrand(sBrand);
                }
                case 4 -> catalog.displayAllGpsCas();
                case 5 -> catalog.displayHighRank(50000);
                case 6 -> System.exit(0);
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

        } while (choice != 6);

    }
}
