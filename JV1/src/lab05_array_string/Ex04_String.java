package lab05_array_string;

public class Ex04_String {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("String length is: " + s.length());
        System.out.println("Character at index 2 is: " + s.charAt(2));

        System.out.println("Concatenated string is: " + s.concat("World"));
        System.out.println("String comparison is: " + s.compareTo("World"));

        System.out.println("Index of o is: " + s.indexOf("o"));
        System.out.println("Last index of 1 is: " + s.lastIndexOf("1"));

        System.out.println("Replaced string is: " + s.replace('e', 'a'));
        System.out.println("Substring is: " + s.substring(2, 5));

        String s1 = " Hello ";
        System.out.println("Untrimmed string is: " + s1);
        System.out.println("Trimmed string is: " + s1.trim());
    }

}