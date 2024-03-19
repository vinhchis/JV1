package Review_EduNext.hospital;

public class Patient {
    private int ID;
    private String fullname;
    private String address;
    private int year_of_birth;

    public Patient() {
        this.ID = 0;
        this.fullname = "";
        this.address = "";
        this.year_of_birth = 0;
    }


    public Patient(int id, String fullname, String address, int year_of_birth) {
        this.ID = id;
        this.fullname = fullname;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return String.format("patient(%02d)[ name: %10s | address: %10s | yob: %4d ]",
            this.ID, this.fullname, this.address, this.year_of_birth);
    }
}
