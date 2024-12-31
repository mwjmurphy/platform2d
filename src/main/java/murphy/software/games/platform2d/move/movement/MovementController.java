package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.config.EDirection2D;
import murphy.software.games.platform2d.move.model.Actor2D;

public class MovementController {

    public void move(Actor2D actor2D) {
        switch (actor2D.direction2D().direction()) {
            case EDirection2D.UP:
                moveUp(actor2D);
                break;
            case EDirection2D.RIGHT:
                moveRight(actor2D);
                break;
        }
    }

    void moveRight(Actor2D actor2D) {
        actor2D.position().x(actor2D.position().x()+SpeedController.speed(actor2D.feetPerSec()));
    }

    void moveUp(Actor2D actor2D) {
        double gravity = gravityAdjustment();
        double speed = actor2D.feetPerSec() * gravity;
        actor2D.position().y(actor2D.position().y()+speed);
    }

    double gravityAdjustment() {
        return 0.1;
    }

    /**
     * At some point you have to break the motion into x and y components, right?
     *
     * So gravity is just adding the acceleration of gravity to your x and y movement. If gravity is pointing straight down, you only need to worry about the y compnent.
     * If gravity is at some weird angle, then you have to compute the x and y components of gravity at some point:
     *
     * gravity_x = lengthdir_x(gravity_acceleration, gravity_angle);
     * gravity_y = lengthdir_y(gravity_acceleration, gravity_angle);
     *
     * and then every step you just add gravity to your movement speed:
     *
     * hspeed += gravity_x;
     * vspeed += gravity_y;
     *
     * if you were using the built in variables, speed and direction would be automatically recalculated as soon as you change hspeed or vspeed.
     *
     * But if you need to compute them yourself, you can just use point_distance(0,0,hspeed,vspeed) for speed and point_direction(0,0,hspeed,vspeed) for direction.
     */

    /**
     *
     * Basically the equation of a jump are like that:
     *
     * the gravity applies vertically and produce a constant force downward. So the vertical velocity is vy = vy0 - elapsedTime * g with g being the gravity constant and vy0 the initial velocity at the beginning of the jump.
     *
     * You don't have to compute the elapsed time. Simply at every frame, you do this:
     *
     * vy -= g * dt; // dt is the elapsed time since last frame
     *
     * y += vy * dt;
     * x += vx * dt; // vx doesn't change in the jump
     */
}
