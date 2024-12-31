package murphy.software.games.platform2d.move.config;

import murphy.software.games.platform2d.move.movement.SpeedController;

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
public enum ESpeed {
    still(0),
    crawl(2),
    walk(4),
    run(6),
    sprint(7);
    private final double feetPerSec;
    ESpeed(double distance) {
        feetPerSec = distance;
    }

    /**
     * The distance is the amount of feet the object will cover in a second.  Walking is
     * considered 4 feet per second.
     */
    public double getDistance() {
        return feetPerSec;
    }
}