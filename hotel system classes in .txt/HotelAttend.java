/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;


import hotelsystem.newpackage.Contact_Hotel_Attend;
import hotelsystem.newpackage1.Choose_User;
import java.awt.FlowLayout;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

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
 * @author pc
 */
public class HotelAttend  extends JFrame {
    final JTextField textId = new JTextField();
        final JTextField textName= new JTextField();
         final JTextField textSearch = new JTextField();
            
        final JComboBox Combo2 = new JComboBox(new String []{"select","Attend","Not_Attend"});
           final JComboBox Combo = new JComboBox(new String []{"select","Male","Female"});
           final JComboBox Combo1 = new JComboBox(new String []{"select","IT","Resiptionist","Driver","House_Keeping","Security","cheif","Suppliers"});
   
    
  ArrayList <Contact_Hotel_Attend> Contact_Hotel_Attend = new ArrayList<>();
        Contact_Hotel_Attend CH=new Contact_Hotel_Attend(); 
        
        
    public HotelAttend() throws Exceptions {
    final JFrame frame = new JFrame("HotelAttend");
        final JTable table = new JTable(); 
        
        
          try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\mca-22-00043-g005.png"));
         frame.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
       
          frame.setSize(900,600);
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","Name ","Attendece","Geneder ","Depertement"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
           JLabel LabelId = new JLabel("Enter id : ");
           JLabel LabelName = new JLabel("Enter your name : ");
          
           JLabel LabelAtt = new JLabel("Choose the Attendece ");
           JLabel LabelGender = new JLabel("Choose Geneder: ");
           JLabel LabeltextSearch = new JLabel("id search: ");
           JLabel LabelDep = new JLabel("Choose Depertement: ");
          
          
         
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelName.setBounds(5, 250, 100, 25);
        LabelAtt.setBounds(5, 280, 200, 25);
        LabelGender.setBounds(5, 310, 200, 25);
        LabelDep.setBounds(5, 340, 200, 25);
        LabeltextSearch.setBounds(5, 400, 200, 25);
      
        
       
       
        
        // create JButtons
       JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnSearch = new JButton("Search");
         JButton btnSave = new JButton("Save");
      
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
        
       
        textId.setBounds(200, 220, 100, 25);
        textName.setBounds(200, 250, 100, 25);
        Combo2.setBounds(200, 280, 100, 25);
        Combo.setBounds(200, 310, 100, 25);
         Combo1.setBounds(200, 340, 100, 25);
          textSearch.setBounds(200, 400, 100, 25);
        
        
        
        btnAdd.setBounds(400, 220, 100, 25);
        btnUpdate.setBounds(400, 265, 100, 25);
        btnDelete.setBounds(400, 310, 100, 25);
       
        btnSearch.setBounds(400, 400, 100, 25);
        btnSave.setBounds(600, 400, 100, 25);
        btnBack.setBounds(600, 455, 100, 25);
        btnExit.setBounds(600, 500, 100, 25);

          
          JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textId);
        frame.add(textName);
        
       frame.add(textSearch);
       // frame.add(textNOOFFloor);
        frame.add(Combo2);
        frame.add(Combo);
        frame.add(Combo1);
       
    
//            JLabel LabelId = new JLabel("Enter id : ");
//           JLabel LabelName = new JLabel("Enter your name : ");
//          
//           JLabel LabelAtt = new JLabel("Choose the Attendece ");
//           JLabel LabelGender = new JLabel("Choose Geneder: ");
//           JLabel LabeltextSearch = new JLabel("id search: ");
//           JLabel LabelDep = new JLabel("Choose Depertement: ");
        frame.add(LabelId);
        frame.add(LabelName);
        frame.add(LabelAtt);
        frame.add(LabelGender);
        frame.add(LabelDep);
      frame.add(LabeltextSearch);
    
       
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        
        frame.add(btnSave);
        frame.add(btnSearch);
       
         frame.add(btnBack);
        frame.add(btnExit);
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
                    for(int i=0 ; i<table.getRowCount();i++)
                    {
                        Object idnum = table.getValueAt(i, 0);
                        if(id.equals(idnum)){found = true;}
                    }
                    
                    if(found==true)
                    {
                        found = false;
                        JOptionPane.showMessageDialog(null,"FOUND"+" "+id,"ID searching",JOptionPane.INFORMATION_MESSAGE);
                        //table.rowAtPoint(null)
                    }
                    else {JOptionPane.showMessageDialog(null,"NOT FOUND"+" "+id,"ID searching",JOptionPane.INFORMATION_MESSAGE);} 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Search Error","error",JOptionPane.ERROR_MESSAGE);}
                
            }
        });
        
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               Object id = textId.getText();
                Object fname = textName.getText();
               Object f = Combo.getSelectedItem();
              Object c= Combo1.getSelectedItem();
               Object p= Combo2.getSelectedItem();
              
                Object n = "";
                if( !id.equals(n) && !fname.equals(n) )
                {
                    row[0] = textId.getText();
                    row[1] = textName.getText();
                  row[2] = Combo.getSelectedItem();
                    row[3] = Combo1.getSelectedItem();
                 
                     row[4] = Combo2.getSelectedItem();
                  
                 
                

                    // add row to the model
                    model.addRow(row);
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
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                  JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            textId.setText(model.getValueAt(i, 0).toString());
            textName.setText(model.getValueAt(i, 1).toString());
            
        }
        });
         
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(textName.getText(), i, 1);
                 
                  
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
       
                  

 textId.addActionListener(new SaveId());
textName.addActionListener(new Savefn());
 Combo.addActionListener(new SaveI());
Combo1.addActionListener(new Savef());
 Combo2.addActionListener(new Saved());


btnSave.addActionListener(new Save());

      }   
           private class Savef implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CH.Combo1=(String) Combo1.getSelectedItem();
        
	}
}
           private class SaveI implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CH.Combo=(String) Combo.getSelectedItem();
        
	}
}
           private class Saved implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CH.Combo2=(String) Combo2.getSelectedItem();
        
	}
}
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CH.id=textId.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CH.Name=textName.getText();
        
	}
	}
         
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_Hotel_Attend.add(CH);
                bin = new ObjectOutputStream(new FileOutputStream("Hotel_Attend.txt"));
                bin.writeObject(Contact_Hotel_Attend.add(CH));
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

    
   

      
      
      
      
      
      
      
      
      

          
   
  
  
    
