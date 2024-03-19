package session04_Package;

class Math{
    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }
}

public class Ex02_StaticMethod {

    public static void main(String[] args) {
        
        System.out.println("Sum of 1 and 2 = " + Math.add(1, 2));
        System.out.println("Sub of 1 and 2 = " + Math.sub(1, 2));

    }
}
