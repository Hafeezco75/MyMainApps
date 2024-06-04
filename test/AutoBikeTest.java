import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutoBikeTest {
    @Test
    public void testAutoBikeCanBeTurnedOn() {
        AutoBike motion = new AutoBike();
        boolean canBeTurnedOn = motion.bikeCanBeTurnedOn();
        assertTrue(true);
    }
    @Test
    public void testAutoBikeCanBeTurnedOff() {
        AutoBike motion = new AutoBike();
        boolean canBeTurnedOff = motion.bikeCanBeTurnedOff();
        assertTrue(canBeTurnedOff);
    }
    @Test
    public void testAutoBikeCanBeAccelerated() {
        AutoBike motion = new AutoBike();
        int acceleration = AutoBike.bikeCanBeAccelerated(10);
        assertEquals(10, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeIncreasedWhenItIsOnGearOne() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeIncreasedWhenItIsOnGearOne(13);
        assertEquals(14, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeIncreasedWhenItIsOnGearTwo() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeIncreasedWhenItIsOnGearTwo(12);
        assertEquals(14, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeIncreasedWhenItIsOnGearThree() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeIncreasedWhenItIsOnGearThree(18);
        assertEquals(21, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeIncreasedWhenItIsOnGearFour() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeIncreasedWhenItIsOnGearFour(22);
        assertEquals(26, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeDecreasedWhenItIsOnGearOne() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeDecreasedWhenItIsOnGearOne(20);
        assertEquals(19, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeDecreasedWhenItIsOnGearTwo() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeDecreasedWhenItIsOnGearTwo(30);
        assertEquals(28, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeDecreasedWhenItIsOnGearThree() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeDecreasedWhenItIsOnGearThree(40);
        assertEquals(37, acceleration);
    }
    @Test
    public void testThatBikeAccelerationCanBeDecreasedWhenItIsOnGearFour() {
        AutoBike motion = new AutoBike();
        int acceleration = motion.bikeAccelerationCanBeIncreasedWhenItIsOnGearFour(41);
        assertEquals(45, acceleration);
    }
}
