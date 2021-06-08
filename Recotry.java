package Project;

import Project.Recommend;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Recotry extends JFrame implements Runnable{

int count=0;
int n;
    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    String age,annual;
    int age1,ann;
    JLabel[] label=new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};

    public void run(){
      int j=0;
        String[] text =new String[]{"Jw mariot-54000","Sunfinch-60000","Justin-80000","Js Mariot-67777","Winzy-30000","Mansoons-37000","Ramiah-28000","Kanishk-20000","A+star-17000","City Gold-16000"};
        if(count==1){
            j=0;
            n=4;
        }
        else if(count==2){
            j=j+5;
            n=6;
        }
        else if(count==3){
            j=j+7;
            n=9;
        }

        for(int i=j;i<=n;i++){
            this.label[i].setVisible(true);
            caption.setText(text[i]);
            this.label[i].add(caption);
            try {
                Thread.sleep(2800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.label[i].setVisible(false);
        }
    }

    /*receive age and annual income of the customer table
     * if(age between 20 and 30){
     * display bronze package*/
    public Recotry(String username){
        // setBounds(280, 120, 900, 500);
        //getContentPane().setBackground(new Color(220, 250, 250));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/explora", "root", "");
            String sql = "select * from customer where username=?";
            PreparedStatement prep = cn.prepareStatement(sql);
            prep.setString(1, username);
            ResultSet rs = prep.executeQuery();

            while (rs.next()) {
                age=rs.getString("age");
                age1=Integer.parseInt(age);
                annual=rs.getString("Annualincome");
                ann=Integer.parseInt(annual);
            }

        }catch (Exception e5){}

        int age11=34;
        if(age1>20 && age1<30){

          count=1;



            setBounds(280,150,700,500);
            ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
            ImageIcon[] image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};


            Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
            Image[] ji=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

            ImageIcon i11=null,i22=null,i33=null,i44=null,i55=null,i66=null,i77=null,i88=null,i99=null,i20=null;
            ImageIcon[] image11=new ImageIcon[]{i11,i22,i33,i44,i55,i66,i77,i88,i99,i20};

            caption=new JLabel();
            caption.setBounds(50,350,400,70);
            caption.setForeground(Color.WHITE);
            caption.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(caption);
            for(int i=0;i<=4;i++){
                image[i]= new ImageIcon(ClassLoader.getSystemResource("Project/icons/hotel"+(i+1)+".jpg"));
                ji[i] = image[i].getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
                image11[i] = new ImageIcon(ji[i]);
                this.label[i] = new JLabel(image11[i]);
                this.label[i].setBounds(0, 0, 700, 500);
                add(this.label[i]);
            }

            t1=new Thread(this);
            t1.start();

        }

        if(age1>30 && age1<40){



count=2;

            setBounds(280,150,700,500);
            ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
            ImageIcon[] image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};


            Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
            Image[] ji=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

            ImageIcon i11=null,i22=null,i33=null,i44=null,i55=null,i66=null,i77=null,i88=null,i99=null,i20=null;
            ImageIcon[] image11=new ImageIcon[]{i11,i22,i33,i44,i55,i66,i77,i88,i99,i20};

            caption=new JLabel();
            caption.setBounds(50,350,400,70);
            caption.setForeground(Color.WHITE);
            caption.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(caption);
            for(int i=5;i<=6;i++){
                image[i]= new ImageIcon(ClassLoader.getSystemResource("Project/icons/hotel"+(i+1)+".jpg"));
                ji[i] = image[i].getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
                image11[i] = new ImageIcon(ji[i]);
                this.label[i] = new JLabel(image11[i]);
                this.label[i].setBounds(0, 0, 700, 500);
                add(this.label[i]);
            }

            t1=new Thread(this);
            t1.start();

        }


        if(age1>50 && age1<60){



            count=3;

            setBounds(280,150,700,500);
            ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
            ImageIcon[] image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};


            Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
            Image[] ji=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

            ImageIcon i11=null,i22=null,i33=null,i44=null,i55=null,i66=null,i77=null,i88=null,i99=null,i20=null;
            ImageIcon[] image11=new ImageIcon[]{i11,i22,i33,i44,i55,i66,i77,i88,i99,i20};

            caption=new JLabel();
            caption.setBounds(50,350,400,70);
            caption.setForeground(Color.WHITE);
            caption.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(caption);
            for(int i=6;i<=9;i++){
                image[i]= new ImageIcon(ClassLoader.getSystemResource("Project/icons/hotel"+(i+1)+".jpg"));
                ji[i] = image[i].getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
                image11[i] = new ImageIcon(ji[i]);
                this.label[i] = new JLabel(image11[i]);
                this.label[i].setBounds(0, 0, 700, 500);
                add(this.label[i]);
            }

            t1=new Thread(this);
            t1.start();

        }
    }


    public static void main(String args[]) {
        new Recotry("").setVisible(true);

    }
}
