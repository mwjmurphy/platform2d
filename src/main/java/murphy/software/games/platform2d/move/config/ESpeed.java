package murphy.software.games.platform2d.move.config;

public enum ESpeed {
    crawl(2),
    walk(4),
    run(6),
    sprint(7);
    private final double feetPerSec;
    ESpeed(double distance) {
        feetPerSec = distance;
    }
    public double getDistance() {
        return feetPerSec;
    }
}