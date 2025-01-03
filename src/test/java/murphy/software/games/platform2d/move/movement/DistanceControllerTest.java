package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Position2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceControllerTest {

    @Test
    void testDistance() {
        Position2D pos2D = DistanceController.distance(4, 0);
        assertEquals(0, pos2D.x());
        pos2D = DistanceController.distance(4, 90);
        assertTrue(pos2D.x() > 0 && pos2D.x() < 1);
        pos2D = DistanceController.distance(4, 180);
        assertTrue(pos2D.y() > -1 && pos2D.y() < 0);
        pos2D = DistanceController.distance(4, 270);
        assertTrue(pos2D.x() > -1 && pos2D.x() < 0);
    }
}
