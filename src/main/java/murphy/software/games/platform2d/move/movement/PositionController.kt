package murphy.software.games.platform2d.move.movement;

import murphy.software.games.platform2d.move.model.Position;

public class PositionController {


    void move(Position mover, double xdiff, double ydiff, double zdiff) {
        mover.x(diff(mover.x(), xdiff));
        mover.y(diff(mover.y(), ydiff));
        mover.z(diff(mover.z(), zdiff));
    }

    private double diff(double d, double diff) {
        return d+diff;
    }
}
