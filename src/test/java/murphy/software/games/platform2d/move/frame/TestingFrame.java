package murphy.software.games.platform2d.move.frame;

import javax.swing.*;
import java.awt.*;

public class TestingFrame extends JFrame {

    public TestingFrame() throws InterruptedException {
        super.setTitle("Testing Frame");
        super.setSize(900, 600);
        super.setLocation(100, 100);
        super.setResizable(false);
        super.add(new TestingPanel());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public void clear() {
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.clearRect(0,0,900, 900);
    }
    public void drawDot(int x, int y) {
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.drawRect(x,y, 1, 1);
    }
}
