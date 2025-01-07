package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Actor2D;
import murphy.software.games.platform2d.move.model.Angle2D;
import murphy.software.games.platform2d.move.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Actor2DControllerTest {

    @Test
    void testConstructor() {
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(0))
                .position(new Position().x(100.0).y(100.0).z(0))
                .feetPerSec(1);
        Actor2DController actor2DController = new Actor2DController(actor2D);
        assertNotNull(actor2DController);
    }
}
