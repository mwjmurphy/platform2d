package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.config.ESpeed
import murphy.software.games.platform2d.move.utils.Rounder

class SpeedController {
    /**
     * Smaller number moves at a longer distance i.e. faster.
     */
    val feetToPixelRatio: Double = 0.3

    val frameRate: Double = 25.0

    /**
     *
     *
     * Convert the distance in feet to pixels.  Applies to positional movement of an object,
     * the resultant speed is the distance the object will cover per frameRate.
     *
     *
     *
     * The distance is the amount of feet the object will cover in a second.  Walking is
     * considered 4 feet per second.
     *
     *
     *
     * The feetToPixelRatio is the conversion factor to present feet in pixels on screen
     * in comparison to the object size.  4 feet is considered 10 pixels.
     *
     *
     *
     * The frameRate is the number of times we will apply the calculation in 1 second. Can
     * be thought of as the number of times the screen is refreshed by the hardware.
     *
     * <pre>
     * The calculation is distance / feetToPixelRatio / frameRate
     * This is then rounded to a set number of decimal places, which is currently set to 3.
    </pre> *
     *
     * @param distance
     * @return the speed rounded to 3 decimal places.
     */
    fun speed(distance: Double): Double {
        val value = distance / feetToPixelRatio / frameRate
        return Rounder().round4(value)
    }

    fun speed(distance: ESpeed): Double {
        return speed(distance.feetPerSec)
    }
}