package session04_Package;

class Rectangle {
    final void draw(){
        System.out.println("A Rectangle is drawn");
    }
}

public class Ex05_FinalMethod extends Rectangle {
    public Ex05_FinalMethod() {
        System.out.println("1. Call though super methods");
        super.draw();

        System.out.println("2. Call class method directly");
        this.draw();
    }

    // @Override
    // public void draw() {
    //     System.out.println("3. Not override final method");
    //     super.draw();
    // }

    public static void main(String[] args) {
        new Ex05_FinalMethod();
    }

    
}
