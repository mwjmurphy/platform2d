package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Angle2DTest {

    @Test
    void testAngle2D() {
        assertEquals(0, new Angle2D().angle(0).angle());
        assertEquals(180, new Angle2D().angle(180).angle());
    }
}
