package murphy.software.games.platform2d.move.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Getter
@Setter
public class Actor2D {
    Position position;
    Direction2D direction2D;
    Angle2D angle2D;
    double feetPerSec;
}
