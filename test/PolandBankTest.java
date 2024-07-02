import BankApp.PolandBank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolandBankTest {

    @Test
    public void testThatBankHasNoCustomer() {
        PolandBank bank = new PolandBank();
        assertEquals(0, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatBankHasCustomer() {
        PolandBank bank = new PolandBank();
        assertEquals(0, bank.getNumberOfCustomers());
        bank.addCustomer("John Felix", "2423", "08123456789");
        assertEquals(1, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatFindAccountWithCustomer() {
        PolandBank bank = new PolandBank();
        bank.addCustomer("John Felix", "2423", "08123456789");
        assertEquals(1, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatAccountNumberIsGenerated() {
        PolandBank bank = new PolandBank();
        bank.addCustomer("John Felix", "2423", "08123456789");
        assertEquals(1, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatCustomerCanWithdrawMoneyFromBank() {
        PolandBank bank = new PolandBank();
        bank.addCustomer("John Felix", "2423", "08123456789");
        bank.withdrawFrom("8123456789", 5_000, "2423");
        assertEquals(4_000, bank.checkBalanceFor("8123456789", "2423"));
    }

}