import java.util.ArrayList;

public class Bank {

    private int accountNumber;
    private int noOfCustomers;
    private ArrayList<Account> account = new ArrayList<>();

    public int getNoOfCustomers() { return noOfCustomers; }

    public void addCustomer(String accountName, String pin ) {
        noOfCustomers++;
    }

    public int generateAccountNumber() {
        return noOfCustomers+1;
    }

    public int checkBalance (int accountNumber, String pin ) {
        return 0;
    }

    public void deposit(int accountNumber, int amount) {
        //find account;
        //deposit into account;
       // Account accountToDeposit = accounts.get(accountNumber);
        //accountToDeposit.deposit(amount);
    }

    //private Account FindAccountWith(int accountNumber) {
        //for (Account account : accounts) {
        //}

    //}
}
