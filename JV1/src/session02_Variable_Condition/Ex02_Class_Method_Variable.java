package session02_Variable_Condition;

public class Ex02_Class_Method_Variable {
    String global = "Class Variable";

    public Ex02_Class_Method_Variable() {
        String local = "Method Variable";

        System.out.println(global + " end " + local);
    }

    public void display(){
        System.out.println(global);
        // System.out.println(local); //local cannot be resolved to a variable
    }
    public static void main(String[] args) {
        new Ex02_Class_Method_Variable().display();
    }
}
