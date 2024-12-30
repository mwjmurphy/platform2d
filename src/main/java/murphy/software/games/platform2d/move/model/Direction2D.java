package murphy.software.games.platform2d.move.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import murphy.software.games.platform2d.move.config.EDirection2D;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Getter
@Setter
public class Direction2D {
    /**
     *       /\      U
     *     <    >  L S R
     *       \/      D
     *
     * S - Still
     * U - Up
     * D - Down
     * L - Left
     * R - Right
     *
     */
    private EDirection2D direction;

    public EDirection2D still() {
        this.direction = EDirection2D.STILL;
        return direction;
    }
    public EDirection2D right() {
        this.direction = EDirection2D.RIGHT;
        return direction;
    }
    public EDirection2D left() {
        this.direction = EDirection2D.LEFT;
        return direction;
    }
    public EDirection2D up() {
        this.direction = EDirection2D.UP;
        return direction;
    }
    public EDirection2D down() {
        this.direction = EDirection2D.DOWN;
        return direction;
    }

}
