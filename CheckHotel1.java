package Project;

import javax.swing.*;
import java.awt.*;

public class CheckHotel1 extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    Thread th;

    public CheckHotel1() {

        setBounds(440, 150, 600, 500);
        getContentPane().setBackground(new Color(220, 250, 250));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project/icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 600, 500);
        add(l2);



}



    public static void main(String args[]) {
        new CheckHotel1().setVisible(true);

    }}
