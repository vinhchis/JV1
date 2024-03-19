package session02_Variable_Condition;

public class Ex04_Static {
    int nonStatic = 5;

    static int staticVar = 0;

    public Ex04_Static() {
        nonStatic += 5;
        staticVar += 1;

        System.out.println("nonStatic: " + nonStatic + " staticVar: " + staticVar);
    }


    public static void main(String[] args) {
        new Ex04_Static();// 10 - 1 
        new Ex04_Static();// 10 - 2
        new Ex04_Static();// 10 - 3

    }
}
