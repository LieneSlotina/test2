package lv.javaguru.demo;

public class BankImproved {
    int balance;

    public void deposit(int amount) {
        this.balance = balance + amount;
        System.out.println("You have deposited " + amount + " EUR");
    }

    public void withdraw(int amount) {
        this.balance = balance - amount;
        System.out.println("You have withdrawn " + amount + " EUR");
    }

    public void checkBalance() {
        System.out.println("You have " + balance + " EUR");
    }
}
