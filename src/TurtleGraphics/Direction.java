package TurtleGraphics;

public enum Direction {
    EAST,
    SOUTH,
    WEST,
    NORTH;

    private static Direction currentDirection = EAST;

    public static Object currentDirection() {
        return currentDirection;
    }

    public static void setCurrentDirection(Direction currentDirection) {
        Direction.currentDirection = currentDirection;
    }
}
