import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Zar extends JFrame implements ActionListener {
    private JButton anaMenuBtn, btn1, btn2, btn3, btn4, btn5, btn6, btnBet1, btnBet2, btnBet3, btnBet4, btnResetBet;

    public double tokenBet = 0;
    private JLabel textLbl, tokenDisplayerLbl;


    public Zar() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("Zar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 550);
        setLocationRelativeTo(this);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 58, 69));
        setVisible(true);
    }

    public void init() {

        textLbl = new JLabel();
        textLbl.setText("Please make a guess");
        textLbl.setSize(350, 60);
        textLbl.setLocation(77, 75);
        textLbl.setFont(new Font("MV Boli", Font.PLAIN, 20));

        anaMenuBtn = new JButton();
        anaMenuBtn.setText("Ana Menüye Dön");
        anaMenuBtn.setSize(175, 50);
        anaMenuBtn.setLocation(5, 20);
        anaMenuBtn.addActionListener(this);

        btn1 = new JButton();
        btn1.setText("1");
        btn1.setSize(75, 75);
        btn1.setLocation(100, 130);
        btn1.addActionListener(this);

        btn2 = new JButton();
        btn2.setText("2");
        btn2.setSize(75, 75);
        btn2.setLocation(175, 130);
        btn2.addActionListener(this);

        btn3 = new JButton();
        btn3.setText("3");
        btn3.setSize(75, 75);
        btn3.setLocation(100, 205);
        btn3.addActionListener(this);

        btn4 = new JButton();
        btn4.setText("4");
        btn4.setSize(75, 75);
        btn4.setLocation(175, 205);
        btn4.addActionListener(this);

        btn5 = new JButton();
        btn5.setText("5");
        btn5.setSize(75, 75);
        btn5.setLocation(100, 280);
        btn5.addActionListener(this);

        btn6 = new JButton();
        btn6.setText("6");
        btn6.setSize(75, 75);
        btn6.setLocation(175, 280);
        btn6.addActionListener(this);

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


        add(textLbl);
        add(anaMenuBtn);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnBet1);
        add(btnBet2);
        add(btnBet3);
        add(btnBet4);
        add(btnResetBet);
        add(tokenDisplayerLbl);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
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

        int dice = (int) (Math.random() * 6 + 1);

        if (e.getSource() == btn1) {
            int guess1 = 1;
            if (guess1 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }

            } else if (guess1 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == btn2) {
            int guess2 = 2;
            if (guess2 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess2 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == btn3) {
            int guess3 = 3;
            if (guess3 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess3 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == btn4) {
            int guess4 = 4;
            if (guess4 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess4 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }

        if (e.getSource() == btn5) {
            int guess5 = 5;
            if (guess5 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess5 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }

        if (e.getSource() == btn6) {
            int guess6 = 6;
            if (guess6 == dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess6 != dice) {
                int n = JOptionPane.showOptionDialog(Zar.this, "Maybe Next Time! \nWould You Want To Try Again?",
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

