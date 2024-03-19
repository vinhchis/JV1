package lab04_method;

public class Ex04_VarArg {

    public void add(int... num){
        int sum = 0;

        for(int i:num){
            sum += i;
        }
        
        System.out.printf("Sum = %d\n", sum);;
    }
    public static void main(String[] args) {
        var varArg = new Ex04_VarArg();

        varArg.add(1, 2, 5, 7);
    }
}
