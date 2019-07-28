/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;


import hotelsystem.newpackage.Contact_of_Suppliers;
import hotelsystem.newpackage1.Choose_User;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextField;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Suppliers extends JFrame
{
     JFrame frameS;
     
     JTable tableS;
     
     JLabel LabelId ;
    JLabel LabelFname;
    JLabel LabeltextAge ;
    JLabel labGender;
    JLabel labSearch;
    
    
    JTextField textId;
    JTextField textName;
    JTextField textSearch;
    
    
    JRadioButton Female;
    JRadioButton Male;
    ButtonGroup GenderGroup;
    
      JComboBox Age;
      
    
      JButton btnAdd ;
      JButton btnDelete;
      JButton btnUpdate;  
      JButton btnSearch;
      JButton btnBack;
      JButton btnExit;
      JButton btnSave;
      
      
      ArrayList <Contact_of_Suppliers> Contact_of_Suppliers = new ArrayList<>();
        Contact_of_Suppliers CS=new Contact_of_Suppliers();
       
    public Suppliers() throws Exceptions
    {
   
        frameS = new JFrame("Suppliers");
        
        
         try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25394236_2254555931437600_490658123_n.jpg"));
        
        frameS.setContentPane(new ImagePanel(myImage));
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
    
       
     tableS = new JTable();
     
    // create a table model and set a Column Identifiers to this model
    Object [] columnsS = {"ID", "Name Supplier" , "Age" ,"Gender"};
    final DefaultTableModel modelS = new DefaultTableModel();
    modelS.setColumnIdentifiers(columnsS);
    
    
    // set the model to the table
        tableS.setModel(modelS);
       
       
       tableS.setBackground(Color.YELLOW);
        
        //create JLabel
          LabelId = new JLabel("Enter ID: ");
          LabelFname = new JLabel("Enter Name Supplier: ");
          LabeltextAge = new JLabel("Enter Age: ");
          labGender = new JLabel("Gender: ");
          
          
         labSearch = new JLabel("ID Search: ");
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelFname.setBounds(5, 250, 150, 25);
        LabeltextAge.setBounds(5, 290, 100, 25);
        labGender.setBounds(5,350, 100, 25);
      
        
         labSearch.setBounds(450, 240, 100, 25);
         
        
        
        
       //create JTextField
          textId = new JTextField();
          textName = new JTextField();
          
          Age = new JComboBox();
          
         Age.addItem("Age");
         Age.addItem("1");
         Age.addItem("2");
         Age.addItem("3");
         Age.addItem("4");
         Age.addItem("5");
         Age.addItem("6");
         Age.addItem("7");
         Age.addItem("8");
         Age.addItem("9");
         Age.addItem("10");
         Age.addItem("11");
         Age.addItem("12");
         Age.addItem("13");
         Age.addItem("14");
         Age.addItem("15");
         Age.addItem("16");
         Age.addItem("17");
         Age.addItem("18");
         Age.addItem("19");
         Age.addItem("20");
         Age.addItem("21");
         Age.addItem("22");
         Age.addItem("23");
         Age.addItem("24");
         Age.addItem("25");
         Age.addItem("26");
         Age.addItem("27");
         Age.addItem("28");
         Age.addItem("29");
         Age.addItem("30");
         Age.addItem("31");
         Age.addItem("32");
         Age.addItem("33");
         Age.addItem("34");
         Age.addItem("35");
         Age.addItem("36");
         Age.addItem("37");
         Age.addItem("38");
         Age.addItem("39");
         Age.addItem("40");
         Age.addItem("41");
         Age.addItem("42");
         Age.addItem("43");
         Age.addItem("44");
         Age.addItem("45");
         Age.addItem("46");
         Age.addItem("47");
         Age.addItem("48");
         Age.addItem("49");
         Age.addItem("50");
         Age.addItem("51");
         Age.addItem("52");
         Age.addItem("53");
         Age.addItem("54");
         Age.addItem("55");
         Age.addItem("56");
         Age.addItem("57");
         Age.addItem("58");
         Age.addItem("59");
         Age.addItem("60");
         Age.addItem("61");
         Age.addItem("62");
         Age.addItem("63");
         Age.addItem("64");
         Age.addItem("65");
         Age.addItem("67");
         Age.addItem("68");
         Age.addItem("69");
         Age.addItem("70");
         Age.addItem("71");
         Age.addItem("72");
         Age.addItem("39");
         Age.addItem("40");
         Age.addItem("41");
         Age.addItem("42");
         Age.addItem("43");
         Age.addItem("44");
         Age.addItem("45");
         Age.addItem("46");
         Age.addItem("47");
         Age.addItem("48");
         Age.addItem("49");
         Age.addItem("50");
         Age.addItem("51");
         Age.addItem("52");
         Age.addItem("53");
         Age.addItem("54");
         Age.addItem("55");
         Age.addItem("56");
         Age.addItem("57");
         Age.addItem("58");
         Age.addItem("59");
         Age.addItem("60");
         Age.addItem("61");
         Age.addItem("62");
         Age.addItem("63");
         Age.addItem("64");
         Age.addItem("65");
         Age.addItem("67");
         Age.addItem("68");
         Age.addItem("69");
         Age.addItem("70");
         Age.addItem("71");
         Age.addItem("72");
         Age.addItem("73");
         Age.addItem("74");
         Age.addItem("75");
         Age.addItem("76");
         Age.addItem("77");
         Age.addItem("78");
         Age.addItem("79");
         Age.addItem("80");
         Age.addItem("81");
         Age.addItem("82");
         Age.addItem("83");
         Age.addItem("84");
         Age.addItem("85");
         Age.addItem("86");
         Age.addItem("87");
         Age.addItem("88");
         Age.addItem("89");
         Age.addItem("90");
         Age.addItem("91");
         Age.addItem("92");
         Age.addItem("93");
         Age.addItem("94");
         Age.addItem("95");
         Age.addItem("96");
         Age.addItem("97");
         Age.addItem("98");
         Age.addItem("99");
         Age.addItem("100");
         Age.addItem("101");
         Age.addItem("102");
         Age.addItem("103");
         Age.addItem("104");
         Age.addItem("105");
         Age.addItem("106");
         Age.addItem("107");
         Age.addItem("108");
         Age.addItem("109");
         Age.addItem("110");
        
        
         
         
         textId.setBounds(150, 220, 100, 25);
        textName.setBounds(150, 250, 100, 25);
        Age.setBounds(150, 290, 100, 25);
        
        //create JRadioButton
         Female = new JRadioButton("Female");
         Male=new JRadioButton("Male");
         
         Female.setBounds(150, 350, 100, 25);
         Male.setBounds(150, 400, 100, 25);
         
         GenderGroup = new ButtonGroup();  
         GenderGroup.add(Female);
         GenderGroup.add(Male);
         
       
         
         textSearch = new JTextField();
         textSearch.setBounds(530, 240, 100, 25);
         
        // create JButtons
         btnAdd = new JButton("Add");
         btnDelete = new JButton("Delete");
         btnUpdate = new JButton("Update");     
        btnSearch = new JButton("Search"); 
         btnBack = new JButton("Back") ;
         btnExit = new JButton ("Exit");
        btnSave = new  JButton ("Save");
        
        btnAdd.setBounds(300, 220, 100, 25);
        btnUpdate.setBounds(300, 265, 100, 25);
        btnDelete.setBounds(300, 310, 100, 25);
         btnSearch.setBounds(650, 240, 100, 25);
        btnSave.setBounds(620, 410, 100, 25);
        btnBack.setBounds(620, 450, 100, 25);
        btnExit.setBounds(620, 490, 100, 25);
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(tableS);
        pane.setBounds(0, 0, 880, 200);
        
        frameS.setLayout(null);
        
        frameS.add(pane);
        
        // add JTextFields to the jframe
        frameS.add(textId);
        frameS.add(textName);
        frameS.add(textSearch);
        
        
        // add JComboBox to the jframe
        frameS.add(Age);
        
        
        //add JLabal to the jframe
        frameS.add(LabelId);
        frameS.add(LabelFname);
        frameS.add(LabeltextAge);
        frameS.add(labGender);
        frameS.add(labSearch);
        
        
         //add JRadioButton to the jframe
        frameS.add(Female);
        frameS.add(Male);
        
        // add JButtons to the jframe
        frameS.add(btnAdd);
        frameS.add(btnDelete);
        frameS.add(btnUpdate);
        frameS.add(btnSearch);
        frameS.add(btnBack);
        frameS.add(btnExit);
        frameS.add(btnSave);
        
        // create an array of objects to set the row data
        final Object[] row = new Object[4];

        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Object id = textId.getText();
                Object name = textName.getText();
                Object age = Age.getSelectedItem();
                Object OFemale = Female.getText();
                Object OMale = Male.getText();
                
                Object n = "";
                
                 if( !id.equals(n) && !name.equals(n) && !OFemale.equals(n) && !OMale.equals(n)&& !age.equals(n))  
                {
                    row[0]=textId.getText();
                row[1]=textName.getText();
                row[2]=Age.getSelectedItem();
                
                if (Female.isSelected())
                {
                    row[3] = Female.getText();
                }
                else
                {
                    row[3]=Male.getText();
                }
   
                //add row to the model
                modelS.addRow(row);
                }
                else
                 {
                    JOptionPane.showMessageDialog(null,"Add Error","error",JOptionPane.ERROR_MESSAGE);
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
                int i = tableS.getSelectedRow();
                if(i >= 0)
                {
                    // remove a row from jtable
                    modelS.removeRow(i);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
//        // get selected row data From table to textfields 
        tableS.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e)
        {
            
            // i = the index of the selected row
            int i = tableS.getSelectedRow();
             
              textId.setText(modelS.getValueAt(i, 0).toString());
              textName.setText(modelS.getValueAt(i, 1).toString());
              Age.setSelectedItem(modelS.getValueAt(i, 2).toString());
                if (Female.isSelected())
                {
                    Female.setText(modelS.getValueAt(i, 3).toString());
                }
                else
                {
                     Male.setText(modelS.getValueAt(i, 3).toString());
                }
            
           
            
           
            
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
             
                // i = the index of the selected row
                int i = tableS.getSelectedRow();
                
                if(i >= 0) 
                {
                   modelS.setValueAt(textId.getText(), i, 0);
                   modelS.setValueAt(textName.getText(), i, 1);
                   modelS.setValueAt(Age.getSelectedItem(), i, 2);
                     if (Female.isSelected())
                {
                   modelS.setValueAt(Female.getText(), i, 3);
                }
                else
                {
                     modelS.setValueAt(Male.getText(), i, 3);
                }
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
         btnSearch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Object id = textSearch.getText();
                Object n = "";
                
                if( !id.equals(n))
                {
                    boolean found =false;
                    for(int i=0 ; i<tableS.getRowCount() ;i++)
                    {
                        Object idnum = tableS.getValueAt(i, 0);
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
 btnSearch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Object id = textSearch.getText();
                Object n = "";
                
                if( !id.equals(n))
                {
                    boolean found =false;
                    for(int i=0 ; i<tableS.getRowCount() ;i++)
                    {
                        Object idnum = tableS.getValueAt(i, 0);
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
        
        
         btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose_User secondform = new Choose_User();
                    secondform.setVisible(true);
                    dispose();
                    
                    frameS.setVisible(false);
                } catch (IOException ex) {
                   
                }
            }
       });
         

        btnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            int exit= JOptionPane.showConfirmDialog(null,"Do you want exit the Frame?", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
            }
            
       });
          textId.addActionListener(new SaveId());
textName.addActionListener(new SaveName());
Age.addActionListener(new SaveAge());
Female.addActionListener(new SaveFemale());
Male.addActionListener(new SaveMale());




btnSave.addActionListener(new Save());

                  frameS.setSize(900,600);
      
        frameS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameS.setVisible(true);

      }   
       private class SaveId implements ActionListener 
       {

             @Override
	     public void actionPerformed(ActionEvent arg0) 
            {
                CS.Id=textId.getText();
        
	    }
      }
       private class SaveName implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CS.Name= textName.getText();
        
	}
}
      private class SaveAge implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CS.Age=(String) Age.getSelectedItem();
        
	}
}
      private class SaveFemale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CS.Female= Female.getText();
      
	}
}
      private class SaveMale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CS.Male= Male.getText();
        
	}
}
 
       

//          private class Saveage implements ActionListener {
//
//   
//        @Override
//	public void actionPerformed(ActionEvent arg0) {
//            CG.Age=Age.getText();
//        
//	}
//        
//	}
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_of_Suppliers.add(CS);
                bin = new ObjectOutputStream(new FileOutputStream("Suppliers.txt"));
                bin.writeObject(Contact_of_Suppliers.add(CS));
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

