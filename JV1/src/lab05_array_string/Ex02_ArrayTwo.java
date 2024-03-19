package lab05_array_string;

public class Ex02_ArrayTwo {
    public static void main(String[] args) {
        int[][] a = {{1,2,4}, {4,10,6},{2,4,6}};

        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.printf("\nMax: %d\n", max);
    }
}
