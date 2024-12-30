package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Actor2DTest {

    @Test
    void testActor2DConstructor() {
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D())
                .direction2D(new Direction2D())
                .position(new Position());
        assertNotNull(actor2D);
    }
}
