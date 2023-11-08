package Class.tut6;

public class BankAccount{
    double balance;
    int transactions;
    

    public BankAccount(double initial){
        this.balance = initial;
        this.transactions = 1;
    }
    public void deposit(double amount){
        balance += amount;
        transactions++;
    }
    public void withdraw(double amount){
        balance -= amount;
        transactions++;
    }
    public void monthlyFee(){
        this.withdraw(10);
    }
}       