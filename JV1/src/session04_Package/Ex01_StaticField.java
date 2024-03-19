package session04_Package;

class StaticField{
    static int count = 0;
    int cnt = 0;
    public StaticField() {
        count++;
        cnt++;
    }
}


public class Ex01_StaticField {
   
    public static void main(String[] args) {
        var first = new StaticField();
        System.out.printf("count: %d, cnt: %d\n", StaticField.count, first.cnt);
        var second = new StaticField();
        System.out.printf("count: %d, cnt: %d\n", StaticField.count, second.cnt);

    }
}
