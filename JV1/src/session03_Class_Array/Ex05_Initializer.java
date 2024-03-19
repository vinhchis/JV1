package session03_Class_Array;

public class Ex05_Initializer {
    // Instance Initializer
    String name = "Nguyen Van A";
    int marks = 100;
    String batch, subject, course;

    // Block Initializer
    {
        batch = "T5.2206.E1";
        subject = "Java";
        course = "ACCP-7091";
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %s - %s - %s", name, marks, batch, subject, course);
    }

    public static void main(String[] args) {
        System.out.println(new Ex05_Initializer());
    }
}
