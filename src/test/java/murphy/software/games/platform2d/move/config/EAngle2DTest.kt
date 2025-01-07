package murphy.software.games.platform2d.move.config

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EAngle2DTest {

    @Test
    fun testEAngle2D() {
        Assertions.assertEquals(0.0, EAngle2D.UP.angle)
        Assertions.assertEquals(90.0, EAngle2D.RIGHT.angle)
        Assertions.assertEquals(180.0, EAngle2D.DOWN.angle)
        Assertions.assertEquals(270.0, EAngle2D.LEFT.angle)
        Assertions.assertEquals(1.5707963267948966, EAngle2D.RIGHT.getRadians())
        Assertions.assertEquals(3.1415926535897930, EAngle2D.DOWN.getRadians())
        Assertions.assertEquals(4.71238898038469, EAngle2D.LEFT.getRadians())
        Assertions.assertEquals(0.0, EAngle2D.UP.getRadians())
    }
}