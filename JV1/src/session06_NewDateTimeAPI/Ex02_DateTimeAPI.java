package session06_NewDateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;


public class Ex02_DateTimeAPI {
    
    void listOfZoneID(){
        var list = new ArrayList(ZoneId.getAvailableZoneIds());
        Collections.sort(list);
        ZoneId zoneId = ZoneId.systemDefault(); 
        LocalDateTime date = LocalDateTime.now();
        
        System.out.println("Vietnam Zone ID: " + zoneId);
        
        System.out.println("All Zone: ");
        
        for (var element : list) {
            zoneId = ZoneId.of((String)element);
            ZonedDateTime zone = date.atZone(zoneId);
            ZoneOffset offset = zone.getOffset();
       
            System.out.println(String.format("%30s\t[%s]", zoneId, offset));
        }
    }
    
    void someNewAPI(){
        ZoneId zoneId = ZoneId.of("Asia/Saigon");
        LocalDateTime today = LocalDateTime.now();
          
        System.out.println("current Year: " + Year.now());
        System.out.println("Timestamp with Instant: " + Instant.now());
        System.out.println("ZonedDateTime: " + ZonedDateTime.of(today, zoneId));
        System.out.println("LocalDate: " + LocalDate.now());
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + today);
    }
    void menu(){
        listOfZoneID();
        System.out.println("---------------------------------------------");
        someNewAPI();
    }

    public static void main(String[] args) {
        new Ex02_DateTimeAPI().menu();
    }
}
