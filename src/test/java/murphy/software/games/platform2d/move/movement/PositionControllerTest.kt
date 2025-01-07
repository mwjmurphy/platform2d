package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.model.Position2D
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PositionControllerTest {

    @Test
    fun moveTest() {
        val mover = Position2D(100.10, 200.20)
        val movement = PositionController()
        movement.move(mover, 10.0, 5.0)
        assertEquals(110.10, mover.x)
        assertEquals(205.20, mover.y)
    }
}