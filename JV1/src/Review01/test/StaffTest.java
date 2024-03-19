package Review01.test;


import java.util.Scanner;

import Review01.executive.ExecutiveStaff;


public class StaffTest {
    private final int maxStaff = 10;
    private int nextStaff;
    private ExecutiveStaff[] es;

    public StaffTest() {
        es = new ExecutiveStaff[maxStaff];
        nextStaff = 0;
    }

    public void addRawData(){
        es[0] = new ExecutiveStaff("1", "Hoang", 1000, 30);
        es[1] = new ExecutiveStaff("2", "Quynh", 3000, 100);
        es[2] = new ExecutiveStaff("3", "Anh", 1500, 10);
        es[3] = new ExecutiveStaff("4", "Na", 4000, 140);
        es[4] = new ExecutiveStaff("5", "Ty", 1200, 0);
        nextStaff = 5;
    }

    public void createStaff(){
        if(nextStaff == maxStaff){
            System.out.println("No more staff available");
        }else{
            es[nextStaff] = new ExecutiveStaff();

            es[nextStaff].input();
            nextStaff++;
            System.out.println("Successfully added a new staff");
        }
    }

    public void viewStaff(){
        int sMin = 800;
        if(nextStaff == 0){
            System.out.println("No more staff available");
        }
        else{
            int count = 0;

            System.out.println("Staffs with salary greater than 800:");
            
            for(int i= 0; i<this.nextStaff; i++){
                if(es[i].getSalary() >= sMin){
                    System.out.println(es[i]);
                    count++;
                }
            }

            if(count  == 0){
                System.out.println("No staffs with salary greater than 800");
            }
        }
    }

    public static void main(String[] args) {
        var app = new StaffTest();
        app.addRawData();

        /* Menu */
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new staff");
            System.out.println("\t2. Display staffs");
            System.out.println("\t3. Exit");

            System.out.print("Your choice is: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> app.createStaff();
                case 2 -> app.viewStaff();
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


    
}
