package session02_Variable_Condition;

public class Ex07_Substring {
    public static void main(String[] args) {
        String url, name, extension;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter filename: ");
        // url = sc.nextLine();
        url = "home\\document\\chelsea.html";

        // Get extension
        int begin = url.lastIndexOf('\\');
        int end = url.lastIndexOf('.');
        name  = url.substring(begin + 1, end);
        extension = url.substring(end + 1);

        System.out.println("Name: " + name); // chelsea
        System.out.println("Extension: " + extension); // html

    }
}
