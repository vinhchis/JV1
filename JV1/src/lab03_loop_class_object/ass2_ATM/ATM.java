package lab03_loop_class_object.ass2_ATM;

import java.util.Scanner;

public class ATM {
    public void menu() {
        var sc = new Scanner(System.in);
        var acc = new Account("ACB-190", 1000);

        int choice = 0;

        do {
            System.out.flush(); 
            System.out.println("\n************ ATM ***********");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the money to deposit(module 100): ");
                    while(true){
                        try {
                            int d_money = Integer.parseInt(sc.nextLine());
                            acc.deposit(d_money);
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid, Please enter your choice again.");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter the money to withdraw: ");
                    int w_money = Integer.parseInt(sc.nextLine());
                    acc.deposit(w_money);
                    break;
                case 3:
                    System.out.printf("Your balance is %d $\n", acc.getBalance());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid, Please enter your choice again.");
                    break;
            }

            System.out.println("Are you want to another transaction ?(y/n)");
            System.out.print("\tEnter your choice: ");
            String c = sc.nextLine();

            if (!c.toLowerCase().equals("y")) {
                System.exit(0);
            }

        } while (choice != 4);

        sc.close();
    }

    public static void main(String[] args) {
        var atm = new ATM();
        atm.menu();
    }
}
