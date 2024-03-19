package lab03_loop_class_object;

import java.util.Scanner;

/**
 * Ex01_multiplication_table
 */
public class Ex01_multiplication_table {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.err.printf("Multiplication table of %d\n", n);
        for(int i=1;  i <= 10; i++){
            System.out.printf("%2d * %2d = %3d\n", n, i, n*i);
        }

        sc.close();
    }
    
}