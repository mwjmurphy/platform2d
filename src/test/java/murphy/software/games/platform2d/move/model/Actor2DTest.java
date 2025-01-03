package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Actor2DTest {

    @Test
    void testActor2DConstructor() {
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D())
                .position(new Position().x(100).y(-100))
                .feetPerSec(6);
        assertNotNull(actor2D);
        actor2D.changeX(10);
        assertEquals(110, actor2D.position.x());
        actor2D.changeY(10);
        assertEquals(-110, actor2D.position.y());
    }
}
