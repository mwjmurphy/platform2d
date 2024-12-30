package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionCntrollerTest {

    @Test
    void moveTest() {
        Position mover = new Position(100.10, 200.20, 1.0);
        PositionController movement = new PositionController();
        movement.move(mover, 10, 5, 1);
        assertEquals(110.10, mover.x());
        assertEquals(205.20, mover.y());
        assertEquals(2.0, mover.z());
    }
}
