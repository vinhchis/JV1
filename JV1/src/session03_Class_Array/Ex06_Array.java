package session03_Class_Array;

public class Ex06_Array {
    public static void main(String[] args) {
        // 1. declaration before initialization
        int[] num = new int[3];
        num[0] = 1; // Literal
        num[1] = new Integer(10); // Constructor - deprecated
        num[2] = Integer.valueOf(90);

        // Simple
        for(int i = 0; i < num.length; i++){
            System.out.printf("%4d", num[i]);
        }

        // Foreach
        for(var n : num){
            System.out.printf("%4d", n);

        }

        // 2. declaration and initialization same time
        int cNum[] = {0,1,2,3,4,5,6,7};
        int[] jNum = {1, 5, 7};

        

    }
}
