package murphy.software.games.platform2d.move.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EDirection2DTest {

    @Test
    void testDirections() {
        assertEquals('S', EDirection2D.STILL.getDirection());
        assertEquals('U', EDirection2D.UP.getDirection());
        assertEquals('D', EDirection2D.DOWN.getDirection());
        assertEquals('L', EDirection2D.LEFT.getDirection());
        assertEquals('R', EDirection2D.RIGHT.getDirection());
    }

}
