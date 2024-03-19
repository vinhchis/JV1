package session05_InterfaceException;

interface IOne{
    String one ="Implicit: public, final and static";
    
    void display();
}

interface ITwo{
    default void defaultMethod(){
        privateMethod();
        privateStaticMethod();
    }
    
    private void privateMethod(){
        System.out.println("Hi! I'm Private Method!");
        
    }
    
    private static void privateStaticMethod(){
        //privateMethod();
        System.out.println("Hi, I'm a private static method!" );
    }
}

public class Ex01_Interface implements IOne, ITwo{
    
    @Override
    public void display(){
//        one = "test final"; //Implicit: public, final and static
        System.out.println(one);
    }
    
    public static void main(String[] args) {
//        new Ex01_Interface().display();
        IOne one = new Ex01_Interface();
        one.display();
        ITwo two = new Ex01_Interface();
        two.defaultMethod();
    }
}
