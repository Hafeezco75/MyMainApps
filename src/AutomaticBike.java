public class AutomaticBike {

    public AutomaticBike() {
    }

    int speed;
    int gearLevel;
    int gearSpeed = 0;
    int acceleration = 1;

    public boolean bikeCanBeOn() {
        boolean canBeOn = false;
        return true;
    }
    public boolean bikeCanBeOff() {
        boolean canBeOff = false;
        return true;
    }
    public int bikeCanBeAcclerated(){
        int acclerate = 0;
        if(true)
            acclerate++;
        return acclerate;
    }
    private int getAcceleratingValue(){
        return acceleration;
    }

    public int bikeCanChangeAccleratingValue(int speed){
        switch (gearLevel){
            case 1 -> {
                    if (gearSpeed >= 0 && gearSpeed <= 20)
                        acceleration+=1; speed = gearSpeed + acceleration;
                        return speed;
            }
            case 2 -> {
                    if (gearSpeed >= 21 && gearSpeed <= 30)
                        acceleration+=2; speed = gearSpeed + acceleration;
                        return speed;
            }
            case 3 -> {
                    if (gearSpeed >= 31 && gearSpeed <= 40)
                        acceleration+=3; speed = gearSpeed + acceleration;
                        return speed;
            }
            case 4 -> {
                if (gearSpeed >= 41)
                    acceleration+=4; speed = gearSpeed + acceleration;
            }
        }
    return speed;
    }

}
