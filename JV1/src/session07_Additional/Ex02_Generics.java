package session07_Additional;

public class Ex02_Generics<T> {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    public static void main(String[] args) {
        Ex02_Generics<String> testString = new Ex02_Generics<>(); // Diamond -  an empty set of type arguments 
        var testInt = new Ex02_Generics<Integer>();
        
        testString.setType("I am String!!!");
        System.out.println(testString.getType());

        testInt.setType(Integer.SIZE);
        System.out.println("Integer Size: " + testInt.getType());
    }
}
