package lab02_var_condition;

import java.util.Scanner;

/*
 * Lập trình điều kiện, sử dụng cấu trúc switch-case. 
 * Viết chương trình nhập 1 số nguyên [0-6], in ra thứ trong tuần tương ứng. 
 */
public class Ex03_DayOfWeek {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Enter a number[0-6] equal day from Monday to Sunday: ");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.err.println("Monday");
                break;
            case 1:
                System.err.println("Tuesday");
                break;
            case 2:
                System.err.println("Wednesday");
                break;
            case 3:
                System.err.println("Thursday");
                break;
            case 4:
                System.err.println("Friday");
                break;
            case 5:
                System.err.println("Saturday");
                break;
            case 6:
                System.err.println("Sunday");
                break;

            default:
                System.err.println("Number out of [0-6]");
                break;
        }

        sc.close();
    }
}
