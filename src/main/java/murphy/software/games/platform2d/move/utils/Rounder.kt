package murphy.software.games.platform2d.move.utils



class Rounder {
    /**
     * Round to 3 decimal places.
     * @param d
     * @return
     */
    fun round3(d: Double) : Double {
        return Math.round(d*1000).toDouble()/1000
    }

    /**
     * Round to 4 decimal places.
     * @param d
     * @return
     */
    fun round4(d: Double) : Double {
        return Math.round(d*10000).toDouble()/10000
    }

}