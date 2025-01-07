package murphy.software.games.platform2d.move.movement

import murphy.software.games.platform2d.move.config.EAngle2D
import murphy.software.games.platform2d.move.config.ESpeed
import murphy.software.games.platform2d.move.frame.TestingFrame
import murphy.software.games.platform2d.move.model.Actor2D
import murphy.software.games.platform2d.move.utils.Rounder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MovementControllerTest {

    @Test
    fun testMovementController() {
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = EAngle2D.RIGHT.angle
            position2D.x = 100.0
            position2D.y = -100.0
            feetPerSec = ESpeed.walk.getDistance()
        }
        val movementController = MovementController()
        movementController.move(actor2D)
        assertEquals(100.8, actor2D.position2D.x)
        val p2d  = movementController.companion.distanceController.distance(50.0, 50.0)
        assertEquals(5.107,Rounder().round3(p2d.x))
    }


    // @Tag("integration-test")
    @Test
    @Throws(InterruptedException::class)
    fun testMovementRight() {
        val testingFrame = TestingFrame()
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = EAngle2D.RIGHT.angle
            position2D.x = 100.0
            position2D.y = -100.0
            feetPerSec = ESpeed.walk.getDistance()
        }
        val movementController = MovementController()
        showActor(testingFrame, actor2D)
        movementController.move(actor2D)
        showActor(testingFrame, actor2D)
        for (i in 0..999) {
            movementController.move(actor2D)
            showActor(testingFrame, actor2D)
            Thread.sleep(1)
        }
        Thread.sleep(1000)
    }

    // @Tag("integration-test")
    @Test
    @Throws(InterruptedException::class)
    fun testMovementUp() {
        val testingFrame = TestingFrame()
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = EAngle2D.UP.angle
            position2D.x = 100.0
            position2D.y = -300.0
            feetPerSec = ESpeed.walk.getDistance()
        }
        val movementController = MovementController()
        showActor(testingFrame, actor2D)
        movementController.move(actor2D)
        showActor(testingFrame, actor2D)
        for (i in 0..999) {
            movementController.move(actor2D)
            showActor(testingFrame, actor2D)
            // actor2D.angle2D().clockwise(0.1);
            // actor2D.feetPerSec(actor2D.feetPerSec()+0.01);
            Thread.sleep(1)
        }
    }

    // @Tag("integration-test")
    @Test
    @Throws(InterruptedException::class)
    fun testMovementJump() {
        val testingFrame = TestingFrame()
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = EAngle2D.UP.angle
            position2D.apply {
                x = 100.0
                y = -400.0
            }
            feetPerSec = ESpeed.run.getDistance()
        }
        val movementController = MovementController()
        showActor(testingFrame, actor2D)
        movementController.move(actor2D)
        showActor(testingFrame, actor2D)
        for (i in 0..999) {
            movementController.move(actor2D)
            actor2D.angle2D.clockwise(0.4)
            showActor(testingFrame, actor2D)
            Thread.sleep(1)
        }
    }

    // @Tag("integration-test")
    @Test
    @Throws(InterruptedException::class)
    fun testMovementJumpRight() {
        val testingFrame = TestingFrame()
        val actor2D: Actor2D = Actor2D().apply {
            angle2D.angle = EAngle2D.JUMPRIGHT.angle
            position2D.x = 100.0
            position2D.y = -400.0
            feetPerSec = ESpeed.run.getDistance()
        }
        val movementController = MovementController()
        showActor(testingFrame, actor2D)
        movementController.move(actor2D)
        showActor(testingFrame, actor2D)
        for (i in 0..499) {
            movementController.move(actor2D)
            showActor(testingFrame, actor2D)
            Thread.sleep(1)
            if (i > 250) {
                actor2D.angle2D.angle = EAngle2D.FALLRIGHT.angle
            }
        }
    }

    fun showActor(tf: TestingFrame, actor2D: Actor2D) {
        // log.info("x:{} y:{}", actor2D.position().x(), actor2D.position().y());
        tf.drawDot(actor2D.position2D.x.toInt(), -actor2D.position2D.y.toInt())
    }

}