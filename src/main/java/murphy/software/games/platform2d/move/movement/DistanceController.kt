package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.model.Position2D
import kotlin.math.cos
import kotlin.math.sin

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
class DistanceController {

    companion object {
        val speedController: SpeedController = SpeedController()
    }
    val companion = Companion

    fun distance(fps: Double, angle: Double): Position2D {
        val distance = speedController.speed(fps)
        val radians = Math.toRadians(angle)
        return Position2D(sin(radians) * distance, cos(radians) * distance)
    }
}