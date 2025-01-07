package murphy.software.games.platform2d.move.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ESpeedTest {

    @Test
    void testSpeed(){
        assertEquals(4.0, ESpeed.walk.getDistance());
    }
}
