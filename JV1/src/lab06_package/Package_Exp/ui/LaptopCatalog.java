package lab06_package.Package_Exp.ui;

import java.util.Scanner;

import lab06_package.Package_Exp.data.Student;

public class LaptopCatalog {
    final int MAX = 10;
    Student sts[] = new Student[MAX];
    int index = 0;
    Scanner sc = new Scanner(System.in);

    void addRawData() {
        index = 7;
        sts[0] = new Student("S-0", "Java", 2000);
        sts[1] = new Student("S-1", "JS", 3000);
        sts[2] = new Student("S-2", "PHP", 4000);
        sts[3] = new Student("S-3", "C#", 2200);
        sts[4] = new Student("S-4", "HTML", 10000);
        sts[5] = new Student("S-5", "CSS", 3000);
        sts[6] = new Student("S-6", "JSON", 6000);
        sts[7] = new Student("S-7", "XML", 1900);
    }

    public void add() {
        if (index == MAX) {
            System.out.println("No space available");
        } else {
            var st = new Student();
            st.input();
            sts[index] = st;
            index++;
            System.out.println("Successfully added");
        }
    }

    public void display() {
        if (index == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("\tList of students");
            for (int i = 0; i < index; i++) {
                System.out.printf("%d : %s \n", i + 1, sts[i]);
            }
        }
    }

    public void display(String name) {
        if (index == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("Students with name = " + name);
            boolean isFounded = false;
            for (int i = 0; i < index; i++) {
                if (sts[i].getName().equalsIgnoreCase(name)) {
                    sts[i].output();
                    isFounded = true;
                }
            }
            if (!isFounded) {
                System.out.println("Not found");
            }

        }

    }

    public void remove(String id) {
        if (index == 0) {
            System.out.println("No Data Available");
        } else {
            for (int i = 0; i < index; i++) {
                if (sts[i].getId().equals(id)) {
                    sts[i] = null;
                    // replace index
                    for (int j = i; j < index; j++) {
                        sts[j] = sts[j + 1];
                    }

                    index--;
                    System.out.printf("Successfully removed (id = %s)\n", id);
                    return;
                }

            }

            System.out.println("Not found");

        }

    }

    public static void main(String[] args) {
        LaptopCatalog app = new LaptopCatalog();
        app.addRawData();
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new Student");
            System.out.println("\t2. View Student Lists");
            System.out.println("\t3. Search by name");
            System.out.println("\t4. Remove by id");
            System.out.println("\t5. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    app.add();
                    break;
                case 2:
                    app.display();
                    break;
                case 3:
                    System.out.print("Enter student \'name\' you want to search: ");
                    String name = sc.nextLine().trim();
                    app.display(name);
                    break;
                case 4:
                    System.out.print("Enter student \'id\' you want to remove: ");
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
