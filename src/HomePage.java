import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    private JButton profilbtn, diceBtn, horseBtn, JackpotBtn, headTailBtn, tokenBtn;

    public HomePage() {
        init();
        MyFrame();
        TimeInFrame tif = new TimeInFrame();
        Thread thread = new Thread(tif);
        thread.start();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("HomePage");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 550);
        setLocationRelativeTo(this);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 58, 69));
        setVisible(true);

    }

    public void init() {

        profilbtn = new JButton();
        profilbtn.setText("Profil");
        profilbtn.setSize(175, 50);
        profilbtn.setLocation(10, 30);
        profilbtn.addActionListener(this);

        diceBtn = new JButton();
        diceBtn.setText("Zar");
        diceBtn.setSize(175, 50);
        diceBtn.setLocation(10, 80);
        diceBtn.addActionListener(this);

        horseBtn = new JButton();
        horseBtn.setText("At");
        horseBtn.setSize(175, 50);
        horseBtn.setLocation(10, 130);
        horseBtn.addActionListener(this);

        JackpotBtn = new JButton();
        JackpotBtn.setText("Jackpot");
        JackpotBtn.setSize(175, 50);
        JackpotBtn.setLocation(10, 180);
        JackpotBtn.addActionListener(this);

        headTailBtn = new JButton();
        headTailBtn.setText("YaziTura");
        headTailBtn.setSize(175, 50);
        headTailBtn.setLocation(10, 230);
        headTailBtn.addActionListener(this);

        tokenBtn = new JButton();
        tokenBtn.setText("Token");
        tokenBtn.setSize(175, 50);
        tokenBtn.setLocation(10, 280);
        tokenBtn.addActionListener(this);

        Loading loading = new Loading();

        add(profilbtn);
        add(diceBtn);
        add(horseBtn);
        add(JackpotBtn);
        add(headTailBtn);
        add(tokenBtn);
        add(loading);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == profilbtn) {
            dispose();
            new Profil();
        } else if (e.getSource() == diceBtn) {
            dispose();
            new Zar();
        } else if (e.getSource() == horseBtn) {
            dispose();
            new At();
        } else if (e.getSource() == JackpotBtn) {
            dispose();
            new Jackpot();
        } else if (e.getSource() == headTailBtn) {
            dispose();
            new YaziTura();
        } else if (e.getSource() == tokenBtn) {
            dispose();
            new Token();
        }

    }
}
