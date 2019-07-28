/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage1;

import hotelsystem.newpackage2.Rating_Hotel;
import hotelsystem.newpackage2.Rating_User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Choose_Rating {
  private JButton RatingHotel= new JButton("Rating_Hotel"); 
       private JButton RatingUser = new JButton("Rating_User"); 
    ; 
 JButton btnBack = new JButton("Back");
               JButton btnExit = new JButton("Exit");
           final JFrame frame = new JFrame("Rating");
  public Choose_Rating() throws IOException {
         
      
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Hotel.jpeg"));
        
       frame.setContentPane(new ImagePanel(myImage));
        
        frame.setSize(340,300);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        // create a table model and set a Column Identifiers to this model 
        
        
     
       
        RatingHotel.setBounds(55, 10, 200, 25);
        RatingUser.setBounds(55, 50, 200, 25);
         
         btnBack.setBounds(200, 190, 100, 25);
       
         
       
     
        btnExit.setBounds(5, 190, 100, 25);
//      ImageIcon image = new ImageIcon("C:\\Users\\pc\\Desktop\\Hotel.jpeg");
//
//        JLabel imageLabel = new JLabel(image);
//       imageLabel.setBounds(5, 90, 100, 25);
        
        frame.setLayout(null);
       

      
        
        // add JTextFields to the jframe
        frame.add(RatingHotel);
        frame.add(RatingUser);
        
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

                RatingUser.addActionListener(handler);
                RatingHotel.addActionListener(handler);
               
               
               
                
              
               
		
	
        btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                   
                    
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
     
                       
                        if (e.getSource() == RatingHotel) {
				
                            try {
                             JFrame frame = new JFrame ("Hotel Rating");
                                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                  frame.setContentPane(new Rating_Hotel());
                                  frame.pack();
//                 
                                  frame.setSize(600,700);
                  frame.setVisible(true);
                      
                            } catch (IOException ex) {
                               
                            }
			}
                         
                         
                            
                              
                           
                              
                            
                               if (e.getSource() == RatingUser) {
                                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                  frame.setContentPane( new Rating_User());
                                  frame.pack();
                                  frame.setSize(600,700);
                  frame.setVisible(true);
                      
                                  
			}
                                
                                  
		}
        }
        
        
        
	// end of inner class
        
    
} // end of outer class

