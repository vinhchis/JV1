package lab07_ihr_poly.Vehicle_System.app;

import lab07_ihr_poly.Vehicle_System.data.Vehicle;

public class VehicleCatalog {
    private Car[] vehicleList;

    private final int MAX = 10;
    private int next;

    public VehicleCatalog() {
        this.vehicleList = new Car[MAX];
        this.next = 0;
    }

    public void addRawData() {
        this.vehicleList[0] = new Car("123", "Sedan", "Toyota", 150.5f, 1200.0f, 25000, true);

        this.vehicleList[1] = new Car("456", "SUV", "Honda", 140.0f, 1600.0f, 30000, false);

        this.vehicleList[2] = new Car("789", "Hatchback", "Ford", 130.2f, 1100.0f, 20000, true);

        this.vehicleList[3] = new Car("101", "Convertible", "Chevrolet", 160.8f, 1400.0f, 35000, true);

        this.vehicleList[4] = new Car("202", "Coupe", "BMW", 155.3f, 1300.0f, 40000, true);

        this.next = 5;
    }

    public void addCar() {
        if (next == MAX) {
            System.out.println("The catalog is full");
        } else {
            var car = new Car();
            car.accept();

            this.vehicleList[next] = car;
            next++;
        }
    }

    public void displayAll() {
        if (next > 0) {
            System.out.println("\tAll cars in catalog:");
            for (int i = 0; i < next; i++) {
                System.out.printf("%d _ %s\n", i + 1, vehicleList[i]);
            }
        } else {
            System.out.println("The catalog is empty");
        }
    }

    public void searchByBrand(String sBrand) {
        if (next == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("Cars has brands = " + sBrand);
            boolean isFounded = false;

            for (int i = 0; i < next; i++) {
                if (this.vehicleList[i].getBrand().equalsIgnoreCase(sBrand)) {
                    System.out.println(this.vehicleList[i]);
                    isFounded = true;
                }
            }

            if (!isFounded) {
                System.out.println("Not found");
            }
        }
    }

    public void displayAllGpsCas() {
        if (next == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("List Car has GPS");
            int num = 0;

            for (int i = 0; i < next; i++) {
                if (this.vehicleList[i].getGps()) {
                    System.out.println(this.vehicleList[i]);
                    num += 1;
                }
            }

            if (num == 0) {
                System.out.println("All cars hasn't been installed gps yet!!!");
            }
        }
    }

    public void displayHighRank(int nPrice) {
        if (next == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("All cars having price greater than :" + nPrice + " $");
            int num = 0;

            for (int i = 0; i < next; i++) {
                if (this.vehicleList[i].getPrice() >= nPrice) {
                    System.out.println(this.vehicleList[i]);
                    num += 1;
                }
            }

            if (num == 0) {
                System.out.println("Cars not having price greater than " + nPrice);
            }
        }
    }
}
