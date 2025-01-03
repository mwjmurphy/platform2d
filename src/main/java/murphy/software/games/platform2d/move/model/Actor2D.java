package murphy.software.games.platform2d.move.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Getter
@Setter
@ToString
public class Actor2D {
    Position position;
    Angle2D angle2D;
    double feetPerSec;

    public void changeX(double amount) {
        position.x(position.x() + amount);
    }
    public void changeY(double amount) {
        position.y(position.y() - amount);
    }

}
