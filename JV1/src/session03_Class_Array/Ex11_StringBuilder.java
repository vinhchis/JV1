package session03_Class_Array;

public class Ex11_StringBuilder {
    public static void main(String[] args) {
        String email = "test@example.com";
        String phone = "01229099248";

        // message
        StringBuilder sb = new StringBuilder();
        sb.append("Your information\n");
        sb.append("------------------------------\n");
        sb.append("Email: ");
        sb.append(email);
        sb.append("\n");
        sb.append("Phone: ");
        sb.append(phone);
        sb.append("\n------------------------------");
        System.out.println(sb);
    }
}
