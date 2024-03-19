package lab03_loop_class_object;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int baseSalary;
    private int workDays;
    private float income;

    public Employee() {
        this.id = "E01";
        this.name = "Anh Phu"; 
        this.baseSalary = 100;
        this.workDays = 30;
    }

    public Employee(String id, String name, int s, int d) {
        this.id = id;
        this.name = name;
        this.baseSalary = s;
        this.workDays = d;
    }

    public void input(){
        var sc = new Scanner(System.in);
        System.out.println("Enter Employee Information");
        System.out.print("\tEnter employee id: ");
        this.id = sc.nextLine();
        System.out.print("\tEnter employee name: ");
        this.name = sc.nextLine();
        System.out.print("\tEnter employee base salary: ");
        this.baseSalary = sc.nextInt();
        System.out.print("\tEnter employee work days: ");
        this.workDays = sc.nextInt();

        
        sc.close();
    }

    public void output(){
        this.income = this.baseSalary * this.workDays / 26.0f;

        System.out.println("\nEmployee Information");
        System.out.println("\tid: " + this.id);
        System.out.println("\tname: " + this.name);
        System.out.println("\tbase salary: " + this.baseSalary);
        System.out.println("\twork days: " + this.workDays);
        System.out.printf("\tincome: %.2f", this.income);

    }
}
