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



    public void setBalance(String transactionType, double amount, String dateTime){
        this.transaction = new Transaction(transactionType, amount, dateTime);

        if(transactionType.equals("Withraw")){
            this.balance -= amount;
        }
        if(transactionType.equals("Deposit")){
            this.balance += amount;
        }

    }
}

