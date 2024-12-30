package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.config.ESpeed;

public class SpeedController {
    public static final double feetToPixelRatio = 200;
    public static final double frameRate = 25;

    public static double speed(ESpeed distance) {
        return distance.getDistance()/feetToPixelRatio*frameRate;
    }
}
