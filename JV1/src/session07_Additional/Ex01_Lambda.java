package session07_Additional;

@FunctionalInterface // Annotation
interface Calculator{
    int cal(int x, int y);
}

@FunctionalInterface // Annotation
interface ShowMessage{
    void show(String s);
}


public class Ex01_Lambda {
    public static int getMethod(int x, int y, Calculator calculator){
        return calculator.cal(x, y);
    }

    public static void main(String[] args) {
        ShowMessage first, second;
        Calculator add, sub, multi, div;
    
        // 1. Without parameters
        first = s -> System.out.println("First: " + s);

        // 2. Using parameters
        second = s -> {
            System.out.println("----------------");
            System.out.println("Second: " + s);
            System.out.println("----------------");
        };

        first.show("Hello, world!");
        second.show("Hello, world!");

        // 3. without type declaration
        add = (x, y) -> x + y;
        System.out.println("Sum 1 + 2 = " + getMethod(1, 2, add));

        // 4. Using type declaration
        sub = (int x, int y) -> x - y;
        System.out.println("Sum 1 - 2 = " + getMethod(1, 2, sub));

        // 5. Using curly braces
        multi = (n, m) -> {
            return n * m;
        };
        System.out.println("Sum 1 * 2 = " + getMethod(1, 2, multi));

        div = (x, y) -> x / y;
        System.out.println("Sum 1 / 2 = " + getMethod(1, 2, div));
        

    }
}
