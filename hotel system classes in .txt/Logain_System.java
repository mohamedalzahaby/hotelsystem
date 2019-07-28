/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import hotelsystem.newpackage1.Choose;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Logain_System extends JFrame  {
     final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
         JButton btnlogin = new JButton("login");
         JButton btnReset = new JButton("Reset");
           final JFrame frame = new JFrame("Logain_System");
  public Logain_System() throws Exceptions  {
         
       try{
           
        BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Log.jpg"));
        
        frame.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
       
        
        frame.setSize(400,270);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        // create a table model and set a Column Identifiers to this model 
        
         JLabel LabelId = new JLabel("Enter passward : ");
         JLabel LabelFname = new JLabel("Enter  Name: "); 
         
          LabelId.setBounds(5, 10, 100, 25);
        LabelFname.setBounds(5, 50, 100, 25);
     
        JButton btnExit = new JButton("Exit");
        textId.setBounds(150, 10, 100, 25);
        textFname.setBounds(150, 50, 100, 25);
         btnlogin.setBounds(80, 90, 100, 25);
         btnReset.setBounds(190, 90, 100, 25);
         
       
     
        btnExit.setBounds(5, 190, 100, 25);
     
        
        frame.setLayout(null);
       

      
        
        // add JTextFields to the jframe
        frame.add(textId);
        frame.add(textFname);
         frame.add(LabelId);
        frame.add(LabelFname);
         frame.add(btnlogin);
           frame.add(btnReset);
      
        frame.add(btnExit);
     
       ButtonHandler handler = new ButtonHandler();	//creation of a new Object
		btnlogin.addActionListener(handler);	   // Attach/register handler to myFirstButton
		
		
	
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
        btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textId.setText(" ");
                textFname.setText(" ");
                
            }
        });
  }
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent e) {
                    Object id = textId.getText();
                Object fname = textFname.getText();
                 Object n = "";
                 if( !id.equals(n) && !fname.equals(n) )
                {
                    if(textId.getText().equalsIgnoreCase("123")&& textFname.getText().equals("Hotel") ){
			if (e.getSource() == btnlogin) {
                            
             

                            try {
                                Choose secondform = new Choose();
                                secondform.setVisible(true);
                                dispose();
                                frame.setVisible(false);
                            } catch (IOException ex) {
                               
                            }
                         
			}
                     }
                    else{
                         JOptionPane.showMessageDialog(null,"please enter the correct name and passward","error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                  else{
                    JOptionPane.showMessageDialog(null,"please enter the name and passward","error",JOptionPane.ERROR_MESSAGE);
                }
        
  }
        }
}