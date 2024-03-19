package session04_Package;

/*
    - Override: compile time
    - Overload: run time
 */


public class Ex07_Polymorphism {
    void draw(int x){
        System.out.println("x: " + x);
    }   

    void draw(int x, int y){
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        var ob = new Ex07_Polymorphism();
        ob.draw(10);
        ob.draw(10, 20);
    }
}
