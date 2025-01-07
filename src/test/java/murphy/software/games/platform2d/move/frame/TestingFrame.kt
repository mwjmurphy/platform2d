package murphy.software.games.platform2d.move.frame

import java.awt.Graphics2D
import javax.swing.JFrame

class TestingFrame : JFrame(){
    init {
        super.setTitle("Testing Frame")
        super.setSize(900, 600)
        super.setLocation(100, 100)
        super.setResizable(false)
        super.add(TestingPanel())
        super.setDefaultCloseOperation(EXIT_ON_CLOSE)
        super.setVisible(true)
    }

    fun clear() {
        val g2d = this.graphics as Graphics2D
        g2d.clearRect(0, 0, 900, 900)
    }

    fun drawDot(x: Int, y: Int) {
        val g2d = this.graphics as Graphics2D
        g2d.drawRect(x, y, 1, 1)
    }
}