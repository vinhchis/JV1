package Review_Final.fai;

import java.util.Scanner;

import Review_Final.fat.Student;

public class StudentManage {
    private int max, index;
    private Student[] arr;

    Scanner sc = new Scanner(System.in);

    public StudentManage() {
        max = 3;
        index = 0;
        arr = new Student[max];
    }

    public void createStudent(Student newStudent) {
        if (index == max) {
            System.out.println("No more workers");
        } else {
            arr[index] = new Student();
            arr[index] = newStudent;
            index++;
        }

    }

    public void input() {
        int id;
        String name;
        String batch;
        float java_Mark;
        float php_Mark;
        float csharp_Mark;

        while (true) {
            try {
                System.out.println("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());

                if (id <= 0) {
                    throw new Exception("ID must be positive number");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid ID - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter Name: ");
                name = sc.nextLine().trim();
                if (name.isBlank()) {
                    throw new Exception("Name cannot be blank");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid Name - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter Batch: ");
                batch = sc.nextLine().trim();
                if (batch.isBlank()) {
                    throw new Exception("Batch cannot be blank");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid Batch - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter Java Mark: ");
                java_Mark = Float.parseFloat(sc.nextLine().trim());

                if (!(java_Mark >= 0f && java_Mark <= 100f)) {
                    throw new Exception("Java Mark must be range 0 - 100");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid Java Mark - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter PHP Mark: ");
                php_Mark = Float.parseFloat(sc.nextLine().trim());

                if (!(php_Mark >= 0f && php_Mark <= 100f)) {
                    throw new Exception("PHP Mark must be range 0 - 100");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid PHP Mark - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter C# Mark: ");
                csharp_Mark = Float.parseFloat(sc.nextLine().trim());

                if (!(csharp_Mark >= 0f && csharp_Mark <= 100f)) {
                    throw new Exception("C# Mark must be range 0 - 100");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid C# Mark - error: " + e.getMessage());
            }
        }

        var stu = new Student(id, name, batch, java_Mark, php_Mark, csharp_Mark);
        createStudent(stu);
    }
    
    public void findAll(){
        if (index == 0) {
            System.err.println("No Students to display");
        } else {
            System.out.println("\tList Students:");
            System.out.println("*****************************************************");
            for (int i = 0; i < this.index; i++) {
                System.out.print(i + 1 + "-");
                arr[i].printStudent();
            }
            System.out.println("*****************************************************");
        }
    }

    public void deleteStudent(int id){
        boolean exists = false;
        for (int i = 0; i < index; i++) {
            if (arr[i].getId() == id) {
                exists = true;
                // swap 
                for (int j = i; j < index - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                System.out.println("Completed remove Student with id: " + id);
                index--;

                // break;
            }

        }

        if(exists == false){
            System.err.println("Not Found id to delete");
        }
    }

    public void menu() {
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Create new Student");
            System.out.println("\t2. Find All");
            System.out.println("\t3. Delete Student");
            System.out.println("\t4. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> input();
                case 2 -> findAll();
                case 3 -> {
                    System.out.print("Enter id to delete: ");
                    var id = Integer.parseInt(sc.nextLine().trim());
                    deleteStudent(id);
                }
                case 4 -> System.exit(0);
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

        } while (choice != 4);
    }

    public static void main(String[] args) {
        new StudentManage().menu();
    }

}
