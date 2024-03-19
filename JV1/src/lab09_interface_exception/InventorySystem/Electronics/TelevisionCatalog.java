package lab09_interface_exception.InventorySystem.Electronics;

import java.util.ArrayList;

public class TelevisionCatalog {
    private ArrayList<Television> tvList;
    private final int MAX = 10; 

    public TelevisionCatalog() {
        tvList = new ArrayList<Television>();
    }

    public void addRawData(){
        tvList.add(new Television("1", "Sony X1","Sony", 1000, 10 ));
        tvList.add(new Television("2", "TCL T2","TCL", 300, 5 ));
        tvList.add(new Television("3", "Sony Z5","Sony", 2000, 2 ));
        tvList.add(new Television("4", "LQ OLED","LQ", 400, 1 ));
        tvList.add(new Television("5", "Samsung QA123","Samsung", 1200, 8 ));

    }

    public void add(){
        if(tvList.size() == MAX){
            System.out.println("No space available");
        }

        var tv = new Television();
        tv.accept();
        tvList.add(tv);
    }

    public void searchByBrand(String sBrand){
        if(tvList.size() == 0){
            System.out.println("List is empty");
        }else{
            System.out.printf("Televisions belong \'%s\'\n", sBrand);
            tvList.stream().filter(tv -> tv.getBrand().equals(sBrand))
                .toList().forEach(tv -> System.out.println(tv));
        }
    }   

    public void displayAll(){
        if(tvList.size() == 0){
            System.out.println("List is empty");
        }else{
            System.out.println("\t List Television");
            tvList.stream().toList().forEach(tv -> System.out.println(tv));
        }
    }

    public void displayHighValue(){
        int price = 500;
        if(tvList.size() == 0){
            System.out.println("List is empty");
        }else{
            System.out.printf("Televisions with the price above %d\n", price);
            tvList.stream().filter(tv -> tv.getPrice() > price)
                .toList().forEach(tv -> System.out.println(tv));
        }
    }

}
