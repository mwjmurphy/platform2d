package murphy.software.games.platform2d.move.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Getter
@Setter
@ToString
public class Position2D {
    private double x;
    private double y;
}
