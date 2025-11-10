package fuckassClasses;

public class Bank {
    private String owner;
    private double balance;

    public Bank(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("After deposit: " + amount);
    }

    public void withdraw(double amount){
        if(balance <= 0 || amount > balance){
            System.out.println("Insufficient balance");
        }else{
            balance -= amount;
            System.out.println("After withdrawing: " + amount);
        }
    }
    public void showInfo(){
        System.out.println("Owner: " + getOwner() + " Balance: " + getBalance());
    }


    public static void main(String[] args) {
    Bank bnk = new Bank("NIgger", 110);

    bnk.deposit(200);
    bnk.withdraw(1000);
    bnk.showInfo();
    }
}
