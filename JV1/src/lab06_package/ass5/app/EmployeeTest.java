package lab06_package.ass5.app;

import java.util.ArrayList;
import java.util.Scanner;

import lab06_package.ass5.data.Employee;

public class EmployeeTest {
    private ArrayList<Employee> empList;

    public EmployeeTest() {
        this.empList = new ArrayList<Employee>();
    }

    public void addRawData() {
        this.empList.add(new Employee("1", "Le Vinh Chi", "Manager", 2000));
        this.empList.add(new Employee("2", "Hoang Van Hung", "Inter", 1800));
        this.empList.add(new Employee("3", "Nguyen Phu Le", "Senior", 1000));
        this.empList.add(new Employee("4", "Lee Chong Qay", "BA", 9000));

    }

    void add() {
        var emp = new Employee();
        System.out.println("Enter a new employee");
        emp.input();

        if (!this.empList.stream().anyMatch(e -> e.getId().equals(emp.getId()))) {
            this.empList.add(emp);
        } else {
            System.out.println("Your id has already been added to the list");
        }

    }

    void display() {
        if (empList.size() > 0) {
            System.out.println("----------------");
            System.out.println("\tEmployee List");
            empList.forEach(e -> {System.out.println(e);});
            System.out.println("----------------");
        }
    }

    void display(int amp) {
        // var ids = new List<String>(this.empList.stream().filter(e -> e.getSalary() >=
        // amp).map(e -> e.getId()).collect(Collectors.toList()));

        if (empList.size() > 0) {
            System.out.println("----------------");
            System.out.printf("\tEmployee List(salary >= %d $)\n", amp);
            empList.forEach(e -> {
                if (e.getSalary() > amp) {
                    System.out.println(e);
                }
            });
            System.out.println("----------------");
        }

    }

    void display(String empName) {
        if (empList.size() > 0) {
            System.out.println("----------------");
            System.out.printf("\tEmployee List(name contains \'%s\' )\n", empName);
            empList.forEach(e -> {
                if (e.getName().contains(empName)) {
                    System.out.println(e);
                }
            });
            System.out.println("----------------");
        }
    }

    void menu() {
        // int min = 1500;
        // String str = "Le";

        addRawData();
        // display();
        // display(str);

        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add a Employee");
            System.out.println("\t2. View Employee List");
            System.out.println("\t3. Search for employees with salaries greater than a amount(number)");
            System.out.println("\t4. Search Employees by name");
            System.out.println("\t5. Exit");
            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.print("Enter a number:");
                    int min = Integer.parseInt(sc.nextLine());
                    display(min);
                    break;
                case 4:
                    System.out.print("Enter a phrase:");
                    String str = sc.nextLine();
                    display(str);
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

    public static void main(String[] args) {
        new EmployeeTest().menu();
    }
}
