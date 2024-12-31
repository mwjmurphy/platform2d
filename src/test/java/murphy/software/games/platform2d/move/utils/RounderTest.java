package murphy.software.games.platform2d.move.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RounderTest {

    @Test
    void testRound3() {
        assertEquals(1.123, Rounder.round3(1.12345));
    }

}
