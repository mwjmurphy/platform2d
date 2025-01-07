package murphy.software.games.platform2d.move.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Getter
@Setter
@ToString
public class Angle2D {
    private double angle;  // 0 to 360 in steps

    public void clockwise(double amount) {
        angle += amount;
    }
    public void antiClockwise(double amount) {
        angle -= amount;
    }
}
