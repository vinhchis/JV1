package session02_Variable_Condition;

public class Ex05_Casting {
    public static void main(String[] args) {
        int n = 10;
        float m = 20.7f;

        // 1. Implicit
        System.out.printf("Implicit: %d + %.2f = %.2f\n", n, m, n + m); // 10 + 20.70 = 30.70
        // System.out.printf("Implicit %d + %.2f = %d\n", n, m, n + m); //Illegal Format Conversion Exception


        // 2. Explicit
        System.out.printf("Explicit: %d + %.2f = %d\n", n, m, (int)(n + m)); // 10 + 20.70 = 30

    }
}
