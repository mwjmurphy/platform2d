package murphy.software.games.platform2d.move.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoverTest {

    @Test
    void testMoverConstructor() {
        Mover mover = new Mover().x(100.10).y(200.20).z(0);
        assertEquals(100.10, mover.x());
        assertEquals(200.20, mover.y());
        assertEquals(0, mover.z());
    }
}
