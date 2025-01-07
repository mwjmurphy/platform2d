package murphy.software.games.platform2d.move.model

class Angle2D(var angle: Double = 0.0) {

    fun clockwise(amount: Double) {
        angle += amount
    }

    fun antiClockwise(amount: Double) {
        angle -= amount
    }
}