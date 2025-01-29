import TurtleGraphics.Direction;
import TurtleGraphics.Position;
import TurtleGraphics.Turtle;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {

    @Test
    public void testThatTurtlePenIsUp() {
        Turtle tortoise = new Turtle();
        tortoise.isPenUp(true);
    }

    @Test
    public void testThatTurtlePenIsDown(){
        Turtle tortoise = new Turtle();
        tortoise.isPenDown(false);
    }

    @Test
    public void testThatTurtlePenCanTurnRight(){
        Direction check = EAST;
        assertEquals(EAST, Direction.EAST);
    }

    @Test
    public void testThatTurtlePenCanTurnSouthDirection(){
        Direction check = EAST;
        Direction.setCurrentDirection(SOUTH);
        assertEquals(SOUTH, Direction.currentDirection());
    }

    @Test
    public void testThatTurtlePenCanTurnWestDirection(){
        Direction check = EAST;
        Direction.setCurrentDirection(SOUTH);
        Direction.setCurrentDirection(WEST);
        assertEquals(WEST, Direction.currentDirection());
    }

    @Test
    public void testThatTurtlePenCanTurnNorthDirection(){
        Direction check = EAST;
        Direction.setCurrentDirection(SOUTH);
        Direction.setCurrentDirection(WEST);
        Direction.setCurrentDirection(NORTH);
        assertEquals(NORTH, Direction.currentDirection());
    }

    @Test
    public void testThatTurtlePenCanChangePosition(){
        Position move = new Position(0, 0);
        assertEquals(new Position(0, 0),move.getRow());
    }
}
