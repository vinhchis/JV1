package lab02_var_condition;

import java.util.Scanner;

public class Ex01_Casio {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x, y;

        System.out.print("Enter x : ");
        x = sc.nextInt();

        System.out.print("Enter y : ");
        y = sc.nextInt();

        System.out.printf("%d + %d = %d \n", x, y, x + y);
        System.out.printf("%d - %d = %d \n", x, y, x - y);

        System.out.printf("%d * %d = %d \n", x, y, x * y);
        System.out.printf("%d / %d = %d \n", x, y, x / y);
        sc.close();
    }
}
