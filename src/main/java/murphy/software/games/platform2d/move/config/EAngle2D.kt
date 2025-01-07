package murphy.software.games.platform2d.move.config;

public enum EAngle2D {
    DOWN(180.0),
    RIGHT(90.0),
    UP(0.0),
    LEFT(270.0),
    JUMPRIGHT(90-55),
    JUMPLEFT(315.0),
    FALLRIGHT(90+55),
    FALLLEFT(270-45);

    private final double angle;
    EAngle2D(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }
    public double getRadians() {
        return angle * Math.PI / 180;
    }
}
