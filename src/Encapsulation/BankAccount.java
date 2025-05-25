package Encapsulation;

public class BankAccount {

    private long accountNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    private  double balance;

    public void deposit(double amount){

        if (amount > 0){
            balance += amount;
            System.out.println("Deposited amount: "+balance);
        }else{
            System.out.println("Invalid value");
        }

    }

    public void withdraw(double amount){

        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn "+amount);
        }else {
            System.out.println("Insufficient balance");
        }

    }

}
