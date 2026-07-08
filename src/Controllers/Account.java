package Controllers;

public class Account {

    private String name;
    private String accountNum;
    private int pin;
    private static double balance;
    Transaction transaction;

    Account(String name, String accountNum, int pin, double balance){
        this.name = name;
        this.accountNum = accountNum;
        this.pin = pin;
        this.balance = balance;

    }
    public double getBalance(){
        return this.balance;
    }
    public double setBalance(int transactionType, double amount, String dateTime){
        this.transaction = new Transaction(transactionType, amount, dateTime);
        this.balance += amount;
    }
}
