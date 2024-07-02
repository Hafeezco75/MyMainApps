public class Television {

    public Television() {
    }
    boolean TvIsOn = false;
    boolean TvIsOff = false;
    int volume;
    int contrast;

    public boolean checkTvIsOn() {
        boolean TvIsOn = false;
        TvIsOn = true;
        return true;
    }
    public boolean checkTvIsOff() {
        boolean TvIsOff = false;
        TvIsOff = true;
        return true;
    }
    public int checkTvVolumeDoesNotChange(int volume) {
        if (TvIsOn) this.volume = volume;
        if (TvIsOff) this.volume = 0;
        return volume;
    }
    public int checkTvVolumeChange(int volume) {
        if (TvIsOn) this.volume = volume;
        volume++;
        return volume;
    }
    public int IncreaseTvVolume(int volume) {
        if (TvIsOn) this.volume = volume;
        volume += 1;
        return volume;
    }
    public int DecreaseTvVolume(int volume) {
        if (TvIsOn) this.volume = volume;
        volume -= 1;
        return volume;
    }
    public void DecreasingVolume(int contrast) {
        if (TvIsOn) this.contrast = contrast;
        switch (contrast) {
            case 1: if (volume >= 0 && volume <= 20) volume += 1; contrast += volume;
            break;
            case 2: if (volume >= 21 && volume <= 40) volume += 2; contrast += volume;
            break;
            case 3: if (volume >= 41 && volume <= 60) volume += 3; contrast += volume;
            break;
            case 4: if (volume >= 61 && volume <= 100) volume += 4; contrast += volume;
            break;
        }
    }
}
