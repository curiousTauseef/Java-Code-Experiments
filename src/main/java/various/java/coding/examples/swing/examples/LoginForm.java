package various.java.coding.examples.swing.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Taken from: http://www.oodlestechnologies.com/blogs/Create-login-form-in-Java-using-Swing
 * and with some initial minor changes to be taken further
 */

public class LoginForm extends JFrame implements ActionListener{

    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;

    LoginForm() {

        JFrame frame = new JFrame("Login Form");
        l1 = new JLabel("Login Form");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 16));

        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton(new ImageIcon("/Users/ilariacorda/login.png"));

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        p1.setBounds(300, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);

        frame.add(l1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(l3);
        frame.add(p1);
        frame.add(btn1);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String uname = tf1.getText();
        String pass = p1.getToolTipText();
        if(uname.equals("admin") && pass.equals("abc!123"))
        {
            Welcome wel = new Welcome();
            wel.setVisible(true);
            JLabel label = new JLabel("Welcome:"+uname);
            wel.getContentPane().add(label);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Incorrect login or password",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
