package session05_InterfaceException;

interface Retango{
    void show();
}

abstract class Polygon{
    abstract void display();
}

class Anonymous{
    
    void addNew(){
        Retango retango = new Retango(){
            @Override
            public void show(){
                System.out.println("Override show from interface Retango");
            }
        };
        retango.show();
    }//end addNew methos
    
    void search(){
        //
        Polygon polygon = new Polygon(){
            @Override
            public void display(){
                System.out.println("Override display from abstract class polygon!");
            }
        };
        polygon.display();
    }//end search method
}//end anonymous method

public class Ex04_AnonymousClass {
    public static void main(String[] args) {
        var anonymous = new Anonymous();
        anonymous.addNew();
        anonymous.search();
    }
}
