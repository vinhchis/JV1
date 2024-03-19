package lab07_ihr_poly.Vehicle_System.data;

import java.util.Scanner;

public class Vehicle {
    protected String id;
    protected String name;
    protected String brand;
    protected float speed;
    protected float weight;
    protected int price;

    public Vehicle() {
        this.id = null;
        this.name = null;
        this.brand = null;
        this.speed = 0f;
        this.weight = 0f;
        this.price = 0;
    }

    public Vehicle(String id, String name, String brand, float speed, float weight, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.price = price;

    }

    protected void accept() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter id: ");
            this.id = sc.nextLine().trim();
        } while (this.id == null);

        do {
            System.out.println("Enter name: ");
            this.name = sc.nextLine().trim();
        } while (this.name == null);

        do {
            System.out.println("Enter brand: ");
            this.brand = sc.nextLine().trim();
        } while (this.brand == null);

        do {
            System.out.println("Enter speed: ");
            this.speed = Float.parseFloat(sc.nextLine().trim());
        } while (this.speed <= 0f);

        do {
            System.out.println("Enter weight: ");
            this.weight = Float.parseFloat(sc.nextLine().trim());
        } while (this.weight <= 0f);

        do {
            System.out.println("Enter price: ");
            this.price = Integer.parseInt(sc.nextLine().trim());
        } while (this.price <= 0);

    }
}
