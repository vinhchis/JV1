package lab08_abstract.InventorySystem.Goods;

public class LaptopCatalog {
    private Laptop[] cList;
    private final int MAX = 10;
    private int cnt;

    public LaptopCatalog() {
        this.cList = new Laptop[MAX];
        this.cnt = 0;
    }

    public void addRawData(){
        cList[0] = new Laptop("1","HP ZBOOK", 2000, true, 5);
        cList[1] = new Laptop("2","Asus Z78", 3000, false, 1);
        cList[2] = new Laptop("3","Novebook", 2000, true, 5);
        cList[3] = new Laptop("4","Intel I9", 9000, true, 20);
        cList[4] = new Laptop("5","HP ProBook", 1500, false, 6);
        cnt = 5;

    }

    public void addLaptop(){
         if (cnt == MAX) {
            System.out.println("The catalog is full");
        } else {
            var lap = new Laptop();
            lap.accept();

            this.cList[cnt] = lap;
            cnt++;
        }
    }

    public void search(String sName){
        if (cnt == 0) {
            System.out.println("No Data Available");
        } else {
            System.out.println("Laptop has Name = " + sName);
            boolean isFounded = false;

            for (int i = 0; i < cnt; i++) {
                if (this.cList[i].name.equalsIgnoreCase(sName)) {
                    System.out.println(this.cList[i]);
                    isFounded = true;
                }
            }

            if (!isFounded) {
                System.out.println("Not found");
            }
        }
    }

    public void displayAll(){
        if (cnt > 0) {
            System.out.println("\tAll cars in catalog:");
            for (int i = 0; i < cnt; i++) {
                System.out.printf("%d _ %s\n", i + 1, cList[i]);
            }
        } else {
            System.out.println("The catalog is empty");
        }
    }

    public void remove(String sID){
        if (cnt == 0) {
            System.out.println("No Data Available");
        } else {
            for (int i = 0; i < cnt; i++) {
                if (cList[i].id.equals(sID)) {
                    cList[i] = null;
                    // replace cnt
                    for (int j = i; j < cnt; j++) {
                        cList[j] = cList[j + 1];
                    }

                    cnt--;
                    System.out.printf("Successfully removed (id = %s)\n", sID);
                    return;
                }

            }

            System.out.println("Not found");

        }
    }
}
