package lab06_package.ass5.data;

import java.util.Scanner;

public class Employee {
    private String id, name, position;
    private int baseSalary;

    public Employee() {
        this.id = "";
        this.name = "";
        this.position = "";
        this.baseSalary = 0;
    }

    public Employee(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return this.baseSalary;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        this.id = sc.next();
        System.out.println("Enter Employee Name: ");
        this.name = sc.next();
        System.out.println("Enter Employee Position: ");
        this.position = sc.next();
        System.out.println("Enter Employee Base Salary: ");
        this.baseSalary = sc.nextInt();
    }

    @Override
    public String toString() {
        return String.format("Employee: %2s | %20s | %10s | %5d", id, name, position, baseSalary);
    }
}
