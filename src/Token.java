import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Token extends JFrame implements ActionListener {

    private JButton anaMenuBtn;

    public Token() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("Token");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 550);
        setLocationRelativeTo(this);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 58, 69));
        setVisible(true);
    }

    public void init() {
        anaMenuBtn = new JButton();
        anaMenuBtn.setText("Ana Menüye Dön");
        anaMenuBtn.setSize(175, 40);
        anaMenuBtn.setLocation(5, 20);
        anaMenuBtn.addActionListener(this);

        add(anaMenuBtn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == anaMenuBtn) {
            dispose();
            new HomePage();
        }

    }
}
