/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import hotelsystem.newpackage.Contact_Dep;

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
public class Departement extends JFrame {
      JFrame frameHK;
     
     ArrayList <Contact_Dep> Contact_Dep = new ArrayList<>();
        Contact_Dep uu=new Contact_Dep(); 
     JCheckBox Housekeeping_Department;
    JCheckBox Engineering_Department;
      JCheckBox Front_Office_Department;
    JCheckBox Accounting_Department;
   
    JCheckBox Security_department;
      JCheckBox Food_and_Beverage_Department;
  
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    String name;
    public Departement() throws Exceptions {
     frameHK = new JFrame("Departement");
     
   
  
      
        
        t1= new JTextField(15);
        b= new JButton("Ok");
        r1= new JRadioButton("Male");
        r2=  new JRadioButton("Famle");
        l = new JLabel("Greeting");
        ButtonGroup bg = new ButtonGroup();
       
         JButton btnSave = new JButton("Save");
      Housekeeping_Department= new JCheckBox("Housekeeping_Department");
      Engineering_Department=new JCheckBox("Engineering_Department");
      Front_Office_Department= new JCheckBox("Front_Office_Department");
      Accounting_Department=new JCheckBox("Accounting_Department");
      Security_department= new JCheckBox("Security_department");
      Food_and_Beverage_Department= new JCheckBox("Food_and_Beverage_Department");
       JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
        // btnSave.setBounds(600, 370, 100, 25);
//            btnBack.setBounds(600, 400, 100, 25);
//        btnExit.setBounds(600, 430, 100, 25);
      bg.add(r1);
      bg.add(r2);
      add(t1);
      add(r1);
      add(r2);
      add(Housekeeping_Department);
      add(Engineering_Department);
      add(Front_Office_Department);
      add(Accounting_Department);
      add(Security_department);
      add(Food_and_Beverage_Department);
      
    
      add(b);
      add(l);
      add(btnBack);
        add(btnSave);
      add(btnExit);
     
    b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String name = t1.getText();
              if(r1.isSelected()){
                  name="Mr "+name;
              }
              else
              {
                  name="Ms  "+name;
            }
              if(Housekeeping_Department.isSelected()){
          name=name+"  Housekeeping_Department";
      }
      if(Engineering_Department.isSelected()){
          name=name+"  Engineering_Department";
      }
      if(Front_Office_Department.isSelected()){
          name=name+"   Front_Office_Department";
      }
      if(Accounting_Department.isSelected()){
          name=name+"   Accounting_Department";
      }
      if(Security_department.isSelected()){
          name=name+" Security_department";
      }
       if(Food_and_Beverage_Department.isSelected()){
          name=name+"  Food_and_Beverage_Department";
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
                    
                   frameHK. setVisible(false);
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
   setSize(400,400);
Housekeeping_Department.addActionListener(new SaveId());
Engineering_Department.addActionListener(new Savefn());
Front_Office_Department.addActionListener(new Saveln());
Accounting_Department.addActionListener(new Saveage());
Security_department.addActionListener(new Savef());
Food_and_Beverage_Department.addActionListener(new Sav());

r1.addActionListener(new Savel());
r2.addActionListener(new Saveag());
btnSave.addActionListener(new Save());

      }   
    private class Savef implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Accounting_Department=Accounting_Department.getText();
        
	}
}
    private class Sav implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Housekeeping_Department=Housekeeping_Department.getText();
        
	}
}
      private class Savel implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Engineering_Department=Engineering_Department.getText();
        
	}
}
      private class Saveag implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Front_Office_Department=Front_Office_Department.getText();
        
	}
}
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Security_department=Security_department.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.Food_and_Beverage_Department=Food_and_Beverage_Department.getText();
        
	}
	}
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.r1=r1.getText();
        
	}
	}
          private class Saveage implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            uu.r2=r2.getText();
        
	}
        
	}
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_Dep.add(uu);
                bin = new ObjectOutputStream(new FileOutputStream("Departement.txt"));
                bin.writeObject(Contact_Dep.add(uu));
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
    

