package murphy.software.games.platform2d.move.config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EAngle2DTest {

    @Test
    void testEAngle2D() {
        assertEquals(0, EAngle2D.UP.getAngle());
        assertEquals(90, EAngle2D.RIGHT.getAngle());
        assertEquals(180, EAngle2D.DOWN.getAngle());
        assertEquals(270, EAngle2D.LEFT.getAngle());
        assertEquals(1.5707963267948966, EAngle2D.RIGHT.getRadians());
        assertEquals(3.1415926535897930, EAngle2D.DOWN.getRadians());
        assertEquals(4.71238898038469, EAngle2D.LEFT.getRadians());
        assertEquals(0, EAngle2D.UP.getRadians());
    }
}
