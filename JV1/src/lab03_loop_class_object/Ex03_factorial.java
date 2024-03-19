package lab03_loop_class_object;

public class Ex03_factorial {
    public static void main(String[] args) {
        int n;
        long f = 1;

        // n <= 16 
        n = 13;
        for(int i = 1; i<n;i++){
            f *= i;
        }

        System.out.printf("Factorial of %d: %d", n, f);
    }
}
