package Review02;

import java.util.Scanner;


public class ByciclesStore {
    ByciclesMag mag;
    Scanner sc = new Scanner(System.in);
    public ByciclesStore() {
        mag = new ByciclesMag();
    }

    void menu() {
        /* Menu */
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Bicycle");
            System.out.println("\t2. Display all information");
            System.out.println("\t3. Quit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> mag.addBike();
                case 2 -> mag.showBikes();
                case 3 -> System.exit(0);
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

        } while (choice != 3);
    }


    public static void main(String[] args) {
        new ByciclesStore().menu();
    }
}
