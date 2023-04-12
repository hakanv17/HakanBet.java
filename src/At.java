import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class At extends JFrame implements ActionListener {

    private JButton horse1, horse2, horse3, horse4, horse5, horse6, horse7, anaMenuBtn, btnBet1, btnBet2, btnBet3, btnBet4, btnResetBet;
    private JLabel tokenDisplayerLbl;

    public double tokenBet = 0;

    public At() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("At");
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

        horse1 = new JButton();
        horse1.setText("horse1");
        horse1.setSize(65, 35);
        horse1.setLocation(10, 80);
        horse1.addActionListener(this);

        horse2 = new JButton();
        horse2.setText("horse2");
        horse2.setSize(65, 35);
        horse2.setLocation(10, 120);
        horse2.addActionListener(this);

        horse3 = new JButton();
        horse3.setText("horse3");
        horse3.setSize(65, 35);
        horse3.setLocation(10, 160);
        horse3.addActionListener(this);

        horse4 = new JButton();
        horse4.setText("horse4");
        horse4.setSize(65, 35);
        horse4.setLocation(10, 200);
        horse4.addActionListener(this);

        horse5 = new JButton();
        horse5.setText("horse5");
        horse5.setSize(65, 35);
        horse5.setLocation(10, 240);
        horse5.addActionListener(this);

        horse6 = new JButton();
        horse6.setText("horse6");
        horse6.setSize(65, 35);
        horse6.setLocation(10, 280);
        horse6.addActionListener(this);

        horse7 = new JButton();
        horse7.setText("horse7");
        horse7.setSize(65, 35);
        horse7.setLocation(10, 320);
        horse7.addActionListener(this);

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

        add(anaMenuBtn);
        add(horse1);
        add(horse2);
        add(horse3);
        add(horse4);
        add(horse5);
        add(horse6);
        add(horse7);
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

        int horse = (int) (Math.random() * 7 + 1);

        if (e.getSource() == horse1) {
            int guess1 = 1;
            if (guess1 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");

                if (n == 1) {
                    dispose();
                    new HomePage();
                }

            } else if (guess1 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == horse2) {
            int guess2 = 2;
            if (guess2 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess2 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == horse3) {
            int guess3 = 3;
            if (guess3 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess3 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }
        if (e.getSource() == horse4) {
            int guess4 = 4;
            if (guess4 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess4 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }

        if (e.getSource() == horse5) {
            int guess5 = 5;
            if (guess5 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess5 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }
        }

        if (e.getSource() == horse6) {
            int guess6 = 6;
            if (guess6 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess6 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            }

        }

        if (e.getSource() == horse7) {
            int guess6 = 6;
            if (guess6 == horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Congratulations! \nWould You Want To Try Again?",
                        "ASD", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                tokenBet = 0;
                tokenDisplayerLbl.setText("Your bet is : ");
                if (n == 1) {
                    dispose();
                    new HomePage();
                }
            } else if (guess6 != horse) {
                int n = JOptionPane.showOptionDialog(At.this, "Maybe Next Time! \nWould You Want To Try Again?",
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
