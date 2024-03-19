package session07_Additional;

@interface MyAnnotation{

}

@interface Additional_Feature{
    String language();
    String chapter();
}

public class Ex04_Annotations {

    @MyAnnotation
    @Additional_Feature(language = "Java", chapter = "11")
    public static void main(String[] args) {
        System.out.println("Annotations in Java");
    }
   
}
