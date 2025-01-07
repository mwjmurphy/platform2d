package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.config.ESpeed
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistanceControllerTest {

    @Test
    fun testDistance() {
        val dc  = DistanceController()
        var pos2D = dc.distance(4.0, 0.0)
        assertEquals(0.0, pos2D.x)
        pos2D = dc.distance(4.0, 90.0)
        Assertions.assertTrue(pos2D.x > 0 && pos2D.x < 1)
        pos2D = dc.distance(4.0, 180.0)
        Assertions.assertTrue(pos2D.y > -1 && pos2D.y < 0)
        pos2D = dc.distance(4.0, 270.0)
        Assertions.assertTrue(pos2D.x > -1 && pos2D.x < 0)

        val distance : Double = dc.companion.speedController.speed(ESpeed.walk)
        assertEquals(0.8, distance)
    }
}