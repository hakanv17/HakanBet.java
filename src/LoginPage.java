import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPage extends JFrame implements ActionListener, MouseListener {

    //private variables for button textfield label combobox and combobox values
    private JButton btnLogin;
    private JTextField txtName, txtSurname, txtUserName;
    private JLabel lblHakanBet, lblCreate;
    private JComboBox combDay, combMonth, combYear;
    private String days[]
            = {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
    private String months[]
            = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    private String years[]
            = {"1987", "1988", "1989", "1990",
            "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022"};


    //my constructor where gui is created
    public LoginPage() {

        init();
        MyFrame();
    }

    //frame creator method that creates the frame for the loginPage
    public void MyFrame() {

        setLayout(null);
        setTitle("Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 550);
        setLocationRelativeTo(this);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 58, 69));
        setVisible(true);

    }

    //components that will appear on the frame
    public void init() {

        lblHakanBet = new JLabel();
        lblHakanBet.setText("HakanBet");
        lblHakanBet.setSize(350, 60);
        lblHakanBet.setLocation(60, 30);
        lblHakanBet.setFont(new Font("MV Boli", Font.PLAIN, 50));

        lblCreate = new JLabel();
        lblCreate.setText("Please Create User");
        lblCreate.setSize(350, 60);
        lblCreate.setLocation(86, 75);
        lblCreate.setFont(new Font("MV Boli", Font.PLAIN, 20));

        txtName = new JTextField();
        txtName.setText("Name");
        txtName.setSize(175, 50);
        txtName.setLocation(87, 120);
        txtName.addMouseListener(this);

        txtSurname = new JTextField();
        txtSurname.setText("Surname");
        txtSurname.setSize(175, 50);
        txtSurname.setLocation(87, 170);
        txtSurname.addMouseListener(this);

        txtUserName = new JTextField();
        txtUserName.setText("Username");
        txtUserName.setSize(175, 50);
        txtUserName.setLocation(87, 220);
        txtUserName.addMouseListener(this);

        combDay = new JComboBox(days);
        combDay.setBounds(67, 280, 70, 30);

        combMonth = new JComboBox(months);
        combMonth.setBounds(129, 280, 75, 30);

        combYear = new JComboBox(years);
        combYear.setBounds(195, 280, 85, 30);

        btnLogin = new JButton("LOGIN");
        btnLogin.setSize(175, 50);
        btnLogin.setLocation(87, 320);
        btnLogin.addActionListener(this);

        //adding the buttons textfields comboboxes and labels to de frame
        add(lblHakanBet);
        add(lblCreate);
        add(txtName);
        add(txtSurname);
        add(txtUserName);
        add(combDay);
        add(combMonth);
        add(combYear);
        add(btnLogin);

    }


    //actionlistener method where i added functionality to combobox and buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        outerloop:
        if (e.getSource() == btnLogin) {
            if (combYear.getSelectedItem() == "2006" ||
                    combYear.getSelectedItem() == "2007" ||
                    combYear.getSelectedItem() == "2008" ||
                    combYear.getSelectedItem() == "2009" ||
                    combYear.getSelectedItem() == "2010" ||
                    combYear.getSelectedItem() == "2011" ||
                    combYear.getSelectedItem() == "2012" ||
                    combYear.getSelectedItem() == "2013" ||
                    combYear.getSelectedItem() == "2014" ||
                    combYear.getSelectedItem() == "2015" ||
                    combYear.getSelectedItem() == "2016" ||
                    combYear.getSelectedItem() == "2017" ||
                    combYear.getSelectedItem() == "2018" ||
                    combYear.getSelectedItem() == "2019" ||
                    combYear.getSelectedItem() == "2020" ||
                    combYear.getSelectedItem() == "2021" ||
                    combYear.getSelectedItem() == "2022") {
                JOptionPane.showMessageDialog(LoginPage.this, "You have to be 18 years old to create an account.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                break outerloop;
            }

            //Created a user object to store the data that the user types in
            User user = new User();
            user.setName(txtName.getText());
            user.setSurName(txtSurname.getText());
            user.setUserName(txtUserName.getText());

            Container.getInstance().name = txtName.getText();
            String tempName = String.valueOf(Container.getInstance());

            Container.getInstance().surname = txtSurname.getText();
            String tempSurName = String.valueOf(Container.getInstance());

            Container.getInstance().username = txtUserName.getText();
            String tempUserName = String.valueOf(Container.getInstance());

            JOptionPane.showMessageDialog(LoginPage.this, "Welcome " + user.getName() + " " +
                            user.getSurName() + ". Your Username is: " + user.getUserName() + "\n\nHello " + user.getUserName() +
                            " This application will cover few of the" +
                            "\nbetting games such as horse racing, coin flipping, etc." +
                            "\nYou are going to answer some math " +
                            "\nproblems to gain tokens to play these games. " +
                            "\nIf you answers the questions correctly the" +
                            "\napplication will add 150 tokens to your account." +
                            "\nThe profit is 50% of your bet in all games.",
                    "Welcome", JOptionPane.PLAIN_MESSAGE);
            dispose();
            new HomePage();
        }

    }

    //mouselistener method where i added functionality to the textfields
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == txtName) {
            txtName.setText("");
        } else if (e.getSource() == txtSurname) {
            txtSurname.setText("");
        } else if (e.getSource() == txtUserName) {
            txtUserName.setText("");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
