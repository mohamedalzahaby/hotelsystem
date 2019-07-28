/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem.newpackage1;

import hotelsystem.Check_In_Out_Date;
import hotelsystem.Exceptions;


import hotelsystem.FoodBoardsFrame;
import hotelsystem.GuestInfo;


import hotelsystem.Room_Booking;
import hotelsystem.Stock;

import hotelsystem.Time_bill_of_Trip;
import javax.swing.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Choose extends JFrame 
   {   

      private JButton User = new JButton("Users"); 
//    
       private JButton Booking = new JButton("Booking");
        private JButton Date = new JButton("Date");
         
       private JButton Services = new JButton("Facilities"); 
     private JButton Food = new JButton("Food");
      private JButton Guest = new JButton("Guest");
       private JButton Cost = new JButton("Time.bill.Trip");
        private JButton ontherServices = new JButton("Services");
          private JButton Stock = new JButton("Stock");

               private JButton Rating = new JButton("Rating");

    
      
         JButton btnExit = new JButton("Exit");
           final JFrame frame = new JFrame("Choose_User");
  public Choose() throws IOException {
         
      
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Hotel.jpeg"));
        
        frame.setContentPane(new ImagePanel(myImage));
        
        frame.setSize(340,300);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
       
      
         JButton btnExit = new JButton("Exit");
        User.setBounds(5, 10, 100, 25);
        Guest.setBounds(5, 90, 100, 25);
        Booking.setBounds(5, 130, 100, 25);
         Date.setBounds(5, 170, 100, 25);
        Services.setBounds(200, 170, 100, 25);
         Food.setBounds(200, 10, 100, 25);
        Cost.setBounds(60, 50, 200, 25);
        ontherServices.setBounds(200, 90, 100, 25);
        Stock.setBounds(200, 130, 100, 25);
        Rating.setBounds(200, 200, 100, 25);
       
       
       
         
       
     
        btnExit.setBounds(30, 230, 100, 25);

       
       

        // add JTextFields to the jframe
        frame.add(Stock);
        frame.add(ontherServices);
         frame.add(Cost);
        frame.add(Food);
        
         frame.add(Services);
        frame.add(Date);
         frame.add(Booking);
        frame.add(User);
         frame.add(Guest);
          frame.add(Rating);
        
         
       
      
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

                User.addActionListener(handler);
               
                Booking.addActionListener(handler);
              Services.addActionListener(handler);
               Cost.addActionListener(handler);
               
                ontherServices.addActionListener(handler);
              
                
                Date.addActionListener(handler);
                   Food.addActionListener(handler);
               
                Stock.addActionListener(handler);
              Guest.addActionListener(handler);
               Rating.addActionListener(handler);
             
		
	
        
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
     

              if (e.getSource() == Food) {
                  
                  try {
                      dispose();
                      new FoodBoardsFrame();
                  } catch (Exceptions ex) {
                  }
                  
			}
                          if (e.getSource() == Date) {
                  try {
                      dispose();
                      new Check_In_Out_Date();
                  }  catch (Exceptions ex) {
                      
                  }
			}
                          
                             if (e.getSource() == Stock) {
                  try {
                      dispose();
                      new Stock();
                  } catch (Exceptions ex) {
                      
                  }
                  
			}
                              if (e.getSource() == Rating) {
                
                  try {
                      dispose();
                      new  Choose_Rating();
                  } catch (IOException ex) {
                     
                  }
                     
        

			}
                             
                              
                               
                           
                                if (e.getSource() == Guest) {
                  try {
                      dispose();
                      new GuestInfo();
                  } catch (Exceptions ex) {
                     
                  }
			}
                   
                          if (e.getSource() == User) {
                  try {
                      dispose();
                      
                    new Choose_User ();
                  } catch (IOException ex) {
                     
                  }
                  
      
			}
                          
                             if (e.getSource() == Booking) {
                  try {
                      dispose();
                      new Room_Booking("Booking");
                  } catch (Exceptions ex) {
                      
                  }
			}
                             
                              
                               
                           
                                if (e.getSource() == Services) {
                  try {
                      dispose();
                      new Facilities();
                  } catch (IOException ex) {
                     
                  }
			}
                                  if (e.getSource() == Cost) {
                  try {
                      dispose();
                      new Time_bill_of_Trip();
                  } catch (Exceptions ex) {
                     
                  }
			}
                                   if (e.getSource() == ontherServices) {
                  try {
                      dispose();
                      new Services();
                  } catch (IOException ex) {
                     
                  }
			}
                                  
		}
        }
	// end of inner class
        
    
} // end of outer class



       
//       private JButton User = new JButton("Users"); 
//    
//       private JButton Booking = new JButton("Booking");
//        private JButton Date = new JButton("Date");
//         
//       private JButton Services = new JButton("Services"); 
//     private JButton Food = new JButton("Food");
//      private JButton Guest = new JButton("Guest");
//       private JButton Cost = new JButton("Cost");
//        private JButton ontherServices = new JButton("ontherServices");
//          private JButton Stock = new JButton("Stock");
//
//    
//      
//         JButton btnExit = new JButton("Exit");
//       private JPanel PnlTwo = new JPanel(new FlowLayout()); 
//      private JPanel PnlFour = new JPanel(new GridLayout(2, 0)); 
//       
//    
//        public Choose() 
//           { 
//               super("Choose what you need");
//              setLayout(new BorderLayout()); 
//              add(PnlFour, BorderLayout.SOUTH);
//              add(PnlTwo, BorderLayout.CENTER); 
//    
//               PnlTwo.add(User);
//      PnlTwo.add(Food);
//              PnlTwo.add(Booking); 
// PnlTwo.add(Guest);
// PnlTwo.add(Stock);
//               PnlTwo.add(Services);
//                PnlTwo.add(Date);
//                 PnlTwo.add(Cost); 
//
//               PnlTwo.add(ontherServices);
//                 PnlFour.add(btnExit); 
//             
//                 // PnlThree.add(btnExit); 
//                  JFrame frame = new JFrame();  
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//
//        JPanel panel = (JPanel)frame.getContentPane();  
//    
//   
//                 //add(btnExit);
//		ButtonHandler handler = new ButtonHandler();	//creation of a new Object
//
//                User.addActionListener(handler);
//               
//                Booking.addActionListener(handler);
//              Services.addActionListener(handler);
//               Cost.addActionListener(handler);
//               
//                ontherServices.addActionListener(handler);
//              
//                
//                Date.addActionListener(handler);
//                   Food.addActionListener(handler);
//               
//                Stock.addActionListener(handler);
//              Guest.addActionListener(handler);
//             
//		setSize(400, 250);
//		show();
//	
//        
//       btnExit.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            int exit= JOptionPane.showConfirmDialog(null,"Do you want exit the Frame?", "Exit", JOptionPane.YES_NO_OPTION);
//             if (exit == JOptionPane.YES_OPTION)
//             {
//                 System.exit(0);
//             }
// 
//            }
//            
//       });
//        }
//	// inner class for button event handling
//	private class ButtonHandler implements ActionListener {
//                @Override
//		public void actionPerformed(ActionEvent e) {
//     
//
//              if (e.getSource() == Food) {
//                  try {
//                      dispose();
//                      new Food();
//                  } catch (IOException ex) {
//                      
//                  }
//			}
//                          if (e.getSource() == Date) {
//                  try {
//                      dispose();
//                      new Check_In_Out_Date();
//                  } catch (IOException ex) {
//                     
//                  }
//			}
//                          
//                             if (e.getSource() == Stock) {
//                  try {
//                      dispose();
//                      new Stock_serv();
//                  } catch (IOException ex) {
//                     
//                  }
//			}
//                             
//                              
//                               
//                           
//                                if (e.getSource() == Guest) {
//                  try {
//                      dispose();
//                      new GuestInfo();
//                  } catch (IOException ex) {
//                     
//                  }
//			}
//                   
//                          if (e.getSource() == User) {
//                  try {
//                      dispose();
//                      
//                    new Choose_User ();
//                  } catch (IOException ex) {
//                     
//                  }
//                  
//      
//			}
//                          
//                             if (e.getSource() == Booking) {
//                  try {
//                      dispose();
//                      new Room_Booking();
//                  } catch (IOException ex) {
//                      
//                  }
//			}
//                             
//                              
//                               
//                           
//                                if (e.getSource() == Services) {
//                  try {
//                      dispose();
//                      new Choose_Serv();
//                  } catch (IOException ex) {
//                     
//                  }
//			}
//                                  if (e.getSource() == Cost) {
//                  try {
//                      dispose();
//                      new Time_bill_of_Trip();
//                  } catch (IOException ex) {
//                      
//                  }
//			}
//                                   if (e.getSource() == ontherServices) {
//                  try {
//                      dispose();
//                      new Other_Services();
//                  } catch (IOException ex) {
//                     
//                  }
//			}
//                                  
//		}
//        }
//	// end of inner class
//        
//    
//} // end of outer class
//
