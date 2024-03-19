package session05_InterfaceException;


public class Ex05_Exception {
    int[] num = {1, 3, 5};
    
    void testError(){
        System.out.println("The last element: " + num[3]);
    }
    
    void testTryCatch(){
        try{
            System.out.println("The last element: " + num[3]);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("1. " + e.toString());
            System.out.println("2. " + e.getMessage());
            System.err.println("3. Error!" );
        }
    }
    public static void main(String[] args) {
//        new Ex05_Exception().testError();
        new Ex05_Exception().testTryCatch();
    }
}
