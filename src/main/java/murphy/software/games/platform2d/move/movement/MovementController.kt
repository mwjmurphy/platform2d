package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.model.Actor2D

class MovementController {

    companion object {
        val distanceController : DistanceController = DistanceController()
    }
    var companion = Companion
    fun move(actor2D: Actor2D) {
        val xy = distanceController.distance(actor2D.feetPerSec, actor2D.angle2D.angle)
        actor2D.changeX(xy.x)
        actor2D.changeY(-xy.y)
    }
}