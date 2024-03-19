package session04_Package;

class Base{
    int money = 100;

    // implicit: virtual method => can override  
    void display(){
        money += 10;
        System.out.println("Money: " + money);
    }
}

class Derived extends Base{
    public Derived() {
        super.display();
        display();
    }

    @Override
    void display(){
        money += 50;
        System.out.println("Money: " + money);
    }
}

public class Ex08_VirtualMethod {
    public static void main(String[] args) {
        var ob = new Derived();
    }
}
