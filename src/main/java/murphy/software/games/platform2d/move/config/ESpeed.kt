package murphy.software.games.platform2d.move.config

/**
 * <h1>ESpeed</h1>
 * <p>
 * A simple set of values to determine the distance in feet for specific
 * actions such as walking.
 * </p>
 * <p>
 * All movement is per second. Walking is considered to be 4 feet per second.
 * </p>
 * <p>
 * The distance must be equated to the screen pixel value using the {@link SpeedController#speed}
 * </p>
 *
 */
enum class ESpeed(val feetPerSec: Double) {
    still(0.0),
    crawl(2.0),
    walk(6.0),
    run(10.0),
    sprint(12.0);

    /**
     * The distance is the amount of feet the object will cover in a second.  Walking is
     * considered 6 feet per second.
     */
    fun getDistance(): Double {
        return feetPerSec
    }
}