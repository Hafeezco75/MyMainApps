package TurtleGraphics;

public class Turtle {

private boolean penIsUp = true;

    public boolean isPenUp(boolean penUp) {
        return penIsUp;
    }

    public boolean isPenDown(boolean penDown) {
        this.penIsUp = false;
        return false;
    }


}
