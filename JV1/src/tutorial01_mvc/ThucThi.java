package tutorial01_mvc;
//view
public class ThucThi {
    void menu(){
        var quanLy = new QuanLy();
        System.out.println("menu");
        quanLy.addNew();
        quanLy.display();
    }
    public static void main(String[] args) {
        new ThucThi().menu();
    }
}
