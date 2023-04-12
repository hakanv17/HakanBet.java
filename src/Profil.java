import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profil extends JFrame implements ActionListener {
    JLabel namelbl, surnamelbl, usernamelbl;

    private JButton anaMenuBtn;

    public Profil() {
        init();
        MyFrame();
    }

    public void MyFrame() {

        setLayout(null);
        setTitle("Profil");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 550);
        setLocationRelativeTo(this);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 58, 69));
        setVisible(true);
    }

    public void init() {

        namelbl = new JLabel();
        namelbl.setText("Name : " + Container.getInstance().name);
        namelbl.setSize(350, 60);
        namelbl.setLocation(60, 90);
        namelbl.setFont(new Font("MV Boli", Font.PLAIN, 20));

        surnamelbl = new JLabel();
        surnamelbl.setText("Surname : " + Container.getInstance().surname);
        surnamelbl.setSize(350, 60);
        surnamelbl.setLocation(60, 120);
        surnamelbl.setFont(new Font("MV Boli", Font.PLAIN, 20));

        usernamelbl = new JLabel();
        usernamelbl.setText("Username : " + Container.getInstance().username);
        usernamelbl.setSize(350, 60);
        usernamelbl.setLocation(60, 150);
        usernamelbl.setFont(new Font("MV Boli", Font.PLAIN, 20));

        anaMenuBtn = new JButton();
        anaMenuBtn.setText("Ana Menüye Dön");
        anaMenuBtn.setSize(175, 50);
        anaMenuBtn.setLocation(5, 20);
        anaMenuBtn.addActionListener(this);

        add(namelbl);
        add(surnamelbl);
        add(usernamelbl);
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
