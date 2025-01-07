package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Actor2D;
import murphy.software.games.platform2d.move.model.Position2D;

public class MovementController {

    public void move(Actor2D actor2D) {
        Position2D xy = DistanceController.distance(actor2D.feetPerSec(), actor2D.angle2D().angle());
        actor2D.changeX(xy.x());
        actor2D.changeY( - xy.y());
    }
}
