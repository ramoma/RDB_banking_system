package Controllers;

import java.util.List;

public class ATMService {
    private Account account;
    private List<Transaction> transactions;


    public double checkBalance(){
        return account.getBalance();
    }

    public void withdraw(String transactionType, double amount, String dateTime){
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(transactionType, amount, dateTime);
        } else {
            System.out.println("Insufficient Balance.");
        }

    }
    public void deposit(String transactionType, double amount, String dateTime){
        if (amount > 0) {
            account.setBalance(transactionType, amount, dateTime);
        } else {
            System.out.println("Insufficient Balance.");
        }

    }


    private String showTransactions(){
        return account.transaction.getTransactionHistory();
    }
}
