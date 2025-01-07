package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.model.Actor2D
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class Actor2DControllerTest {
    @Test
    fun testConstructor() {
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = 0.0
            position2D.x = 100.0
            position2D.y = 100.0
            feetPerSec = 1.0
        }
        val actor2DController = Actor2DController(actor2D)
        assertNotNull(actor2DController)
        assertEquals(100.0, actor2D.position2D.x)
    }
}