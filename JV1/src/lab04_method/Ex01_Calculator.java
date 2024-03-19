package lab04_method;

public class Ex01_Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a * b;
    }

    public float div(int a, int b){
        return (float)a / b;
    }   

    public static void main(String[] args) {
        var calculator = new Ex01_Calculator();
        int a, b;

        a = 10; 
        b = 26;

        System.out.printf("%d + %d = %d\n", a, b, calculator.add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, calculator.sub(a, b));
        System.out.printf("%d * %d = %d\n", a, b, calculator.mul(a, b));
        System.out.printf("%d / %d = %.2f\n", a, b, calculator.div(a, b));

    }
}
