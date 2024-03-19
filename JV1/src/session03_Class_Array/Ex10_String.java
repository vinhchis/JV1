package session03_Class_Array;

public class Ex10_String {
    public static void main(String[] args) {
        char[] ch = {'h', 'c', 'n', 'o', 'a'};

        for (int i = 0; i < ch.length; i++) {
            System.out.printf("ch[%d] = %c\n",i,ch[i]);
        }

        System.out.println("String: " + new String(ch));
    }
}
