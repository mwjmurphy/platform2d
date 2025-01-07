package murphy.software.games.platform2d.move.frame;

public class FrameTest {

    // @Test
    void testOpenFrame() throws InterruptedException {
        TestingFrame tf = new TestingFrame();
        tf.drawDot(100,100);
        Thread.sleep(2000);
        tf.drawDot(120,120);
        Thread.sleep(2000);
        tf.clear();
        tf.drawDot(150,150);
        Thread.sleep(10000);
    }
}
