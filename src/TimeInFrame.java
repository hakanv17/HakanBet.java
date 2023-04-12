import javax.swing.*;

public class TimeInFrame extends JPanel implements Runnable {

    @Override
    public void run() {
        Counter();
    }

    public void Counter() {
        while (true) {
            for (int i = 1; i < 9999; i++) {
                try {
                    Thread.sleep(1100);
                    System.out.println(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
