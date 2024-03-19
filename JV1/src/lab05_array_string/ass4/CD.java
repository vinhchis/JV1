package lab05_array_string.ass4;

import java.util.Scanner;

enum Type {
    Audio,
    Video
}

public class CD {
    private int id;
    private String title;
    private Type type;
    private int price;
    private int year;

    public CD() {
        input();
    }

    public CD(int id, String title, Type type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id: ");
        id = sc.nextInt();

        System.out.print("Enter title: ");
        sc.nextLine();
        title = sc.nextLine();

        System.out.println("Enter type: ");
        System.out.println("\t1. Audio");
        System.out.println("\t2. Video");
        System.out.print("\tEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                this.type = Type.Audio;
                break;
            case 2:
                this.type = Type.Video;
                break;
            default:
                System.err.println("Invalid choice: " + choice);
                break;
        }

        System.out.print("Enter price: ");
        price = sc.nextInt();

        System.out.print("Enter year: ");
        year = sc.nextInt();


    }

  
    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

}
