/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage1;

import hotelsystem.Chief;
import hotelsystem.Driv_Info;
import hotelsystem.Exceptions;
import hotelsystem.HotelAttend;
import hotelsystem.HouseKeeping;
import hotelsystem.IT;
import hotelsystem.Manager;
import hotelsystem.Resptionist;
import hotelsystem.Security;
import hotelsystem.Staff;
import hotelsystem.Suppliers;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Choose_User extends JFrame {
     private JButton Manager = new JButton("Manager"); 
       private JButton Resp = new JButton("Resptionist"); 
        private JButton Driv_Info = new JButton("Driv_Info"); 
         private JButton HotelAttend = new JButton("HotelAttend"); 
        private JButton House_Keeping = new JButton("House_Keeping"); 
       private JButton IT = new JButton("IT"); 
        private JButton Security = new JButton("Security"); 
         private JButton Suppliers = new JButton("Suppliers"); 
          private JButton Staff = new JButton("Staff"); 
          private JButton cheif = new JButton("cheif"); 
            JButton btnBack = new JButton("Back");
               JButton btnExit = new JButton("Exit");
           final JFrame frame = new JFrame("Choose_User");
  public Choose_User() throws IOException {
         
      
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Hotel.jpeg"));
        
        frame.setContentPane(new ImagePanel(myImage));
        
        frame.setSize(340,300);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        // create a table model and set a Column Identifiers to this model 
        
       
        Manager.setBounds(5, 10, 100, 25);
        Resp.setBounds(5, 50, 100, 25);
         Driv_Info.setBounds(5, 90, 100, 25);
        HotelAttend.setBounds(5, 130, 100, 25);
         House_Keeping.setBounds(200, 10, 100, 25);
        IT.setBounds(200, 50, 100, 25);
         Security.setBounds(200, 90, 100, 25);
        Suppliers.setBounds(200, 130, 100, 25);
         Staff.setBounds(5, 170, 100, 25);
        cheif.setBounds(200, 170, 100, 25);
         btnBack.setBounds(170, 230, 100, 25);
       
         
       
     
        btnExit.setBounds(30, 230, 100, 25);

       
       

        // add JTextFields to the jframe
        frame.add(Manager);
        frame.add(Resp);
         frame.add(Driv_Info);
        frame.add(HotelAttend);
        
         frame.add(House_Keeping);
        frame.add(IT);
         frame.add(Security);
        frame.add(Suppliers);
        
         frame.add(Staff);
        frame.add(cheif);
         
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
		Manager.addActionListener(handler);	   // Attach/register handler to myFirstButton
		Resp.addActionListener(handler);	  //Attach/register handler to mySecondButton
                Suppliers.addActionListener(handler);
                Driv_Info.addActionListener(handler);
               
                HotelAttend.addActionListener(handler);
                House_Keeping.addActionListener(handler);	   // Attach/register handler to myFirstButton
		IT.addActionListener(handler);	  //Attach/register handler to mySecondButton
                
                Security.addActionListener(handler);
               
                Staff.addActionListener(handler);
             
                cheif.addActionListener(handler);
               
		
	
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
			if (e.getSource() == Manager) {
                              
                            try {
                                dispose();
                                
                                new Manager();
                            }  catch (Exceptions ex) {
                                
                            }
                            
                         
			}
			if (e.getSource() == Resp) {
                            try {
                                dispose();
                                new Resptionist();
                            } catch (Exceptions ex) {
                               
                            }
                           
                        }
                        
                              if (e.getSource() == Driv_Info) {
                            try {
                                dispose();
                                new Driv_Info();
                            }  catch (Exceptions ex) {
                               
                            }
                            
			}
                           
                               if (e.getSource() == HotelAttend) {
                           
                            try {
                                dispose();
                                
                                new HotelAttend();
                            } catch (Exceptions ex) {
                               
                            }
                           
                            
			}
//                
                                 if (e.getSource() == House_Keeping) {
                            try {
                                dispose();
                                
                                new HouseKeeping();
                            } catch (Exceptions ex) {
                                
                            }
                            
			}
                           if (e.getSource() == IT) {
                            try {
                                dispose();
                                
                                new IT();
                            }  catch (Exceptions ex) {
                                
                            }
                          
			}
                           
                               if (e.getSource() == Security) {
                            try {
                                dispose();
                                
                                new Security();
                            } catch (Exceptions ex) {
                              
                            }
                            
			}
                               
                               if (e.getSource() == Staff) {
                            try {
                                dispose();
                                
                                new Staff();
                            }  catch (Exceptions ex) {
                               
                            }
                           
			}
                              
                                if (e.getSource() == cheif) {
                            try {
                                dispose();
                                new Chief();
                            }  catch (Exceptions ex) {
                               
                            }
                            
			}
                              if (e.getSource() == Suppliers) {
                            try {
                              
                                dispose();
                                new Suppliers();
			
                            } catch (Exceptions ex) {
                               
                            }
                              }
                                  
		}
        }
	// end of inner class
        
    
} // end of outer class

