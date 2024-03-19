package lab02_var_condition;

import java.util.Scanner;
import java.lang.Math;

public class Ex02_Quadratic_Equation {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Solve a Quadratic Equation with ax^2 + bx + c = 0");

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter a:");
        int b = sc.nextInt();

        System.out.print("Enter a:");
        int c = sc.nextInt();

        int deta = (int) Math.pow(b, 2) - 4 * a * c;

        if (deta < 0) {
            System.out.println("Impossible equation");
        } else if (deta == 0) {
            double x = -b / (2.0 * a);
            System.out.printf("Only root, x = %.2f", x);
        } else {
            double x1 = (-b + Math.sqrt(deta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(deta)) / (2.0 * a);
            System.out.printf("Two roots,  x1 = %.2f and x2 = %.2f", x1, x2);
        }


        sc.close();


    }

}