package lab08_abstract.Example.app;

import lab08_abstract.Example.data.*;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.input();
        circle.output();


        Rectangle rec = new Rectangle();
        rec.input();
        rec.output();
    }
}
