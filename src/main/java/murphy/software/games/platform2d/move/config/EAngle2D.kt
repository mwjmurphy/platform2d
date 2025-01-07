package murphy.software.games.platform2d.move.config

enum class EAngle2D(val angle: Double) {
    DOWN(180.0),
    RIGHT(90.0),
    UP(0.0),
    LEFT(270.0),
    JUMPRIGHT(90.0-55.0),
    JUMPLEFT(315.0),
    FALLRIGHT(90.0+55.0),
    FALLLEFT(270.0-45.0);

//    public double getAngle() {
//        return angle;
//    }
//    public double getRadians() {
//        return angle * Math.PI / 180;
//    }
    fun getRadians(): Double {
        return Math.toRadians(angle)
    }
}