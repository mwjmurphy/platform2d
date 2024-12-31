package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.config.EDirection2D;
import murphy.software.games.platform2d.move.config.ESpeed;
import murphy.software.games.platform2d.move.frame.TestingFrame;
import murphy.software.games.platform2d.move.model.Actor2D;
import murphy.software.games.platform2d.move.model.Angle2D;
import murphy.software.games.platform2d.move.model.Direction2D;
import murphy.software.games.platform2d.move.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovementControllerTest {

    @Test
    void testMovementRight() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(0))
                .direction2D(new Direction2D().direction(EDirection2D.RIGHT))
                .position(new Position().x(100.0).y(100.0).z(0))
                .feetPerSec(ESpeed.walk.getDistance());

        MovementController movementController = new MovementController();
        showActor(testingFrame, actor2D);
        movementController.move(actor2D);
        showActor(testingFrame, actor2D);
        for (int i = 0 ; i < 1000; i++) {
            movementController.move(actor2D);
            showActor(testingFrame, actor2D);
            Thread.sleep(1);
        }
        assertEquals(0.1, actor2D.feetPerSec());
    }

    @Test
    void testMovementJump() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(0))
                .direction2D(new Direction2D().direction(EDirection2D.STILL))
                .position(new Position().x(100.0).y(100.0).z(0))
                .feetPerSec(6);

        MovementController movementController = new MovementController();
        showActor(testingFrame, actor2D);
        movementController.move(actor2D);
        showActor(testingFrame, actor2D);
        actor2D.direction2D().direction(EDirection2D.UP);
        for (int i = 0 ; i < 1000; i++) {
            movementController.move(actor2D);
            showActor(testingFrame, actor2D);
            Thread.sleep(1);
        }
        assertEquals(0.1, actor2D.feetPerSec());
    }

    void showActor(TestingFrame tf, Actor2D actor2D) {
        tf.drawDot((int) actor2D.position().x(), (int) actor2D.position().y());
    }
}
