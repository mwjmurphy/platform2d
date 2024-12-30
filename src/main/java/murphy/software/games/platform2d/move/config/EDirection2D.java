package murphy.software.games.platform2d.move.config;

public enum EDirection2D {
    STILL('S'),
    UP('U'),
    DOWN('D'),
    LEFT('L'),
    RIGHT('R');

    private final char direction;
    EDirection2D(char direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

}
