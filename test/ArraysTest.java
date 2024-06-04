import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {

    @Test
    public void testArrays() {
        Arrayss multiply = new Arrayss();
        int[] number = Arrayss.substitute(new int[]{2, 3, 5, 2, 5, 3});
        assertArrayEquals(new int[]{4, 6, 10, 4, 10, 6}, number);
    }
}
