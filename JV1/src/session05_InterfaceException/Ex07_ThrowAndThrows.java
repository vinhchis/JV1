package session05_InterfaceException;

import java.util.Scanner;

public class Ex07_ThrowAndThrows {

    void calculator() throws Exception{
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m (m != 0): "); //ArithmeticException || InputMismatchException
        m = sc.nextInt();
        if(m <= 0){
            throw new Exception("number must be greater than zero");
        }
    }

    public static void main(String[] args) {
        try{
            new Ex07_ThrowAndThrows().calculator();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
