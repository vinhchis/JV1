package lab08_abstract.Example.data;

import java.util.Scanner;

public class Circle extends Shape {
    public float radius;

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPeripheral() {
        return PI * 2 * radius; 
    }

    @Override
    public void input() {
        var sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = Float.parseFloat(sc.nextLine());
    }
    
    @Override
    public void output() {
        System.out.printf("Circle (with radius = %.2f)\n", this.radius);
        super.output();
    }
}
