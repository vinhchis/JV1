package Review03.academy;

public class Worker {
    private int ID;
    private String name, address;
    private int year_of_birth;

    public Worker() {
        ID = 0;
        name = "Le Van A";
        address = "HCM";
        year_of_birth = 2023;
    }

    public int getID() {
        return ID;
    }

    public Worker(int id, String name, String address, int year_of_birth) {
        this.ID = id;
        this.name = name;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    @Override
    public String toString() {
        return String.format("Worker(%02d): name = %10s | address = %20s | yob = %4d", ID, name, address, year_of_birth);
    }
}
