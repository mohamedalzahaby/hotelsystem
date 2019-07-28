/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;

public class menuFrame implements Serializable{
    
    JPanel p = new JPanel();
    ArrayList<Object> SaveList = new ArrayList<>();
    //___________________________________________________________________________

          public menuFrame() throws Exceptions {
        final JFrame frame = new JFrame("menu list");
        final JTable table = new JTable(); 
        
        
           try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25394305_2254564838103376_649846072_n.jpg"));
        
        frame.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
  
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","food item","number ordered","cost"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
         table.setModel(model);
         JLabel LabelId = new JLabel("Enter id : ");
         JLabel LabelBoardType = new JLabel("choose food item: ");
         JLabel LabelNumdays = new JLabel("number ordered: ");
         JLabel LabeltextSearch = new JLabel("id search: ");
         
         
        
         //create combo box
         final JComboBox CBoxFoodBoard = new JComboBox();
         CBoxFoodBoard.addItem("none");
         CBoxFoodBoard.addItem("Drinks");
         CBoxFoodBoard.addItem("Aspagati");
         CBoxFoodBoard.addItem("Chicken");
         CBoxFoodBoard.addItem("Meat");
         CBoxFoodBoard.setSelectedItem("none");
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelBoardType.setBounds(5, 250, 100, 25);
        LabelNumdays.setBounds(5, 310, 130, 25);
        LabeltextSearch.setBounds(5, 340, 100, 25);
        
        final JTextField textId = new JTextField();
        final JTextField textNumdays = new JTextField();
        final JTextField textSearch = new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
        JButton btnSave = new JButton("Save");     
        JButton btnSearch = new JButton("Search");     
        //JButton btnNext = new JButton("next");
        JButton btnBack = new JButton("back");
        
        
        textId.setBounds(150, 220, 100, 25);
        textNumdays.setBounds(150, 310, 100, 25);
        textSearch.setBounds(150, 340, 100, 25);
        
        CBoxFoodBoard.setBounds(150, 250, 100, 25);
        
        btnAdd   .setBounds (300, 220, 100, 25);
        btnUpdate.setBounds (300, 265, 100, 25);
        btnDelete.setBounds (300, 310, 100, 25);
        btnSearch.setBounds (300, 340, 100, 25);
        btnSave.  setBounds (600, 250, 150, 70);
       
        btnBack.  setBounds (650, 420, 100, 25);
          JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        //add JCombobox to the JFrame
        frame.add(CBoxFoodBoard);
        // add JTextFields to the jframe
        frame.add(textId);
        frame.add(textNumdays);
        frame.add(textSearch);
        //addLabels
        frame.add(LabelId);
        frame.add(LabelBoardType);
        frame.add(LabelNumdays);
        frame.add(LabeltextSearch);
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnSave);
        frame.add(btnSearch);
     
        frame.add(btnBack);
        
        
        
        
        
        
        
        
        
        // create an array of objects to set the row data
        final Object[] row = new Object[4];
        
        // button add row
        btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            { 
                Object id = textId.getText();
                Object daysnumber = textNumdays.getText();
                Object n = "";
                if( !id.equals(n) && !daysnumber.equals(n) )
                {
                    MenuList f = new MenuList();
                    
                    row[0] = textId.getText();
                    row[1] = CBoxFoodBoard.getSelectedItem();
                    row[2] = textNumdays.getText();
                    f.setCost((String) row[1], daysnumber);
                    double x =  f.getCost();
                    row[3] =(Object) x;
                    
                    // add row to the model
                    model.addRow(row); 
                }
                else {JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);}
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textId.setText(model.getValueAt(i, 0).toString());
                CBoxFoodBoard.setSelectedItem(model.getValueAt(i, 1).toString());
                //setText(model.getValueAt(i, 1).toString());
                textNumdays.setText(model.getValueAt(i, 2).toString());
        }
        });
        
        
        
        
        
        
        
        
        
        
        //update
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(CBoxFoodBoard.getSelectedItem(), i, 1);
                   model.setValueAt(textNumdays.getText() , i, 2);
                   //model.setValueAt(textAge.getText(), i, 3);
                   for(int j = 0 ; j<table.getColumnCount()  ; j++)
                       {
                           Object Cellvalue = model.getValueAt(i, j);
                           Object n ="";
                           if(Cellvalue.equals(n) )
                           {
                               JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);
                           }
                       }
                   
                }
                else{
                     JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        // button remove row
        btnDelete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);}
            }
        });
        
        
        
        
        
        
        
        
        
        
        //search for an ID
        btnSearch.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
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
                else{JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);}
                
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        //enter only numbers
        textNumdays.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char ch = e.getKeyChar();
                if(Character.isLetter(ch))
                {
                    textNumdays.setText("");
                    JOptionPane.showMessageDialog(null,"Error: please enter only numbers","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        //button back
        //JButton btnBack = new JButton("back");
        //btnBack.  setBounds (650, 420, 100, 25);
        //frame.add(btnBack);
        btnBack.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    try {
                        FoodBoardsFrame secondform = new FoodBoardsFrame();
                        //dispose();
                        frame.setVisible(false);
                    } catch (Exceptions ex) {
                        
                    }
                }
            });
        
        
        
        
        
        
        
        
        
        
        
        
        //button next
        //JButton btnNext = new JButton("next");
        //btnNext.  setBounds (760, 420, 100, 25);
        //frame.add(btnNext);
//        btnNext.addActionListener(new ActionListener()
//            {
//                @Override
//                public void actionPerformed(ActionEvent e) 
//                {
//                    GymFrame secondform = new GymFrame();
//                    //dispose();
//                    frame.setVisible(false);
//                }
//            });
//        
        
        
        
        
        
        
        
        
        
        
        // (SAVE) get selected row data From table to ArrayList (SAVE)
        btnSave.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(table.getRowCount() > 0 ) 
                {
                    
                    for(int i=0 ; i<table.getRowCount() ; i++ )
                    {   
                        String a = "" ;
                        for(int j = 0 ; j< table.getColumnCount() ; j++ )
                        {
                            String b = model.getValueAt(i, j).toString()+ " " ;
                            a+=b;
                        }
                        SaveList.add(i, a);
                    }
                    
                }
                else{ JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE); }
                for(int i=0 ; i<table.getRowCount() ; i++ )
                {  
                    System.out.println(SaveList.get(i));
                }
                try 
                {
                    ObjectOutputStream bin = new ObjectOutputStream( new FileOutputStream( "menuFrameBinFile.bin" ) );
                    bin.writeObject(SaveList);
                    bin.close();
                } 
                catch (FileNotFoundException ex) {Logger.getLogger(SafariFrame.class.getName()).log(Level.SEVERE, null, ex);} 
                catch (IOException ex) {Logger.getLogger(SafariFrame.class.getName()).log(Level.SEVERE, null, ex);}
            }
        });
        
        frame.setSize(900,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
          
  
   
    
}
