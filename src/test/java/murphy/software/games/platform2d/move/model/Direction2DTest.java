package murphy.software.games.platform2d.move.model;

import murphy.software.games.platform2d.move.config.EDirection2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Direction2DTest {

    @Test
    void testDirections() {
        Direction2D d2d = new Direction2D().direction(EDirection2D.STILL);
        assertEquals('S', d2d.direction().getDirection());
        assertEquals('S', d2d.still().getDirection());
        assertEquals('R', d2d.right().getDirection());
        assertEquals('L', d2d.left().getDirection());
        assertEquals('U', d2d.up().getDirection());
        assertEquals('D', d2d.down().getDirection());
    }
}
