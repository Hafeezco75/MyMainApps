import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ACTest {
    @Test
    public void newAC_isOn() {
        AirConditioner userAC = new AirConditioner();
        boolean on = userAC.isOn();
        assertTrue(on);
    }

    @Test
    public void newAC_isOff() {
        AirConditioner userAC = new AirConditioner();
        boolean off = userAC.isOff();
        assertFalse(off);
    }

    @Test
    public int checkNewACTemperature() {
        AirConditioner userAC = new AirConditioner();
        boolean on = userAC.isOn();
    }

}