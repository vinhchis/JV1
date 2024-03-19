package tutorial01_mvc;
//model

import java.util.Scanner;

public class DoiTuong {
    
    //1. Fields
    String code, name;
    Scanner sc = new Scanner(System.in);
    
    //2. Input by Default Constructor
    public DoiTuong(){
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }
    
    //3. Output
    @Override
    public String toString(){
        String s = "Code: "+ code + " \nName: " + name;
        return s;
    }      
}
