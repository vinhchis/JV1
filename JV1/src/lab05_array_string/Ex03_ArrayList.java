package lab05_array_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_ArrayList {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = 5;
        var list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name of Student[%d]: ", i + 1);
            String name = sc.nextLine();
            list.add(name);
        }

        list.sort(String::compareToIgnoreCase);

        for (String name : list) {
            System.out.println(name);
        }

        sc.close();

    }
}
