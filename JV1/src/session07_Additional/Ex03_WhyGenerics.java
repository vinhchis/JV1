package session07_Additional;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_WhyGenerics {
    static Scanner sc = new Scanner(System.in);
    static String ch;
    static int sum; 
    static void sumCollection(){
        // Collection declarations
        var list = new ArrayList();
        // Add collection
        while (true) {
            System.out.println("Enter a whole number: ");
            list.add(Integer.parseInt(sc.nextLine()));

            // Continue ?
            System.out.println("Are you sure you want to continue?(y/n)");
            ch = sc.nextLine();
            if(!ch.toLowerCase().equals("y")){
                break;
            }

        }

        // Calculate
        for(int i = 0; i < list.size(); i++) {
            sum += (int)list.get(i);
        }

        // Display
        System.out.println("sum: " + sum);
    };

    static void sumGeneric(){
        var list = new ArrayList<Integer>();
        // Add collection
        while (true) {
            System.out.println("Enter a whole number: ");
            list.add(Integer.parseInt(sc.nextLine()));


            // Continue ?
            System.out.println("Are you sure you want to continue?(y/n)");
            ch = sc.nextLine();
            if(!ch.toLowerCase().equals("y")){
                break;
            }

        }

        // Calculate
        list.forEach(x -> {sum = sum + x;});

        // Display

        System.out.println("Sum: " + sum);
    } 

    public static void main(String[] args) {
        // sumCollection();
        sumGeneric();
    }
}
