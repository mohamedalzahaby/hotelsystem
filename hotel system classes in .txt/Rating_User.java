/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage2;

import hotelsystem.newpackage1.Choose;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Rating_User extends JPanel{
    public int x,y;
    public int neededx,neededy;
    Color c;
    String rate;
    ArrayList<String> arraysave = new ArrayList();
    public Rating_User()
    {
        rate ="0";
        c = Color.ORANGE;
        x=75;
        y=586;
        neededx=0;
        neededy=0;
        setSize(800,700);
        this.setLayout(null);
        final JTextField id = new JTextField("ID");
        id.setBounds(450,60,90,30);
        add(id);
        
        
        //add comboBox
        final JComboBox whoseRate = new JComboBox();
        whoseRate.addItem("Select");
        whoseRate.addItem("manager");
        whoseRate.addItem("receptionist");
          whoseRate.addItem("Driver");
        whoseRate.addItem("IT");
        
        
          whoseRate.addItem("House_Keeping");
        whoseRate.addItem("Security");
          whoseRate.addItem("Suppliers");
        whoseRate.addItem("cheif");
        
        
         
        
        
        
        whoseRate.setSelectedItem("none");
        whoseRate.setBounds(310,25,90,30);
        add(whoseRate);
        
        
        //add label
        JLabel choose = new JLabel("rating the");
        choose.setBounds(250,25,90,30);
        add(choose);
       
        
        
        //Button save
        JButton save=new JButton("save");
        save.setBounds(450,25,90,30);
        add(save);
        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!id.getText().equals("ID"))
                {
                    if(!rate.equals("0"))
                    {
                        if(!whoseRate.getSelectedItem().equals("none"))
                        {
                            arraysave.add(id.getText());
                            arraysave.add((String) whoseRate.getSelectedItem());
                            arraysave.add(rate);
                            //this for loop is just for checking
                            for(String f : arraysave){System.out.println(f);}
                        }
                         else{JOptionPane.showMessageDialog(null,"please choose whome to rate","error",JOptionPane.ERROR_MESSAGE);}
                    }
                    else{JOptionPane.showMessageDialog(null,"please choose your rate","error",JOptionPane.ERROR_MESSAGE);}
                }
                else{JOptionPane.showMessageDialog(null,"please enter id number","error",JOptionPane.ERROR_MESSAGE);}
                
            }
        });
        
        /*
        *
        *
        *
        *
        *
        *
        * 
        */
        //Button 10
        JButton btn10=new JButton("10 stars");
        btn10.setBounds(450,100,90,30);
        add(btn10);
        btn10.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 80;
                    rate = "10";
                    JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 9
        JButton btn9=new JButton("9 stars");
        btn9.setBounds(450,150,90,30);
        add(btn9);
        btn9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 130;
                    rate = "9";
                     JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 8
        JButton btn8=new JButton("8 stars");
        btn8.setBounds(450,200,90,30);
        add(btn8);
        btn8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 180;
                    rate = "8";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 7
        JButton btn7=new JButton("7 stars");
        btn7.setBounds(450,250,90,30);
        add(btn7);
        btn7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 230;
                    rate = "7";
                    JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 6
        JButton btn6=new JButton("6 stars");
        btn6.setBounds(450,300,90,30);
        add(btn6);
        btn6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 280;
                    rate = "6";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 5
        JButton btn5=new JButton("5 stars");
        btn5.setBounds(450,350,90,30);
        add(btn5);
        btn5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 330;
                    rate = "5";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 4
        JButton btn4=new JButton("4 stars");
        btn4.setBounds(450,400,90,30);
        add(btn4);
        btn4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 380;
                    rate = "4";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 3
        JButton btn3=new JButton("3 stars");
        btn3.setBounds(450,450,90,30);
        add(btn3);
        btn3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 430;
                    rate = "3";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 2
        JButton btn2=new JButton("2 stars");
        btn2.setBounds(450,500,90,30);
        add(btn2);
        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 480;
                    rate = "2";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
        /*
        *
        *
        *
        *
        *
        *
        *
        */
        //Button 1
        JButton btn1=new JButton("1 stars");
        btn1.setBounds(450,550,90,30);
        add(btn1);
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                { 
                    neededy = 530;
                    rate = "1";
                      JOptionPane.showMessageDialog(null, "Action performed");
                    move();
                }
                catch (InterruptedException ez){}
            }
        });
               
        
    }

   
    
   public void move() throws InterruptedException
   {
      Thread gameThread = new Thread(){
         public void run() 
         {
             while(y!=neededy)
             {
                if(y > neededy)
                {
                    y =y-1;
                }
                if(y < neededy)
                {
                    y =y+1;
                }
                if(y == 80  && neededy == 80 ){c = Color.YELLOW;}
                if(y == 130 && neededy == 130){c = Color.LIGHT_GRAY;}
                if(y == 180 && neededy == 180){c = Color.cyan;}
                if(y == 230 && neededy == 230){c = Color.blue;}
                if(y == 280 && neededy == 280){c = Color.RED;}
                if(y == 330  && neededy == 330){c = Color.YELLOW;}
                if(y == 380 && neededy == 380){c = Color.LIGHT_GRAY;}
                if(y == 430 && neededy == 430){c = Color.cyan;}
                if(y == 480 && neededy == 480){c = Color.blue;}
                if(y == 530 && neededy == 530){c = Color.RED;}
                repaint();
                try{Thread.sleep(3);}
                catch (InterruptedException z){}
             }  
         }};
        gameThread.start();
   }
   
    @Override
   public void paintComponent (Graphics g)
    {
        int z =40;
        super.paintComponent(g);
        g.drawString("10", z-5, 100);
        g.drawString("9", z, 150);
        g.drawString("8", z, 200);
        g.drawString("7", z, 250);
        g.drawString("6", z, 300);
        g.drawString("5", z, 350);
        g.drawString("4", z, 400);
        g.drawString("3", z, 450);
        g.drawString("2", z, 500);
        g.drawString("1", z, 550);
        g.drawString("0", z, 600);
        g.drawLine(z+10, 90, z+10, 600); //vertical line
        g.drawLine(z+10, 600, 130, 600); //horizontal line 
        g.setColor(c);
        g.drawOval(x, y, 25, 26);
        g.fillOval(x+1, y+1, 23, 23);   
        JButton btnBack = new JButton("Back");
        //  btn1.setBounds(450,550,90,30);
          btnBack.setBounds(450, 600, 90, 30);
          add(btnBack);
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                  
                     setVisible(false);
                } catch (IOException ex) {
                    
                }
            }
       });
    
    
    }   
}
