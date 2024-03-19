package lab04_method.ass3;

public class DoctorTest {
    public static void main(String[] args) {
        var doctor = new Doctor();
        int days = 30;

        doctor.input();
        doctor.display();

        System.out.printf("\tLevel of Doctor: %s\n", doctor.getLevel());
        float income = doctor.getIncome(days);
        System.out.printf("\tIncome of Doctor in %d days: %.2f $\n", days, income);

    }
}
