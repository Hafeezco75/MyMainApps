import BankApp.Accounts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsTest {

    @Test
    public void testThatAccountHasNoAccountName() {
        Accounts accounts = new Accounts();
        assertEquals(null, accounts.getAccountName());
    }
    @Test
    public void testThatAccountHasAccountName() {
        Accounts accounts = new Accounts();
        accounts.createAccountName("Emeka Samson", "1321");
        assertEquals("Emeka Samson", accounts.getAccountName());
    }
    @Test
    public void testThatAccountUserHasNoAccountNumber() {
        Accounts accounts = new Accounts();
        assertEquals(0, accounts.getAccountNumber());
    }

    @Test
    public void testThatAccountUserCanCheckBalance() {
        Accounts accounts = new Accounts();
        assertEquals(0, accounts.checkBalance("2324"));
    }

    @Test
    public void testThatAccountUserCanDeposit() {
        Accounts accounts = new Accounts();
        accounts.createAccountName("Emeka Samson", "1321");
        assertEquals("Emeka Samson", accounts.getAccountName());
        accounts.deposit(2_000);
        assertEquals(2_000, accounts.checkBalance("1321"));
    }

    @Test
    public void testThatAccountUserCanWithdraw() {
        Accounts accounts = new Accounts();
        accounts.createAccountName("Emeka Samson", "1321");
        assertEquals("Emeka Samson", accounts.getAccountName());
        accounts.deposit(2_000);
        accounts.withdraw(3_000, "1321");
        assertEquals(2_000, accounts.checkBalance("1321"));
    }

}
