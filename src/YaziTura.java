import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YaziTura extends JFrame implements ActionListener {

    private JButton anaMenuBtn, btnBet1, btnBet2, btnBet3, btnBet4, btnYazi, btnTura, btnResetBet;
    private JLabel tokenDisplayerLbl;

    public double tokenBet = 0;

    public YaziTura() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("YaziTura");
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

        btnYazi = new JButton();
        btnYazi.setText("Yazi");
        btnYazi.setSize(75, 75);
        btnYazi.setLocation(100, 180);
        btnYazi.addActionListener(this);

        btnTura = new JButton();
        btnTura.setText("Tura");
        btnTura.setSize(75, 75);
        btnTura.setLocation(175, 180);
        btnTura.addActionListener(this);

        add(anaMenuBtn);
        add(btnBet1);
        add(btnBet2);
        add(btnBet3);
        add(btnBet4);
        add(btnResetBet);
        add(btnYazi);
        add(btnTura);
        add(tokenDisplayerLbl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int YaziTura = (int) (Math.random() * 2 + 1);

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
            tokenDisplayerLbl.setText("Your bet is : ");
            tokenBet = 0;
        }


        if (e.getSource() == anaMenuBtn) {
            dispose();
            new HomePage();
        }

        if (e.getSource() == btnYazi) {
            int guess1 = 1;
            if (guess1 == YaziTura) {
                int n = JOptionPane.showOptionDialog(YaziTura.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }

            } else if (guess1 != YaziTura) {
                int n = JOptionPane.showOptionDialog(YaziTura.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == btnTura) {
            int guess2 = 2;
            if (guess2 == YaziTura) {
                int n = JOptionPane.showOptionDialog(YaziTura.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess2 != YaziTura) {
                int n = JOptionPane.showOptionDialog(YaziTura.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }

    }
}
