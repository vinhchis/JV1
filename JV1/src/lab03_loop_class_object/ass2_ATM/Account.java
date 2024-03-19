package lab03_loop_class_object.ass2_ATM;

public class Account {
    private String accNo;
    private int balance;

    public Account() {
        this.accNo = "N-0";
        this.balance = 0;
    }

    public Account(String no, int balance) {
        this.accNo = no;
        this.balance = balance;
    }

     public String getNo() {
        return this.accNo;
    }
    public int getBalance() {
        return this.balance;
    }

    public void displayBalance(){
        System.out.printf("Your balance: %d$\n", this.balance);
    }

    public void deposit(int money) throws IllegalArgumentException{
        if(money < 0 || money % 100 != 0){
            throw new IllegalArgumentException("Money must be positive and  module 100!");
        }
        this.balance += money;

        System.out.printf("You has just deposited %d$ to account\n", money);
        displayBalance();
    }

    public void withdraw(int money) {
        this.balance -= money;
        displayBalance();
    }


}
