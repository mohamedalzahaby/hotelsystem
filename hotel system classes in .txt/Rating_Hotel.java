/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage2;


import hotelsystem.newpackage1.Choose;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
/**
 *
 * @author pc
 */
public class Rating_Hotel extends JPanel {
 
  
    public int x,y;
    public int neededx,neededy;
    Color c;
    String rate;
    ArrayList<String> arraysave = new ArrayList();
      
    public Rating_Hotel() throws IOException 
    {
//        frameCN = new JFrame("AddServTransportation");
    
                  
            
        rate ="0";
        c = Color.ORANGE;
        x=75;
        y=586;
        neededx=0;
        neededy=0;
        setSize(800,700);
  this.setLayout(null);
      
       // this.setVisible(true);
       final JTextField NameHotel = new JTextField();
         JLabel LabelName = new JLabel("Enter Hotel_Name : ");
          LabelName.setBounds(300, 60, 130, 30);
        NameHotel.setBounds(450,60,90,30);
        add(NameHotel);
        
        //Button save
        JButton save=new JButton("save");
        save.setBounds(450,25,90,30);
        add(save);
        add(LabelName);
        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!NameHotel.getText().equals("Hotel name"))
                {
                    if(rate.equals("0")){JOptionPane.showMessageDialog(null,"please choose your rate","error",JOptionPane.ERROR_MESSAGE);}
                    else
                    {
                        arraysave.add(NameHotel.getText());
                        arraysave.add(rate);
                        for(String f : arraysave){
                            JOptionPane.showMessageDialog(null,f,"error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                else{JOptionPane.showMessageDialog(null,"pleaseenter id number","error",JOptionPane.ERROR_MESSAGE);}
                
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
        //g.drawString("Hello", 100, 100);
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
        g.fillOval(x+1, y+1, 23, 23);
        g.drawOval(x, y, 25, 26);
         JButton btnBack = new JButton("Back");
          btnBack.setBounds(450, 580, 90, 30);
          add(btnBack);
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
               
                try {
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                    JFrame frame = new JFrame ("Hotel Rating");
                    
                    frame.setContentPane(new Rating_Hotel());
                    
                    frame. setVisible(false);
                } catch (IOException ex) {
                }
                 
            }
       });
    
         
    
    
}
}