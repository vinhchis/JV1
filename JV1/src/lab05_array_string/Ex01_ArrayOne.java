package lab05_array_string;

public class Ex01_ArrayOne {
    public static void main(String[] args) {
        int[] a = { 10, 6, 20, 123, -23, 20 };

        System.out.print("Elements in array[0 - n]:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }

        System.out.print("\nElements in array[n - 1]:");
        for (int i = a.length - 1; i > 0; i--) {
            System.out.printf("%4d", a[i]);
        }
    }

}
