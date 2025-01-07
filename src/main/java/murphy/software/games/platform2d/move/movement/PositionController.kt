package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.model.Position2D

class PositionController {
    fun move(mover: Position2D, xdiff: Double, ydiff: Double) {
        mover.x = diff(mover.x, xdiff)
        mover.y = diff(mover.y, ydiff)
    }

    private fun diff(d: Double, diff: Double): Double {
        return d + diff
    }
}