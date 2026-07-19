package Controllers;

public class Transaction {

    private String transactionType;
    private double amount;
    private String dateTime;

    Transaction(String transactionType, double amount, String dateTime){
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    protected String getTransactionHistory(){
        return "Nigga";
    }

}
