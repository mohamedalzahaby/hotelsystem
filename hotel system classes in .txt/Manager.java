/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;



import hotelsystem.newpackage.Contact;
import hotelsystem.newpackage1.Choose_User;
import java.awt.Color;
import java.awt.Container;
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
public class Manager   extends  JFrame {
        final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
        final JTextField textLname = new JTextField();
             JComboBox Age;
           final JTextField textSearch = new JTextField();
          final JComboBox Combo1 = new JComboBox(new String []{"select","Male","Famle"});
        ArrayList <Contact> list = new ArrayList<>();
        Contact em=new Contact();  
        JPanel p = new JPanel();

    //___________________________________________________________________________
      public Manager() throws Exceptions {
         
        final JFrame frame = new JFrame("Manager");
        try{
           
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\0ecb429c8296e4da1aa31062272df.jpeg"));
        
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
        frame.setSize(900,530);
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        // create a table model and set a Column Identifiers to this model 
        String [] columns = {"Id","First Name","Last Name","Age","Geneder"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
       
       
        Age = new JComboBox();

         Age.addItem("Select");
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
         
        // set the model to the table
        table.setModel(model);
      
         JLabel LabelId = new JLabel("Enter id : ");
         JLabel LabelFname = new JLabel("Enter First Name: ");
         JLabel LabelLname = new JLabel("Enter Last Name: ");
         JLabel LabeltextAge = new JLabel("Enter Age: ");
        JLabel LabeltextSearch = new JLabel("id search: ");
         JLabel LabeltextGeneder = new JLabel("Choose Geneder: ");
         
       LabelId.setBounds(5, 220, 100, 25);
        LabelFname.setBounds(5, 250, 100, 25);
        LabelLname.setBounds(5, 280, 100, 25);
        LabeltextAge.setBounds(5, 310, 100, 25);
         LabeltextSearch.setBounds(5, 390, 100, 25);
        LabeltextGeneder.setBounds(5, 340, 100, 25);
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnSearch = new JButton("Search");
     
        JButton btnSave = new JButton("Save");
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
       
        textId.setBounds(150, 220, 100, 25);
        textFname.setBounds(150, 250, 100, 25);
        textLname.setBounds(150, 280, 100, 25);
    Age.setBounds(150, 310, 100, 25);
        textSearch.setBounds(150, 390, 100, 25);
            Combo1.setBounds(150, 340, 100, 25);
        
        btnAdd.setBounds(300, 220, 100, 25);
        btnUpdate.setBounds(300, 265, 100, 25);
        btnDelete.setBounds(300, 310, 100, 25);
        btnSearch.setBounds(300, 390, 100, 25);
        btnSave.setBounds(600, 370, 100, 25);
        btnBack.setBounds(600, 400, 100, 25);
        btnExit.setBounds(600, 430, 100, 25);
        
        
          JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(Age);
        frame.add(textSearch);
        //frame.add(textSearchValue);
        
        frame.add(LabelId);
        frame.add(LabelFname);
        frame.add(LabelLname);
        frame.add(LabeltextAge);
        frame.add(LabeltextSearch);
           frame.add(LabeltextGeneder);
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnSearch);
        frame.add(btnSave);
         frame.add(btnBack);
        frame.add(btnExit);
            frame. add(Combo1);
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
               Object id = textId.getText();
                Object fname = textFname.getText();
                Object lname = textLname.getText();
                Object age = Age.getSelectedItem();
                    Object r =  Combo1.getSelectedItem();
                Object n = "";
                if( !id.equals(n) && !age.equals(n) && !fname.equals(n) && !lname.equals(n))
                {
                    row[0] = textId.getText();
                    row[1] = textFname.getText();
                    row[2] = textLname.getText();
                    row[3] = Age.getSelectedItem();
                    row[4] = Combo1.getSelectedItem();
                

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
            textFname.setText(model.getValueAt(i, 1).toString());
            textLname.setText(model.getValueAt(i, 2).toString());
         //   textAge.setText(model.getValueAt(i, 3).toString());
//            r1.setText(model.getValueAt(i,4 ).toString());
//            r2.setText(model.getValueAt(i, 5).toString());
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
                   model.setValueAt(textFname.getText(), i, 1);
                   model.setValueAt(textLname.getText(), i, 2);
                  model.setValueAt(Age.getSelectedItem(), i, 3);
                    
                    model.setValueAt(Combo1.getSelectedItem(), i, 4);
                  
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
textFname.addActionListener(new Savefn());
textLname.addActionListener(new Saveln());
Age.addActionListener(new Saveage());
//Combo1.addActionListener(new Savel());

btnSave.addActionListener(new Save());

      }   
//      private class Savel implements ActionListener {
//
//   
//        @Override
//	public void actionPerformed(ActionEvent arg0) {
//            em.r1=r1.getText();
//        
//	}
//}
     
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            em.Id=textId.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            em.First_Name=textFname.getText();
        
	}
	}
         private class Saveln implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            em.Last_Name=textLname.getText();
        
	}
	}
          private class Saveage implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            em.Age=(String) Age.getSelectedItem();
        
	}
        
	}
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                list.add(em);
                bin = new ObjectOutputStream(new FileOutputStream("Manager.txt"));
                bin.writeObject(list.add(em));
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
    

