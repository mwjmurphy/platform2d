package murphy.software.games.platform2d.move.config

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ESpeedTest {

    @Test
    fun testSpeed() {
        Assertions.assertEquals(6.0, ESpeed.walk.feetPerSec)
    }
}