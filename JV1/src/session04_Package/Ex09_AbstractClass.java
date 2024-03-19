package session04_Package;

import java.util.Scanner;

abstract class Shape {
    public abstract void input();

    public int area() {
        return 10;
    }
}

class Square extends Shape {
    int width;
    int height;

    public Square() {
        input();
    }

    @Override
    public void input() {
        var sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        this.width = Integer.parseInt(sc.nextLine());
        System.out.println("Enter height: ");
        this.height = Integer.parseInt(sc.nextLine());
    }

    @Override
    public int area() {
        return width * height + super.area();
    }

    @Override
    public String toString() {
        return String.format("width: %d _ height: %d _ area = %d", width, height, area());
    }
}

public class Ex09_AbstractClass {
    public static void main(String[] args) {
        var sq = new Square();

        System.out.println(sq);
        
    }
}
