package lab04_method;

public class Ex03_PassByRef {

    public void calSquare(Circle c, double radius) {
        c.radius = radius;
        c.area = c.radius * c.radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        var demo = new Ex03_PassByRef();

        System.out.printf("Before - with Circle.radius =  %.2f, Circle.area = %.2f\n", c.radius, c.area);
        demo.calSquare(c, 10);
        System.out.printf("After - with  Circle.radius =  %.2f, Circle.area = %.2f\n", c.radius, c.area);

    }
}
