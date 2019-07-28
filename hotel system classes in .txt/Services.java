/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage1;


import hotelsystem.Complain;
import hotelsystem.Departement;
import hotelsystem.Exceptions;

import javax.swing.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Services extends JFrame 
   {   
    private JButton Complain = new JButton("Complain"); 

       private JButton Departement = new JButton("Departement"); 
      
     JButton btnBack = new JButton("Back");
               JButton btnExit = new JButton("Exit");
               
           final JFrame frame = new JFrame("Services");
  public Services() throws IOException {
         
      
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Hotel.jpeg"));
        
        frame.setContentPane(new ImagePanel(myImage));
        
        frame.setSize(340,300);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        // create a table model and set a Column Identifiers to this model 
        
       
        Complain.setBounds(100, 10, 100, 25);
        Departement.setBounds(50, 50, 200, 25);
         
         btnBack.setBounds(170, 230, 100, 25);
       
         
       
     
        btnExit.setBounds(30, 230, 100, 25);

       
       

        // add JTextFields to the jframe
        frame.add(Complain);
        frame.add(Departement);
        
         
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

                Departement.addActionListener(handler);
               
               
               
            
               
              
                Complain.addActionListener(handler);
		
	
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
                   
                          if (e.getSource() == Complain) {
                              try {
                                  dispose();
                                  new Complain();
                              } catch (Exceptions ex) {
                                  
                              }
			}
                          
                             if (e.getSource() == Departement) {
				  dispose();
                              try {
                                  new Departement();
                              }  catch (Exceptions ex) {
                                 
                              }
			}
                             
                              
                               
                           
                             
                                  
		}
        }
	// end of inner class
        
    
} // end of outer class
