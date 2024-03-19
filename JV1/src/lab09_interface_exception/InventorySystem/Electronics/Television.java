package lab09_interface_exception.InventorySystem.Electronics;

import java.util.Scanner;

import lab09_interface_exception.InventorySystem.Goods.ITax;
import lab09_interface_exception.InventorySystem.Goods.Product;



public class Television extends Product implements ITax {
    private String brand;
    private int price;
    private int QoH;

    public Television() {
        super();
        brand = "Java";
        price = 0;
        QoH = -1;
    }

    public Television(String id, String name, String brand, int price, int QoH) {
        super(id, name);
        this.brand = brand;
        this.price = price;
        this.QoH = QoH;
    }

    @Override
    protected void accept(){
        super.accept();
        var sc = new Scanner(System.in);

        while(true){
            try {
                System.out.println("Enter brand: ");
                this.brand = sc.nextLine().trim();
                if(this.brand.isEmpty()){
                    throw new Exception("Brand must not be empty");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid brand: " + e.getMessage());
            }
        }

        while(true){
            try {
                System.out.println("Enter price: ");
                this.price = Integer.parseInt(sc.nextLine().trim());
                if(this.price <= 0){
                    throw new Exception("Price must be greater than zero");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid price: " + e.getMessage());
            }
        }

        while(true){
            try {
                System.out.println("Enter QoH: ");
                this.QoH = Integer.parseInt(sc.nextLine().trim());
                if(this.QoH <= 0){
                    throw new Exception("QoH must be greater than zero");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid QoH: " + e.getMessage());
            }
        }
        
        
    }


    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }
    @Override
    public void printInfo() {
       System.out.println("Television information");
       System.out.println("\tId: " + this.id);
       System.out.println("\tName: " + this.name);
       System.out.println("\tPrice: " + this.price);
       System.out.println("\tQoH: " + this.QoH);
       System.out.println("\tCost: " + getCost());
       System.out.println("\tAmount " + this.QoH * getCost());

    }

    @Override
    public float getCost() {
        return price * (1  - ITax.VAT_TAX_PERCENT);
    }

    @Override
    public String toString() {
        return String.format("Television(%s): %s - %s - %d - %d - %.2f - %.2f",
                this.id, this.name, this.brand, this.price, this.QoH, getCost() ,this.QoH * getCost());
    }


    
}
