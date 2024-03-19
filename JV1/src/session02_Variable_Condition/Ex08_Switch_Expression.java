package session02_Variable_Condition;

import java.util.Scanner;

public class Ex08_Switch_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your level(A - D): ");
        var str = sc.nextLine();
        sc.close();

        var result = switch (str) {
            case "A" -> 100;
            case "B" -> 90;
            case "C" -> 80;
            case "D" -> 50;
            default -> {
                throw new IllegalStateException("Unexpected value: " + str);
            }
        };
        
        System.out.println("Your mark: " + result + " point");
    }
}
