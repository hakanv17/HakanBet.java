import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loading extends JPanel implements Runnable, ActionListener {
    private int x, y;
    private Thread thread;

    public Loading() {
        x = 50;
        y = 1;

        thread = new Thread(this);
        thread.start();

        setLayout(null);
        setBackground(new Color(50, 58, 69));
        setSize(750, 20);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 15, 15);
    }

    @Override
    public void run() {
        moveCircleLeftToRight();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void moveCircleLeftToRight() {
        while (x <= 600) {
            try {
                Thread.sleep(10);
                x = x + 5;
                repaint();
                if (x == 600) {
                    while (x >= 100) {
                        try {
                            Thread.sleep(10);
                            x = x - 5;
                            repaint();

                        } catch (InterruptedException e) {
                            // TODO: handle exception
                            return; // exit from the loop
                        }
                    }

                }
            } catch (InterruptedException e) {
                // TODO: handle exception
                return; // exit from the loop
            }
        }
    }

}


