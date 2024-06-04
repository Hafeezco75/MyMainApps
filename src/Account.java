public class Account {

    public static String UserAccounts(String firstName,String lastName,String phoneNumber,String pin) {
        balance = 0;

        return firstName;
    }

    private static int balance;

    private static String pin;

    public static int depositMoneyInAccount(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public static int withdrawMoneyInAccount(int amount, String pin) {
        if (amount > 0) {
            balance -= amount;
        }
        return balance;
    }
}
