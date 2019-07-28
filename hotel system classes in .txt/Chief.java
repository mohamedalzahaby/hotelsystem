/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import hotelsystem.newpackage.Contact_of_Cheif;
import hotelsystem.newpackage1.Choose_User;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
 * @author DELL
 */
public class Chief extends JFrame
{
    JFrame frameC;
    
    JTable tableC ;
    
    JLabel LabelId ;
    JLabel LabelFname;
    JLabel LabeltextAge ;
    JLabel labGender;
    JLabel labSearch;
    JLabel labRank;
    
    JTextField textId;
    JTextField textName;
    JTextField textAge;
    JTextField textSearch;
    
    JRadioButton Female;
    JRadioButton Male;
    ButtonGroup GenderGroup;
    
      JComboBox Age;
    JComboBox Rank;
    
      JButton btnAdd ;
      JButton btnDelete;
      JButton btnUpdate;  
      JButton btnSearch;
      JButton btnBack;
      JButton btnExit;
      JButton btnSave;
    
       ArrayList <Contact_of_Cheif> Contact_of_Cheif = new ArrayList<>();
        Contact_of_Cheif CC=new Contact_of_Cheif(); 
      
    public Chief() throws Exceptions
    {
       
        frameC = new JFrame("Cheif");
    try{
           
          BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25395372_2254547538105106_565654656_n (1).jpg"));
        
        frameC.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
       
     tableC = new JTable();
     
    // create a table model and set a Column Identifiers to this model
    Object [] columnsC = {"ID","Name Chief" , "Age","Gender","Rank"};
    final DefaultTableModel modelC = new DefaultTableModel();
    modelC.setColumnIdentifiers(columnsC);
    
    
    // set the model to the table
        tableC.setModel(modelC);
        
        
       
       tableC.setBackground(Color.YELLOW);
        
        //create JLabel
          LabelId = new JLabel("Enter ID: ");
          LabelFname = new JLabel("Enter Name Chief: ");
          LabeltextAge = new JLabel("Enter Age: ");
          labGender = new JLabel("Gender: ");
          labRank = new JLabel("Rank: ");
         labSearch = new JLabel("ID Search: ");
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelFname.setBounds(5, 250, 150, 25);
        LabeltextAge.setBounds(5, 290, 100, 25);
        labGender.setBounds(5,350, 100, 25);
          labRank.setBounds(5,450, 100, 25);
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
         
           Rank = new JComboBox();
         Rank.addItem("Rank");
         Rank.addItem("Master Chef");
         Rank.addItem("Sous Chef");
         Rank.addItem("Station Chef");
         Rank.addItem("Prep Cook");
         
         Rank.setBounds(150, 450, 100, 25);
         
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
        JScrollPane pane = new JScrollPane(tableC);
        pane.setBounds(0, 0, 880, 200);
        
        frameC.setLayout(null);
        
        frameC.add(pane);
        
        // add JTextFields to the jframe
        frameC.add(textId);
        frameC.add(textName);
        frameC.add(Age);
        frameC.add(textSearch);
        
        frameC.add(Rank);
        
        //add JLabal to the jframe
        frameC.add(LabelId);
        frameC.add(LabelFname);
        frameC.add(LabeltextAge);
        frameC.add(labGender);
        frameC.add(labSearch);
        frameC.add(labRank);
         //add JRadioButton to the jframe
        frameC.add(Female);
        frameC.add(Male);
        
        // add JButtons to the jframe
        frameC.add(btnAdd);
        frameC.add(btnDelete);
        frameC.add(btnUpdate);
        frameC.add(btnSearch);
        frameC.add(btnBack);
        frameC.add(btnExit);
        frameC.add(btnSave);
        
        // create an array of objects to set the row data
        final Object[] row = new Object[5];

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
                Object ORank = Rank.getSelectedItem();
                
                Object n = "";
                
                 if( !id.equals(n) && !name.equals(n) && !OFemale.equals(n) && !OMale.equals(n)&& !age.equals(n)&& !ORank.equals(n))  
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
                
                row[4]=Rank.getSelectedItem();
   
                //add row to the model
                modelC.addRow(row);
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
                int i = tableC.getSelectedRow();
                if(i >= 0)
                {
                    // remove a row from jtable
                    modelC.removeRow(i);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // get selected row data From table to textfields 
        tableC.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e)
        {
            
            // i = the index of the selected row
            int i = tableC.getSelectedRow();
            
            textId.setText(modelC.getValueAt(i, 0).toString());
            textName.addKeyListener(new KeyAdapter(){

            public void keyTyped(KeyEvent e){

                char ch = e.getKeyChar();

                if(Character.isDigit(ch))
                {

                    textName.setText("");

                    JOptionPane.showMessageDialog(null,"Error: you enter numbers","error",JOptionPane.ERROR_MESSAGE);
                    textName.enableInputMethods(rootPaneCheckingEnabled);

               }
                
                

            }

 

             

        });
            
            textAge.setText(modelC.getValueAt(i, 2).toString());
           
           
            
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
             
                // i = the index of the selected row
                int i = tableC.getSelectedRow();
                
                if(i >= 0) 
                {
                   modelC.setValueAt(textId.getText(), i, 0);
                   modelC.setValueAt(textName.getText(), i, 1);
                   modelC.setValueAt(Age.getSelectedItem(), i, 2);
                    if (Female.isSelected())
                {
                   modelC.setValueAt(Female.getText(), i, 3);
                }
                else
                {
                     modelC.setValueAt(Male.getText(), i, 3);
                }
                   
                   
                   modelC.setValueAt(Rank.getSelectedItem(), i, 4);
                  
                   
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
                    for(int i=0 ; i<tableC.getRowCount() ;i++)
                    {
                        Object idnum = tableC.getValueAt(i, 0);
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
                    
                    frameC.setVisible(false);
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
textName.addActionListener(new SaveName());
Age.addActionListener(new SaveAge());
Female.addActionListener(new SaveFemale());
Male.addActionListener(new SaveMale());
Rank.addActionListener(new SaveRank());




btnSave.addActionListener(new Save());

                  frameC.setSize(900,600);
      
        frameC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameC.setVisible(true);

      }   
       private class SaveId implements ActionListener 
       {

             @Override
	     public void actionPerformed(ActionEvent arg0) 
            {
                CC.Id=textId.getText();
        
	    }
      }
       private class SaveName implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CC.Name= textName.getText();
        
	}
}
      private class SaveAge implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CC.Age=(String) Age.getSelectedItem();
        
	}
}
      private class SaveFemale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CC.Female= Female.getText();
        
	}
}
      private class SaveMale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CC.Male= Male.getText();
        
	}
}
  private class SaveRank implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CC.Rank=(String) Rank.getSelectedItem();
        
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
                Contact_of_Cheif.add(CC);
                bin = new ObjectOutputStream(new FileOutputStream("Cheif.txt"));
                bin.writeObject(Contact_of_Cheif.add(CC));
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

