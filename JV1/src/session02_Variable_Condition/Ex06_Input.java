package session02_Variable_Condition;

import java.util.Scanner;

public class Ex06_Input {
    int code;
    String name;
    Scanner sc = new Scanner(System.in);

    void inputDirect(){
        System.out.println("Enter code: ");
        code = sc.nextInt();

        sc.nextLine(); // clear buffer (*important - when enter number before string)

        System.out.println("Enter name: ");
        name = sc.nextLine(); // nextLine() get "\n" in buffer -> incorrect

    }

    void inputIndirect(){
        System.out.println("Enter code: ");
        code = Integer.parseInt(sc.nextLine().trim());
        
        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println(code + " " + name);

    }

    void display(){
        System.out.printf("code: %d, name: %s", code, name);
    }

    public static void main(String[] args) {
        var input = new Ex06_Input();

        // 1. Direct
        // input.inputDirect();

        // 2. Indirect
        input.inputIndirect();

        input.display();
    }
}
