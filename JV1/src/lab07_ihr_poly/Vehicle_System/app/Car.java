package lab07_ihr_poly.Vehicle_System.app;

import java.util.Scanner;

import lab07_ihr_poly.Vehicle_System.data.Vehicle;

public class Car extends Vehicle {
    private boolean gps;

    public Car() {
        super();
        this.gps = false;
    }

    public Car(String id, String name, String brand, float speed, float weight, int price, boolean gps) {   
        super(id, name, brand, speed, weight, price);
        this.gps = gps;
    }

    @Override
    public void accept() {
        super.accept();
        var sc = new Scanner(System.in);

        System.out.println("Does your car have gps: ");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        System.out.print("Enter your choice: ");
        int c = Integer.parseInt(sc.nextLine().trim());
        switch (c) {
            case 1 -> this.gps = true;
            case 2 -> this.gps = false;
            default -> throw new IllegalStateException("Unexpected value: " + c);

        }

    }

    public void printInfo() {
        System.out.println(this);
    }

    public boolean getGps() {
        return this.gps;
    }

    public int getPrice() {
        return this.price;
    }

    public String getBrand(){
        return this.brand;
    }

    @Override
    public String toString() {
        String str = String.format("CAR: %s - %s - %s - %s - %.2f km/h - %.2f kg - %d $",
                this.gps, this.id, this.name, this.brand, this.speed, this.weight, this.price);
        return str;
    }
}
