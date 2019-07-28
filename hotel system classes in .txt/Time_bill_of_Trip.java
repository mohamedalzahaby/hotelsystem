/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import hotelsystem.newpackage.Trip_Contact;
import hotelsystem.newpackage1.Choose;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
public class Time_bill_of_Trip extends JFrame 
{
      ArrayList <Trip_Contact> Trip_Contact = new ArrayList<>();
        Trip_Contact TC=new Trip_Contact(); 
    private final int price_One_Hour_From = 10;
    
    //private final int priceChild =30;
    
    private final int price_One_Hour_To =10;
    private final int price_Two_Hour_To =20;
    private final int price_Three_Hour_To =30;
    private final int price_Four_Hour_To = 40;
    private final int price_Five_Hour_To =50;
    private final int price_Six_Hour_To =60;
    private final int price_Seven_Hour_To =70;
    private final int price_Eight_Hour_To = 80;
    private final int price_Nine_Hour_To = 90;
    private final int price_Ten_Hour_To = 100;
    
    private int result;
    
    JFrame frameCN ;
   
    
    JLabel labfrom;
    JLabel labto;
    ButtonGroup From;
    JRadioButton One_Hour_From;
    
    ButtonGroup To;
    JRadioButton One_Hour_To;
    JRadioButton Two_Hour_To;
    JRadioButton Three_Hour_To;
    JRadioButton Four_Hour_To;
    JRadioButton Five_Hour_To;
    JRadioButton Six_Hour_To;
    JRadioButton Seven_Hour_To;
    JRadioButton Eight_Hour_To;
    JRadioButton Nine_Hour_To;
    JRadioButton Ten_Hour_To;
    
    JScrollPane pane;
    JButton  btnToCal;
    JButton ok;
    JTextField t;
     
    public Time_bill_of_Trip()throws Exceptions
    {
      
        frameCN = new JFrame("Time and Bill of Trip");
        
        
 try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\clock.jpg"));
        
        frameCN.setContentPane(new ImagePanel(myImage));
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
        
       
       //create JLabel
        labfrom = new JLabel("Time from trip: ");
        labto = new JLabel("Time To trip: ");
         JButton btnSave = new JButton("Save");
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
        labfrom.setBounds(5, 30, 100, 25);
        labto.setBounds(5, 100, 100, 25);
        
        t=new JTextField();
        t.setBounds(200, 200, 100, 25);
       
       
        //create JRadioButton
         One_Hour_From = new JRadioButton("From_1hr",true);
         
        One_Hour_From.setBounds(100, 30, 100, 25);
        From = new ButtonGroup();
        From.add(One_Hour_From);
        
        
        //create JCheckBox
         One_Hour_To = new JRadioButton("To_1hr");
         Two_Hour_To = new JRadioButton("To_2hrs");
         Three_Hour_To = new JRadioButton("To_3hrs");
         Four_Hour_To = new JRadioButton("To_4hrs");
         Five_Hour_To = new JRadioButton("To_5hrs");
         Six_Hour_To = new JRadioButton("To_6hrs");
         Seven_Hour_To = new JRadioButton("To_7hrs");
         Eight_Hour_To = new JRadioButton("To_8hrs");
         Nine_Hour_To = new JRadioButton("To_9hrs");
         Ten_Hour_To = new JRadioButton("To_10hrs");
         
         One_Hour_To.setBounds(100, 100, 100, 25);
        Two_Hour_To.setBounds(200, 100, 100, 25);
        Three_Hour_To.setBounds(300, 100, 100, 25);
       Four_Hour_To.setBounds(400, 100, 100, 25);
        Five_Hour_To.setBounds(500, 100, 100, 25);
        Six_Hour_To.setBounds(600, 100, 100, 25);
       Seven_Hour_To.setBounds(700, 100, 100, 25);
        Eight_Hour_To.setBounds(800, 100, 100, 25);
        Nine_Hour_To.setBounds(900, 100, 100, 25);
        Ten_Hour_To.setBounds(1000, 100, 100, 25);
        
         To = new ButtonGroup();
         To.add(One_Hour_To);
         To.add(Two_Hour_To);
         To.add(Three_Hour_To);
         To.add(Four_Hour_To);
         To.add(Five_Hour_To);
         To.add(Six_Hour_To);
         To.add(Seven_Hour_To);
         To.add(Eight_Hour_To);
         To.add(Nine_Hour_To);
         To.add(Ten_Hour_To);
        
        frameCN.setLayout(null);
        
        
         
         
         // create JButtons

          
         ok= new JButton("Calculate Price of Time and Trip");
        ok.setBounds(400, 200, 250, 25);
        
       
         
         //Add JLabel to the jframe
         frameCN.add(labfrom);
         frameCN.add(labto);
         
         //Add JRadioButton to the jframe
         frameCN.add(One_Hour_From);
         
        
        //add JRadioButton to the jframe
        frameCN.add(One_Hour_To);
        frameCN.add(Two_Hour_To);
        frameCN.add(Three_Hour_To);
        frameCN.add(Four_Hour_To);
        frameCN.add(Five_Hour_To);
        frameCN.add(Six_Hour_To);
        frameCN.add(Seven_Hour_To);
        frameCN.add(Eight_Hour_To);
        frameCN.add(Nine_Hour_To);
        frameCN.add(Ten_Hour_To);
        
        //add JButtons to the jframe
  
        //frameCN.add(btnToCal);
        frameCN.add(t);
        frameCN.add(ok);
          btnSave.setBounds(700, 220, 100, 25);
        btnBack.setBounds(700, 250, 100, 25);
        btnExit.setBounds(700, 280, 100, 25);
        frameCN.add(btnSave);
         frameCN.add(btnBack);
        frameCN.add(btnExit);
        //valueOf btrg3 al value hya eh bzabt
        //getsource bt3ml generate ll object ae elly hwa bta3 ActionEvent
        //btrg3 al object elly event 3mlo inizilate 
         // button add row
         
         
           
          ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = ok.getText();
             
                if (ae.getSource()==ok)
                {
                   if(One_Hour_From.isSelected() && One_Hour_To.isSelected() )
                   {    
                       
                           result =price_One_Hour_From+price_One_Hour_To;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                
                   
                   if(One_Hour_From.isSelected() && Two_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Two_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Three_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Three_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Four_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Four_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Five_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Five_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Six_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Six_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Seven_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Seven_Hour_To;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Eight_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Eight_Hour_To;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(One_Hour_From.isSelected() && Nine_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Nine_Hour_To ;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(One_Hour_From.isSelected() && Ten_Hour_To.isSelected() )
                   {
                       
                            result =price_One_Hour_From+price_Ten_Hour_To;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                        ok.setText(price);
                }        
                             
            }

            }

                 );

        
        frameCN.setSize(1100, 400);
      frameCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCN.setVisible(true);
              btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose secondform = new Choose();
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
  
 
     
  
 One_Hour_From.addActionListener(new SaveId());
One_Hour_To.addActionListener(new Savefn());
Two_Hour_To.addActionListener(new Saveln());
Three_Hour_To.addActionListener(new Savel());
Four_Hour_To.addActionListener(new Saveag());
Five_Hour_To.addActionListener(new Saveage());
Six_Hour_To.addActionListener(new SaveEmail());
Seven_Hour_To.addActionListener(new SavePhone());
Eight_Hour_To.addActionListener(new Savea());
Nine_Hour_To.addActionListener(new SaveEmai());
Ten_Hour_To.addActionListener(new SavePhon());


btnSave.addActionListener(new Save());

      }   
       private class SaveEmail implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Six_Hour_To=Six_Hour_To.getText();
        
	}
}
        private class Savea implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Eight_Hour_To=Eight_Hour_To.getText();
        
	}
}
         private class SaveEmai implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Nine_Hour_To=Nine_Hour_To.getText();
        
	}
}
          private class SavePhon implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Ten_Hour_To=Ten_Hour_To.getText();
        
	}
}
       private class Saveage implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Five_Hour_To= Five_Hour_To.getText();
        
	}
}
      private class SavePhone implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Seven_Hour_To=Seven_Hour_To.getText();
        
	}
}
      private class Savel implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Three_Hour_To= Three_Hour_To.getText();
        
	}
}
      private class Saveag implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Four_Hour_To= Four_Hour_To.getText();
        
	}
}
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.One_Hour_From=One_Hour_From.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.One_Hour_To=One_Hour_To.getText();
        
	}
	}
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            TC.Two_Hour_To=Two_Hour_To.getText();
        
	}
	}
          
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Trip_Contact.add(TC);
                bin = new ObjectOutputStream(new FileOutputStream("Time_bill_of_Trip.txt"));
                bin.writeObject(Trip_Contact.add(TC));
                bin.close();
                JOptionPane.showMessageDialog(null, " Saved");
            } catch (IOException ex) {
               
            } finally {
                try {
                    bin.close();
                } catch (IOException ex) {
                    
                }
            }
        
	}
}

      
}
    

