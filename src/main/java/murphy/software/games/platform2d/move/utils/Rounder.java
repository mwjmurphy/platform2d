package murphy.software.games.platform2d.move.utils;

public class Rounder {

    /**
     * Round to 3 decimal places.
     * @param d
     * @return
     */
    public static double round3(double d) {
        int s = (int) (d * 1000);
        return ((double) s) / 1000;
    }
}
