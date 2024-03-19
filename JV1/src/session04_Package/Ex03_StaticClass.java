package session04_Package;

/*
    - Static class has been created inside another class
    - Static class has only accessed from static variables outside of the class
*/

class Outer {
    public String name;
    private static int used = 0;

    public Outer() {
        this.name = "outer";
        used++;
    }

    public static class Inside {
        static int counter = 0;
        public int in = 0;

        public Inside() {
            Inside.counter++;
        }

        int countOuter() {
            return Outer.used;
        }

        void display() {
            // System.out.println("Name" + name); // can't not access
            System.out.println("Counter: " + counter);
        }
    }
}

public class Ex03_StaticClass {

    public static void main(String[] args) {
        // System.out.println("Can't use private static outside class: " + Outer.used);
        var o1 = new Outer();
        var o2 = new Outer();

        Outer.Inside ins1 = new Outer.Inside();
        Outer.Inside ins2 = new Outer.Inside();

        ins1.display();
        ins2.display();

        System.out.println("Count instances of outer class: " + ins2.countOuter());
        // System.out.println("Count instances of outer class: "+ ins1.countOuter()); //
        // same as above

    }
}
