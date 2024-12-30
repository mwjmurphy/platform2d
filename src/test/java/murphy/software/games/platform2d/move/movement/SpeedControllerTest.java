package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.config.ESpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedControllerTest {

    @Test
    void testSpeed() {
        assertEquals(getDistance(ESpeed.walk), SpeedController.speed(ESpeed.walk));
        assertEquals(getDistance(ESpeed.crawl), SpeedController.speed(ESpeed.crawl));
        assertEquals(getDistance(ESpeed.run), SpeedController.speed(ESpeed.run));
        assertEquals(getDistance(ESpeed.sprint), SpeedController.speed(ESpeed.sprint));
    }

    private double getDistance(ESpeed distance) {
        return distance.getDistance() / SpeedController.feetToPixelRatio * SpeedController.frameRate;
    }
}
