public class Times {

    private int hour;
    private int minute;
    private int second;


    public Times(int hour, int minute, int second) {
        validateTimeWith(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validateTimeWith(int hour, int minute, int second) {
        validateHourWith(hour);
        validateMinuteWith(minute);
        validateSecondWith(second);
    }

    public void setHour() {
        validateHourWith(hour);
    }

    public void setMinute() {
        validateMinuteWith(minute);
    }

    public void setSecond() {
        validateMinuteWith(second);
    }

    private static void validateHourWith(int hour){
        boolean isInvalid = hour < 0 || hour > 23;
        if(isInvalid) throw new IllegalArgumentException ("Hour must be between 0 and 23");
    }

    private static void validateMinuteWith(int minute){
        boolean isInvalid = minute < 0 || minute > 59;
        if(isInvalid) throw new IllegalArgumentException ("Minute must be between 0 and 59");
    }

    private static void validateSecondWith(int second){
        boolean isInvalid = second < 0 || second > 59;
        if(isInvalid) throw new IllegalArgumentException ("Second must be between 0 and 59");
    }

}
