/*Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 0₹).
• A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the
account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named getMonthlyInterest() that returns the monthly interest.
• A method named withdraw that withdraws a specified amount from the account.
• A method named deposit that deposits a specified amount to the account.
 */

   import java.util.*;

public class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated= new Date();

    {
        annualInterestRate = 7;
    }

    Account() {
        balance = 500;
    }

    Account(int id, double balance)
    {
        this.id = id;
        this.balance= balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance*(annualInterestRate/1200);
    }

    public double withdraw(double a)
    {
        if(a<balance)
            balance-=a;
        else
            System.out.println(“Insufficient balance”);
        return balance;
    }

    public double deposit(double a)
    {
        balance+=a;
        return balance;
    }
}
