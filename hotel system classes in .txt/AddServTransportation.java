/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import hotelsystem.newpackage1.Facilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class AddServTransportation extends JFrame 
{
    private final int Drinks = 30;
    private final int Food=100;
    private final int Air_condeationer=30;
    private final int wifi=20;
    private final int PersonalTV =130;
    
    private final int fullboard =700;
    private final int halfboard =600;
    private final int NONboard =50;
   
    private int result;
    
    JFrame frameCN ;
   
    
    JLabel labview;
    //JLabel labtyperoom;
    JRadioButton Fullboard;
    JRadioButton Halfboard;
    JRadioButton nONboard;
   
    ButtonGroup View;
    JCheckBox Drink;
    JCheckBox Foods;
    JCheckBox Air_condeatione;
    JCheckBox Wifi;
    JCheckBox personalTV;
    JScrollPane pane;
    JButton  btnToCal;
    JButton ok;
    JTextField t;
     
    public AddServTransportation() throws Exceptions
    {
      
        frameCN = new JFrame("AddServTransportation");
        JTable tableCN = new JTable();
         labview = new JLabel("Choose what you need : ");
           try{
           
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\qadtssj8oowzlyln3rg14248396556aefcd9a926ojpg.jpeg"));
//        
            frameCN.setContentPane(new ImagePanel(myImage));
//        
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
       
       
       
        
       t=new JTextField(10);
  

   
       
        //create JRadioButton
       JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
         Fullboard = new JRadioButton("Fullboard");
         Halfboard = new JRadioButton("Halfboard");
         nONboard = new JRadioButton("nONboard ");
    
        
        
        
        View = new ButtonGroup();
        View.add(Fullboard);
        View.add(Halfboard);
        View.add(nONboard);
       
      
        //create JComboBox
         Drink = new JCheckBox("Drink");
         Foods = new JCheckBox("Foods");
         Air_condeatione = new JCheckBox("Air_condeatione");
         Wifi = new JCheckBox("Wifi");
         personalTV = new JCheckBox("personalTV");
        
        
        frameCN.setLayout(new FlowLayout());
        
         pane = new JScrollPane();
         pane.setBounds(0, 0, 880, 200);
           btnBack.setBounds(600, 400, 100, 25);
        btnExit.setBounds(600, 430, 100, 25);
         
         // create JButtons

          
         ok= new JButton("Calculate Price");
        
        
        frameCN.add(pane);
         
         //Add JLabel to the jframe
        frameCN.add(labview);
      
     
         //Add JRadioButton to the jframe
         frameCN.add(Fullboard);
         frameCN.add(Halfboard);
        frameCN.add(nONboard);
      
        //add JCheckBox to the jframe
        frameCN.add(Drink);
        frameCN.add(Foods);
        frameCN.add(Air_condeatione);
        frameCN.add(Wifi);
         frameCN.add(personalTV);
        
        //add JButtons to the jframe
  
//        frameCN.add(btnToCal);
        frameCN.add(t);
        frameCN.add(ok);
        frameCN.add(btnBack);
        frameCN.add(btnExit);

          ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = ok.getText();
                
                if (ae.getSource()==ok)
                {
                   if(Fullboard.isSelected() && Drink.isSelected() )
                   {    
                       
                           result =Drinks+fullboard;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
               
                   
                   if(Fullboard.isSelected() && Foods.isSelected() )
                   {
                       
                            result =Food+fullboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Fullboard.isSelected() && Air_condeatione.isSelected() )
                   {
                       
                            result =Air_condeationer+fullboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Fullboard.isSelected() && Wifi.isSelected() )
                   {
                       
                            result =wifi+fullboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Fullboard.isSelected() && personalTV.isSelected() )
                   {
                       
                            result =PersonalTV+fullboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
            
                   if(Halfboard.isSelected() && Drink.isSelected() )
                   {
                       
                            result =Drinks+halfboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Halfboard.isSelected() && Foods.isSelected() )
                   {
                       
                            result =Food+halfboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                   if(Halfboard.isSelected() && Air_condeatione.isSelected() )
                   {
                       
                            result =Air_condeationer+halfboard;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(Halfboard.isSelected() && Wifi.isSelected() )
                   {
                       
                            result =wifi+halfboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                  
                   if(Halfboard.isSelected() && personalTV.isSelected() )
                   {
                       
                            result =PersonalTV+halfboard;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(nONboard.isSelected() && Drink.isSelected() )
                   {
                       
                            result =Drinks+NONboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(nONboard.isSelected() && Foods.isSelected() )
                   {
                       
                            result =Food+NONboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                
                    if(nONboard.isSelected() && Air_condeatione.isSelected() )
                   {
                       
                            result =Air_condeationer+NONboard;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(nONboard.isSelected() && Wifi.isSelected() )
                   {
                       
                            result =wifi+NONboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(nONboard.isSelected() && personalTV.isSelected() )
                   {
                       
                            result =PersonalTV+NONboard;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                  
                        ok.setText(price);
                }        
                             
            }

            }

                 );
          
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Facilities secondform = new Facilities();
                    secondform.setVisible(true);
                    dispose();
                    
                    frameCN. setVisible(false);
                } catch (IOException ex) {
                   
                }
            }
       });
   
       btnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            int exit= JOptionPane.showConfirmDialog(null,"Do you want exit the Frame?", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
            }
            
       });

        frameCN.setSize(900, 400);
      frameCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCN.setVisible(true);
        
    }
}
