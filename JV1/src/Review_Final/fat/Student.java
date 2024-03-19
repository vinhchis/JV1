package Review_Final.fat;

public class Student {
    private int Id;
    private String Name;
    private String Batch;
    private float Java_Mark;
    private float PHP_Mark;
    private float CSharp_Mark;

    public Student() {
        this.Id = -1;
        this.Name = "No";
        this.Batch = "FPT";
        this.Java_Mark = 0f;
        this.PHP_Mark = 0f;
        this.CSharp_Mark = 0f;
    }

    public Student(int id, String name, String Batch, float Java_Mark, float PHP_Mark, float CSharp_Mark) {
        this.Id = id;
        this.Name = name;
        this.Batch = Batch;
        this.Java_Mark = Java_Mark;
        this.PHP_Mark = PHP_Mark;
        this.CSharp_Mark = CSharp_Mark;
    }

    public int getId() {
        return Id;
    }
    public void printStudent(){
        System.out.printf("Student : {id: %02d, Name: %10s, Batch: %5s, Java mark: %.2f, PHP mark: %.2f, C# mark: %.2f}\n",
         this.Id, this.Name, this.Batch, this.Java_Mark, this.Java_Mark, this.CSharp_Mark);
    }
}
