package tutorial10_Helper;

import java.util.Scanner;

public class Helper {
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        String s = "";

        s = sc.nextLine();

        if(!s.isBlank()){
            s = s.trim();
        }

        return s;
    }


    public static boolean checkValid(String value){
        boolean isOk = true;

        if(value.isBlank()){
            isOk = false;
        }

        return isOk;
    }

    
}
