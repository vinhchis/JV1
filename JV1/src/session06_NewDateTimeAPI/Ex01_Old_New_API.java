package session06_NewDateTimeAPI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/*
    UTC - Coordinated Universal Time
    ICT - Indochina Time
*/
public class Ex01_Old_New_API {
    SimpleDateFormat simple;
    DateTimeFormatter pattern;
    
    public Ex01_Old_New_API(){
         simple     = new SimpleDateFormat("dd/MMM/yyyy");
         pattern    = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
    void oldAPI(){
        //Date
        Date today = new Date();
        var dd = today.getDay();
        var mm = today .getMonth();
        
        System.out.println("1. [Simple with Date]");
        String sDate = String.format("Date Index of:\n+ Day (Mon - Sunday): %s\n+ Month (Jan - Dec): %s", dd, mm);
        System.out.println(sDate);
        System.out.println("Today [Date]: " + today);
        System.out.println("Today [format Date]: " + simple.format(today));
        
        //Calendar - days of week (1 - 7)
        TimeZone hcmc = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
        Calendar calendar = Calendar.getInstance(hcmc);
        var day = calendar.get(Calendar.DAY_OF_WEEK);
        var month = calendar.get(Calendar.MONTH);
        
        System.out.println("2. [Localization with Calendar]");
        String sCalendar = String.format("Calendar Index of:\n+ Day (Mon - Sunday): %s\n+ Month (Jan - Dec): %s", day, month);
        System.out.println(sCalendar);
        System.out.println("Today [Calendar]: " + calendar);
        System.out.println("Today [format Calendar]: " + simple.format(calendar.getTime()));      
    }
    void newAPI(){
        LocalDate today = LocalDate.now();
        var dd = today.getDayOfWeek();
        var mm = today .getMonth();
        String dateFormat = String.format("Display the name of:\n+ Day (Mon - Sunday): %s\n+ Month (Jan - Dec): %s", dd, mm);
        System.out.println(dateFormat);
        System.out.println("Today [LocalDate]: " + today);
        System.out.println("Today [format LocalDate]: " + today.format(pattern));
    }
    public static void main(String[] args) {
        new Ex01_Old_New_API().oldAPI();
        System.out.println("--------------");
        new Ex01_Old_New_API().newAPI();
    }
}