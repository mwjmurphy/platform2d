package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    void testMoverConstructor() {
        Position position = new Position().x(100.10).y(200.20).z(0);
        assertEquals(100.10, position.x());
        assertEquals(200.20, position.y());
        assertEquals(0, position.z());
    }
}
