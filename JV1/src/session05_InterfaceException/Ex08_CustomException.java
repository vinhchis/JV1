package session05_InterfaceException;

import java.util.Scanner;

class MyException extends Exception {

    public MyException(String s) {
        super(s);
    }

}

public class Ex08_CustomException {

    void input() throws MyException {
        Scanner sc = new Scanner(System.in);
        String code;
        System.out.println("Enter code: ");
        code = sc.nextLine();
        if (code.isBlank()) {
            throw new MyException("Code is required");
        }
    }

    public static void main(String[] args) {
        try {
            new Ex08_CustomException().input();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
}
