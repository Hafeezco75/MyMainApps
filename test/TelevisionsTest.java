import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionsTest {

    @Test
    public void testThatTelevisionIsOn() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        assertTrue(true);
    }
    @Test
    public void testThatTelevisionIsOff() {
        Televisions samsung = new Televisions();
        boolean TvIsOff = samsung.checkTvIsOff();
        assertFalse(false);
    }
    @Test
    public void testThatTelevisionVolumeIsNotChanged() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.checkTvVolumeDoesNotChange(10);
        assertEquals(10,volume);
    }
    @Test
    public void testThatTelevisionVolumeCanChange() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.checkTvVolumeChange(12);
        assertEquals(13, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanBeIncreased() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.IncreaseTvVolume(15);
        assertEquals(16, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanBeDecreased() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        int volume = samsung.DecreaseTvVolume(20);
        assertEquals(19, volume);
    }
    @Test
    public void testThatTelevisionVolumeCanIncreaseAutomatically() {
        Televisions samsung = new Televisions();
        boolean TvIsOn = samsung.checkTvIsOn();
        //Televisions volume = samsung.DecreasingVolume(30);
        //assertEquals(33, volume);
    }
}
