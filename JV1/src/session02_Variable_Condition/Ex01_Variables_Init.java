package session02_Variable_Condition;

public class Ex01_Variables_Init {
    void testInit(){
        // 1. Literal init 
        String name = "Le A";
        int age = 20;
        float pi = 3.14f;

        // 2. Constructor init
        String date = new String("Today is 13/01/2024");
        // int rate = new Integer(20000); // deprecated 
        int rate = Integer.valueOf(20000); // new
        // long money = new Long(200000L); // deprecated 
        long money = Long.valueOf(2000_000L); // new

        String out = String.format("%s was %d years old, He was rent %d $ with rate = %d", name, age, money, rate);


        System.out.println("Pi = " + pi);
        System.out.println(date);

        System.out.println(out);
        
    }


    void testType(){
        int intVal = 10;
        Object intObj = intVal;
        double doubleVal = 100D;
        Object doubleObj = doubleVal;
        boolean booleanVal = false;
        Object booleanObj = booleanVal;
        String sVal = "OK";
        Object sObj = sVal;

        System.out.println("1. Type of intVal: " + intObj.getClass().getSimpleName());
        System.out.println("2. Type of doubleVal: " + doubleObj.getClass().getSimpleName());
        System.out.println("3. Type of booleanVal: " + booleanObj.getClass().getSimpleName());
        System.out.println("4. Type of sVal: " + sObj.getClass().getSimpleName());


    }


    public static void main(String[] args) {
        var ob = new Ex01_Variables_Init();
        ob.testInit();
        ob.testType();
    }
}
