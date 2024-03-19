package session03_Class_Array;

import java.util.Iterator;
import java.util.Vector;

public class Ex09_Vector {
    public static void main(String[] args) {
        var vector = new Vector();
        for (int i = 0; i < 5;i++){
            vector.add(i + 1);
        }

        Iterator element = vector.iterator();

        while(element.hasNext()){
            System.out.println(element.next());

        }
    }
}
