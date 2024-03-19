package session03_Class_Array;

class Subject{
    private int marks = 39;

    public int getMarks() {
        // Conditions
        return marks;
    }

    public void setMarks(int marks) {
        // Conditions
        this.marks = marks;
    }
}

public class Ex03_Getter_Setter {

    public static void main(String[] args) {
        var std = new Subject();

        // std.mark = 100; // can't assign private field
        System.out.println("Before -  Marks: " + std.getMarks()); // 39

        std.setMarks(100);
        System.out.println("After - Marks: " + std.getMarks()); // 100
    }
}
