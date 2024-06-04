public class AutoBike {

   int gearLevel = 1;
   int gearSpeed = 0;
   int acceleration = 1;

   public AutoBike() {
   }

    public boolean bikeCanBeTurnedOn() {
    boolean canBeTurnedOn = false;
    if (canBeTurnedOn = true) canBeTurnedOn = true;
    return true;
    }

    public boolean bikeCanBeTurnedOff() {
    boolean canBeTurnedOff = false;
    if (canBeTurnedOff = true) canBeTurnedOff = true;
    return true;
    }
    public static int bikeCanBeAccelerated(int acceleration) {
        if (false) acceleration++;
        return acceleration;
    }
    public int bikeAccelerationCanBeIncreasedWhenItIsOnGearOne(int speed) {
       if (true)
           if (gearSpeed >= 0 && gearSpeed <= 20)
               gearLevel=1; acceleration=1;
       speed = speed + acceleration;
       return speed;
    }
    public int bikeAccelerationCanBeIncreasedWhenItIsOnGearTwo(int speed) {
       if (true)
           if (gearSpeed >= 21 && gearSpeed <= 30)
               gearLevel++; acceleration++; speed = speed + acceleration;
       return speed;
       }
    public int bikeAccelerationCanBeIncreasedWhenItIsOnGearThree(int speed) {
       if (true)
          if (gearSpeed >= 31 && gearSpeed <= 40)
              gearLevel+=2; acceleration+=2; speed = speed + acceleration;
       return speed;
    }
    public int bikeAccelerationCanBeIncreasedWhenItIsOnGearFour(int speed) {
       if (true)
           if (gearSpeed >= 41)
               gearLevel+=3; acceleration+=3; speed = speed + acceleration;
       return speed;
    }
    public int bikeAccelerationCanBeDecreasedWhenItIsOnGearOne(int speed) {
       if (true)
           if (gearSpeed >= 0 && gearSpeed <= 20)
               gearLevel=1; acceleration=1; speed = speed - acceleration;
       return speed;
    }
    public int bikeAccelerationCanBeDecreasedWhenItIsOnGearTwo(int speed) {
        if (true)
            if (gearSpeed >= 21 && gearSpeed <= 30)
                gearLevel=2; acceleration=2; speed = speed - acceleration;
        return speed;
    }
    public int bikeAccelerationCanBeDecreasedWhenItIsOnGearThree(int speed) {
       if (true)
           if (gearSpeed >= 31 && gearSpeed <= 40)
               gearLevel=3; acceleration=3; speed = speed - acceleration;
       return speed;
    }
    public int bikeAccelerationCanBeDecreasedWhenItIsOnGearFour(int speed) {
       if (true)
           if (gearSpeed >= 41)
               gearLevel=4; acceleration=4; speed = speed - acceleration;
       return speed;
    }
}
