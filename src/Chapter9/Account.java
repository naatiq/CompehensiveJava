package Chapter9;

import java.util.Date;

/**
 * Created by naatiqullahmohammed on 27/06/14.
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    private Account(){
        dateCreated = new Date();
    }

    private Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Current Balance: "+ balance
                +"\nMonthly Interest: " + getMonthlyInterest()
                +"\nAccount Created on: "+dateCreated;
    }

    public static void main(String[] args) {
        Account ac = new Account(1112, 20000);
        Account.setAnnualInterestRate(0.045);
        ac.withdraw(2500);
        ac.deposit(3000);
        System.out.println(ac);
    }
}
