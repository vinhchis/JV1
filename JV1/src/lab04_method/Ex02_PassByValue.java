package lab04_method;

class Ex02_PassByValue {

    public void setVal(int n) {
        n += 10;
    }

    public static void main(String[] args) {
        Ex02_PassByValue obj = new Ex02_PassByValue();
        int n = 10;

        obj.setVal(n);

        System.out.printf("N after use pass by value: %d\n", n);
    }

}