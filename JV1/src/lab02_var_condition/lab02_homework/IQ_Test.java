package lab02_var_condition.lab02_homework;

public class IQ_Test {

    public static void main(String[] args) {
        var iq = new IQ(7, 6, 5, 6);
        System.out.printf("Your score: %d\n", iq.getScore());
        iq.printLevelIQ();


    }
}
