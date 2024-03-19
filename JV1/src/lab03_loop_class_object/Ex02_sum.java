package lab03_loop_class_object;

public class Ex02_sum {
    public static void main(String[] args) {
        int n;
        int i =1, sum=0;

        n = 20;
        while(i <= n){
            sum += i;
            i++;
        }

        System.out.printf("Sum of number[1-%d]: %d", n, sum);
    }
}
