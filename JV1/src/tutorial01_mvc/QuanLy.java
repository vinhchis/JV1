package tutorial01_mvc;
//controller
public class QuanLy {
    DoiTuong doiTuong;
    void addNew(){
//        System.out.println("addnew");
        doiTuong = new DoiTuong();
    }
    
    void display(){
//        System.out.println("display");
        System.out.println(doiTuong);
    }
    public static void main(String[] args) {
        new QuanLy().display();
    }
}
