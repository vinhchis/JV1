package lab04_method.ass3;

import java.util.Scanner;

public class Doctor {
    private String docNo;
    private String name;
    private String spec;
    private int exp_years;
    private int salary;

    public Doctor() {
        this.docNo = "D-01";
        this.name = "Me";
    }

    public Doctor(String no, String name, String spec, int exp_years, int salary) {
        this.docNo = no;
        this.name = name;
        this.spec = spec;
        this.exp_years = exp_years;
        this.salary = salary;
    }

    public void input() {
        var sc = new Scanner(System.in);
        do {
            System.out.print("Enter Doctor No: ");
            this.docNo = sc.nextLine();
        } while (this.docNo.isEmpty());

        do {
            System.out.print("Enter Doctor Name: ");
            this.name = sc.nextLine();
        } while (this.name.isEmpty());

        do {
            System.out.print("Enter Doctor specification: ");
            this.spec = sc.nextLine();
        } while (this.spec.isEmpty());

        do {
            System.out.print("Enter Doctor experience: ");
            this.exp_years = sc.nextInt();
        } while (this.exp_years <= 0);

        do {
            System.out.print("Enter Doctor salary: ");
            this.salary = sc.nextInt();
        } while (this.salary <= 0);

        sc.close();

    }

    public void display() {
        System.out.println("Doctor Information:");
        System.out.printf("\tDoctor No: %s\n", this.docNo);
        System.out.printf("\tDoctor Name: %s\n", this.name);
        System.out.printf("\tDoctor specification: %s\n", this.spec);
        System.out.printf("\tDoctor experience: %d\n", this.exp_years);
        System.out.printf("\tDoctor salary: %d $\n", this.salary);
    }

    public char getLevel() {
        if (this.exp_years >= 15) {
            return 'D';
        } else if (this.exp_years >= 10) {
            return 'C';
        } else if (this.exp_years >= 5) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public float getIncome(int days) {
        float income = 0;
        int allowable = 0;
        switch (this.getLevel()) {
            case 'D':
                allowable = 1000;
                break;
            case 'C':
                allowable = 600;
                break;
            case 'B':
                allowable = 300;
                break;
            case 'A':
                allowable = 100;
                break;
            default:
                break;
        }

        income = (this.salary * days)/24 + allowable;

        return income;
    }

}
