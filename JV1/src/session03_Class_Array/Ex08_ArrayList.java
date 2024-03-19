package session03_Class_Array;

import java.util.ArrayList;

public class Ex08_ArrayList {
    public static void main(String[] args) {
        var list = new ArrayList();
        int sum = 0;
        
        // Add
        for (int i = 0; i < 5; i++) {
            list.add(i + 1); // Boxing
        }

        // Read num and sum of elements
         // Add
         for (int i = 0; i < 5; i++) {
            sum += (int)list.get(i); // Unboxing
        }

        System.out.println(sum);
    }
}
