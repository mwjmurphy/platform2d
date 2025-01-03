package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Angle2DTest {

    @Test
    void testAngle2D() {
        assertEquals(0, new Angle2D().angle(0).angle());
        assertEquals(180, new Angle2D().angle(180).angle());
        Angle2D angle2D = new Angle2D().angle(0);
        angle2D.clockwise(10.0);
        assertEquals(10, angle2D.angle());
        angle2D.antiClockwise(20.0);
        assertEquals(-10, angle2D.angle());
    }
}
