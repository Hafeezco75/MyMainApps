import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    @Test
    public void testThatAcIsOn() {
        AirConditioner check = new AirConditioner();
        boolean isOn = AirConditioner.isOn();
        assertTrue(isOn);
    }
    @Test
    public void testThatAcIsOff() {
        AirConditioner check = new AirConditioner();
        boolean isOff = AirConditioner.isOff();
        assertTrue(isOff);
    }
    @Test
    public void testThatTemperatureCanBeIncreased() {
        AirConditioner check = new AirConditioner();
        boolean isOn = AirConditioner.isOn();
        int temperature = AirConditioner.increaseTemperature(2);
        assertEquals(3, temperature);
    }
    @Test
    public void testThatTemperatureCanBeDecreased() {
        AirConditioner check = new AirConditioner();
        boolean isOn = AirConditioner.isOn();
        int temperature = AirConditioner.decreaseTemperature(4);
        assertEquals(3, temperature);
    }
    @Test
    public void testThatTemperatureIsDecreased() {
        AirConditioner check = new AirConditioner();
        boolean isOn = AirConditioner.isOn();
        int temperature = AirConditioner.increaseTemperatureBy30(30);
        assertEquals(30, temperature);
    }
    @Test
    public void testThatTemperatureIsNotDecreased() {
        AirConditioner check = new AirConditioner();
        boolean isOn = AirConditioner.isOn();
        int temperature = AirConditioner.decreaseTemperatureBy16(16);
        assertEquals(16, temperature);
    }
}
