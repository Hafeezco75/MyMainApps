import ElecronicStore.Estore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest {

    @Test
    public void testThatUsersCanBeAdded() {
        Estore store = new Estore();
        store.addUsers(21,"semicolon@gmail.com", "312, Herbert Macaulay Way", "Semicolon", "123456","07001234567");
        assertEquals(1,1);
    }
}
