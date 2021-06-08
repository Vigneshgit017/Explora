package Project;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
JProgressBar p;
Thread t;
String username;
public void run(){
    try{
        for(int i=1;i<=101;i++){
            int m=p.getMaximum();//100 maybe
            int n=p.getValue();//current value//maybe 32
            if(n<m){//32<100---increment......when 100<100then else part
                p.setValue(p.getValue()+1);
            }
            else{
                i=101;
                setVisible(false);
                new Dashboard(username).setVisible(true);
            }
            Thread.sleep(50);
        }
    }catch (Exception e4){

    }
}
    Loading(String user){
        username=user;
        t=new Thread(this);
        setBounds(400,150,500,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//why is this

        JLabel l1=new JLabel("EXPLORA");
        l1.setBounds(150,40,600,40);
        l1.setFont(new Font("Railway",Font.BOLD,40));
        l1.setForeground(Color.BLUE);
        add(l1);

        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(100,100,300,25);
        add(p);

        JLabel l2=new JLabel("Please Wait");
        l2.setBounds(160,140,300,20);
        l2.setFont(new Font("Railway",Font.BOLD,20));
        l2.setForeground(Color.RED);
        add(l2);

        JLabel l3=new JLabel("Welcome " +username);
        l3.setBounds(30,290,320,20);
        l3.setFont(new Font("Railway",Font.BOLD,20));
        l3.setForeground(Color.RED);
        add(l3);

        t.start();
    }




    public static void main(String[] args) {
        new Loading("").setVisible(true);

    }


}
