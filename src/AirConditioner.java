public class AirConditioner {
    public boolean on;

    public boolean isOn() {
        on = true;
        return true;
    }
    public boolean off;

    public boolean isOff() {
        off = false;
        return false;
    }

    private int setTemperature(int temperature) {
        if (on && 16 <= temperature && temperature <= 30) {
            temperature++;
        }
        return temperature;
    }

}
