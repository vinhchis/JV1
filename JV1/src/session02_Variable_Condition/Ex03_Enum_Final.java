package session02_Variable_Condition;

/*
    Constants variables: final keyword + variable declaration 
 */
enum DAY {
    Mon,
    Tue,
    Wed,
    Thu,
    Fri,
    Sat,
    Sun
}

public class Ex03_Enum_Final {
    final String HEADER = "Welcome To My Channel!!!";

    public Ex03_Enum_Final() {
        // HEADER = "It is constant"; // error
        System.out.println(HEADER);
    }

    void display(DAY day) {
        String today = switch (day) 
        {
            case Mon -> "Monday";
            case Tue -> "Tuesday";
            case Wed -> "Wednesday";
            case Thu -> "Thursday";
            case Fri -> "Friday";
            case Sat -> "Saturday";
            case Sun -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println("\tToday is " + today);
    }

    public static void main(String[] args) {
        new Ex03_Enum_Final().display(DAY.Sun);
    }
}
