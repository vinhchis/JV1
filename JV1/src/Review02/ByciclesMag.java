package Review02;

import java.util.Scanner;

public class ByciclesMag {
    private int max;
    private int next;

    Bycicles[] bikes;
    Scanner sc = new Scanner(System.in);

    public ByciclesMag() {
        inputMax();
        bikes = new Bycicles[max];
        next = 0;
    }

    public void inputMax() {
        while (true) {
            try {
                System.out.println("Enter max: ");
                this.max = Integer.parseInt(sc.nextLine().trim());
                if (!(this.max > 1 && this.max < 100)) {
                    throw new BycicleException("Max must be value range > 1 and < 100.");
                }
                break;
            } catch (BycicleException e) {
                System.err.println("Bicycle Exception: " + e.getMessage());

            } 
            catch (Exception e) {
                System.err.println("Invalid Max - error: " + e.getMessage());
            }
        }

    }

    public void addBike() {
        if (next == max) {
            System.out.println("No more bycicles available");
        } else {
            bikes[next] = new Bycicles();
            while (true) {
                try {
                    System.out.println("Enter model: ");
                    bikes[next].setModel(sc.nextLine().trim());
                    if (bikes[next].getModel().isEmpty()) {
                        throw new Exception("model must not be empty");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid model - error: " + e.getMessage());
                }

            }

            while (true) {
                try {
                    System.out.println("Enter size: ");
                    bikes[next].setSize(Integer.parseInt(sc.nextLine().trim()));
                    if (!(bikes[next].getSize() > 10 && bikes[next].getSize() < 20)) {
                        throw new Exception("Wheel size by inch: Accepted value >10 and < 20");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid type - error: " + e.getMessage());
                }

            }

            while (true) {
                try {
                    System.out.println("Enter model: ");
                    bikes[next].setType(sc.nextLine().trim());
                    if (bikes[next].getType().isEmpty()) {
                        throw new Exception("Type must not be empty");
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid type - error: " + e.getMessage());
                }

            }
            next++;
        }
    }

    public void showBikes() {
        if (next == 0) {
            System.err.println("No bycicle to display");
        } else {
            for (int i = 0; i < this.next; i++) {
                System.out.println(bikes[i]);
            }

        }
    }
}
