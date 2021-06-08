package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
String username;
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);//SETS TO FULLSCREEN
       setLayout(null);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1950,65);
        p1.setBackground(new Color(0,0,102));
        add(p1);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Project/icons/splash.jpg"));
        Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(0,0,70,70);
        p1.add(l2);

        JLabel l3=new JLabel("DashBoard");
        l3.setFont(new Font("Tahoma",Font.BOLD,25));
        l3.setForeground(Color.WHITE);
       l3.setBounds( 80,10,300,40);
       p1.add(l3);


        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,200,1000);
        p2.setBackground(new Color(0,0,102));
        add(p2);

   b1=new JButton("Add Personal Details");
   b1.setBackground(new Color(0,0,102));
   b1.setFont(new Font("Tahoma",Font.PLAIN,15));
   //b1.setMargin(new Insets(0,0,0,60));
   b1.setForeground(Color.WHITE);
   b1.setBounds(0,0,200,50);
   p2.add(b1);
   b1.addActionListener(this);



        b2=new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setForeground(Color.WHITE);
     //   b2.setMargin(new Insets(0,0,0,30));
        b2.setBounds(0,50,200,50);
        b2.addActionListener(this);
        p2.add(b2);

        b3=new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma",Font.PLAIN,15));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
       // b3.setMargin(new Insets(0,0,0,100));
        b3.setBounds(0,100,200,50);
        p2.add(b3);

        b4=new JButton("Recommended Hotels");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN,15));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBounds(0,150,200,50);
        p2.add(b4);

        b5=new JButton("Check Package");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN,15));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0,200,200,50);
        b5.addActionListener(this);
        p2.add(b5);

        b6=new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma",Font.PLAIN,15));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0,250,200,50);
        b6.addActionListener(this);
        p2.add(b6);

        b7=new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,15));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0,300,200,50);
        b7.addActionListener(this);
        p2.add(b7);

        b8=new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Tahoma",Font.PLAIN,15));
        b8.setForeground(Color.WHITE);
        b8.setBounds(0,350,200,50);
        b8.addActionListener(this);
        p2.add(b8);

        b9=new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma",Font.PLAIN,15));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0,400,200,50);
        b9.addActionListener(this);
        p2.add(b9);

        b10=new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Tahoma",Font.PLAIN,15));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0,450,200,50);
        b10.addActionListener(this);
        p2.add(b10);

        b11=new JButton("Destination");
        b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Tahoma",Font.PLAIN,15));
        b11.setForeground(Color.WHITE);
        b11.setBounds(0,500,200,50);
        p2.add(b11);

        b12=new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setFont(new Font("Tahoma",Font.PLAIN,15));
        b12.setForeground(Color.WHITE);
        b12.setBounds(0,550,200,50);
        b12.addActionListener(this);
        p2.add(b12);






        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Project/icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);

        l1.setBounds(0,0,1950,1000);
        add(l1);

        JLabel l4=new JLabel("EXPLORA");
        l4.setBounds(600,100,1000,50);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma",Font.PLAIN,60));
        l1.add(l4);

    }

    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1){
             try{
             new AddCustomer(username).setVisible(true);
         }
             catch (Exception e1){}

    }
        else if(e.getSource()==b2){
            try{
                new UpdateCustomer(username).setVisible(true);
            }
            catch (Exception e1){}
}

         else if(e.getSource()==b5){
             try{
                 new Checkpackage(username).setVisible(true);
             }
             catch (Exception e1){}

         }
         else if(e.getSource()==b6){
             try{
                 new BookPackage(username).setVisible(true);
             }
             catch (Exception e1){}

    }

         else if(e.getSource()==b7){
             try{
                 new ViewPackage(username).setVisible(true);
             }
             catch (Exception e1){}

         }
         else if(e.getSource()==b9){
             try{
                 new BookHotel(username).setVisible(true);
             }
             catch (Exception e1){}

         }


         else if(e.getSource()==b10){
             try{
                 new ViewHotels(username).setVisible(true);
             }
             catch (Exception e1){}

         }
         else if(e.getSource()==b3){
             try{
                 new ViewCustomer(username).setVisible(true);
             }
             catch (Exception e1){}

         }

         else if(e.getSource()==b8){
             try{
                 new CheckHotel().setVisible(true);

             }
             catch (Exception e1){}

         }
         else if(e.getSource()==b12){
             try{
                 new Payment().setVisible(true);

             }
             catch (Exception e1){}

         }
         else if(e.getSource()==b4){
             try{
                 new Reco(username).setVisible(true);

             }
             catch (Exception e1){}

         }


    }}
