package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.config.ESpeed
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SpeedControllerTest {

    @Test
    fun testSpeed() {
        val sc = SpeedController()
        Assertions.assertEquals(0.8, sc.speed(ESpeed.walk))
        Assertions.assertEquals(0.2667, sc.speed(ESpeed.crawl))
        Assertions.assertEquals(1.3333, sc.speed(ESpeed.run))
        Assertions.assertEquals(1.6, sc.speed(ESpeed.sprint))
    }

}