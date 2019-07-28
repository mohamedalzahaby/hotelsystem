/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import hotelsystem.newpackage.Contact_of_Staff;
import hotelsystem.newpackage1.Choose_User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Staff extends JFrame
{
      final JTextField textId = new JTextField();
         final JTextField textFname = new JTextField();
         final JTextField textLname = new JTextField();
         final JTextField textAge = new JTextField();
          final JTextField textSearch = new JTextField();
      ArrayList <Contact_of_Staff> Contact_of_Staff = new ArrayList<>();
        Contact_of_Staff pp=new Contact_of_Staff();  
    public Staff() throws Exceptions
    {
           
       
        
       final JFrame frameG = new JFrame("Staff");
      
       
       
        try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\url1.jpg"));
         frameG.setContentPane(new ImagePanel(myImage));
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
        
         frameG.setSize(900,700);
      
        frameG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameG.setVisible(true);
    final JTable tableG = new JTable();
     
    // create a table model and set a Column Identifiers to this model
    Object [] columnsG = {"ID ","First Name" , "Last Name" , "Age" , "Type" };
    final DefaultTableModel modelG = new DefaultTableModel();
    modelG.setColumnIdentifiers(columnsG);
    
    
    // set the model to the table
        tableG.setModel(modelG);
        
        
        //create JLabel
         JLabel LabelId = new JLabel("Enter id : ");
         JLabel LabelFname = new JLabel("Enter First Name: ");
         JLabel LabelLname = new JLabel("Enter Last Name: ");
         JLabel LabeltextAge = new JLabel("Enter Age: ");
         JLabel labelGender = new JLabel("Type: ");
          JLabel LabeltextSearch = new JLabel("id search: ");
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelFname.setBounds(5, 250, 100, 25);
        LabelLname.setBounds(5, 280, 100, 25);
        LabeltextAge.setBounds(5, 320, 100, 25);
        labelGender.setBounds(5, 450, 100, 25);
        LabeltextSearch.setBounds(5, 355, 100, 25);
        
       //create JTextField
       
        
         
         
        textId.setBounds(150, 220, 100, 25);
        textFname.setBounds(150, 250, 100, 25);
        textLname.setBounds(150, 280, 100, 25);
        textAge.setBounds(150, 320, 100, 25);
        textSearch.setBounds(150, 355, 100, 25);
        
        //create  JRadioButton
         final JRadioButton IT = new JRadioButton("It");
         final JRadioButton Security = new JRadioButton("Security");
         final JRadioButton Resptionist = new JRadioButton("Resptionist");
         final JRadioButton Manager = new JRadioButton("Manager");
         final JRadioButton Suppliers = new JRadioButton("Suppliers");
         final JRadioButton Cheif = new JRadioButton("Cheif");
         final JRadioButton Driver = new JRadioButton("Driver");
         final JRadioButton Hause_Kepping = new JRadioButton("Hause_Kepping");
         
         
         IT.setBounds(80, 400, 100, 25);
         Security.setBounds(80, 420, 100, 25);
          Resptionist.setBounds(80, 440, 100, 25);
         Manager.setBounds(80, 500, 460, 25);
          Suppliers.setBounds(80, 480, 100, 25);
         Cheif.setBounds(80, 500, 500, 25);
          Driver.setBounds(80, 520, 100, 25);
         Hause_Kepping.setBounds(80, 540, 100, 25);
         
         
        //create ButtonGroup
         final ButtonGroup GenderGroup = new ButtonGroup();
         GenderGroup.add(IT);
          GenderGroup.add(Security);
         GenderGroup.add(Resptionist);
         GenderGroup.add(Manager);
         GenderGroup.add(Suppliers);
         GenderGroup.add(Cheif);
         GenderGroup.add(Driver);
         GenderGroup.add(Hause_Kepping);
        
         
        //create JCheckBok
//        JCheckBox chkAdult = new JCheckBox("Adult");
//        JCheckBox chkchild = new JCheckBox("Child");
//        
//        chkAdult.setBounds(700, 440, 100, 25);
//        chkchild.setBounds(700, 400, 200, 60);
        
         
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update"); 
        JButton btnSave = new JButton("Save"); 
        JButton btnSearch = new JButton("Search");
     
        
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
        
        btnAdd.setBounds(300, 220, 100, 25);
        btnUpdate.setBounds(300, 265, 100, 25);
        btnDelete.setBounds(300, 310, 100, 25);
        // btnSave.setBounds(300, 355, 100, 25);
          btnSearch.setBounds(300, 355, 100, 25);
        btnSave.setBounds(600, 370, 100, 25);
        btnBack.setBounds(600, 400, 100, 25);
        btnExit.setBounds(600, 430, 100, 25);
        // create JScrollPane
        JScrollPane pane = new JScrollPane(tableG);
        pane.setBounds(0, 0, 880, 200);
        
        frameG.setLayout(null);
        
        frameG.add(pane);
        
        // add JTextFields to the jframe
        frameG.add(textId);
        frameG.add(textFname);
        frameG.add(textLname);
        frameG.add(textAge);
         frameG.add(textSearch);
        
        
        //add JLabal to the jframe
        frameG.add(LabelId);
        frameG.add(LabelFname);
        frameG.add(LabelLname);
        frameG.add(LabeltextAge);
        frameG.add(labelGender);
       frameG.add(LabeltextSearch);
        
        //add JRadioButton to the jframe

        frameG.add(IT);
        frameG.add(Security);
        frameG.add(Resptionist);
        frameG.add(Manager);
        frameG.add(Suppliers);
        frameG.add(Cheif);
         frameG.add(Driver);
        frameG.add(Hause_Kepping);
        
        
        

        
        // add JButtons to the jframe
        frameG.add(btnAdd);
        frameG.add(btnDelete);
        frameG.add(btnUpdate);
         frameG.add(btnSearch);
        frameG.add(btnSave);
         frameG.add(btnBack);
        frameG.add(btnExit);
        
        // create an array of objects to set the row data
        final Object[] row = new Object[5];

        // button add row
        
      btnSearch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Object id = textSearch.getText();
                Object n = "";
                
                if( !id.equals(n))
                {
                    boolean found =false;
                    for(int i=0 ; i<tableG.getRowCount() ;i++)
                    {
                        Object idnum = tableG.getValueAt(i, 0);
                        if(id.equals(idnum)){found = true;}
                    }
                    
                    if(found==true)
                    {
                        found = false;
                        JOptionPane.showMessageDialog(null,"FOUND","ID searching",JOptionPane.INFORMATION_MESSAGE);
                        //table.rowAtPoint(null)
                    }
                    else {JOptionPane.showMessageDialog(null,"NOT FOUND","ID searching",JOptionPane.INFORMATION_MESSAGE);} 
                }
                else{JOptionPane.showMessageDialog(null,"Search Error","error",JOptionPane.ERROR_MESSAGE);}
                
            }
        });
        
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               Object id = textId.getText();
                Object fname = textFname.getText();
                Object lname = textLname.getText();
                Object age = textAge.getText();
                 Object it=  IT.getText();
                  Object Securit=  Security.getText();
                   Object Resptionis=  Resptionist.getText();
                    Object Manag=  Manager.getText();
                     Object Supplier=  Suppliers.getText();
                      Object Cheifs=  Cheif.getText();
                    Object Drivers=  Driver.getText();
                     Object Hause_Keppings=  Hause_Kepping.getText();
     
        
       
                Object n = "";
                if( !id.equals(n) && !age.equals(n) && !fname.equals(n) && !lname.equals(n))
                {
                    row[0] = textId.getText();
                    row[1] = textFname.getText();
                    row[2] = textLname.getText();
                    row[3] = textAge.getText();
                    row[4] = IT.getText();
                    row[4] = Security.getText();
                    row[4] = Resptionist.getText();
                    row[4] = Manager.getText();
                    row[4] = Suppliers.getText();
                    row[4] = Cheif.getText();
                    row[4] = Driver.getText();
                    row[4] = Hause_Kepping.getText();
                    
                

                    // add row to the model
                    modelG.addRow(row);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Add Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = tableG.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    modelG.removeRow(i);
                }
                else{
                  JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // get selected row data From table to textfields 
        tableG.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = tableG.getSelectedRow();
            
            textId.setText(modelG.getValueAt(i, 0).toString());
            textFname.setText(modelG.getValueAt(i, 1).toString());
            textLname.setText(modelG.getValueAt(i, 2).toString());
            textAge.setText(modelG.getValueAt(i, 3).toString());
        }
        });
         
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = tableG.getSelectedRow();
                
                if(i >= 0) 
                {
                   modelG.setValueAt(textId.getText(), i, 0);
                   modelG.setValueAt(textFname.getText(), i, 1);
                   modelG.setValueAt(textLname.getText(), i, 2);
                   modelG.setValueAt(textAge.getText(), i, 3);
                  
                }
               
                 else{
                   JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
     
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose_User secondform = new Choose_User();
                    secondform.setVisible(true);
                    dispose();
                    
                    frameG.setVisible(false);
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
 textId.addActionListener(new SaveId());
textFname.addActionListener(new Savefn());
textLname.addActionListener(new Saveln());
textAge.addActionListener(new Saveage());
btnSave.addActionListener(new Save());

      }   
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            pp.Id=textId.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            pp.First_Name=textFname.getText();
        
	}
	}
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            pp.Last_Name=textLname.getText();
        
	}
	}
          private class Saveage implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            pp.Age=textAge.getText();
        
	}
	}
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_of_Staff.add(pp);
                bin = new ObjectOutputStream(new FileOutputStream("Staff.txt"));
                bin.writeObject(Contact_of_Staff.add(pp));
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
