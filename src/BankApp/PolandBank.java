package BankApp;

import java.util.ArrayList;

public class PolandBank {
    private Accounts account;
    private final ArrayList<Accounts> accounts = new ArrayList<>();
    private int noOfCustomers;


    public void addCustomer(String accountName, String pin, String phoneNumber) {
        Accounts account = new Accounts();
        account.createAccountName(accountName, phoneNumber);
        accounts.add(account);
        noOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return noOfCustomers;
    }

    private void findAccountWith(String accountNumber) {
        for (int count = 0; count < accounts.size(); count++) {
            if (accounts.get(count).getAccountNumber().equals(accountNumber)) {
                account = accounts.get(count);
            }
            throw new IllegalArgumentException("Account number does not exist");
        }
    }

    private String generateAccountNumber(String phoneNumber) {
        phoneNumber = phoneNumber.substring(1);
        return phoneNumber;
    }

    public void deposit(String accountNumber, int amount) {
        findAccountWith(accountNumber);
        if (amount > 0) account.deposit(amount);
        else System.out.println("Amount must be greater than zero");
    }

    public void withdrawFrom(String accountNumber, int amount, String pin) {
        findAccountWith(accountNumber);
        if (amount > 0) account.withdraw(amount,pin);
        else System.out.println("Amount must be positive");
    }

    public int checkBalanceFor(String accountNumber, String pin) {
        findAccountWith(accountNumber);
        if (pin.equals(pin)) return account.checkBalance(pin);
        throw new IllegalArgumentException("Invalid pin");
    }

    public void transferFrom(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        if (pin.equals(account.getAccountNumber())) findAccountWith(senderAccountNumber);
        withdrawFrom(senderAccountNumber, amount, pin);
        deposit(receiverAccountNumber, amount);
        throw new IllegalArgumentException("Invalid pin");
    }


}




