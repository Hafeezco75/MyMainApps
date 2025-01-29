package BankApp;

public class Accounts {

private String accountName;
private String pin;
private int balance;
private String accountNumber;

public Accounts(){
}

    public void createAccountName(String accountName,String pin) {
        this.accountName = accountName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int checkBalance(String pin) {
        if (pin.equals(this.pin)) return balance;
        else return 0;
    }

    public void deposit(int amount) {
        if (pin.equals(this.pin)) balance += amount;
        else System.out.println("Incorrect pin");
    }

    public void withdraw(int amount, String pin) {
        if (pin.equals(this.pin) && (amount <= balance)) balance -= amount;
        else throw new IllegalArgumentException("Insufficient balance");
    }
}
