package lab08_abstract.Example.data;

public abstract class Shape {
    public double PI = 3.14;

    public abstract double getArea();

    public abstract double getPeripheral();

    public abstract void input();

    public void output(){
        System.out.printf("\tArea: %.2f \n", getArea());
        System.out.printf("\tPeripheral: %.2f \n", getPeripheral());
    }
}
