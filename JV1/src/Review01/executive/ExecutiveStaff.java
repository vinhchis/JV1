package Review01.executive;

import java.util.Scanner;

public class ExecutiveStaff extends Staff {
    private int salary;
    private int bonus;

    public ExecutiveStaff() {
        this.id = "NO";
        this.name = "Le Van A";
        this.salary = 0;
        
        this.bonus = 0;
    }
    
    public ExecutiveStaff(String id, String name, int salary, int bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public int getSalary() {
        return this.salary;
    }
    
    @Override
    public void input() {
        var sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter id: ");
                this.id = sc.nextLine().trim();
                if (this.id.isEmpty()) {
                    throw new Exception("Id must not be empty");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid id - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter name: ");
                this.name = sc.nextLine().trim();
                if (this.name.isEmpty()) {
                    throw new Exception("Name must not be empty");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid name - error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter salary: ");
                this.salary = Integer.parseInt(sc.nextLine());
                if (this.salary > 1000 || this.salary < 500) {
                    throw new Exception("Salary must have value between 500 and 1000");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid salary - " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter bonus: ");
                this.bonus = Integer.parseInt(sc.nextLine());
                if (this.bonus > 1000 || this.bonus < 0) {
                    throw new Exception("Salary must have value between 0 and 100");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid bonus - " + e.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return String.format("E_Staff(%2s): %10s | %5d | %d", this.id, this.name, this.salary, this.bonus);
    }

}
