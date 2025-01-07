package murphy.software.games.platform2d.move.frame

import javax.swing.JPanel

class TestingPanel : JPanel(true) {
    init {
        super.setDoubleBuffered(true)
    }
//    public void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.drawLine(10, 10, 100, 100);
//    }
}