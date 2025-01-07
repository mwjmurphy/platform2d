package murphy.software.games.platform2d.move.movement;

import lombok.extern.slf4j.Slf4j;
import murphy.software.games.platform2d.move.config.EAngle2D;
import murphy.software.games.platform2d.move.config.ESpeed;
import murphy.software.games.platform2d.move.frame.TestingFrame;
import murphy.software.games.platform2d.move.model.Actor2D;
import murphy.software.games.platform2d.move.model.Angle2D;
import murphy.software.games.platform2d.move.model.Position;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



@Slf4j
public class MovementControllerTest {

    @Test
    void testMovementController() {
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(EAngle2D.RIGHT.getAngle()))
                .position(new Position().x(100.0).y(-100.0).z(0))
                .feetPerSec(ESpeed.walk.getDistance());
        MovementController movementController = new MovementController();
        movementController.move(actor2D);
        assertEquals(100.8, actor2D.position().x());
    }


    @Tag("integration-test")
    @Test
    void testMovementRight() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(EAngle2D.RIGHT.getAngle()))
                //.direction2D(new Direction2D().direction(EDirection2D.RIGHT))
                .position(new Position().x(100.0).y(-100.0).z(0))
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
        Thread.sleep(1000);
    }

    @Tag("integration-test")
    @Test
    void testMovementUp() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(EAngle2D.UP.getAngle()))
                .position(new Position().x(100.0).y(-300.0).z(0))
                .feetPerSec(ESpeed.walk.getDistance());

        MovementController movementController = new MovementController();
        showActor(testingFrame, actor2D);
        movementController.move(actor2D);
        showActor(testingFrame, actor2D);
        for (int i = 0 ; i < 1000; i++) {
            movementController.move(actor2D);
            showActor(testingFrame, actor2D);
            // actor2D.angle2D().clockwise(0.1);
            // actor2D.feetPerSec(actor2D.feetPerSec()+0.01);
            Thread.sleep(1);
        }
    }

    @Tag("integration-test")
    @Test
    void testMovementJump() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(EAngle2D.UP.getAngle()))
                .position(new Position().x(100.0).y(-400.0).z(0))
                .feetPerSec(ESpeed.run.getDistance());

        MovementController movementController = new MovementController();
        showActor(testingFrame, actor2D);
        movementController.move(actor2D);
        showActor(testingFrame, actor2D);
        for (int i = 0 ; i < 1000; i++) {
            movementController.move(actor2D);
            actor2D.angle2D().clockwise(0.4);
            showActor(testingFrame, actor2D);
            Thread.sleep(1);
        }
    }

    @Tag("integration-test")
    @Test
    void testMovementJumpRight() throws InterruptedException {
        TestingFrame testingFrame = new TestingFrame();
        Actor2D actor2D = new Actor2D()
                .angle2D(new Angle2D().angle(EAngle2D.JUMPRIGHT.getAngle()))
                .position(new Position().x(100.0).y(-400.0).z(0))
                .feetPerSec(ESpeed.run.getDistance());

        MovementController movementController = new MovementController();
        showActor(testingFrame, actor2D);
        movementController.move(actor2D);
        showActor(testingFrame, actor2D);
        for (int i = 0 ; i < 500; i++) {
            movementController.move(actor2D);
            showActor(testingFrame, actor2D);
            Thread.sleep(1);
            if(i > 250) {
                actor2D.angle2D().angle(EAngle2D.FALLRIGHT.getAngle());
            }
        }
    }

    void showActor(TestingFrame tf, Actor2D actor2D) {
        // log.info("x:{} y:{}", actor2D.position().x(), actor2D.position().y());
        tf.drawDot((int) actor2D.position().x(), -(int) actor2D.position().y());
    }
}
