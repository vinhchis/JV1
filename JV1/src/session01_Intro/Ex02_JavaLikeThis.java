package session01_Intro;
/**
 * 1. Constructor:
 *      - method not return
 *      - same class name
 * 2. type of constructor:
 *      - 2.1. Default constructor
 *      - 2.2. Customer constructor
 */

public class Ex02_JavaLikeThis {
    // 1. Field
    int n;
    float m;

    // 2.1 Default constructor
    public Ex02_JavaLikeThis(){
        n = 10;
        m = 20;
    }

    // 3. Method
    void output(){
        System.out.printf("1.Display like C: %d +  %.2f = %.2f\n", n, m, n + m);
        System.out.print("1.Display like C: "+n+" + "+m+" = "+(n+m)+"\n");

        String s = String.format("3.Display string format: %d +  %.2f = %.2f\n", n, m, n + m);

        System.out.println(s);
    }

    public static void main(String[] args) {
        // Ex02_JavaLikeThis obj = new Ex02_JavaLikeThis();
        // obj.output();
        new Ex02_JavaLikeThis().output();
    }
}
