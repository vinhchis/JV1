package Review02;

public class Bycicles {
    private String model;
    private int size;
    private String type;

    public Bycicles() {
        this.model = "";
        this.size = 0;
        this.type = "";
    }

    public Bycicles(String model, int size, String type) {
        this.model = model;
        this.size = size;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("model: %s, size: %d, type: %s", model, size, type);
    }
}
