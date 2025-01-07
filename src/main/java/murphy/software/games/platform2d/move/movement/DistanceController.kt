package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Position2D;

/**
 * <b>Distance Controller</b>
 * <p>
 *     Calculated the x,y distance of travel based on an angle and distance
 * </p>
 * <p>
 *     The distance in feet
 * </p>
 * <p>
 *     The angle is in degrees from 0 to 359
 * </p>
 */
public class DistanceController {

    public static Position2D distance(double fps, double angle) {
        double distance = SpeedController.speed(fps);
        double radians = Math.toRadians(angle);
        return new Position2D()
                .x(Math.sin(radians) * distance)
                .y(Math.cos(radians) * distance);
    }


}
