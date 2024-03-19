package session05_InterfaceException;

class OuterClass {

    public String printer = "Canon NPB Laser 6600";
    private String scannerMachine = "HP Injet 1100";
    protected String television = "SamSung 80 inch";
    //default
    String airConditioner = "Aqua";
    static String laptop = "Thinkpad X1 Carbon";

    void show() {
        class LocalClass {
            
            String s = "Hi, I'm Local Class";
            
            void display() {
                System.out.println("Public " + printer);
                System.out.println("Private " + scannerMachine);
                System.out.println("Protected " + television);
                System.out.println("Default " + airConditioner);
                System.out.println("Static: " + laptop);
            }
        }//end Local Class
        
        var local = new LocalClass();;
        local.display();
        System.out.println(local.s);
        
    }//end show method
}

public class Ex03_LocalClass {
    public static void main(String[] args) {
        var outer = new OuterClass();
        outer.show();
    }
}
