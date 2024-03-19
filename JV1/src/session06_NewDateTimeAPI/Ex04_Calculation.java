package session06_NewDateTimeAPI;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ex04_Calculation {
    public static void main(String[] args) {
        //1. To display the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
        
        //2. To display the result 2 weeks addition to the current date
        LocalDate nextWeek = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("After 2 weeks: " + nextWeek);
        
        //3. To display the result 2 months addition to the current date
        LocalDate nextMonth = today.plus(2, ChronoUnit.MONTHS);
        System.out.println("After 2 months: " + nextMonth);
        
        //4. To display the result 2 years addition to the current date
        LocalDate nextYear = today.plus(2, ChronoUnit.YEARS);
        System.out.println("After 2 years: " + nextYear);
        
        //5. To display the result 20 years addition to the current date
        LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
        System.out.println("Date after twenty years: " + nextDecade);
        
        //6. To display next Tuesday from current date
        DayOfWeek tuesday = DayOfWeek.TUESDAY;
        var tmp = TemporalAdjusters.next(tuesday);
        
        LocalDate nextTuesday = today.with(tmp);
        System.out.println("Next Tuesday on : " + nextTuesday);
    }
}
