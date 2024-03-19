package lab06_package.Package_Exp.data;

import java.util.Scanner;

public class Student {
    private String id, name;
    private int yob;

    public Student() {
        this.id = "S-0";
        this.name = "Java";
        this.yob = 0;
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public void input(){
        var sc = new Scanner(System.in);
        System.out.print("Enter student id: ");
        id = sc.nextLine().trim();

        System.out.print("Enter student name: ");
        name = sc.nextLine().trim();

        while(true){
            System.out.print("Enter student yob: ");
            yob = Integer.parseInt(sc.nextLine().trim());

            if(yob <= 2000){
                break;
            }
            else{
                System.out.println("Invalid year of birth");
            }
        }
    }

    public void output(){
        System.out.println("\tStudent Information:");
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student yob: " + this.yob);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", id, name, yob);
    }
}

