package murphy.software.games.platform2d.move.model

class Actor2D (var position2D: Position2D = Position2D(), var angle2D: Angle2D = Angle2D(), var feetPerSec : Double = 0.0) {

    fun changeX(amount: Double) {
        position2D.x = position2D.x + amount
    }

    fun changeY(amount: Double) {
        position2D.y = position2D.y + amount
    }
}