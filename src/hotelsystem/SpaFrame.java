package hotelsystem;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class SpaFrame implements Serializable{
    
    JPanel p = new JPanel();
    //static double try3;
    ArrayList<Object> SaveList = new ArrayList<>();
    static HashMap<String, Double> spaCostTable = new HashMap<>();
    CalculatingCost obj ;
    //___________________________________________________________________________

          public SpaFrame() {
        final JFrame frame = new JFrame("Spa");
        final JTable table = new JTable(); 
        obj = new CalculatingCost();
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","First Name","Last Name","days number","cost"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
         JLabel LabelId = new JLabel("Enter id : ");
         JLabel LabelFname = new JLabel("Enter First Name: ");
         JLabel LabelLname = new JLabel("Enter Last Name: ");
         JLabel LabeltextAge = new JLabel("days number: ");
         JLabel LabeltextSearch = new JLabel("id search: ");
         
         
       LabelId.setBounds(5, 220, 100, 25);
        LabelFname.setBounds(5, 250, 100, 25);
        LabelLname.setBounds(5, 280, 100, 25);
        LabeltextAge.setBounds(5, 310, 100, 25);
        LabeltextSearch.setBounds(5, 340, 100, 25);
        
        final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
        final JTextField textLname = new JTextField();
        final JTextField textdays = new JTextField();
        final JTextField textSearch = new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
        JButton btnSave = new JButton("Save");     
        JButton btnSearch = new JButton("Search");     
        JButton btnNext = new JButton("next");
        
        textId.setBounds(150, 220, 100, 25);
        textFname.setBounds(150, 250, 100, 25);
        textLname.setBounds(150, 280, 100, 25);
        textdays.setBounds(150, 310, 100, 25);
        textSearch.setBounds(150, 340, 100, 25);
        
        btnAdd   .setBounds (300, 220, 100, 25);
        btnUpdate.setBounds (300, 265, 100, 25);
        btnDelete.setBounds (300, 310, 100, 25);
        btnSearch.setBounds (300, 340, 100, 25);
        btnSave.  setBounds (600, 250, 150, 70);
        btnNext.  setBounds (760, 420, 100, 25);
          JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(textdays);
        frame.add(textSearch);
    
        
        frame.add(LabelId);
        frame.add(LabelFname);
        frame.add(LabelLname);
        frame.add(LabeltextAge);
        frame.add(LabeltextSearch);
       
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnSave);
        frame.add(btnSearch);
        frame.add(btnNext);
        
        // create an array of objects to set the row data
        final Object[] row = new Object[5];
        
        
        
        //enter only numbers
        textdays.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char ch = e.getKeyChar();
                if(Character.isLetter(ch))
                {
                    textdays.setText("");
                    JOptionPane.showMessageDialog(null,"Error: please enter only numbers","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // button add row
        btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                Object id = textId.getText();
                Object fname = textFname.getText();
                Object lname = textLname.getText();
                Object days = textdays.getText();
                Object n = "";
                if( !id.equals(n) && !days.equals(n) && !fname.equals(n) && !lname.equals(n))
                {
                    row[0] = textId.getText();
                    row[1] = textFname.getText();
                    row[2] = textLname.getText();
                    row[3] = textdays.getText();
                    String x = row[3].toString();
                    int daynum = Integer.parseInt(x);
                    obj.SetCost(daynum);
                    row[4] = obj.getCost();

                    // add row to the model
                    model.addRow(row);
                }
                else{JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);}
            }
        });
        //search for an ID
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
                else{JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);}
                
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
            textdays.setText(model.getValueAt(i, 3).toString());
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
                   model.setValueAt(textdays.getText(), i, 3);
                   String x =textdays.getText();
                   int daynum = Integer.parseInt(x);
                   obj.SetCost(daynum);
                   model.setValueAt(obj.getCost(), i, 4);
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
                else{JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);}
            }
        });
        
        
        
        
        
        
        //button next
        btnNext.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    SafariFrame secondform = new SafariFrame();
                    //dispose();
                    frame.setVisible(false);
                }
            });
        
        
        
        
        
        
        
        
        //button back
        JButton btnBack = new JButton("back");
        btnBack.  setBounds (650, 420, 100, 25);
        frame.add(btnBack);
        btnBack.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    GymFrame secondform = new GymFrame();
                    //dispose();
                    frame.setVisible(false);
                }
            });
        
        
        
        
        
        
        
        
        
        
        
        // (SAVE) get selected row data From table to ArrayList (SAVE)
        btnSave.addActionListener(new ActionListener(){

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
                    //for calculating cost
                    for(int i=0 ; i<table.getRowCount() ; i++ )
                    {
                        String b = model.getValueAt(i, 0).toString();
                        String x = model.getValueAt(i, 3).toString();
                        int daynum = Integer.parseInt(x);
                        obj.SetCost(daynum);
                        spaCostTable.put(b, obj.getCost());
                        //try3 = spaCostTable.get(b);
                    }
                }
                else { JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE); }
                
                try 
                {
                    ObjectOutputStream bin = new ObjectOutputStream( new FileOutputStream( "SpaFrameBinFile.bin" ) );
                    bin.writeObject(spaCostTable);
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
