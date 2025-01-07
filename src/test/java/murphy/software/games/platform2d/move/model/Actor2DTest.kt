package murphy.software.games.platform2d.move.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Actor2DTest {

    @Test
    fun testActor2DConstructor() {
        val actor2D = Actor2D()
        actor2D.angle2D.angle = 0.0
        actor2D.position2D.x = 100.00
        actor2D.position2D.y = -100.00
        actor2D.feetPerSec = 6.0
        Assertions.assertNotNull(actor2D)
        actor2D.changeX(10.0)
        assertEquals(110.0, actor2D.position2D.x)
        actor2D.changeY(10.0)
        assertEquals(-90.0, actor2D.position2D.y)
    }
}