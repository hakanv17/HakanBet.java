import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jackpot extends JFrame implements ActionListener {

    private JButton anaMenuBtn, btnBet1, btnBet2, btnBet3, btnBet4, btnResetBet, btnPlay;

    private JLabel tokenDisplayerLbl, firstlbl, secondlbl, thirdlbl;

    public double tokenBet = 0;

    public Jackpot() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("Jackpot");
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

        btnPlay = new JButton();
        btnPlay.setText("Play");
        btnPlay.setSize(70, 60);
        btnPlay.setLocation(140, 310);
        btnPlay.addActionListener(this);

        btnBet1 = new JButton();
        btnBet1.setText("100");
        btnBet1.setSize(70, 30);
        btnBet1.setLocation(110, 370);
        btnBet1.addActionListener(this);

        btnBet2 = new JButton();
        btnBet2.setText("250");
        btnBet2.setSize(70, 30);
        btnBet2.setLocation(170, 370);
        btnBet2.addActionListener(this);

        btnBet3 = new JButton();
        btnBet3.setText("500");
        btnBet3.setSize(70, 30);
        btnBet3.setLocation(110, 395);
        btnBet3.addActionListener(this);

        btnBet4 = new JButton();
        btnBet4.setText("1000");
        btnBet4.setSize(70, 30);
        btnBet4.setLocation(170, 395);
        btnBet4.addActionListener(this);

        btnResetBet = new JButton();
        btnResetBet.setText("Reset");
        btnResetBet.setSize(70, 30);
        btnResetBet.setLocation(235, 382);
        btnResetBet.addActionListener(this);

        tokenDisplayerLbl = new JLabel();
        tokenDisplayerLbl.setText("Your bet is : ");
        tokenDisplayerLbl.setSize(350, 60);
        tokenDisplayerLbl.setLocation(95, 415);
        tokenDisplayerLbl.setFont(new Font("MV Boli", Font.PLAIN, 20));

        firstlbl = new JLabel();
        firstlbl.setText("*");
        firstlbl.setSize(350, 60);
        firstlbl.setLocation(80, 200);
        firstlbl.setFont(new Font("MV Boli", Font.PLAIN, 60));

        secondlbl = new JLabel();
        secondlbl.setText("*");
        secondlbl.setSize(350, 60);
        secondlbl.setLocation(160, 200);
        secondlbl.setFont(new Font("MV Boli", Font.PLAIN, 60));

        thirdlbl = new JLabel();
        thirdlbl.setText("*");
        thirdlbl.setSize(350, 60);
        thirdlbl.setLocation(240, 200);
        thirdlbl.setFont(new Font("MV Boli", Font.PLAIN, 60));

        add(anaMenuBtn);
        add(btnPlay);
        add(btnBet1);
        add(btnBet2);
        add(btnBet3);
        add(btnBet4);
        add(btnResetBet);
        add(firstlbl);
        add(secondlbl);
        add(thirdlbl);
        add(tokenDisplayerLbl);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == anaMenuBtn) {
            dispose();
            new HomePage();
        }

        if (e.getSource() == btnBet1) {
            tokenBet += 100;
            tokenDisplayerLbl.setText("Your bet is : " + tokenBet);
        } else if (e.getSource() == btnBet2) {
            tokenBet += 250;
            tokenDisplayerLbl.setText("Your bet is : " + tokenBet);
        } else if (e.getSource() == btnBet3) {
            tokenBet += 500;
            tokenDisplayerLbl.setText("Your bet is : " + tokenBet);
        } else if (e.getSource() == btnBet4) {
            tokenBet += 1000;
            tokenDisplayerLbl.setText("Your bet is : " + tokenBet);
        } else if (e.getSource() == btnResetBet) {
            firstlbl.setText("*");
            secondlbl.setText("*");
            thirdlbl.setText("*");
            tokenDisplayerLbl.setText("Your bet is : ");
            tokenBet = 0;
        }

        if (e.getSource() == btnPlay) {
            int[] randoms = {(int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1)};
            firstlbl.setText(String.valueOf(randoms[0]));
            secondlbl.setText(String.valueOf(randoms[1]));
            thirdlbl.setText(String.valueOf(randoms[2]));
            if (randoms[0] == randoms[1] && randoms[0] == randoms[2]) {
                int n = JOptionPane.showOptionDialog(Jackpot.this, ("Congratulations!\n" + String.valueOf(randoms[0]) + " " + String.valueOf(randoms[1]) +
                                " " + String.valueOf(randoms[2]) + "\nYou won %100 of your bet. \nWould You Want To Try Again?"),
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                firstlbl.setText("*");
                secondlbl.setText("*");
                thirdlbl.setText("*");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (randoms[0] == randoms[1] || randoms[0] == randoms[2] || randoms[1] == randoms[2]) {
                int n = JOptionPane.showOptionDialog(Jackpot.this, ("Congratulations!\n" + String.valueOf(randoms[0]) + " " + String.valueOf(randoms[1]) +
                                " " + String.valueOf(randoms[2]) + "\nYou won %20 of your bet. \nWould You Want To Try Again?"),
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                firstlbl.setText("*");
                secondlbl.setText("*");
                thirdlbl.setText("*");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else {
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");

            }

        }

    }

}
