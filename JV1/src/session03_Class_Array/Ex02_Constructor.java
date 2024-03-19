package session03_Class_Array;

public class Ex02_Constructor {
    // 1. Fields
    String code, name;

    // 2.1 Default Constructor
    public Ex02_Constructor() {
        this.code = "0";
        this.name = "NONE";
    }

    // 2.2. Parameters Constructor
    public Ex02_Constructor(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Code: " + this.code + ", Name: " + this.name;
    }

    public static void main(String[] args) {
        Ex02_Constructor std1, std2;

        std1 = new Ex02_Constructor();
        System.out.println("Default: " + std1); // Default: Code: 0, Name: NONE


        std2 = new Ex02_Constructor("001", "Standard"); // Parameter: Code: 001, Name: Standard
        System.out.println("Parameter: " + std2);
    }
}
