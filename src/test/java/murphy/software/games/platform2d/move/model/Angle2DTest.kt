package murphy.software.games.platform2d.move.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Angle2DTest {

    @Test
    fun testAngle2D() {
        Assertions.assertEquals(0.0, Angle2D(0.0).angle)
        Assertions.assertEquals(180.0, Angle2D(180.0).angle)
        val angle2D = Angle2D()
        angle2D.clockwise(10.0)
        Assertions.assertEquals(10.0, angle2D.angle)
        angle2D.antiClockwise(20.0)
        Assertions.assertEquals(-10.0, angle2D.angle)
    }
}