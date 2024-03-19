package session04_Package;

public class Ex04_FinalField extends Thread {
    final float RATE = 0.5f;
    double capital = 100D;

    @Override
    public void run() {
        // RATE = 0.3f; // The final field cannot be assigned
        for (int i = 0; i < 12; i++) {
            capital += RATE * capital;
            System.out.printf("Total(%d): %.2f\n", i + 1, capital);
            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }

    public static void main(String[] args) {
        Ex04_FinalField f = new Ex04_FinalField();
        f.start();
    }

}
