package session06_NewDateTimeAPI;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class Ex03_MonthDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please, enter your birthdate");
        
        System.out.println("Enter the day: ");
        var dd = sc.nextInt();
        System.out.println("Enter the month: ");
        var mm = sc.nextInt();
        System.out.println("Enter the year: ");
        var yy = sc.nextInt();
        
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(yy, mm, dd);
        
        MonthDay bday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        
        if (currentMonthDay.equals(bday)) {
            System.out.println("**Colorful Joyful Birthday Buddy**");
        } else {
            System.out.println("Nope, today is not your B'day");
        }
    }
}
