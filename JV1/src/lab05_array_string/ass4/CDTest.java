package lab05_array_string.ass4;

import java.util.Scanner;

public class CDTest {
    private CDList cdList;

    public CDTest() {
        this.cdList = new CDList();
    }

    public void addRawData(){
       cdList.add(new CD(1, "A", Type.Audio, 120, 2024));
       cdList.add(new CD(2, "B", Type.Video, 1000, 1990));
       cdList.add(new CD(3, "C", Type.Video, 300, 2000));
       cdList.add(new CD(4, "D", Type.Audio, 400, 2010));
       cdList.add(new CD(5, "E", Type.Audio, 2000, 2022));

    }

    void menu() {
        var sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Add new CDs");
            System.out.println("\t2. Search CD by id");
            System.out.println("\t3. View all CDs");
            System.out.println("\t4. Exit");
            System.out.print("Your choice is: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Are you want to continue");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            System.out.print("Your choice is: ");
            int c = sc.nextInt();

            if (c == 2) {
                System.exit(0);
            }

        } while (choice != 4);

    }

    void add() {
        var sc = new Scanner(System.in);
        int quality = this.cdList.getCounter();
        System.out.printf("Enter the number of CDs (<=%d) you want to add(present: %d):", cdList.MAX - quality, quality);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("***%d. CD - (%d) ***\n", i + 1, quality + i + 1);
            var cd = new CD();
            cdList.add(cd);
            System.out.println("***************");
        }

    }

    void search() {
        var sc = new Scanner(System.in);
        System.out.print("Enter a number for identifying: ");
        int id = sc.nextInt();

        var cd = cdList.findById(id);

        if(cd != null){
            System.out.printf("The CD has id = %d : %s\n", id, cd);
        }else{
            System.err.println("Nothing found");
        }
    }

    void displayAll() {
        System.out.println("********************************");
        System.out.println("\tList of all CDs");

        for (int i = 0; i < cdList.getCounter(); i++) {
            System.out.printf("%d. %s\n", i + 1, cdList.getCdList()[i]);
        }

        System.out.println("********************************");
    }

    public static void main(String[] args) {
        var cdTest = new CDTest();
        cdTest.addRawData();
        cdTest.menu();

    }
}
