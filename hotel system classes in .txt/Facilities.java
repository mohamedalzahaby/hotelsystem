/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage1;

import hotelsystem.AddServTransportation;
import hotelsystem.Exceptions;
import hotelsystem.GymFrame;


import hotelsystem.SafariFrame;
import hotelsystem.SpaFrame;
import hotelsystem.newpackage1.Choose;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
public class Facilities extends JFrame {
     private JButton AddServTransportation = new JButton("AddServTransportation"); 
       private JButton Addition_Services_of_Hotel = new JButton("Addition_Services_of_Hotel"); 
    ; 
 JButton btnBack = new JButton("Back");
               JButton btnExit = new JButton("Exit");
           final JFrame frame = new JFrame("Facilities");
  public Facilities() throws IOException {
         
      
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Hotel.jpeg"));
        
       frame.setContentPane(new ImagePanel(myImage));
        
        frame.setSize(340,300);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        // create a table model and set a Column Identifiers to this model 
        
        
     
       
        AddServTransportation.setBounds(55, 10, 200, 25);
        Addition_Services_of_Hotel.setBounds(55, 50, 200, 25);
         
         btnBack.setBounds(200, 190, 100, 25);
       
         
       
     
        btnExit.setBounds(5, 190, 100, 25);
//      ImageIcon image = new ImageIcon("C:\\Users\\pc\\Desktop\\Hotel.jpeg");
//
//        JLabel imageLabel = new JLabel(image);
//       imageLabel.setBounds(5, 90, 100, 25);
        
        frame.setLayout(null);
       

      
        
        // add JTextFields to the jframe
        frame.add(AddServTransportation);
        frame.add(Addition_Services_of_Hotel);
        
         frame.add(btnBack);
       
      
        frame.add(btnExit);
     
      
	
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
  ButtonHandler handler = new ButtonHandler();	//creation of a new Object

                AddServTransportation.addActionListener(handler);
                Addition_Services_of_Hotel.addActionListener(handler);
               
               
               
                
              
               
		
	
        btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                    dispose();
                    
                    frame. setVisible(false);
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
        }
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent e) {
     
                       
                        if (e.getSource() == AddServTransportation) {
				  dispose();
                            try {
                                new AddServTransportation();
                            } catch (Exceptions ex) {
                               
                            }
			}
                         
                         
                            
                              
                           
                              
                            
                               if (e.getSource() == Addition_Services_of_Hotel) {
                                   dispose();
                                   new GymFrame();
			}
                                
                                  
		}
        }
        
        
        
	// end of inner class
        
    
} // end of outer class

