package Controllers;

import java.util.List;

public class ATMService {
    private Account account;
    private List<Transaction> transactions;


    public double checkBalance(){
        return account.getBalance;
    }

    public int withdraw(amount){
    if (amount > 0 && amount <= account.getBalance()) {
        account.setBalance(account.setBalance() - amount);
    }
    }

    public String showTransaction(){
        (transactions);
    }
}
