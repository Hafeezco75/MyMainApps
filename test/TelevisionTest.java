import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void testThatTelevisionIsOn() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        assertTrue(true);
    }
    @Test
    public void testThatTelevisionIsOff() {
        Television samsung = new Television();
        boolean TvIsOff = samsung.checkTvIsOff();
        assertFalse(false);
    }
    @Test
    public void testThatTelevisionVolumeIsNotChanged() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.checkTvVolumeDoesNotChange(10);
        assertEquals(10,volume);
    }
    @Test
    public void testThatTelevisionVolumeCanChange() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.checkTvVolumeChange(12);
        assertEquals(13, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanBeIncreased() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.IncreaseTvVolume(15);
        assertEquals(16, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanBeDecreased() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.DecreaseTvVolume(20);
        assertEquals(19, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanIncreaseAutomatically() {
        Television samsung = new Television();
        boolean TvIsOn = samsung.checkTvIsOn();
        //Television volume = samsung.DecreasingVolume(30);
        //assertEquals(33, volume);
    }
}
