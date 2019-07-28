/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import hotelsystem.newpackage.Contact_of_Stock;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Stock   extends JFrame {
   final JTextField textCode = new JTextField();
       
        JRadioButton Cribs_and_Crib_Accessories = new JRadioButton("Cribs_and_Crib_Accessories");
         JRadioButton Alarm_Clocks_Radios = new JRadioButton("Alarm_Clocks_Radios");
         JRadioButton Room_Coffee_Makers = new JRadioButton("Room_Coffee_Makers");
         JRadioButton Hair_Dryers = new JRadioButton("Hair_Dryers");
         JRadioButton Ironing_and_Laundry_Supplies = new JRadioButton("Ironing_and_Laundry_Supplies");
         JRadioButton Service_Trays = new JRadioButton("Service_Trays");
         JRadioButton Coffee_Condiment_Kits = new JRadioButton("Coffee_Condiment_Kits");
         JRadioButton Folding_Luggage_Racks_and_Hotel_Luggage_Racks = new JRadioButton("Folding_Luggage_Racks_and_Hotel_Luggage_Racks");
          JRadioButton Air_Purifiers = new JRadioButton("Air_Purifiers");
         JRadioButton Cookware_Sets = new JRadioButton("Cookware_Sets");
         JRadioButton Kitchen_Appliances = new JRadioButton("Kitchen_Appliances");
         JRadioButton Towel_Trays = new JRadioButton("Towel_Trays");
         JRadioButton Tables = new JRadioButton("Tables");
         JRadioButton Tissue_Box_Covers = new JRadioButton("Tissue_Box_Covers");
         JRadioButton Tumbler_Glasses = new JRadioButton("Tumbler_Glasses");
         JRadioButton Trash_Cans = new JRadioButton("Trash_Cans");
        final JComboBox Combo2 = new JComboBox(new String []{"Select","Papers","Air Conditional","Trays","Alarm_Clocks_Radios","Kitchen_Appliances","Towel","Tables","Tissue_Box"});
          final JTextField textSearch = new JTextField();
          ArrayList <Contact_of_Stock> Contact_of_Stock = new ArrayList<>();
        Contact_of_Stock oo=new Contact_of_Stock(); 
JPanel p = new JPanel();

    //___________________________________________________________________________
  
    
   

          public Stock() throws Exceptions {
        final JFrame frame = new JFrame("Stock");
        
        
         try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25394236_2254555931437600_490658123_n.jpg"));
        
        frame.setContentPane(new ImagePanel(myImage));
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
       
        final JTable table = new JTable(); 
         frame.setSize(900,700);
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Code","product Name","type"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
       
        
        // set the model to the table
        table.setModel(model);
         JLabel LabelCode = new JLabel("Enter code : ");
         JLabel Labelproduct_Name = new JLabel("Enter product Name: ");
         JLabel Labeltype = new JLabel("Enter type: ");
        JLabel LabeltextSearch = new JLabel("id search: ");
       
     LabelCode.setBounds(5, 220, 100, 25);
        Labelproduct_Name.setBounds(5, 250, 100, 25);
        Labeltype.setBounds(500, 280, 100, 25);
         LabeltextSearch.setBounds(5, 280, 100, 25);
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
       JButton btnSearch = new JButton("Search");
      JButton btnNext = new JButton("next");
        JButton btnSave = new JButton("Save");
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
   
        textCode.setBounds(150, 220, 100, 25);
        Combo2.setBounds(150, 250, 100, 25);
       // textType.setBounds(150, 280, 100, 25);
        //textPrice.setBounds(150, 280, 100, 25);
         textSearch.setBounds(150, 285, 100, 25);
         
         
         
         
         Cribs_and_Crib_Accessories.setBounds(650, 250, 200, 25);
         Alarm_Clocks_Radios.setBounds(650, 270, 200, 25);
          Room_Coffee_Makers.setBounds(650, 290, 200, 25);
         Hair_Dryers.setBounds(650, 310, 200, 25);
          Ironing_and_Laundry_Supplies.setBounds(650, 330, 200, 25);
         Service_Trays.setBounds(650, 350, 200, 25);
          Coffee_Condiment_Kits.setBounds(650, 370, 200, 25);
         Folding_Luggage_Racks_and_Hotel_Luggage_Racks.setBounds(650, 390, 200, 25);
         
          Air_Purifiers.setBounds(650, 410, 200, 25);
         Cookware_Sets.setBounds(650, 430, 200, 25);
          Kitchen_Appliances.setBounds(650, 450, 200, 25);
         Towel_Trays.setBounds(650, 470, 200, 25);
          Tables.setBounds(650, 490, 200, 25);
         Tissue_Box_Covers.setBounds(650, 510, 200, 25);
          Tumbler_Glasses.setBounds(650, 550, 200, 25);
         Trash_Cans.setBounds(650, 570, 200, 25);
         
         
        //create ButtonGroup
         final ButtonGroup GenderGroup = new ButtonGroup();
         GenderGroup.add(Cribs_and_Crib_Accessories);
          GenderGroup.add(Alarm_Clocks_Radios);
         GenderGroup.add(Room_Coffee_Makers);
         GenderGroup.add(Hair_Dryers);
         GenderGroup.add(Ironing_and_Laundry_Supplies);
         GenderGroup.add(Service_Trays);
         GenderGroup.add(Coffee_Condiment_Kits);
         GenderGroup.add(Folding_Luggage_Racks_and_Hotel_Luggage_Racks);
         
         GenderGroup.add(Air_Purifiers);
          GenderGroup.add(Cookware_Sets);
         GenderGroup.add(Kitchen_Appliances);
         GenderGroup.add(Towel_Trays);
         GenderGroup.add(Tables);
         GenderGroup.add(Tissue_Box_Covers);
         GenderGroup.add(Tumbler_Glasses);
         GenderGroup.add(Trash_Cans);
        
         
         
       btnAdd.setBounds(300, 220, 100, 25);
        btnUpdate.setBounds(300, 265, 100, 25);
        btnDelete.setBounds(300, 310, 100, 25);
        btnSearch.setBounds(300, 355, 100, 25);
        btnSave.setBounds(80, 400, 100, 25);
         btnNext.  setBounds (80, 430, 100, 25);
        btnBack.setBounds(80, 460, 100, 25);
        btnExit.setBounds(80, 490, 100, 25);
        
          JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textCode);
        frame.add(Combo2);
       // frame.add(textType);
      
         frame.add(textSearch);
         
         
         frame.add(LabelCode);
        frame.add(Labelproduct_Name);
        frame.add(Labeltype);
        
        frame.add(LabeltextSearch);
        
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnSearch);
        frame.add(btnSave);
         frame.add(btnBack);
        frame.add(btnExit);
        frame.add(btnNext);
                


        frame.add(Cribs_and_Crib_Accessories);
        frame.add(Tables);
        frame.add(Tissue_Box_Covers);
        frame.add(Tumbler_Glasses);
        frame.add(Trash_Cans);
        frame.add(Towel_Trays);
        frame.add(Kitchen_Appliances);
        frame.add(Cookware_Sets);
        frame.add(Air_Purifiers);
        frame.add(Folding_Luggage_Racks_and_Hotel_Luggage_Racks);
        frame.add(Coffee_Condiment_Kits);
        frame.add(Service_Trays);
        frame.add(Ironing_and_Laundry_Supplies);
        frame.add(Hair_Dryers);
        frame.add(Room_Coffee_Makers);
        frame.add(Alarm_Clocks_Radios);
        // create an array of objects to set the row data
        final Object[] row = new Object[4];
        
        // button add row
        btnSearch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Object id = textSearch.getText();
                Object n = "";
                
                if( !id.equals(n))
                {
                    boolean found =false;
                    for(int i=0 ; i<table.getRowCount() ;i++)
                    {
                        Object idnum = table.getValueAt(i, 0);
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
               Object Code = textCode.getText();
               
                Object lname = Combo2.getSelectedItem();
               Object Cribs_and_Crib_Accessorie = Cribs_and_Crib_Accessories.getText();
               Object Alarm_Clocks_Radio = Alarm_Clocks_Radios.getText();
               Object Room_Coffee_Maker = Room_Coffee_Makers.getText();
               
               Object Hair_Dryer = Hair_Dryers.getText();
               Object Ironing_and_Laundry_Supplie = Ironing_and_Laundry_Supplies.getText();
               Object Service_Tray = Service_Trays.getText();
               
               Object Coffee_Condiment_Kit = Coffee_Condiment_Kits.getText();
               Object Folding_Luggage_Racks_and_Hotel_Luggage_Rack = Folding_Luggage_Racks_and_Hotel_Luggage_Racks.getText();
               Object Air_Purifier = Air_Purifiers.getText();
               
                Object Cookware_Set = Cookware_Sets.getText();
               Object Kitchen_Appliance = Kitchen_Appliances.getText();
               Object Towel_Tray = Towel_Trays.getText();
               
                Object Table = Tables.getText();
               Object Tissue_Box_Cover = Tissue_Box_Covers.getText();
               Object Tumbler_Glasse = Tumbler_Glasses.getText();
                Object Trash_Can = Trash_Cans.getText();
               
               
               
               
               
                Object n = "";
                
                if( !Code.equals(n)   && !lname.equals(n))
                {
                    row[0] = textCode.getText();
                  
                    row[1] = Combo2.getSelectedItem();
                   
               if (Trash_Cans.isSelected())
                {
                      row[2] = Trash_Cans.getText();
                }
              else if (Tumbler_Glasses.isSelected())
                {
                      row[2] = Tumbler_Glasses.getText();
                }
              else if (Tissue_Box_Covers.isSelected())
                {
                      row[2] = Tissue_Box_Covers.getText();
                }
              
              
              
              
              
               if (Tables.isSelected())
                {
                       row[2] = Tables.getText();
                }
              else if (Kitchen_Appliances.isSelected())
                {
                     row[2] = Kitchen_Appliances.getText();
                }
              else if (Cookware_Sets.isSelected())
                {
                     row[2] = Cookware_Sets.getText();
                }
              else if (Air_Purifiers.isSelected())
                {
                       row[2] = Air_Purifiers.getText();
                }
                

                    
               
            
              
            else  if (Folding_Luggage_Racks_and_Hotel_Luggage_Racks.isSelected())
                {
                    row[2] = Folding_Luggage_Racks_and_Hotel_Luggage_Racks.getText();
                }
              else if (Coffee_Condiment_Kits.isSelected())
                {
                         row[2] = Coffee_Condiment_Kits.getText();
                }
              else if (Service_Trays.isSelected())
                {
                      row[2] = Service_Trays.getText();
                }
              else if (Ironing_and_Laundry_Supplies.isSelected())
                {
                     row[2] = Ironing_and_Laundry_Supplies.getText();
                }
              
              
              
              
              
              else if (Hair_Dryers.isSelected())
                {
                        row[2] = Hair_Dryers.getText();
                }
              else if (Room_Coffee_Makers.isSelected())
                {
                     row[2] = Room_Coffee_Makers.getText();
                }
              else if (Alarm_Clocks_Radios.isSelected())
                {
                      row[2] = Alarm_Clocks_Radios.getText();
                }
              else if (Cribs_and_Crib_Accessories.isSelected())
                {
                      row[2] = Cribs_and_Crib_Accessories.getText();
                }
                 
                  
                   
                 
                      
                     
                      
                  
                    
                     
                     
                       
                       
                     
                     
                

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
            
            textCode.setText(model.getValueAt(i, 0).toString());
            //Combo2(model.getValueAt(i, 1).toString());
         ;
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
                   model.setValueAt(textCode.getText(), i, 0);
                 
                  model.setValueAt(Combo2.getSelectedItem(), i, 1);
                    
    
         
         if (Towel_Trays.isSelected())
                {
                     model.setValueAt(Towel_Trays.getText(), i, 2);
                }
              else if (Tables.isSelected())
                {
                    model.setValueAt(Tables.getText(), i, 2);
                }
              else if (Tissue_Box_Covers.isSelected())
                {
                     model.setValueAt(Tissue_Box_Covers.getText(), i, 2);
                }
              else if (Tumbler_Glasses.isSelected())
                {
                     model.setValueAt(Tumbler_Glasses.getText(), i, 2);
                }
                  
                }
               else if (Trash_Cans.isSelected())
                {
                     model.setValueAt(Trash_Cans.getText(), i, 2);
                }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
              if(Cribs_and_Crib_Accessories.isSelected())
                {
                     model.setValueAt(Cribs_and_Crib_Accessories.getText(), i, 2);
                }
              else if (Alarm_Clocks_Radios.isSelected())
                {
                    model.setValueAt(Alarm_Clocks_Radios.getText(), i, 2);
                }
              else if (Room_Coffee_Makers.isSelected())
                {
                     model.setValueAt(Room_Coffee_Makers.getText(), i, 2);
                }
              else if (Hair_Dryers.isSelected())
                {
                     model.setValueAt(Hair_Dryers.getText(), i, 2);
                }
                  
                
             else if (Ironing_and_Laundry_Supplies.isSelected())
                {
                     model.setValueAt(Ironing_and_Laundry_Supplies.getText(), i,2);
                }
              else if (Service_Trays.isSelected())
                {
                    model.setValueAt(Service_Trays.getText(), i, 2);
                }
              else if (Coffee_Condiment_Kits.isSelected())
                {
                     model.setValueAt(Coffee_Condiment_Kits.getText(), i, 2);
                }
              else if (Folding_Luggage_Racks_and_Hotel_Luggage_Racks.isSelected())
                {
                     model.setValueAt(Folding_Luggage_Racks_and_Hotel_Luggage_Racks.getText(), i, 2);
                }
              
              
               else if (Air_Purifiers.isSelected())
                {
                    model.setValueAt(Air_Purifiers.getText(), i, 2);
                }
              else if (Cookware_Sets.isSelected())
                {
                     model.setValueAt(Cookware_Sets.getText(), i, 2);
                }
              else if (Kitchen_Appliances.isSelected())
                {
                     model.setValueAt(Kitchen_Appliances.getText(), i, 2);
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
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                    dispose();
                    
                    frame. setVisible(false);
                } catch (IOException ex) {
                  
                }
            }
       });
    btnNext.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  
                    try {
                        ProductCost secondform = new ProductCost();
                        //dispose();
                        frame.setVisible(false);
                    } catch (Exceptions ex) {
                      
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
  
 textCode.addActionListener(new SaveId());

Combo2.addActionListener(new Saveln());

btnSave.addActionListener(new Save());

      }   
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            oo.Code=textCode.getText();
        
	}
}
       
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            oo.Combo2=Combo2.getSelectedIndex();
        
	}
	}
       
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_of_Stock.add(oo);
                bin = new ObjectOutputStream(new FileOutputStream("Contact_of_Stock.txt"));
                bin.writeObject(Contact_of_Stock.add(oo));
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
      