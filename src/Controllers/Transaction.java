package Controllers;

public class Transaction {

    private int transactionType;
    private double amount;
    private String dateTime;

    Transaction(int transactionType, double amount, String dateTime){
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = dateTime;
    }

}
