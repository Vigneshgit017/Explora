package Project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    private JButton b1,b2,b3;
private JTextField t1;
   private JPasswordField t2;









    //JButton b1,b2,b3;
    Login(){

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);//change background color


        setBounds(200,200,900,400);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        //jpanel setting bounds--0,0 means it starts from top left from the frame
        add(p1);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Project/icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(100,120,200,200);
        p1.setLayout(null);
        p1.add(l1);


        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);

        JLabel l2=new JLabel("Username");
        l2.setBounds(60,20,100,30);
        l2.setFont(new Font("SAN-SERIF", Font.PLAIN,20));

        p2.add(l2);

         t1=new JTextField("");
        t1.setBounds(60,60,300,30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        JLabel l3=new JLabel("Password");
        l3.setBounds(60,100,100,30);
        l3.setFont(new Font("SAN-SERIF", Font.PLAIN,20));

        p2.add(l3);

         t2=new JPasswordField();
        t2.setBounds(60,140,300,30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);


        b1=new JButton("Login");
        b1.addActionListener(this);
        b1.setBounds(60,200,130,30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());

        p2.add(b1);

        b2=new JButton("Sign up");
        b2.setBounds(230,200,130,30);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p2.add(b2);

        b3=new JButton("Forget Password");
        b3.setBounds(130,250,130,30);
        b3.setForeground(new Color(133,193,233));
        b3.setBackground(Color.WHITE);
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        b3.addActionListener(this);
        p2.add(b3);


        JLabel l4=new JLabel("Trouble in login");
        l4.setBounds(270,250,100,20);
        p2.add(l4);





        setVisible(true);

    }






    public static void main(String[] args) {

        new Login();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == b1){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/explora", "root", "");
                String sql = "select * from exp_acc where username=? and password=?";
                PreparedStatement st = cn.prepareStatement(sql);

                st.setString(1, t1.getText());
                st.setString(2, t2.getText());
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading(t1.getText()).setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login or Password!");

            }catch (Exception e3){
                e3.printStackTrace();
            }

        }
        if(ae.getSource() == b2){
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }
        if(ae.getSource() == b3){
            setVisible(false);
            Forget_password_copy forgot = new Forget_password_copy();
            forgot.setVisible(true);
        }


    }

}
