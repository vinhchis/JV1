package tutorial10_Helper;

public class Test implements InnerTest {
    String code;
    String name;

    public Test() {
        code = input("name");

        name = input("name");
    }

    @Override
    public String input(String name) {
        String s = "";
        while(true){
            try {
                System.out.printf("Enter %s: ", name);
                s = Helper.getString();
        
                if(!Helper.checkValid(s)){
                    throw new Exception("String must not be empty");
                }
                break;
            } catch (Exception e) {
                System.err.println("Invalid String");
            }
        }
        
        return s;
       
    }

    public static void main(String[] args) {
        Test test = new Test();

    }

}
