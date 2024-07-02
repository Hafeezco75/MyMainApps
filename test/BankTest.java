import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    @Test
    public void newBankHasNoCustomerTest() {
        Bank bank = new Bank();
        assertEquals(0, bank.getNoOfCustomers());
    }

    @Test
    public void newBankHasCustomerTest() {
        Bank bank = new Bank();
        assertEquals(0, bank.getNoOfCustomers());
        bank.addCustomer("Kent samson", "pin");
        assertEquals(1, bank.getNoOfCustomers());
        bank.addCustomer("Kent davies", "pin");
        assertEquals(2, bank.getNoOfCustomers());
    }

    @Test
    public void addCustomer_defaultBalanceAndCustomerTest() {
        Bank bank = new Bank();
        assertEquals(0, bank.getNoOfCustomers());
        bank.checkBalance(0212321354, "pin");
        assertEquals(1, bank.generateAccountNumber());

    }
}
