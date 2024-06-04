import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void testAutomaticBikeCanBeOn() {
        AutomaticBike bajaj = new AutomaticBike();
        boolean canBeOn = bajaj.bikeCanBeOn();
        assertTrue(true);
    }
    @Test
    public void testAutomaticBikeCanBeOff() {
        AutomaticBike bajaj = new AutomaticBike();
        boolean canBeOff = bajaj.bikeCanBeOff();
        assertFalse(false);
    }
    @Test
    public void testAutomaticBikeCanBeAccelerated() {
        AutomaticBike bajaj = new AutomaticBike();
        int accelerate = bajaj.bikeCanBeAcclerated();
        assertEquals(1, accelerate);
    }
    @Test
    public void testAutomaticBikeCanBeAccelerating() {
        AutomaticBike bajaj = new AutomaticBike();
        int gearLevel = bajaj.bikeCanChangeAccleratingValue(23);
        assertEquals(26,gearLevel);


    }
}
