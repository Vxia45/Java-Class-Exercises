package classes;

public class Bank {
    private String owner;
    private double balance;

    public Bank(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }
    public void showInfo() {
        System.out.println("Bank Account Info:");
        System.out.println("Account Holder: " + owner);
        System.out.println("Current Balance: $" + balance);

    }

    public static void main(String[] args) {
        Bank bank = new Bank(null, 0);

        bank.setOwner("Xeno");
        bank.setBalance(67000);
        bank.withdraw(1000);
        bank.deposit(67);

        bank.showInfo();

    }
}
