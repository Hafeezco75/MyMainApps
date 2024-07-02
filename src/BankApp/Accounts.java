package BankApp;

public class Accounts {

private String accountName;
private String pin;
private int balance;
private String accountNumber;


    public void createAccountName(String accountName, String pin) {
        this.accountName = accountName;
        this.pin = pin;
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
        if (amount < balance) balance -= amount;
        else System.out.println("Incorrect pin");
        validatePinForWithdraw(pin,amount);
    }

    public void validatePinForWithdraw(String Pin, int amount) {
        if (pin.equals(this.pin)) balance -= amount;
        else System.out.println("Incorrect pin,Input the correct pin");
    }
}
