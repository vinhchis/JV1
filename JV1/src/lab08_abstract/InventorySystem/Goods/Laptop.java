package lab08_abstract.InventorySystem.Goods;

import java.util.Scanner;

public class Laptop extends Computer {
    public boolean webcam;
    public int QoH;
    

    public Laptop() {
        super();
        this.webcam = false;
        this.QoH = 0;
    }

    public Laptop(String id, String name, int price, boolean webcam, int QoH) {
        super(id, name, price);
        this.webcam = webcam;
        this.QoH = QoH;
    }

    @Override
    public void accept(){
        super.accept();
        var sc = new Scanner(System.in);

        System.out.println("Do your computer have webcam?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        System.out.print("Enter your choice:");
        int c = Integer.parseInt(sc.nextLine().trim()); 
        switch (c) {
            case 1 -> this.webcam = true;
            case 2 -> this.webcam = false;    
            default -> System.out.println("Invalid choice");
        }
            
        do {
            System.out.println("Enter QoH: ");
            this.QoH = Integer.parseInt(sc.nextLine().trim());
        } while (this.QoH < 0);

    }

    public int getAmount(){
        return this.QoH * this.price;
    }

    @Override
    public void printInfo() {
        System.out.println("Detail information");
        System.out.println("\tID: " + this.id);
        System.out.println("\tName: " + this.name);
        System.out.println("\tPrice: " + this.price);
        System.out.println("\tWebcam: " + this.webcam);
        System.out.println("\tQoH: " + this.QoH);
        System.out.printf("\tAmount: %d", getAmount());

    }

    @Override
    public String toString() {
        String str = String.format("Laptop(%s) : %s - %d - %s - %d - %d", id, name, price, webcam, QoH, getAmount());
        return str;
    }
    
}
