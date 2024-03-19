package Review_EduNext.appICT;

import java.util.Scanner;

import Review_EduNext.hospital.Patient;

public class PatientManage {
    private int max, next;
    private Patient[] patients;
    Scanner sc = new Scanner(System.in);

    public PatientManage() {
        max = 10;
        next = 0;
        patients = new Patient[max];
    }

    public void addPatient(Patient pnt) {
        patients[next] = new Patient();
        patients[next] = pnt;
        next++;
    }

    public void input() {
        if (next == max) {
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
                    System.out.println("Enter Year of Birth(>1965 , < 2024): ");
                    year_of_birth = Integer.parseInt(sc.nextLine().trim());
                    if (!(year_of_birth > 1965 && year_of_birth < 2024)) {
                        throw new Exception("Year of birth must not be greater than 1965 and less than 2024");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid Yob - error: " + e.getMessage());
                }
            }

            var patient = new Patient(ID, name, address, year_of_birth);
            addPatient(patient);
        }
    }

    private boolean isExist(int id) {
        boolean exists = false;
        if (next != 0) {
            for (int i = 0; i < next; i++) {
                if (patients[i].getID() == id) {
                    return true;
                }
            }
        }
        return exists;
    }

    public void listAll() {
        if (next == 0) {
            System.err.println("No patients to display");
        } else {
            System.out.println("\tList patients:");
            System.out.println("*****************************************************");
            for (int i = 0; i < this.next; i++) {
                System.out.println(patients[i]);
            }
            System.out.println("*****************************************************");


        }
    }

    public void menu() {
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Patient");
            System.out.println("\t2. Patient List");
            System.out.println("\t3. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> input();
                case 2 -> listAll();
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
        new PatientManage().menu();
    }
}
