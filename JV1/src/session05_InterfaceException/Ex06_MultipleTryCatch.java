package session05_InterfaceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06_MultipleTryCatch {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter n: ");
            n = sc.nextInt();
            System.out.println("Enter m (m != 0): "); //ArithmeticException || InputMismatchException
            m = sc.nextInt();
            String s = String.format("%d / %d = %d", n, m, (n / m));
            System.out.println(s);
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Saving...");
        }
        sc.close();
    }
}
