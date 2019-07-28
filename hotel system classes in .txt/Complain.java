/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import hotelsystem.newpackage.Contact_Add;

import hotelsystem.newpackage1.Services;
import java.awt.FlowLayout;
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
import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class Complain  extends JFrame {
     JCheckBox Vistor;
    JCheckBox Staff;
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
 ArrayList <Contact_Add> Contact_Add = new ArrayList<>();
        Contact_Add CA=new Contact_Add();
        
        
        
    public Complain() throws Exceptions {
    final JFrame frame = new JFrame("Complain");
    
     try{
           
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\images (1).png"));
         
        frame.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
      
        t1= new JTextField(15);
        b= new JButton("Ok");
       
        
        r1= new JRadioButton("Male");
        r2=  new JRadioButton("Famle");
        l = new JLabel("Greeting");
          JLabel jb=new JLabel("please enter the complain");
        ButtonGroup bg = new ButtonGroup();
         JButton btnSave = new JButton("Save");
         JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
      Vistor= new JCheckBox("Vistor");
      Staff=new JCheckBox("Staff");
        btnSave.setBounds(600, 370, 100, 25);
       bg.add(r1);
      bg.add(r2);
      add(jb);
      add(t1);
      add(r1);
      add(r2);
      add(Vistor);
      add(Staff);
      add(b);
      add(l);
       add(btnSave);
      add(btnBack);
     add(btnExit);



    b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
              String name = t1.getText();
              if(r1.isSelected()){
                  name="Mr"+name;
              }
              else
              {
                  name="Ms  "+name;
            }
              if(Vistor.isSelected()){
          name=name+"Vistor";
      }
      if(Staff.isSelected()){
          name=name+"Staff";
      }
              l.setText(name);
            }
        
    }     
    );
   
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Services secondform = new Services();
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
  
   setLayout(new FlowLayout());
  
   setVisible(true);
   setSize(450,280);
Vistor.addActionListener(new SaveId());
Staff.addActionListener(new Savefn());
t1.addActionListener(new Saveln());

r1.addActionListener(new Savel());
r2.addActionListener(new Saveag());
btnSave.addActionListener(new Save());

      }   
      private class Savel implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CA.r1=r1.getText();
        
	}
}
      private class Saveag implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CA.r2=r2.getText();
        
	}
}
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CA.Vistor=Vistor.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CA.Staff=Staff.getText();
        
	}
	}
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CA.t1=t1.getText();
        
	}
	}
          
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_Add.add(CA);
                bin = new ObjectOutputStream(new FileOutputStream("Complain.txt"));
                bin.writeObject(Contact_Add.add(CA));
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
