/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import hotelsystem.newpackage.Contact_of_booking;
import hotelsystem.newpackage1.Choose;
import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Room_Booking  extends JFrame{
 
    final JTextField textId = new JTextField();
        final JTextField textRoomid = new JTextField();
         final JTextField textSearch = new JTextField();
             final JTextField textAvilability = new JTextField();
        final JComboBox Combo2 = new JComboBox(new String []{"select","Floor 1","Floor 2","Floor 3","Floor 4","Floor 5"});
           final JComboBox Combo = new JComboBox(new String []{"select","1","2","3","4"});
           final JComboBox Combo1 = new JComboBox(new String []{"select","Double","Single","Family","Multiple"});
             JLabel LabelId = new JLabel("Enter id : ");
           JLabel LabelRoomId = new JLabel("Enter Room id: ");
           JLabel LabelNOFFloor =  new JLabel("Enter Number Of Floor: ");
           JLabel LabelBed = new JLabel("Choose the numbers of beds ");
           JLabel LabelRoomType = new JLabel("Choose room type: ");
           JLabel LabeltextSearch = new JLabel("id search: ");
           JLabel LabeltextAvilability = new JLabel("Room_id Avilability: ");
            InputStream is;
    OutputStream os;
    Socket toFromserver = null;
    String clientName;
           
          ArrayList <Contact_of_booking> Contact_of_booking = new ArrayList<>();
        Contact_of_booking bb=new Contact_of_booking();  
        
        
        //final JTextField textNOOFFloor = new JTextField();

JPanel p = new JPanel();

    //___________________________________________________________________________
  
    
   

          public Room_Booking(String Name) throws Exceptions  {
        final JFrame frame = new JFrame("Room_Booking");
        
        
         try{
           
        BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\Brand-Home_Desktop_Image-5-Travel-fit-even-during-downtime-with-EVEN-Hotels-Premium-Bedding@2x.jpg"));
        
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
          frame.setSize(900,600);
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","Room_id","Number Of bed","Type of room","Number of Floor"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
         
          
          
          
   //frame
        this.clientName=Name;
      
        setTitle("Client V 1.0" + Name);
       // recivedMsg=new JLabel("<html>Recived Message<br>");
        setLayout(null);
       // recivedMsg.setBounds(20,20, 200,250);
        //add(recivedMsg);
        JButton btnReciveMsg=new JButton("Send");
        btnReciveMsg.setBounds(5,500,200,25);
        
        //textAvilability.setBounds(200, 460, 100, 25);
//        textId.setBounds(btnReciveMsg.getBounds().x,btnReciveMsg.getBounds().y+50,100,50);
//        add(tx_Msg);
        btnReciveMsg.addActionListener(new act());
        frame .add(btnReciveMsg);
        
                try {
                    toFromserver = new Socket("127.0.0.0", 6000);
                    is=toFromserver.getInputStream();
                    os=toFromserver.getOutputStream();
                    updategui t=new updategui();
                    t.start();

                } catch (IOException ex) {
                    
                }
                
    
    
    
         
        LabelId.setBounds(5, 220, 100, 25);
        LabelRoomId.setBounds(5, 250, 100, 25);
        LabelBed.setBounds(5, 280, 200, 25);
        LabelRoomType.setBounds(5, 310, 200, 25);
        LabelNOFFloor.setBounds(5, 340, 200, 25);
        LabeltextSearch.setBounds(5, 400, 200, 25);
        LabeltextAvilability.setBounds(5, 460, 100, 25);
        
       
       
        
        // create JButtons
       JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnSearch = new JButton("Search");
         JButton btnSave = new JButton("Save");
        JButton btnAvilability = new JButton("Avilablility");
        JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
        textId.setBounds(200, 220, 100, 25);
        textRoomid.setBounds(200, 250, 100, 25);
        textSearch.setBounds(200, 400, 100, 25);
        textAvilability.setBounds(200, 460, 100, 25);
        
        Combo.setBounds(200, 280, 100, 25);
        Combo1.setBounds(200, 310, 100, 25);
        Combo2.setBounds(200, 340, 100, 25);
        
        btnAdd.setBounds(400, 220, 100, 25);
        btnUpdate.setBounds(400, 265, 100, 25);
        btnDelete.setBounds(400, 310, 100, 25);
        btnAvilability.setBounds(400, 460, 100, 25);
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
        frame.add(textRoomid);
        frame.add(textSearch);
         frame.add(textAvilability);
      
       // frame.add(textNOOFFloor);
        frame.add(Combo2);
        frame.add(Combo);
        frame.add(Combo1);
       
    
        
        frame.add(LabelId);
        frame.add(LabelRoomId);
        frame.add(LabelBed);
        frame.add(LabelRoomType);
        frame.add(LabelNOFFloor);
      frame.add(LabeltextSearch);
      frame.add(LabeltextAvilability);
          
       
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnAvilability);
        frame.add(btnSave);
        frame.add(btnSearch);
       
         frame.add(btnBack);
        frame.add(btnExit);
        // create an array of objects to set the row data
        final Object[] row = new Object[6];
        
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
                        if(id.equals(idnum)){
                            found = true;
                            // idnum.setBackground(Color.pink);
                        }
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
        btnAvilability.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Object Room_id = textAvilability.getText();
                Object n = "";
                
                if( !Room_id.equals(n))
                {
                    boolean found =false;
                    for(int i=0 ; i<table.getRowCount() ;i++)
                    {
                        Object id= table.getValueAt(i, 0);
                        if(Room_id.equals(id)){found = true;}
                    }
                    
                    if(found==true)
                    {
                        found = false;
               
                        JOptionPane.showMessageDialog(null,"Room_id not Avilabale"+" "+Room_id," Found ",JOptionPane.INFORMATION_MESSAGE);
                        //table.rowAtPoint(null)
                    }
                    else {JOptionPane.showMessageDialog(null,"Room_id   Avilabale"+" "+Room_id," Not Found",JOptionPane.INFORMATION_MESSAGE);} 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Avilability Error","error",JOptionPane.ERROR_MESSAGE);}
                
            }
        });
        
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               Object id = textId.getText();
                Object fname = textRoomid.getText();
              
             
                Object n = "";
                if( !id.equals(n) && !fname.equals(n) )
                {
                    row[0] = textId.getText();
                    row[1] = textRoomid.getText();
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
            textRoomid.setText(model.getValueAt(i, 1).toString());
            
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
                   model.setValueAt(textRoomid.getText(), i, 1);
                    model.setValueAt(Combo.getSelectedItem(), i, 2);
                      model.setValueAt(Combo1.getSelectedItem(), i, 3);
                    model.setValueAt(Combo2.getSelectedItem(), i, 4);
//                     row[2] = Combo.getSelectedItem();
//                    row[3] = Combo1.getSelectedItem();
//                 
//                     row[4] = Combo2.getSelectedItem();
                  
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
textRoomid.addActionListener(new Savefn());
// Combo.addActionListener(new SaveI());
//Combo1.addActionListener(new Savef());
// Combo2.addActionListener(new Saved());


btnSave.addActionListener(new Save());

      }   
//           private class Savef implements ActionListener {
//
//   
//        @Override
//	public void actionPerformed(ActionEvent arg0) {
//            bb.Room_type=Combo1.get
//        
//	}
//}
  private class SaveId implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            bb.id=textId.getText();
        
	}
}
       private class Savefn implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            bb.room_id=textRoomid.getText();
        
	}
	}
         
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_of_booking.add(bb);
                bin = new ObjectOutputStream(new FileOutputStream("Contact_of_booking.txt"));
                bin.writeObject(Contact_of_booking.add(bb));
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
 private class act implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            PrintWriter pw=new PrintWriter(os,true);
            pw.println(clientName+": "+textId.getText());
              pw.println(clientName+": "+textRoomid.getText());
              
                   pw.println(clientName+": "+Combo2.getSelectedItem());
              pw.println(clientName+": "+Combo.getSelectedItem());
                pw.println(clientName+": "+Combo1.getSelectedItem());
        }
        
    }
    private class updategui extends Thread
    {
        
        @Override
        public void run()
        {
            while (true)
            {
                
                BufferedReader bf=new BufferedReader(new InputStreamReader(is));
                String Message = null;
                try {
                    Message = bf.readLine();
                    if (Message!=null)
                    {
//                          JLabel LabelId = new JLabel("Enter id : ");
//           JLabel LabelRoomId = new JLabel("Enter Room id: ");
//           JLabel LabelNOFFloor =  new JLabel("Enter Number Of Floor: ");
//           JLabel LabelBed = new JLabel("Choose the numbers of beds ");
//           JLabel LabelRoomType = new JLabel("Choose room type: ");
//           JLabel LabeltextSearch = new JLabel("id search: ");
//           JLabel LabeltextAvilability = new JLabel("Room_id Avilability: ");
                    LabelId.setText(LabelId.getText()+"<br>"+Message);
                     LabelNOFFloor.setText(LabelNOFFloor.getText()+"<br>"+Message);
                      LabelBed.setText(LabelBed.getText()+"<br>"+Message);
                       LabelRoomType.setText(LabelRoomType.getText()+"<br>"+Message);
                      
                     JOptionPane.showMessageDialog(null, "Server says "+ Message );
                    
                    }
                } catch (IOException ex) {
                   //  JOptionPane.showInputDialog(ex);
                }
                
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    
                }
    
            }
        }
    }
}


    
   

      
      
      
      
      
      
      
      
      

          
   
  
  
    
