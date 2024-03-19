package session01_Intro;
/**
 * 1. Name of class (contains main) is same file name
 * 2. Class,Interface => capitalize first letter
 * 3. package, method, variable => lowercase first letter
 */

public class Ex01_JavaLikeC {
    public static void main(String[] args) {
        int n = 10;
        float m = 20;

        System.out.printf("1.Display like C: %d +  %.2f = %.2f\n", n, m, n + m);
        System.out.printf("1.Display like C: "+n+" + "+m+" = "+(n+m)+"\n");

        String s = String.format("3.Display string format: %d +  %.2f = %.2f\n", n, m, n + m);

        System.out.println(s);
    }
}
