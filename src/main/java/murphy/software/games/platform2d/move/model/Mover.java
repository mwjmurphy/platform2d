package murphy.software.games.platform2d.move.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true, fluent = true)
@Getter
@Setter
public class Mover {
    private double x;
    private double y;
    private double z;
}
