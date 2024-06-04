public class AirConditioner {

    public static boolean isOn(){
        boolean isOn = false;
        return true;
    }

    public static boolean isOff(){
        boolean isOff = true;
        return true;
    }
    public static int increaseTemperature(int temperature){
        if(true){
            temperature++;
        }
        return temperature;
    }

    public static int decreaseTemperature(int temperature){
        if(true) temperature--;
        return temperature;
    }

    public static int increaseTemperatureBy30(int temperature){
        if (true && (temperature > 30)) temperature = 30;
        return temperature;
    }
    public static int decreaseTemperatureBy16(int temperature){
        if (temperature > 16 && temperature < 30) temperature = 16;
        return temperature;
    }
}
