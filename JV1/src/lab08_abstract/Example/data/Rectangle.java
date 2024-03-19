package lab08_abstract.Example.data;

import java.util.Scanner;

public class Rectangle extends Shape {
    public float width;
    public float height;

    @Override
    public double getArea() {
       return width * height;
    }

    @Override
    public double getPeripheral() {
        return 2 * (width + height);
    }

    @Override
    public void input() {
        var sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        this.width = Float.parseFloat(sc.nextLine());
        System.out.print("Enter height: ");
        this.height = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void output() {
        System.out.printf("Rectangle (with width = %.2f and height = %.2f)\n", this.width, this.height);
        super.output();
    }
    
}
