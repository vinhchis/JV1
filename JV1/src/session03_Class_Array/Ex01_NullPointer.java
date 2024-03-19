package session03_Class_Array;

public class Ex01_NullPointer {
    void sayHello()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Ex01_NullPointer test1;
        // Ex01_NullPointer test2;
        test1 = new Ex01_NullPointer();

        test1.sayHello();
        // test2.sayHello();// error - not be initialized

       
    }
}
