package murphy.software.games.platform2d.move.frame

import org.junit.jupiter.api.Test

class FrameTest {

    @Test
    @Throws(InterruptedException::class)
    fun testOpenFrame() {
        val tf = TestingFrame()
        tf.drawDot(100, 100)
        Thread.sleep(1000)
        tf.drawDot(120, 120)
        Thread.sleep(1000)
        tf.clear()
        tf.drawDot(150, 150)
        Thread.sleep(2000)
    }
}