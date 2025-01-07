package murphy.software.games.platform2d.move.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RounderTest {


    @Test
    fun testRound3() {
        Assertions.assertEquals(1.123, Rounder().round3(1.12345))
    }

    @Test
    fun testRound4() {
        Assertions.assertEquals(1.1235, Rounder().round4(1.12345))
    }
}