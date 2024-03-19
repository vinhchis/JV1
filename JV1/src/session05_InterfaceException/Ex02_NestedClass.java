package session05_InterfaceException;

class Outer {

    public String printer = "Canon NPB Laser 6600";
    private String scannerMachine = "HP Injet 1100";
    protected String television = "SamSung 80 inch";
    //default
    String airConditioner = "Aqua";
    static String laptop = "Thinkpad X1 Carbon";

    class NestedClass {

        void display() {
            System.out.println("Public " + printer);
            System.out.println("Private " + scannerMachine);
            System.out.println("Protected " + television);
            System.out.println("Default " + airConditioner);
            System.out.println("Static: " + laptop);
        }
    }
}

public class Ex02_NestedClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.NestedClass run = outer.new NestedClass();
        run.display();
    }
}
