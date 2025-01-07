package murphy.software.games.platform2d.move.model

import lombok.extern.slf4j.Slf4j
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

@Slf4j
class Position2DTest {

    var LOG = LoggerFactory.getLogger(javaClass.simpleName)

    @Test
    fun testPosition2D_K() {
        val position2d = Position2D(x = 100.0, y = 100.0)
        assertEquals(100.00, position2d.x)
        assertEquals(100.00, position2d.y)
        position2d.x = 110.0
        // LOG.info(StackTraceElement.generateMessage("Hello World!!!"))

        LOG.info("Hello World!!! {}", Thread.currentThread().getStackTrace()[1].generateMessage())
    }

    fun StackTraceElement.generateMessage(msg: Any = "")
            = "$fileName.$methodName():$lineNumber"
}