package lab09_interface_exception.Example.basic;

import java.util.Scanner;

public class Worker implements IPayable{
    private String id, name;
    private int salary, wdays;
    private boolean partime;

    public Worker() {
    }

    public Worker(String id, String name, int salary, int wdays, boolean partime) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wdays = wdays;
        this.partime = partime;
    }

    public void input(){
        var sc = new Scanner(System.in);

        System.out.println("Enter id: ");
        this.id = sc.nextLine();
        System.out.println("Enter name: ");
        this.name = sc.nextLine();

        while(true){
            try {
                System.out.println("Enter salary: ");
                this.salary = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Your salary is invalid: " + e.getMessage());
            }
        }

        while(true){
            try {
                System.out.println("Enter wdays: ");
                this.wdays = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Your wdays is invalid: " + e.getMessage());
            }
        }

        System.out.println("Are you partime ?(y/n)");
        this.partime = sc.nextLine().trim().equalsIgnoreCase("y");

    }
    @Override
    public float getSalary() {
        return this.salary * this.wdays / 24.0f;
    }

    @Override
    public float getTax() {
        float temp = 0;
        if(partime != false && getSalary() > 500){
            temp = this.salary * 1.0f;
        }

        return temp;
    }

    public void output(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary (default): " + this.salary);
        System.out.println("Working Days: " + wdays);
        System.out.println("Partime: " + this.partime);
        System.out.printf("Salary (monthly): %.2f\n" + getSalary());
        System.out.printf("Tax: %.2f\n", getTax());
        System.out.printf("Salary (real): %.2f\n", (getSalary() - getTax()));
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", this.id, this.name, getSalary() - getTax());
    }

    
}
