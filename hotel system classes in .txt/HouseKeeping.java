/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import hotelsystem.newpackage.Contact_of_House_Keeping;
import hotelsystem.newpackage1.Choose_User;
import java.awt.Color;
import java.awt.Container;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
public class HouseKeeping extends JFrame
{
    JFrame frameHK;
    
    JTable tableHK;
    
    JLabel labID;
    JLabel labName;
    JLabel labGender;
    JLabel labRoom;
    JLabel labRmStatus;
    JLabel labBusinessDate;
    JLabel labTimein;
    JLabel labTimeout;
    JLabel labSearch;
    
    JComboBox ComRmStatus;
    JComboBox textTimein;
    JComboBox textTimeout;
     
     JScrollPane pane;
     JTextField txtID;
     JTextField txtName ;
     JTextField textRoom; 
     JTextField textBusinessDate;
     JTextField textSearch;
     
       JRadioButton Female ;
       JRadioButton Male ;
       ButtonGroup Gender ;
       
       
      JButton btnAdd;
      JButton btnDelete;
      JButton btnUpdate;
      JButton btnSearch;
      JButton btnBack;
      JButton btnExit;
      JButton btnSave;
     
      ArrayList <Contact_of_House_Keeping> Contact_of_House_Keeping = new ArrayList<>();
    Contact_of_House_Keeping CHK=new Contact_of_House_Keeping();
      
    public HouseKeeping() throws Exceptions 
    {
        
        
        
         frameHK = new JFrame("House Keeping");
         try{
           
        BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25436515_2254550918104768_1212146860_n.jpg"));
        
        frameHK.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
         
       
        
      
        
         tableHK = new JTable();
        
        Object []columsHK = {"ID","Name","Gender","ID Room","Rm Status","Business Date","Time in","Time out"};
        
       final DefaultTableModel modelHK = new DefaultTableModel();
       modelHK.setColumnIdentifiers(columsHK);
       
       //set model of tableHK
       tableHK.setModel(modelHK);
       
       Container x = tableHK.getTableHeader();

        x.setBackground(Color.BLUE);
       
      // tableHK.setBackground(Color.YELLOW);
       //create JLabel
       labID = new JLabel ("ID: ");
       labName = new JLabel ("Name HouseKeeper: ");
       labGender = new JLabel ("Gender: ");
        labRoom = new JLabel("No.Room: ");
        labRmStatus = new JLabel("Status of room: ");
        labBusinessDate = new JLabel("Date of check the room: ");
        labTimein = new JLabel("Time in of check: ");
        labTimeout = new JLabel("Time out of check: ");
       
        labSearch = new JLabel("ID Search: ");
       
         
        labID.setBounds(5, 220, 150, 25);
        labName.setBounds(5, 250, 150, 25);
        labGender.setBounds(5, 280, 150, 25);
        labRoom.setBounds(5, 320, 150, 25);
        labRmStatus.setBounds(5, 360, 150, 25);
        labBusinessDate.setBounds(5, 400, 150, 25);
        labTimein.setBounds(5, 440, 150, 25);
        labTimeout.setBounds(5, 480, 150, 25);
        
        
        
        labSearch.setBounds(530, 240, 100, 25);
         
        //create JTextField
         textRoom = new JTextField();
        
        textBusinessDate = new JTextField();
        
        textTimein = new JComboBox();
        textTimein.addItem("Select");
        textTimein.addItem("8:59AM");
        textTimein.addItem("9:00AM");
        textTimein.addItem("9:01AM");
        textTimein.addItem("9:02AM");
        textTimein.addItem("9:03AM");
        textTimein.addItem("9:04AM");
        textTimein.addItem("9:05AM");
        textTimein.addItem("9:06AM");
        textTimein.addItem("9:07AM");
        textTimein.addItem("9:08AM");
        textTimein.addItem("9:09AM");
        textTimein.addItem("9:10AM");
        textTimein.addItem("9:11AM");
        textTimein.addItem("9:12AM");
        textTimein.addItem("9:13AM");
        textTimein.addItem("9:14AM");
        textTimein.addItem("9:15AM");
        textTimein.addItem("9:16AM");
        textTimein.addItem("9:17AM");
        textTimein.addItem("9:18AM");
        textTimein.addItem("9:19AM");
        textTimein.addItem("9:20AM");
        textTimein.addItem("9:21AM");
        textTimein.addItem("9:22AM");
        textTimein.addItem("9:23AM");
        textTimein.addItem("9:24AM");
        textTimein.addItem("9:25AM");
        textTimein.addItem("9:26AM");
        textTimein.addItem("9:27AM");
        textTimein.addItem("9:28AM");
        textTimein.addItem("9:29AM");
        textTimein.addItem("9:30AM");
        textTimein.addItem("9:31AM");
        textTimein.addItem("9:32AM");
        textTimein.addItem("9:33AM");
        textTimein.addItem("9:34AM");
        textTimein.addItem("9:35AM");
        textTimein.addItem("9:36AM");
        textTimein.addItem("9:37AM");
        textTimein.addItem("9:38AM");
        textTimein.addItem("9:39AM");
        textTimein.addItem("9:40AM");
        textTimein.addItem("9:41AM");
        textTimein.addItem("9:42AM");
        textTimein.addItem("9:43AM");
        textTimein.addItem("9:44AM");
        textTimein.addItem("9:45AM");
        textTimein.addItem("9:46AM");
        textTimein.addItem("9:47AM");
        textTimein.addItem("9:48AM");
        textTimein.addItem("9:49AM");
        textTimein.addItem("9:50AM");
        textTimein.addItem("9:51AM");
        textTimein.addItem("9:52AM");
        textTimein.addItem("9:53AM");
        textTimein.addItem("9:54AM");
        textTimein.addItem("9:55AM");
        textTimein.addItem("9:56AM");
        textTimein.addItem("9:57AM");
        textTimein.addItem("9:58AM");
        textTimein.addItem("9:59AM");
        textTimein.addItem("10:00AM");
        textTimein.addItem("10:01AM");
        textTimein.addItem("10:02AM");
        textTimein.addItem("10:03AM");
        textTimein.addItem("10:04AM");
        textTimein.addItem("10:05AM");
        textTimein.addItem("10:06AM");
        textTimein.addItem("10:07AM");
        textTimein.addItem("10:08AM");
        textTimein.addItem("10:09AM");
        textTimein.addItem("10:10AM");
        textTimein.addItem("10:11AM");
        textTimein.addItem("10:12AM");
        textTimein.addItem("10:13AM");
        textTimein.addItem("10:14AM");
        textTimein.addItem("10:15AM");
        textTimein.addItem("10:16AM");
        textTimein.addItem("10:17AM");
        textTimein.addItem("10:18AM");
        textTimein.addItem("10:19AM");
        textTimein.addItem("10:20AM");
        textTimein.addItem("10:21AM");
        textTimein.addItem("10:22AM");
        textTimein.addItem("10:23AM");
        textTimein.addItem("10:24AM");
        textTimein.addItem("10:25AM");
        textTimein.addItem("10:26AM");
        textTimein.addItem("10:27AM");
        textTimein.addItem("10:28AM");
        textTimein.addItem("10:29AM");
        textTimein.addItem("10:30AM");
        textTimein.addItem("10:31AM");
        textTimein.addItem("10:32AM");
        textTimein.addItem("10:33AM");
        textTimein.addItem("10:34AM");
        textTimein.addItem("10:35AM");
        textTimein.addItem("10:36AM");
        textTimein.addItem("10:37AM");
        textTimein.addItem("10:38AM");
        textTimein.addItem("10:39AM");
        textTimein.addItem("10:40AM");
        textTimein.addItem("10:41AM");
        textTimein.addItem("10:42AM");
        textTimein.addItem("10:43AM");
        textTimein.addItem("10:44AM");
        textTimein.addItem("10:45AM");
        textTimein.addItem("10:46AM");
        textTimein.addItem("10:47AM");
        textTimein.addItem("10:48AM");
        textTimein.addItem("10:49AM");
        textTimein.addItem("10:50AM");
        textTimein.addItem("10:51AM");
        textTimein.addItem("10:52AM");
        textTimein.addItem("10:53AM");
        textTimein.addItem("10:54AM");
        textTimein.addItem("10:55AM");
        textTimein.addItem("10:56AM");
        textTimein.addItem("10:57AM");
        textTimein.addItem("10:58AM");
        textTimein.addItem("10:59AM");
        textTimein.addItem("11:00AM");
        textTimein.addItem("11:01AM");
        textTimein.addItem("11:02AM");
        textTimein.addItem("11:03AM");
        textTimein.addItem("11:04AM");
        textTimein.addItem("11:05AM");
        textTimein.addItem("11:06AM");
        textTimein.addItem("11:07AM");
        textTimein.addItem("11:08AM");
        textTimein.addItem("11:09AM");
        textTimein.addItem("11:10AM");
        textTimein.addItem("11:11AM");
        textTimein.addItem("11:12AM");
        textTimein.addItem("11:13AM");
        textTimein.addItem("11:14AM");
        textTimein.addItem("11:15AM");
        textTimein.addItem("11:16AM");
        textTimein.addItem("11:17AM");
        textTimein.addItem("11:18AM");
        textTimein.addItem("11:19AM");
        textTimein.addItem("11:20AM");
        textTimein.addItem("11:21AM");
        textTimein.addItem("11:22AM");
        textTimein.addItem("11:23AM");
        textTimein.addItem("11:24AM");
        textTimein.addItem("11:25AM");
        textTimein.addItem("11:26AM");
        textTimein.addItem("11:27AM");
        textTimein.addItem("11:28AM");
        textTimein.addItem("11:29AM");
        textTimein.addItem("11:30AM");
        textTimein.addItem("11:31AM");
        textTimein.addItem("11:32AM");
        textTimein.addItem("11:33AM");
        textTimein.addItem("11:34AM");
        textTimein.addItem("11:35AM");
        textTimein.addItem("11:36AM");
        textTimein.addItem("11:37AM");
        textTimein.addItem("11:38AM");
        textTimein.addItem("11:39AM");
        textTimein.addItem("11:40AM");
        textTimein.addItem("11:41AM");
        textTimein.addItem("11:42AM");
        textTimein.addItem("11:43AM");
        textTimein.addItem("11:44AM");
        textTimein.addItem("11:45AM");
        textTimein.addItem("11:46AM");
        textTimein.addItem("11:47AM");
        textTimein.addItem("11:48AM");
        textTimein.addItem("11:49AM");
        textTimein.addItem("11:50AM");
        textTimein.addItem("11:51AM");
        textTimein.addItem("11:52AM");
        textTimein.addItem("11:53AM");
        textTimein.addItem("11:54AM");
        textTimein.addItem("11:55AM");
        textTimein.addItem("11:56AM");
        textTimein.addItem("11:57AM");
        textTimein.addItem("11:58AM");
        textTimein.addItem("11:59AM");
        textTimein.addItem("1:00PM");
        textTimein.addItem("1:01PM");
        textTimein.addItem("1:02PM");
        textTimein.addItem("1:03PM");
        textTimein.addItem("1:04PM");
        textTimein.addItem("1:05PM");
        textTimein.addItem("1:06PM");
        textTimein.addItem("1:07PM");
        textTimein.addItem("1:08PM");
        textTimein.addItem("1:09PM");
        textTimein.addItem("1:10PM");
        textTimein.addItem("1:11PM");
        textTimein.addItem("1:12PM");
        textTimein.addItem("1:13PM");
        textTimein.addItem("1:14PM");
        textTimein.addItem("1:15PM");
        textTimein.addItem("1:16PM");
        textTimein.addItem("1:17PM");
        textTimein.addItem("1:18PM");
        textTimein.addItem("1:19PM");
        textTimein.addItem("1:20PM");
        textTimein.addItem("1:21PM");
        textTimein.addItem("1:22PM");
        textTimein.addItem("1:23PM");
        textTimein.addItem("1:24PM");
        textTimein.addItem("1:25PM");
        textTimein.addItem("1:26PM");
        textTimein.addItem("1:27PM");
        textTimein.addItem("1:28PM");
        textTimein.addItem("1:29PM");
        textTimein.addItem("1:30PM");
        textTimein.addItem("1:31PM");
        textTimein.addItem("1:32PM");
        textTimein.addItem("1:33PM");
        textTimein.addItem("1:34PM");
        textTimein.addItem("1:35PM");
        textTimein.addItem("1:36PM");
        textTimein.addItem("1:37PM");
        textTimein.addItem("1:38PM");
        textTimein.addItem("1:39PM");
        textTimein.addItem("1:40PM");
        textTimein.addItem("1:41PM");
        textTimein.addItem("1:42PM");
        textTimein.addItem("1:43PM");
        textTimein.addItem("1:44PM");
        textTimein.addItem("1:45PM");
        textTimein.addItem("1:46PM");
        textTimein.addItem("1:47PM");
        textTimein.addItem("1:48PM");
        textTimein.addItem("1:49PM");
        textTimein.addItem("1:50PM");
        textTimein.addItem("1:51PM");
        textTimein.addItem("1:52PM");
        textTimein.addItem("1:53PM");
        textTimein.addItem("1:54PM");
        textTimein.addItem("1:55PM");
        textTimein.addItem("1:56PM");
        textTimein.addItem("1:57PM");
        textTimein.addItem("1:58PM");
        textTimein.addItem("1:59PM");
        textTimein.addItem("2:00PM");
        textTimein.addItem("2:01PM");
        textTimein.addItem("2:02PM");
        textTimein.addItem("2:03PM");
        textTimein.addItem("2:04PM");
        textTimein.addItem("2:05PM");
        textTimein.addItem("2:06PM");
        textTimein.addItem("2:07PM");
        textTimein.addItem("2:08PM");
        textTimein.addItem("2:09PM");
        textTimein.addItem("2:10PM");
        textTimein.addItem("2:11PM");
        textTimein.addItem("2:12PM");
        textTimein.addItem("2:13PM");
        textTimein.addItem("2:14PM");
        textTimein.addItem("2:15PM");
        textTimein.addItem("2:16PM");
        textTimein.addItem("2:17PM");
        textTimein.addItem("2:18PM");
        textTimein.addItem("2:19PM");
        textTimein.addItem("2:20PM");
        textTimein.addItem("2:21PM");
        textTimein.addItem("2:22PM");
        textTimein.addItem("2:23PM");
        textTimein.addItem("2:24PM");
        textTimein.addItem("2:25PM");
        textTimein.addItem("2:26PM");
        textTimein.addItem("2:27PM");
        textTimein.addItem("2:28PM");
        textTimein.addItem("2:29PM");
        textTimein.addItem("2:30PM");
        textTimein.addItem("2:31PM");
        textTimein.addItem("2:32PM");
        textTimein.addItem("2:33PM");
        textTimein.addItem("2:34PM");
        textTimein.addItem("2:35PM");
        textTimein.addItem("2:36PM");
        textTimein.addItem("2:37PM");
        textTimein.addItem("2:38PM");
        textTimein.addItem("2:39PM");
        textTimein.addItem("2:40PM");
        textTimein.addItem("2:41PM");
        textTimein.addItem("2:42PM");
        textTimein.addItem("2:43PM");
        textTimein.addItem("2:44PM");
        textTimein.addItem("2:45PM");
        textTimein.addItem("2:46PM");
        textTimein.addItem("2:47PM");
        textTimein.addItem("2:48PM");
        textTimein.addItem("2:49PM");
        textTimein.addItem("2:50PM");
        textTimein.addItem("2:51PM");
        textTimein.addItem("2:52PM");
        textTimein.addItem("2:53PM");
        textTimein.addItem("2:54PM");
        textTimein.addItem("2:55PM");
        textTimein.addItem("2:56PM");
        textTimein.addItem("2:57PM");
        textTimein.addItem("2:58PM");
        textTimein.addItem("2:59PM");
        textTimein.addItem("3:00PM");
        
        
        
        textTimeout = new JComboBox();
        
        textTimeout.addItem("Select");
        textTimeout.addItem("9:00AM");
        textTimeout.addItem("9:01AM");
        textTimeout.addItem("9:02AM");
        textTimeout.addItem("9:03AM");
        textTimeout.addItem("9:04AM");
        textTimeout.addItem("9:05AM");
        textTimeout.addItem("9:06AM");
        textTimeout.addItem("9:07AM");
        textTimeout.addItem("9:08AM");
        textTimeout.addItem("9:09AM");
        textTimeout.addItem("9:10AM");
        textTimeout.addItem("9:11AM");
        textTimeout.addItem("9:12AM");
        textTimeout.addItem("9:13AM");
        textTimeout.addItem("9:14AM");
        textTimeout.addItem("9:15AM");
        textTimeout.addItem("9:16AM");
        textTimeout.addItem("9:17AM");
        textTimeout.addItem("9:18AM");
        textTimeout.addItem("9:19AM");
        textTimeout.addItem("9:20AM");
        textTimeout.addItem("9:21AM");
        textTimeout.addItem("9:22AM");
        textTimeout.addItem("9:23AM");
        textTimeout.addItem("9:24AM");
        textTimeout.addItem("9:25AM");
        textTimeout.addItem("9:26AM");
        textTimeout.addItem("9:27AM");
        textTimeout.addItem("9:28AM");
        textTimeout.addItem("9:29AM");
        textTimeout.addItem("9:30AM");
        textTimeout.addItem("9:31AM");
        textTimeout.addItem("9:32AM");
        textTimeout.addItem("9:33AM");
        textTimeout.addItem("9:34AM");
        textTimeout.addItem("9:35AM");
        textTimeout.addItem("9:36AM");
        textTimeout.addItem("9:37AM");
        textTimeout.addItem("9:38AM");
        textTimeout.addItem("9:39AM");
        textTimeout.addItem("9:40AM");
        textTimeout.addItem("9:41AM");
        textTimeout.addItem("9:42AM");
        textTimeout.addItem("9:43AM");
        textTimeout.addItem("9:44AM");
        textTimeout.addItem("9:45AM");
        textTimeout.addItem("9:46AM");
        textTimeout.addItem("9:47AM");
        textTimeout.addItem("9:48AM");
        textTimeout.addItem("9:49AM");
        textTimeout.addItem("9:50AM");
        textTimeout.addItem("9:51AM");
        textTimeout.addItem("9:52AM");
        textTimeout.addItem("9:53AM");
        textTimeout.addItem("9:54AM");
        textTimeout.addItem("9:55AM");
        textTimeout.addItem("9:56AM");
        textTimeout.addItem("9:57AM");
        textTimeout.addItem("9:58AM");
        textTimeout.addItem("9:59AM");
        textTimeout.addItem("10:00AM");
        textTimeout.addItem("10:01AM");
        textTimeout.addItem("10:02AM");
        textTimeout.addItem("10:03AM");
        textTimeout.addItem("10:04AM");
        textTimeout.addItem("10:05AM");
        textTimeout.addItem("10:06AM");
        textTimeout.addItem("10:07AM");
        textTimeout.addItem("10:08AM");
        textTimeout.addItem("10:09AM");
        textTimeout.addItem("10:10AM");
        textTimeout.addItem("10:11AM");
        textTimeout.addItem("10:12AM");
        textTimeout.addItem("10:13AM");
        textTimeout.addItem("10:14AM");
        textTimeout.addItem("10:15AM");
        textTimeout.addItem("10:16AM");
        textTimeout.addItem("10:17AM");
        textTimeout.addItem("10:18AM");
        textTimeout.addItem("10:19AM");
        textTimeout.addItem("10:20AM");
        textTimeout.addItem("10:21AM");
        textTimeout.addItem("10:22AM");
        textTimeout.addItem("10:23AM");
        textTimeout.addItem("10:24AM");
        textTimeout.addItem("10:25AM");
        textTimeout.addItem("10:26AM");
        textTimeout.addItem("10:27AM");
        textTimeout.addItem("10:28AM");
        textTimeout.addItem("10:29AM");
        textTimeout.addItem("10:30AM");
        textTimeout.addItem("10:31AM");
        textTimeout.addItem("10:32AM");
        textTimeout.addItem("10:33AM");
        textTimeout.addItem("10:34AM");
        textTimeout.addItem("10:35AM");
        textTimeout.addItem("10:36AM");
        textTimeout.addItem("10:37AM");
        textTimeout.addItem("10:38AM");
        textTimeout.addItem("10:39AM");
        textTimeout.addItem("10:40AM");
        textTimeout.addItem("10:41AM");
        textTimeout.addItem("10:42AM");
        textTimeout.addItem("10:43AM");
        textTimeout.addItem("10:44AM");
        textTimeout.addItem("10:45AM");
        textTimeout.addItem("10:46AM");
        textTimeout.addItem("10:47AM");
        textTimeout.addItem("10:48AM");
        textTimeout.addItem("10:49AM");
        textTimeout.addItem("10:50AM");
        textTimeout.addItem("10:51AM");
        textTimeout.addItem("10:52AM");
        textTimeout.addItem("10:53AM");
        textTimeout.addItem("10:54AM");
        textTimeout.addItem("10:55AM");
        textTimeout.addItem("10:56AM");
        textTimeout.addItem("10:57AM");
        textTimeout.addItem("10:58AM");
        textTimeout.addItem("10:59AM");
        textTimeout.addItem("11:00AM");
        textTimeout.addItem("11:01AM");
        textTimeout.addItem("11:02AM");
        textTimeout.addItem("11:03AM");
        textTimeout.addItem("11:04AM");
        textTimeout.addItem("11:05AM");
        textTimeout.addItem("11:06AM");
        textTimeout.addItem("11:07AM");
        textTimeout.addItem("11:08AM");
        textTimeout.addItem("11:09AM");
        textTimeout.addItem("11:10AM");
        textTimeout.addItem("11:11AM");
        textTimeout.addItem("11:12AM");
        textTimeout.addItem("11:13AM");
        textTimeout.addItem("11:14AM");
        textTimeout.addItem("11:15AM");
        textTimeout.addItem("11:16AM");
        textTimeout.addItem("11:17AM");
        textTimeout.addItem("11:18AM");
        textTimeout.addItem("11:19AM");
        textTimeout.addItem("11:20AM");
        textTimeout.addItem("11:21AM");
        textTimeout.addItem("11:22AM");
        textTimeout.addItem("11:23AM");
        textTimeout.addItem("11:24AM");
        textTimeout.addItem("11:25AM");
        textTimeout.addItem("11:26AM");
        textTimeout.addItem("11:27AM");
        textTimeout.addItem("11:28AM");
        textTimeout.addItem("11:29AM");
        textTimeout.addItem("11:30AM");
        textTimeout.addItem("11:31AM");
        textTimeout.addItem("11:32AM");
        textTimeout.addItem("11:33AM");
        textTimeout.addItem("11:34AM");
        textTimeout.addItem("11:35AM");
        textTimeout.addItem("11:36AM");
        textTimeout.addItem("11:37AM");
        textTimeout.addItem("11:38AM");
        textTimeout.addItem("11:39AM");
        textTimeout.addItem("11:40AM");
        textTimeout.addItem("11:41AM");
        textTimeout.addItem("11:42AM");
        textTimeout.addItem("11:43AM");
        textTimeout.addItem("11:44AM");
        textTimeout.addItem("11:45AM");
        textTimeout.addItem("11:46AM");
        textTimeout.addItem("11:47AM");
        textTimeout.addItem("11:48AM");
        textTimeout.addItem("11:49AM");
        textTimeout.addItem("11:50AM");
        textTimeout.addItem("11:51AM");
        textTimeout.addItem("11:52AM");
        textTimeout.addItem("11:53AM");
        textTimeout.addItem("11:54AM");
        textTimeout.addItem("11:55AM");
        textTimeout.addItem("11:56AM");
        textTimeout.addItem("11:57AM");
        textTimeout.addItem("11:58AM");
        textTimeout.addItem("11:59AM");
        textTimeout.addItem("1:00PM");
        textTimeout.addItem("1:01PM");
        textTimeout.addItem("1:02PM");
        textTimeout.addItem("1:03PM");
        textTimeout.addItem("1:04PM");
        textTimeout.addItem("1:05PM");
        textTimeout.addItem("1:06PM");
        textTimeout.addItem("1:07PM");
        textTimeout.addItem("1:08PM");
        textTimeout.addItem("1:09PM");
        textTimeout.addItem("1:10PM");
        textTimeout.addItem("1:11PM");
        textTimeout.addItem("1:12PM");
        textTimeout.addItem("1:13PM");
        textTimeout.addItem("1:14PM");
        textTimeout.addItem("1:15PM");
        textTimeout.addItem("1:16PM");
        textTimeout.addItem("1:17PM");
        textTimeout.addItem("1:18PM");
        textTimeout.addItem("1:19PM");
        textTimeout.addItem("1:20PM");
        textTimeout.addItem("1:21PM");
        textTimeout.addItem("1:22PM");
        textTimeout.addItem("1:23PM");
        textTimeout.addItem("1:24PM");
        textTimeout.addItem("1:25PM");
        textTimeout.addItem("1:26PM");
        textTimeout.addItem("1:27PM");
        textTimeout.addItem("1:28PM");
        textTimeout.addItem("1:29PM");
        textTimeout.addItem("1:30PM");
        textTimeout.addItem("1:31PM");
        textTimeout.addItem("1:32PM");
        textTimeout.addItem("1:33PM");
        textTimeout.addItem("1:34PM");
        textTimeout.addItem("1:35PM");
        textTimeout.addItem("1:36PM");
        textTimeout.addItem("1:37PM");
        textTimeout.addItem("1:38PM");
        textTimeout.addItem("1:39PM");
        textTimeout.addItem("1:40PM");
        textTimeout.addItem("1:41PM");
        textTimeout.addItem("1:42PM");
        textTimeout.addItem("1:43PM");
        textTimeout.addItem("1:44PM");
        textTimeout.addItem("1:45PM");
        textTimeout.addItem("1:46PM");
        textTimeout.addItem("1:47PM");
        textTimeout.addItem("1:48PM");
        textTimeout.addItem("1:49PM");
        textTimeout.addItem("1:50PM");
        textTimeout.addItem("1:51PM");
        textTimeout.addItem("1:52PM");
        textTimeout.addItem("1:53PM");
        textTimeout.addItem("1:54PM");
        textTimeout.addItem("1:55PM");
        textTimeout.addItem("1:56PM");
        textTimeout.addItem("1:57PM");
        textTimeout.addItem("1:58PM");
        textTimeout.addItem("1:59PM");
        textTimeout.addItem("2:00PM");
        textTimeout.addItem("2:01PM");
        textTimeout.addItem("2:02PM");
        textTimeout.addItem("2:03PM");
        textTimeout.addItem("2:04PM");
        textTimeout.addItem("2:05PM");
        textTimeout.addItem("2:06PM");
        textTimeout.addItem("2:07PM");
        textTimeout.addItem("2:08PM");
        textTimeout.addItem("2:09PM");
        textTimeout.addItem("2:10PM");
        textTimeout.addItem("2:11PM");
        textTimeout.addItem("2:12PM");
        textTimeout.addItem("2:13PM");
        textTimeout.addItem("2:14PM");
        textTimeout.addItem("2:15PM");
        textTimeout.addItem("2:16PM");
        textTimeout.addItem("2:17PM");
        textTimeout.addItem("2:18PM");
        textTimeout.addItem("2:19PM");
        textTimeout.addItem("2:20PM");
        textTimeout.addItem("2:21PM");
        textTimeout.addItem("2:22PM");
        textTimeout.addItem("2:23PM");
        textTimeout.addItem("2:24PM");
        textTimeout.addItem("2:25PM");
        textTimeout.addItem("2:26PM");
        textTimeout.addItem("2:27PM");
        textTimeout.addItem("2:28PM");
        textTimeout.addItem("2:29PM");
        textTimeout.addItem("2:30PM");
        textTimeout.addItem("2:31PM");
        textTimeout.addItem("2:32PM");
        textTimeout.addItem("2:33PM");
        textTimeout.addItem("2:34PM");
        textTimeout.addItem("2:35PM");
        textTimeout.addItem("2:36PM");
        textTimeout.addItem("2:37PM");
        textTimeout.addItem("2:38PM");
        textTimeout.addItem("2:39PM");
        textTimeout.addItem("2:40PM");
        textTimeout.addItem("2:41PM");
        textTimeout.addItem("2:42PM");
        textTimeout.addItem("2:43PM");
        textTimeout.addItem("2:44PM");
        textTimeout.addItem("2:45PM");
        textTimeout.addItem("2:46PM");
        textTimeout.addItem("2:47PM");
        textTimeout.addItem("2:48PM");
        textTimeout.addItem("2:49PM");
        textTimeout.addItem("2:50PM");
        textTimeout.addItem("2:51PM");
        textTimeout.addItem("2:52PM");
        textTimeout.addItem("2:53PM");
        textTimeout.addItem("2:54PM");
        textTimeout.addItem("2:55PM");
        textTimeout.addItem("2:56PM");
        textTimeout.addItem("2:57PM");
        textTimeout.addItem("2:58PM");
        textTimeout.addItem("2:59PM");
        textTimeout.addItem("3:00PM");
        textTimeout.addItem("3:01PM");
        textRoom.setBounds(150, 320, 100, 25);
        
        textBusinessDate.setBounds(150, 400, 100, 25);
        textTimein.setBounds(150, 440, 100, 25);
        textTimeout.setBounds(150, 480, 100, 25);
        
        
    
        
        ComRmStatus = new JComboBox();
        ComRmStatus.addItem("Select");
        ComRmStatus.addItem("Clean");
        ComRmStatus.addItem("Dirty");
        
        
        if (ComRmStatus.equals("Clean"))
        {
           ComRmStatus.setForeground(Color.RED);
        }
      else if (ComRmStatus.equals("Dirty"))
        {
           ComRmStatus.setForeground(Color.YELLOW);
        }
        
        
       
        //text.setFont(combo.getFont());
//        if (ComRmStatus.equals("Clean"))
//        {
//            ComRmStatus.set
//            
//        }
////        else
//        {
//            ComRmStatus.setBackground(Color.RED);
//            
//        }
        
        
        
        ComRmStatus.setBounds(150, 360, 100, 25);
        
        txtID = new JTextField();
        txtName = new JTextField();
        
        Female =new JRadioButton("Female");
        Male = new JRadioButton("Male");
        
        Gender  = new ButtonGroup();
        Gender.add(Female);
        Gender.add(Male);
        
        txtID.setBounds(150, 220, 100, 25);
        txtName.setBounds(150, 250, 150, 25);
        Female.setBounds(150, 280, 100, 25);
        Male.setBounds(250, 280, 100, 25);
        
        textSearch = new JTextField();
        textSearch.setBounds(610, 240, 100, 25);
        
        // create JButtons
         btnAdd = new JButton("Add");
         btnDelete = new JButton("Delete");
         btnUpdate = new JButton("Update");
         btnSearch = new JButton("Search"); 
         btnBack = new JButton("Back") ;
         btnExit = new JButton ("Exit");
         btnSave = new  JButton ("Save");
        
        btnAdd.setBounds(370, 220, 100, 25);
        btnUpdate.setBounds(370, 265, 100, 25);
        btnDelete.setBounds(370, 310, 100, 25);
        
        btnSearch.setBounds(750, 240, 100, 25);
        btnSave.setBounds(620, 410, 100, 25);
        btnBack.setBounds(620, 450, 100, 25);
        btnExit.setBounds(620, 490, 100, 25);
       
        
        // create JScrollPane
        pane = new JScrollPane(tableHK);
        pane.setBounds(0, 0, 880, 200);
        
        
        frameHK.setLayout(null);
        
        // add JTextField to the jframe
         frameHK.add(pane);
        
        // add JLabel to the jframe
        frameHK.add(labID);
        frameHK.add(labName);
        frameHK.add(labGender);
        frameHK.add(labRoom);
        frameHK.add(labRmStatus);
        frameHK.add(labBusinessDate);
        frameHK.add(labTimein);
        frameHK.add(labTimeout);
        frameHK.add(labSearch);
        
         // add JTextField to the jframe
         frameHK.add(txtID);
         frameHK.add(txtName);
         frameHK.add(Female);
         frameHK.add(Male);
        frameHK.add(textRoom);
        frameHK.add(textBusinessDate);
        frameHK.add(textTimein);
        frameHK.add(textTimeout);
        frameHK.add(textSearch);
        
        // add JComboBox to the jframe
        frameHK.add(ComRmStatus);
        
         // add JButton to the jframe
        frameHK.add(btnAdd);
        frameHK.add(btnDelete);
        frameHK.add(btnUpdate);
        frameHK.add(btnSearch);
        frameHK.add(btnBack);
        frameHK.add(btnExit);
        frameHK.add(btnSave);
        
        // create an array of objects to set the row data
        final Object []row = new Object[8];
        
         // button add row
         btnAdd.addActionListener(new ActionListener() 
         {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
             SimpleDateFormat myFormat = new SimpleDateFormat("HH:mm");
             
                    String StringTimein = (String) textTimein.getSelectedItem();
	            String StringTimeout = (String) textTimeout.getSelectedItem();
                    String ConstTimein = "8:59AM";
                    String ConstTimeout = "3:01AM";
                    

	 try {

             
	       Date Timein = myFormat.parse(StringTimein);
	       Date Timeout = myFormat.parse(StringTimeout);
               Date TimeinClean = myFormat.parse(ConstTimein);
	       Date TimeoutClean = myFormat.parse(ConstTimeout);
               
	       
               if (Timeout.before(Timein))
               {
                   JOptionPane.showMessageDialog(null,"Error: Time out of clean before time in of clean","Wrong",JOptionPane.ERROR_MESSAGE);
                   
                   
                   
               }
               else if (Timein.before(TimeinClean))
               {
                         JOptionPane.showMessageDialog(null,"Error: Time in of clean before time in hotel and Time out of clean before time out hotel","Wrong",JOptionPane.ERROR_MESSAGE);  
               }
               else if (Timeout.before(TimeoutClean))
               {
                   JOptionPane.showMessageDialog(null,"Error: Time out of clean before time out hotel","Wrong",JOptionPane.ERROR_MESSAGE);  
               }
               else
               {
                    
                    row[6]=textTimein.getSelectedItem();
                    row[7]=textTimeout.getSelectedItem();
               }
               
	 }
         catch (Exception e) 
         {
	       
	 }
                
                Object id = txtID.getText();
                Object name = txtName.getText();
                Object OFemale = Female.getText();
                Object OMale = Male.getText();
                Object OtextRoom = textRoom.getText();
                Object OComRmStatus = ComRmStatus.getSelectedItem();
                Object OtextBusinessDate = textBusinessDate.getText();
                Object OtextTimein = textTimein.getSelectedItem();
                Object OtextTimeout = textTimeout.getSelectedItem();
                
                Object n = "";
                
                if( !id.equals(n) && !name.equals(n) && !OFemale.equals(n) && !OMale.equals(n)
                        && !OtextRoom.equals(n) && !OComRmStatus.equals(n) && !OtextBusinessDate.equals(n)
                        && !OtextTimein.equals(n)&& !OtextTimeout.equals(n))
                    {
                    row[0]=txtID.getText();
                row[1]=txtName.getText();
                
                if (Female.isSelected())
                {
                    row[2] = Female.getText();
                }
                else
                {
                    row[2]=Male.getText();
                }
                
                row[3]=textRoom.getText();
                row[4]=ComRmStatus.getSelectedItem();
                row[5]=textBusinessDate.getText();
                row[6]=textTimein.getSelectedItem();
                row[7]=textTimeout.getSelectedItem();
                    
                //add row to the model
                modelHK.addRow(row);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Add Error","error",JOptionPane.ERROR_MESSAGE);
                }
                    
                
            }
        } );
         
         
         btnDelete.addActionListener(new ActionListener() 
         {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                // i = the index of the selected row
                int i = tableHK.getSelectedRow();
                
               if(i >=0)
               {
                   modelHK.removeRow(i);
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "Delete Error", "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
        });
         
         
         btnUpdate.addActionListener(new ActionListener() 
         {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                // i = the index of the selected row
                int i = tableHK.getSelectedRow();
                
                if (i>=0)
                {
                    modelHK.setValueAt(txtID.getText(), i, 0);
                    modelHK.setValueAt(txtName.getText(), i, 1);
                    if (Female.isSelected())
                {
                    modelHK.setValueAt(Female.getText(), i, 2);
                }
                else
                {
                    modelHK.setValueAt(Male.getText(), i, 2);
                }
                    

                     
                    modelHK.setValueAt(textRoom.getText(), i, 3);
                    modelHK.setValueAt(ComRmStatus.getSelectedItem(), i, 4);
                    modelHK.setValueAt(textBusinessDate.getText(), i, 5);
                    modelHK.setValueAt(textTimein.getSelectedItem(), i, 6);
                    modelHK.setValueAt(textTimeout.getSelectedItem(), i, 7);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Error Update", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
         
         // get selected row data From table to textfields 
         
         tableHK.addMouseListener(new MouseAdapter() 
         {
        
        @Override
        public void mouseClicked(MouseEvent e)
        {
            
            // i = the index of the selected row
            int i = tableHK.getSelectedRow();
            
            txtID.setText(modelHK.getValueAt(i, 0).toString());
            txtName.setText(modelHK.getValueAt(i, 1).toString());
              if (Female.isSelected())
                {
                    Female.setText(modelHK.getValueAt(i, 2).toString());
                }
                else
                {
                    Male.setText(modelHK.getValueAt(i, 2).toString());
                }
            
            
            textRoom.setText(modelHK.getValueAt(i, 3).toString());
            ComRmStatus.setSelectedItem(modelHK.getValueAt(i, 4).toString());
            textBusinessDate.setText(modelHK.getValueAt(i, 5).toString());
            textTimein.setSelectedItem(modelHK.getValueAt(i, 6).toString());
            textTimeout.setSelectedItem(modelHK.getValueAt(i, 7).toString());
            
        
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
                    for(int i=0 ; i<tableHK.getRowCount() ;i++)
                    {
                        Object idnum = tableHK.getValueAt(i, 0);
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
                    
                    frameHK.setVisible(false);
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
        
txtID.addActionListener(new SaveID());
txtName.addActionListener(new SaveName());
Female.addActionListener(new SaveFemale());
Male.addActionListener(new SaveMale());
textRoom.addActionListener(new SaveRoom());
ComRmStatus.addActionListener(new SaveRmStatus());
textBusinessDate.addActionListener(new SaveBusinessDate());
textTimein.addActionListener(new SaveTimein());
textTimeout.addActionListener(new SaveTimeout());




btnSave.addActionListener(new Save());

                 frameHK.setSize(900, 700);
                 frameHK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameHK.setVisible(true);

      }   
       private class SaveID implements ActionListener 
       {

             @Override
	     public void actionPerformed(ActionEvent arg0) 
             {
                CHK.ID=txtID.getText();
        
	     }
      }
       private class SaveName implements ActionListener 
       {

        @Override
	public void actionPerformed(ActionEvent arg0) 
        {
            CHK.Name= txtName.getText();
        
	}
      }
      private class SaveFemale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.Female=Female.getText();
        
	}
}
      private class SaveMale implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.Male= Male.getText();
        
	}
}
      private class SaveRoom implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.Room= textRoom.getText();
        
	}
}
  private class SaveRmStatus implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.RmStatus=(String) ComRmStatus.getSelectedItem();
        
	}
}
       private class SaveBusinessDate implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.BusinessDate=textBusinessDate.getText();
        
	}
	}
         private class SaveTimein implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.Timein=(String) textTimein.getSelectedItem();
        
	}
	}
          private class SaveTimeout implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CHK.Timeout=(String) textTimeout.getSelectedItem();
        
	}
	}
          
private class Save implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
                ObjectOutputStream bin = null;
            try {
                Contact_of_House_Keeping.add(CHK);
                bin = new ObjectOutputStream(new FileOutputStream("HouseKeeping.bin"));
                bin.writeObject(Contact_of_House_Keeping.add(CHK));
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
