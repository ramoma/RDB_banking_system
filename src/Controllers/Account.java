package Controllers;

public class Account {

    private String name;
    private String accountNum;
    private int pin;
    private double balance;

    Account(String name, String accountNum, int pin, double balance){
        this.name = name;
        this.accountNum = accountNum;
        this.pin = pin;
        this.balance = balance;
    }
}
