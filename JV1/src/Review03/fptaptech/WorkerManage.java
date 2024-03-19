package Review03.fptaptech;

import java.util.Scanner;

import Review03.academy.Worker;

public class WorkerManage {
    private int maxWorker, nextWorker;
    Worker[] arr;

    Scanner sc = new Scanner(System.in);

    public WorkerManage() {
        maxWorker = 10;
        nextWorker = 0;
        arr = new Worker[maxWorker];
    }

    public void saveWorker(Worker worker) {
        arr[nextWorker] = new Worker();
        arr[nextWorker] = worker;
        nextWorker++;
    }

    private boolean isExist(int id){
        boolean exists = false;
        
        if (nextWorker != 0) {
            for (int i = 0; i < nextWorker; i++) {
                if (arr[i].getID() == id) {
                    return true;
                }
            }
        }

        return exists;
    } 

    public void input() {
        if (nextWorker == maxWorker) {
            System.out.println("No more workers");
        } else {
            int ID;
            String name, address;
            int year_of_birth;

            // ID
            while (true) {
                try {
                    System.out.println("Enter ID: ");
                    ID = Integer.parseInt(sc.nextLine().trim());

                    if (isExist(ID)) {
                        throw new Exception("ID existed"); 
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid ID - error: " + e.getMessage());
                }
            }

            // Name
            while (true) {
                try {
                    System.out.println("Enter Name: ");
                    name = sc.nextLine().trim();
                    if (name.isBlank()) {
                        throw new Exception("Name must not be empty");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid Name - error: " + e.getMessage());
                }
            }

            // Address
            while (true) {
                try {
                    System.out.println("Enter Address: ");
                    address = sc.nextLine().trim();
                    if (address.isBlank()) {
                        throw new Exception("Address must not be empty");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid Address - error: " + e.getMessage());
                }
            }

            // year of birth
            while (true) {
                try {
                    System.out.println("Enter Year of Birth(>1965 , < 2005): ");
                    year_of_birth = Integer.parseInt(sc.nextLine().trim());
                    if (!(year_of_birth > 1965 && year_of_birth < 2005)) {
                        throw new Exception("Year of birth must not be greater than 1965 and less than 2005");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid Yob - error: " + e.getMessage());
                }
            }

            var worker = new Worker(ID, name, address, year_of_birth);
            saveWorker(worker);
        }
    }

    public void showAll() {
        if (nextWorker == 0) {
            System.err.println("No workers to display");
        } else {
            for (int i = 0; i < this.nextWorker; i++) {
                System.out.println(arr[i]);
            }

        }
    }

    public void menu() {

        /* Menu */
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Worker");
            System.out.println("\t2. Display Worker List");
            System.out.println("\t3. Quit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> input();
                case 2 -> showAll();
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
        new WorkerManage().menu();
    }
}
