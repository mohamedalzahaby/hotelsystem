package Hotelsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class SpaSecFrame extends JFrame 
{
    private final int price_One_Hour =10;
    private final int price_Two_Hour =15;
    private final int price_Three_Hour =20;
    private final int price_Four_Hour = 25;
    private final int price_Five_Hour =30;
    private final int price_Six_Hour =35;
    private final int price_Seven_Hour =40;
    private final int price_Eight_Hour = 45;
    private final int price_Nine_Hour = 50;
    private final int price_Ten_Hour = 55;
    private final int price_elven_Hour =60;
    private final int price_twelve_Hour =65;
    private final int price_thirteen_Hour =75;
    private final int price_Fourteen_Hour = 85;
    private final int price_Fiveteen_Hour =90;
    private final int price_Sixteen_Hour =95;
    private final int price_Seventeen_Hour =100;
    private final int price_Eightteen_Hour = 150;
    private final int price_Nineteen_Hour = 200;
    private final int price_Twenty_Hour = 250;
    private final int price_TwentyOne_Hour = 300;
    private final int price_TwentyTwo_Hour = 350;
    private final int price_TwentyThree_Hour = 400;
    private final int price_TwentyFour_Hour = 450;
    
    JFrame frameSP;
    
    JTable tableSP;
    
    JLabel labDate;
    JLabel labTime;
    JLabel labHours;
    JLabel labCost;
    
    JTextField txtDate;
    JTextField txtCost;
    
    
    
    JComboBox ComDayIN;
    JComboBox ComMonthIN;
    JComboBox ComYearIN;
    JComboBox ComTime;
    
    
    ButtonGroup Hour;
    JRadioButton One_Hour;
    JRadioButton Two_Hour;
    JRadioButton Three_Hour;
    JRadioButton Four_Hour;
    JRadioButton Five_Hour;
    JRadioButton Six_Hour;
    JRadioButton Seven_Hour;
    JRadioButton Eight_Hour;
    JRadioButton Nine_Hour;
    JRadioButton Ten_Hour;
    JRadioButton elven_Hour;
    JRadioButton twelve_Hour;
    JRadioButton thirteen_Hour;
    JRadioButton Fourteen_Hour;
    JRadioButton Fiveteen_Hour;
    JRadioButton Sixteen_Hour;
    JRadioButton Seventeen_Hour;
    JRadioButton Eightteen_Hour;
    JRadioButton Nineteen_Hour;
    JRadioButton Twenty_Hour;
    JRadioButton TwentyOne_Hour;
    JRadioButton TwentyTwo_Hour;
    JRadioButton TwentyThree_Hour;
    JRadioButton TwentyFour_Hour;
    
    
    JButton btnDate;
    JButton btnCost;
    JButton btnAdd;
    JButton btnDelete;
    JButton btnUpdate;
    JButton btnBack;
    JButton btnExit;
    JButton btnSave;
    
      static  ArrayList <Contant_of_Spa> Contant_of_Spa = new ArrayList<>();
        Contant_of_Spa CSP=new Contant_of_Spa(); 
    public SpaSecFrame() throws IOException
    {
           frameSP = new JFrame("Spa");
           BufferedImage myImage = ImageIO.read(new File("E:\\OLa\\Data Structures\\eid-mubarak-3.jpg"));
        
           frameSP.setContentPane(new ImagePanel(myImage));
           
           tableSP = new JTable();
     
    // create a table model and set a Column Identifiers to this model
    Object [] columnsG = {"Date","Time" , "Hours","Cost"};
    final DefaultTableModel modelG = new DefaultTableModel();
    modelG.setColumnIdentifiers(columnsG);
    
    
    // set the model to the table
        tableSP.setModel(modelG);
        Container x = tableSP.getTableHeader();

        x.setBackground(Color.BLUE);
       
             tableSP.setBackground(Color.YELLOW);
            labDate = new JLabel("Date: ");
            labTime = new JLabel("Time: ");
            labHours = new JLabel("Hours: ");
            labCost = new JLabel("Cost: ");

             labDate.setBounds(5, 220, 100, 25);
             labTime.setBounds(5, 270, 150, 25);
             labHours.setBounds(5, 330, 150, 25);
             labCost.setBounds(5, 600, 50, 25);
             
             
             txtDate=new JTextField(); 
             txtDate.setBounds(550, 220, 100, 25);
             
             txtCost=new JTextField();
             txtCost.setBounds(250, 600, 100, 25); 
             
             btnDate = new JButton("Date"); 
             btnDate.setBounds(400, 220, 100, 25);
             
              btnCost = new JButton("Cost"); 
              btnCost.setBounds(100, 600, 100, 25);
           
               btnAdd = new JButton("Add");
              btnAdd.setBounds(700, 265, 100, 25);
            
              btnAdd = new JButton("Add");
             btnDelete = new JButton("Delete");
             btnUpdate = new JButton("Update");   
             btnBack = new JButton("Back") ;
         btnExit = new JButton ("Exit");
        btnSave = new  JButton ("Save");
            
       
        btnAdd.setBounds(700, 265, 100, 25);
        btnUpdate.setBounds(700, 300, 100, 25);
        btnDelete.setBounds(700, 340, 100, 25);
        btnSave.setBounds(620, 510, 100, 25);
        btnBack.setBounds(620, 550, 100, 25);
        btnExit.setBounds(620, 590, 100, 25);
            
             
             ComDayIN = new JComboBox();
             ComDayIN.addItem("Day");
             ComDayIN.addItem("1");
             ComDayIN.addItem("2");
             ComDayIN.addItem("3");
             ComDayIN.addItem("4");
             ComDayIN.addItem("5");
             ComDayIN.addItem("6");
             ComDayIN.addItem("7");
             ComDayIN.addItem("8");
             ComDayIN.addItem("9");
             ComDayIN.addItem("10");
             ComDayIN.addItem("11");
             ComDayIN.addItem("12");
             ComDayIN.addItem("13");
             ComDayIN.addItem("14");
             ComDayIN.addItem("15");
             ComDayIN.addItem("16");
             ComDayIN.addItem("17");
             ComDayIN.addItem("18");
             ComDayIN.addItem("19");
             ComDayIN.addItem("20");
             ComDayIN.addItem("21");
             ComDayIN.addItem("22");
             ComDayIN.addItem("23");
             ComDayIN.addItem("24");
             ComDayIN.addItem("25");
             ComDayIN.addItem("26");
             ComDayIN.addItem("27");
             ComDayIN.addItem("28");
             ComDayIN.addItem("29");
             ComDayIN.addItem("30");
             ComDayIN.addItem("31");
             
             ComDayIN.setBounds(100, 220, 50, 25); 
            
             ComMonthIN= new JComboBox();
             ComMonthIN.addItem("Month");
             ComMonthIN.addItem("1");
             ComMonthIN.addItem("2");
             ComMonthIN.addItem("3");
             ComMonthIN.addItem("4");
             ComMonthIN.addItem("5");
             ComMonthIN.addItem("6");
             ComMonthIN.addItem("7");
             ComMonthIN.addItem("8");
             ComMonthIN.addItem("9");
             ComMonthIN.addItem("10");
             ComMonthIN.addItem("11");
             ComMonthIN.addItem("12");
             
             ComMonthIN.setBounds(160, 220, 100, 25); 
             
             
             ComYearIN = new JComboBox();
             ComYearIN.addItem("Year");
             ComYearIN.addItem("2016");
             ComYearIN.addItem("2017");
             ComYearIN.addItem("2018");
             ComYearIN.addItem("2020");
             ComYearIN.addItem("2021");
             ComYearIN.addItem("2022");
             ComYearIN.addItem("2023");
             ComYearIN.addItem("2024");
             ComYearIN.addItem("2025");
             ComYearIN.addItem("2026");
             ComYearIN.addItem("2027");
             ComYearIN.addItem("2028");
             ComYearIN.addItem("2029");
             ComYearIN.addItem("2030");
             ComYearIN.addItem("2031");
             ComYearIN.addItem("2032");
             ComYearIN.addItem("2033");
             ComYearIN.addItem("2034");
             ComYearIN.addItem("2035");
             ComYearIN.addItem("2036");
             ComYearIN.addItem("2037");
             ComYearIN.addItem("2038");
             ComYearIN.addItem("2039");
             ComYearIN.addItem("2040");
             ComYearIN.addItem("2041");
             ComYearIN.addItem("2042");
             ComYearIN.addItem("2043");
             ComYearIN.addItem("2044");
             ComYearIN.addItem("2045");
             ComYearIN.addItem("2046");
             ComYearIN.addItem("2047");
             ComYearIN.addItem("2048");
             ComYearIN.addItem("2049");
             ComYearIN.addItem("2050");
             ComYearIN.addItem("2051");
             ComYearIN.addItem("2052");
             ComYearIN.addItem("2053");
             ComYearIN.addItem("2054");
             ComYearIN.addItem("2055");
             ComYearIN.addItem("2056");
             ComYearIN.addItem("2057");
             ComYearIN.addItem("2058");
             ComYearIN.addItem("2059");
             ComYearIN.addItem("2060");
             
             
            ComYearIN.setBounds(270, 220, 100, 25);
            
            ComTime = new JComboBox();
        
        ComTime.addItem("Select");
      
        ComTime.addItem("1:00AM");
        ComTime.addItem("1:01AM");
        ComTime.addItem("1:02AM");
        ComTime.addItem("1:03AM");
        ComTime.addItem("1:04AM");
        ComTime.addItem("1:05AM");
        ComTime.addItem("1:06AM");
        ComTime.addItem("1:07AM");
        ComTime.addItem("1:08AM");
        ComTime.addItem("1:09AM");
        ComTime.addItem("1:10AM");
        ComTime.addItem("1:11AM");
        ComTime.addItem("1:12AM");
        ComTime.addItem("1:13AM");
        ComTime.addItem("1:14AM");
        ComTime.addItem("1:15AM");
        ComTime.addItem("1:16AM");
        ComTime.addItem("1:17AM");
        ComTime.addItem("1:18AM");
        ComTime.addItem("1:19AM");
        ComTime.addItem("1:20AM");
        ComTime.addItem("1:21AM");
        ComTime.addItem("1:22AM");
        ComTime.addItem("1:23AM");
        ComTime.addItem("1:24AM");
        ComTime.addItem("1:25AM");
        ComTime.addItem("1:26AM");
        ComTime.addItem("1:27AM");
        ComTime.addItem("1:28AM");
        ComTime.addItem("1:29AM");
        ComTime.addItem("1:30AM");
        ComTime.addItem("1:31AM");
        ComTime.addItem("1:32AM");
        ComTime.addItem("1:33AM");
        ComTime.addItem("1:34AM");
        ComTime.addItem("1:35AM");
        ComTime.addItem("1:36AM");
        ComTime.addItem("1:37AM");
        ComTime.addItem("1:38AM");
        ComTime.addItem("1:39AM");
        ComTime.addItem("1:40AM");
        ComTime.addItem("1:41AM");
        ComTime.addItem("1:42AM");
        ComTime.addItem("1:43AM");
        ComTime.addItem("1:44AM");
        ComTime.addItem("1:45AM");
        ComTime.addItem("1:46AM");
        ComTime.addItem("1:47AM");
        ComTime.addItem("1:48AM");
        ComTime.addItem("1:49AM");
        ComTime.addItem("1:50AM");
        ComTime.addItem("1:51AM");
        ComTime.addItem("1:52AM");
        ComTime.addItem("1:53AM");
        ComTime.addItem("1:54AM");
        ComTime.addItem("1:55AM");
        ComTime.addItem("1:56AM");
        ComTime.addItem("1:57AM");
        ComTime.addItem("1:58AM");
        ComTime.addItem("1:59AM");
        ComTime.addItem("2:00AM");
        ComTime.addItem("2:01AM");
        ComTime.addItem("2:02AM");
        ComTime.addItem("2:03AM");
        ComTime.addItem("2:04AM");
        ComTime.addItem("2:05AM");
        ComTime.addItem("2:06AM");
        ComTime.addItem("2:07AM");
        ComTime.addItem("2:08AM");
        ComTime.addItem("2:09AM");
        ComTime.addItem("2:10AM");
        ComTime.addItem("2:11AM");
        ComTime.addItem("2:12AM");
        ComTime.addItem("2:13AM");
        ComTime.addItem("2:14AM");
        ComTime.addItem("2:15AM");
        ComTime.addItem("2:16AM");
        ComTime.addItem("2:17AM");
        ComTime.addItem("2:18AM");
        ComTime.addItem("2:19AM");
        ComTime.addItem("2:20AM");
        ComTime.addItem("2:21AM");
        ComTime.addItem("2:22AM");
        ComTime.addItem("2:23AM");
        ComTime.addItem("2:24AM");
        ComTime.addItem("2:25AM");
        ComTime.addItem("2:26AM");
        ComTime.addItem("2:27AM");
        ComTime.addItem("2:28AM");
        ComTime.addItem("2:29AM");
        ComTime.addItem("2:30AM");
        ComTime.addItem("2:31AM");
        ComTime.addItem("2:32AM");
        ComTime.addItem("2:33AM");
        ComTime.addItem("2:34AM");
        ComTime.addItem("2:35AM");
        ComTime.addItem("2:36AM");
        ComTime.addItem("2:37AM");
        ComTime.addItem("2:38AM");
        ComTime.addItem("2:39AM");
        ComTime.addItem("2:40AM");
        ComTime.addItem("2:41AM");
        ComTime.addItem("2:42AM");
        ComTime.addItem("2:43AM");
        ComTime.addItem("2:44AM");
        ComTime.addItem("2:45AM");
        ComTime.addItem("2:46AM");
        ComTime.addItem("2:47AM");
        ComTime.addItem("2:48AM");
        ComTime.addItem("2:49AM");
        ComTime.addItem("2:50AM");
        ComTime.addItem("2:51AM");
        ComTime.addItem("2:52AM");
        ComTime.addItem("2:53AM");
        ComTime.addItem("2:54AM");
        ComTime.addItem("2:55AM");
        ComTime.addItem("2:56AM");
        ComTime.addItem("2:57AM");
        ComTime.addItem("2:58AM");
        ComTime.addItem("2:59AM");
        ComTime.addItem("3:00AM");
        ComTime.addItem("3:01AM");
        ComTime.addItem("3:02AM");
        ComTime.addItem("3:03AM");
        ComTime.addItem("3:04AM");
        ComTime.addItem("3:05AM");
        ComTime.addItem("3:06AM");
        ComTime.addItem("3:07AM");
        ComTime.addItem("3:08AM");
        ComTime.addItem("3:09AM");
        ComTime.addItem("3:10AM");
        ComTime.addItem("3:11AM");
        ComTime.addItem("3:12AM");
        ComTime.addItem("3:13AM");
        ComTime.addItem("3:14AM");
        ComTime.addItem("3:15AM");
        ComTime.addItem("3:16AM");
        ComTime.addItem("3:17AM");
        ComTime.addItem("3:18AM");
        ComTime.addItem("3:19AM");
        ComTime.addItem("3:20AM");
        ComTime.addItem("3:21AM");
        ComTime.addItem("3:22AM");
        ComTime.addItem("3:23AM");
        ComTime.addItem("3:24AM");
        ComTime.addItem("3:25AM");
        ComTime.addItem("3:26AM");
        ComTime.addItem("3:27AM");
        ComTime.addItem("3:28AM");
        ComTime.addItem("3:29AM");
        ComTime.addItem("3:30AM");
        ComTime.addItem("3:31AM");
        ComTime.addItem("3:32AM");
        ComTime.addItem("3:33AM");
        ComTime.addItem("3:34AM");
        ComTime.addItem("3:35AM");
        ComTime.addItem("3:36AM");
        ComTime.addItem("3:37AM");
        ComTime.addItem("3:38AM");
        ComTime.addItem("3:39AM");
        ComTime.addItem("3:40AM");
        ComTime.addItem("3:41AM");
        ComTime.addItem("3:42AM");
        ComTime.addItem("3:43AM");
        ComTime.addItem("3:44AM");
        ComTime.addItem("3:45AM");
        ComTime.addItem("3:46AM");
        ComTime.addItem("3:47AM");
        ComTime.addItem("3:48AM");
        ComTime.addItem("3:49AM");
        ComTime.addItem("3:50AM");
        ComTime.addItem("3:51AM");
        ComTime.addItem("3:52AM");
        ComTime.addItem("3:53AM");
        ComTime.addItem("3:54AM");
        ComTime.addItem("3:55AM");
        ComTime.addItem("3:56AM");
        ComTime.addItem("3:57AM");
        ComTime.addItem("3:58AM");
        ComTime.addItem("3:59AM");
        ComTime.addItem("4:00AM");
        ComTime.addItem("4:01AM");
        ComTime.addItem("4:02AM");
        ComTime.addItem("4:03AM");
        ComTime.addItem("4:04AM");
        ComTime.addItem("4:05AM");
        ComTime.addItem("4:06AM");
        ComTime.addItem("4:07AM");
        ComTime.addItem("4:08AM");
        ComTime.addItem("4:09AM");
        ComTime.addItem("4:10AM");
        ComTime.addItem("4:11AM");
        ComTime.addItem("4:12AM");
        ComTime.addItem("4:13AM");
        ComTime.addItem("4:14AM");
        ComTime.addItem("4:15AM");
        ComTime.addItem("4:16AM");
        ComTime.addItem("4:17AM");
        ComTime.addItem("4:18AM");
        ComTime.addItem("4:19AM");
        ComTime.addItem("4:20AM");
        ComTime.addItem("4:21AM");
        ComTime.addItem("4:22AM");
        ComTime.addItem("4:23AM");
        ComTime.addItem("4:24AM");
        ComTime.addItem("4:25AM");
        ComTime.addItem("4:26AM");
        ComTime.addItem("4:27AM");
        ComTime.addItem("4:28AM");
        ComTime.addItem("4:29AM");
        ComTime.addItem("4:30AM");
        ComTime.addItem("4:31AM");
        ComTime.addItem("4:32AM");
        ComTime.addItem("4:33AM");
        ComTime.addItem("4:34AM");
        ComTime.addItem("4:35AM");
        ComTime.addItem("4:36AM");
        ComTime.addItem("4:37AM");
        ComTime.addItem("4:38AM");
        ComTime.addItem("4:39AM");
        ComTime.addItem("4:40AM");
        ComTime.addItem("4:41AM");
        ComTime.addItem("4:42AM");
        ComTime.addItem("4:43AM");
        ComTime.addItem("4:44AM");
        ComTime.addItem("4:45AM");
        ComTime.addItem("4:46AM");
        ComTime.addItem("4:47AM");
        ComTime.addItem("4:48AM");
        ComTime.addItem("4:49AM");
        ComTime.addItem("4:50AM");
        ComTime.addItem("4:51AM");
        ComTime.addItem("4:52AM");
        ComTime.addItem("4:53AM");
        ComTime.addItem("4:54AM");
        ComTime.addItem("4:55AM");
        ComTime.addItem("4:56AM");
        ComTime.addItem("4:57AM");
        ComTime.addItem("4:58AM");
        ComTime.addItem("4:59AM");
        ComTime.addItem("5:00AM");
        ComTime.addItem("5:01AM");
        ComTime.addItem("5:02AM");
        ComTime.addItem("5:03AM");
        ComTime.addItem("5:04AM");
        ComTime.addItem("5:05AM");
        ComTime.addItem("5:06AM");
        ComTime.addItem("5:07AM");
        ComTime.addItem("5:08AM");
        ComTime.addItem("5:09AM");
        ComTime.addItem("5:10AM");
        ComTime.addItem("5:11AM");
        ComTime.addItem("5:12AM");
        ComTime.addItem("5:13AM");
        ComTime.addItem("5:14AM");
        ComTime.addItem("5:15AM");
        ComTime.addItem("5:16AM");
        ComTime.addItem("5:17AM");
        ComTime.addItem("5:18AM");
        ComTime.addItem("5:19AM");
        ComTime.addItem("5:20AM");
        ComTime.addItem("5:21AM");
        ComTime.addItem("5:22AM");
        ComTime.addItem("5:23AM");
        ComTime.addItem("5:24AM");
        ComTime.addItem("5:25AM");
        ComTime.addItem("5:26AM");
        ComTime.addItem("5:27AM");
        ComTime.addItem("5:28AM");
        ComTime.addItem("5:29AM");
        ComTime.addItem("5:30AM");
        ComTime.addItem("5:31AM");
        ComTime.addItem("5:32AM");
        ComTime.addItem("5:33AM");
        ComTime.addItem("5:34AM");
        ComTime.addItem("5:35AM");
        ComTime.addItem("5:36AM");
        ComTime.addItem("5:37AM");
        ComTime.addItem("5:38AM");
        ComTime.addItem("5:39AM");
        ComTime.addItem("5:40AM");
        ComTime.addItem("5:41AM");
        ComTime.addItem("5:42AM");
        ComTime.addItem("5:43AM");
        ComTime.addItem("5:44AM");
        ComTime.addItem("5:45AM");
        ComTime.addItem("5:46AM");
        ComTime.addItem("5:47AM");
        ComTime.addItem("5:48AM");
        ComTime.addItem("5:49AM");
        ComTime.addItem("5:50AM");
        ComTime.addItem("5:51AM");
        ComTime.addItem("5:52AM");
        ComTime.addItem("5:53AM");
        ComTime.addItem("5:54AM");
        ComTime.addItem("5:55AM");
        ComTime.addItem("5:56AM");
        ComTime.addItem("5:57AM");
        ComTime.addItem("5:58AM");
        ComTime.addItem("5:59AM");
        ComTime.addItem("6:00AM");
        ComTime.addItem("6:01AM");
        ComTime.addItem("6:02AM");
        ComTime.addItem("6:03AM");
        ComTime.addItem("6:04AM");
        ComTime.addItem("6:05AM");
        ComTime.addItem("6:06AM");
        ComTime.addItem("6:07AM");
        ComTime.addItem("6:08AM");
        ComTime.addItem("6:09AM");
        ComTime.addItem("6:10AM");
        ComTime.addItem("6:11AM");
        ComTime.addItem("6:12AM");
        ComTime.addItem("6:13AM");
        ComTime.addItem("6:14AM");
        ComTime.addItem("6:15AM");
        ComTime.addItem("6:16AM");
        ComTime.addItem("6:17AM");
        ComTime.addItem("6:18AM");
        ComTime.addItem("6:19AM");
        ComTime.addItem("6:20AM");
        ComTime.addItem("6:21AM");
        ComTime.addItem("6:22AM");
        ComTime.addItem("6:23AM");
        ComTime.addItem("6:24AM");
        ComTime.addItem("6:25AM");
        ComTime.addItem("6:26AM");
        ComTime.addItem("6:27AM");
        ComTime.addItem("6:28AM");
        ComTime.addItem("6:29AM");
        ComTime.addItem("6:30AM");
        ComTime.addItem("6:31AM");
        ComTime.addItem("6:32AM");
        ComTime.addItem("6:33AM");
        ComTime.addItem("6:34AM");
        ComTime.addItem("6:35AM");
        ComTime.addItem("6:36AM");
        ComTime.addItem("6:37AM");
        ComTime.addItem("6:38AM");
        ComTime.addItem("6:39AM");
        ComTime.addItem("6:40AM");
        ComTime.addItem("6:41AM");
        ComTime.addItem("6:42AM");
        ComTime.addItem("6:43AM");
        ComTime.addItem("6:44AM");
        ComTime.addItem("6:45AM");
        ComTime.addItem("6:46AM");
        ComTime.addItem("6:47AM");
        ComTime.addItem("6:48AM");
        ComTime.addItem("6:49AM");
        ComTime.addItem("6:50AM");
        ComTime.addItem("6:51AM");
        ComTime.addItem("6:52AM");
        ComTime.addItem("6:53AM");
        ComTime.addItem("6:54AM");
        ComTime.addItem("6:55AM");
        ComTime.addItem("6:56AM");
        ComTime.addItem("6:57AM");
        ComTime.addItem("6:58AM");
        ComTime.addItem("6:59AM");
        ComTime.addItem("7:00AM");
        ComTime.addItem("7:01AM");
        ComTime.addItem("7:02AM");
        ComTime.addItem("7:03AM");
        ComTime.addItem("7:04AM");
        ComTime.addItem("7:05AM");
        ComTime.addItem("7:06AM");
        ComTime.addItem("7:07AM");
        ComTime.addItem("7:08AM");
        ComTime.addItem("7:09AM");
        ComTime.addItem("7:10AM");
        ComTime.addItem("7:11AM");
        ComTime.addItem("7:12AM");
        ComTime.addItem("7:13AM");
        ComTime.addItem("7:14AM");
        ComTime.addItem("7:15AM");
        ComTime.addItem("7:16AM");
        ComTime.addItem("7:17AM");
        ComTime.addItem("7:18AM");
        ComTime.addItem("7:19AM");
        ComTime.addItem("7:20AM");
        ComTime.addItem("7:21AM");
        ComTime.addItem("7:22AM");
        ComTime.addItem("7:23AM");
        ComTime.addItem("7:24AM");
        ComTime.addItem("7:25AM");
        ComTime.addItem("7:26AM");
        ComTime.addItem("7:27AM");
        ComTime.addItem("7:28AM");
        ComTime.addItem("7:29AM");
        ComTime.addItem("7:30AM");
        ComTime.addItem("7:31AM");
        ComTime.addItem("7:32AM");
        ComTime.addItem("7:33AM");
        ComTime.addItem("7:34AM");
        ComTime.addItem("7:35AM");
        ComTime.addItem("7:36AM");
        ComTime.addItem("7:37AM");
        ComTime.addItem("7:38AM");
        ComTime.addItem("7:39AM");
        ComTime.addItem("7:40AM");
        ComTime.addItem("7:41AM");
        ComTime.addItem("7:42AM");
        ComTime.addItem("7:43AM");
        ComTime.addItem("7:44AM");
        ComTime.addItem("7:45AM");
        ComTime.addItem("7:46AM");
        ComTime.addItem("7:47AM");
        ComTime.addItem("7:48AM");
        ComTime.addItem("7:49AM");
        ComTime.addItem("7:50AM");
        ComTime.addItem("7:51AM");
        ComTime.addItem("7:52AM");
        ComTime.addItem("7:53AM");
        ComTime.addItem("7:54AM");
        ComTime.addItem("7:55AM");
        ComTime.addItem("7:56AM");
        ComTime.addItem("7:57AM");
        ComTime.addItem("7:58AM");
        ComTime.addItem("7:59AM");
        ComTime.addItem("8:00AM");
        ComTime.addItem("8:01AM");
        ComTime.addItem("8:02AM");
        ComTime.addItem("8:03AM");
        ComTime.addItem("8:04AM");
        ComTime.addItem("8:05AM");
        ComTime.addItem("8:06AM");
        ComTime.addItem("8:07AM");
        ComTime.addItem("8:08AM");
        ComTime.addItem("8:09AM");
        ComTime.addItem("8:10AM");
        ComTime.addItem("8:11AM");
        ComTime.addItem("8:12AM");
        ComTime.addItem("8:13AM");
        ComTime.addItem("8:14AM");
        ComTime.addItem("8:15AM");
        ComTime.addItem("8:16AM");
        ComTime.addItem("8:17AM");
        ComTime.addItem("8:18AM");
        ComTime.addItem("8:19AM");
        ComTime.addItem("8:20AM");
        ComTime.addItem("8:21AM");
        ComTime.addItem("8:22AM");
        ComTime.addItem("8:23AM");
        ComTime.addItem("8:24AM");
        ComTime.addItem("8:25AM");
        ComTime.addItem("8:26AM");
        ComTime.addItem("8:27AM");
        ComTime.addItem("8:28AM");
        ComTime.addItem("8:29AM");
        ComTime.addItem("8:30AM");
        ComTime.addItem("8:31AM");
        ComTime.addItem("8:32AM");
        ComTime.addItem("8:33AM");
        ComTime.addItem("8:34AM");
        ComTime.addItem("8:35AM");
        ComTime.addItem("8:36AM");
        ComTime.addItem("8:37AM");
        ComTime.addItem("8:38AM");
        ComTime.addItem("8:39AM");
        ComTime.addItem("8:40AM");
        ComTime.addItem("8:41AM");
        ComTime.addItem("8:42AM");
        ComTime.addItem("8:43AM");
        ComTime.addItem("8:44AM");
        ComTime.addItem("8:45AM");
        ComTime.addItem("8:46AM");
        ComTime.addItem("8:47AM");
        ComTime.addItem("8:48AM");
        ComTime.addItem("8:49AM");
        ComTime.addItem("8:50AM");
        ComTime.addItem("8:51AM");
        ComTime.addItem("8:52AM");
        ComTime.addItem("8:53AM");
        ComTime.addItem("8:54AM");
        ComTime.addItem("8:55AM");
        ComTime.addItem("8:56AM");
        ComTime.addItem("8:57AM");
        ComTime.addItem("8:58AM");
        ComTime.addItem("8:59AM");
        ComTime.addItem("9:00AM");
        ComTime.addItem("9:01AM");
        ComTime.addItem("9:02AM");
        ComTime.addItem("9:03AM");
        ComTime.addItem("9:04AM");
        ComTime.addItem("9:05AM");
        ComTime.addItem("9:06AM");
        ComTime.addItem("9:07AM");
        ComTime.addItem("9:08AM");
        ComTime.addItem("9:09AM");
        ComTime.addItem("9:10AM");
        ComTime.addItem("9:11AM");
        ComTime.addItem("9:12AM");
        ComTime.addItem("9:13AM");
        ComTime.addItem("9:14AM");
        ComTime.addItem("9:15AM");
        ComTime.addItem("9:16AM");
        ComTime.addItem("9:17AM");
        ComTime.addItem("9:18AM");
        ComTime.addItem("9:19AM");
        ComTime.addItem("9:20AM");
        ComTime.addItem("9:21AM");
        ComTime.addItem("9:22AM");
        ComTime.addItem("9:23AM");
        ComTime.addItem("9:24AM");
        ComTime.addItem("9:25AM");
        ComTime.addItem("9:26AM");
        ComTime.addItem("9:27AM");
        ComTime.addItem("9:28AM");
        ComTime.addItem("9:29AM");
        ComTime.addItem("9:30AM");
        ComTime.addItem("9:31AM");
        ComTime.addItem("9:32AM");
        ComTime.addItem("9:33AM");
        ComTime.addItem("9:34AM");
        ComTime.addItem("9:35AM");
        ComTime.addItem("9:36AM");
        ComTime.addItem("9:37AM");
        ComTime.addItem("9:38AM");
        ComTime.addItem("9:39AM");
        ComTime.addItem("9:40AM");
        ComTime.addItem("9:41AM");
        ComTime.addItem("9:42AM");
        ComTime.addItem("9:43AM");
        ComTime.addItem("9:44AM");
        ComTime.addItem("9:45AM");
        ComTime.addItem("9:46AM");
        ComTime.addItem("9:47AM");
        ComTime.addItem("9:48AM");
        ComTime.addItem("9:49AM");
        ComTime.addItem("9:50AM");
        ComTime.addItem("9:51AM");
        ComTime.addItem("9:52AM");
        ComTime.addItem("9:53AM");
        ComTime.addItem("9:54AM");
        ComTime.addItem("9:55AM");
        ComTime.addItem("9:56AM");
        ComTime.addItem("9:57AM");
        ComTime.addItem("9:58AM");
        ComTime.addItem("9:59AM");
        ComTime.addItem("10:00AM");
        ComTime.addItem("10:01AM");
        ComTime.addItem("10:02AM");
        ComTime.addItem("10:03AM");
        ComTime.addItem("10:04AM");
        ComTime.addItem("10:05AM");
        ComTime.addItem("10:06AM");
        ComTime.addItem("10:07AM");
        ComTime.addItem("10:08AM");
        ComTime.addItem("10:09AM");
        ComTime.addItem("10:10AM");
        ComTime.addItem("10:11AM");
        ComTime.addItem("10:12AM");
        ComTime.addItem("10:13AM");
        ComTime.addItem("10:14AM");
        ComTime.addItem("10:15AM");
        ComTime.addItem("10:16AM");
        ComTime.addItem("10:17AM");
        ComTime.addItem("10:18AM");
        ComTime.addItem("10:19AM");
        ComTime.addItem("10:20AM");
        ComTime.addItem("10:21AM");
        ComTime.addItem("10:22AM");
        ComTime.addItem("10:23AM");
        ComTime.addItem("10:24AM");
        ComTime.addItem("10:25AM");
        ComTime.addItem("10:26AM");
        ComTime.addItem("10:27AM");
        ComTime.addItem("10:28AM");
        ComTime.addItem("10:29AM");
        ComTime.addItem("10:30AM");
        ComTime.addItem("10:31AM");
        ComTime.addItem("10:32AM");
        ComTime.addItem("10:33AM");
        ComTime.addItem("10:34AM");
        ComTime.addItem("10:35AM");
        ComTime.addItem("10:36AM");
        ComTime.addItem("10:37AM");
        ComTime.addItem("10:38AM");
        ComTime.addItem("10:39AM");
        ComTime.addItem("10:40AM");
        ComTime.addItem("10:41AM");
        ComTime.addItem("10:42AM");
        ComTime.addItem("10:43AM");
        ComTime.addItem("10:44AM");
        ComTime.addItem("10:45AM");
        ComTime.addItem("10:46AM");
        ComTime.addItem("10:47AM");
        ComTime.addItem("10:48AM");
        ComTime.addItem("10:49AM");
        ComTime.addItem("10:50AM");
        ComTime.addItem("10:51AM");
        ComTime.addItem("10:52AM");
        ComTime.addItem("10:53AM");
        ComTime.addItem("10:54AM");
        ComTime.addItem("10:55AM");
        ComTime.addItem("10:56AM");
        ComTime.addItem("10:57AM");
        ComTime.addItem("10:58AM");
        ComTime.addItem("10:59AM");
        ComTime.addItem("11:00AM");
        ComTime.addItem("11:01AM");
        ComTime.addItem("11:02AM");
        ComTime.addItem("11:03AM");
        ComTime.addItem("11:04AM");
        ComTime.addItem("11:05AM");
        ComTime.addItem("11:06AM");
        ComTime.addItem("11:07AM");
        ComTime.addItem("11:08AM");
        ComTime.addItem("11:09AM");
        ComTime.addItem("11:10AM");
        ComTime.addItem("11:11AM");
        ComTime.addItem("11:12AM");
        ComTime.addItem("11:13AM");
        ComTime.addItem("11:14AM");
        ComTime.addItem("11:15AM");
        ComTime.addItem("11:16AM");
        ComTime.addItem("11:17AM");
        ComTime.addItem("11:18AM");
        ComTime.addItem("11:19AM");
        ComTime.addItem("11:20AM");
        ComTime.addItem("11:21AM");
        ComTime.addItem("11:22AM");
        ComTime.addItem("11:23AM");
        ComTime.addItem("11:24AM");
        ComTime.addItem("11:25AM");
        ComTime.addItem("11:26AM");
        ComTime.addItem("11:27AM");
        ComTime.addItem("11:28AM");
        ComTime.addItem("11:29AM");
        ComTime.addItem("11:30AM");
        ComTime.addItem("11:31AM");
        ComTime.addItem("11:32AM");
        ComTime.addItem("11:33AM");
        ComTime.addItem("11:34AM");
        ComTime.addItem("11:35AM");
        ComTime.addItem("11:36AM");
        ComTime.addItem("11:37AM");
        ComTime.addItem("11:38AM");
        ComTime.addItem("11:39AM");
        ComTime.addItem("11:40AM");
        ComTime.addItem("11:41AM");
        ComTime.addItem("11:42AM");
        ComTime.addItem("11:43AM");
        ComTime.addItem("11:44AM");
        ComTime.addItem("11:45AM");
        ComTime.addItem("11:46AM");
        ComTime.addItem("11:47AM");
        ComTime.addItem("11:48AM");
        ComTime.addItem("11:49AM");
        ComTime.addItem("11:50AM");
        ComTime.addItem("11:51AM");
        ComTime.addItem("11:52AM");
        ComTime.addItem("11:53AM");
        ComTime.addItem("11:54AM");
        ComTime.addItem("11:55AM");
        ComTime.addItem("11:56AM");
        ComTime.addItem("11:57AM");
        ComTime.addItem("11:58AM");
        ComTime.addItem("11:59AM");
        ComTime.addItem("12:00PM");
        ComTime.addItem("12:01PM");
        ComTime.addItem("12:02PM");
        ComTime.addItem("12:03PM");
        ComTime.addItem("12:04PM");
        ComTime.addItem("12:05PM");
        ComTime.addItem("12:06PM");
        ComTime.addItem("12:07PM");
        ComTime.addItem("12:08PM");
        ComTime.addItem("12:09PM");
        ComTime.addItem("12:10PM");
        ComTime.addItem("12:11PM");
        ComTime.addItem("12:12PM");
        ComTime.addItem("12:13PM");
        ComTime.addItem("12:14PM");
        ComTime.addItem("12:15PM");
        ComTime.addItem("12:16PM");
        ComTime.addItem("12:17PM");
        ComTime.addItem("12:18PM");
        ComTime.addItem("12:19PM");
        ComTime.addItem("12:20PM");
        ComTime.addItem("12:21PM");
        ComTime.addItem("12:22PM");
        ComTime.addItem("12:23PM");
        ComTime.addItem("12:24PM");
        ComTime.addItem("12:25PM");
        ComTime.addItem("12:26PM");
        ComTime.addItem("12:27PM");
        ComTime.addItem("12:28PM");
        ComTime.addItem("12:29PM");
        ComTime.addItem("12:30PM");
        ComTime.addItem("12:31PM");
        ComTime.addItem("12:32PM");
        ComTime.addItem("12:33PM");
        ComTime.addItem("12:34PM");
        ComTime.addItem("12:35PM");
        ComTime.addItem("12:36PM");
        ComTime.addItem("12:37PM");
        ComTime.addItem("12:38PM");
        ComTime.addItem("12:39PM");
        ComTime.addItem("12:40PM");
        ComTime.addItem("12:41PM");
        ComTime.addItem("12:42PM");
        ComTime.addItem("12:43PM");
        ComTime.addItem("12:44PM");
        ComTime.addItem("12:45PM");
        ComTime.addItem("12:46PM");
        ComTime.addItem("12:47PM");
        ComTime.addItem("12:48PM");
        ComTime.addItem("12:49PM");
        ComTime.addItem("12:50PM");
        ComTime.addItem("12:51PM");
        ComTime.addItem("12:52PM");
        ComTime.addItem("12:53PM");
        ComTime.addItem("12:54PM");
        ComTime.addItem("12:55PM");
        ComTime.addItem("12:56PM");
        ComTime.addItem("12:57PM");
        ComTime.addItem("12:58PM");
        ComTime.addItem("12:59PM");
        ComTime.addItem("1:00PM");
        ComTime.addItem("1:01PM");
        ComTime.addItem("1:02PM");
        ComTime.addItem("1:03PM");
        ComTime.addItem("1:04PM");
        ComTime.addItem("1:05PM");
        ComTime.addItem("1:06PM");
        ComTime.addItem("1:07PM");
        ComTime.addItem("1:08PM");
        ComTime.addItem("1:09PM");
        ComTime.addItem("1:10PM");
        ComTime.addItem("1:11PM");
        ComTime.addItem("1:12PM");
        ComTime.addItem("1:13PM");
        ComTime.addItem("1:14PM");
        ComTime.addItem("1:15PM");
        ComTime.addItem("1:16PM");
        ComTime.addItem("1:17PM");
        ComTime.addItem("1:18PM");
        ComTime.addItem("1:19PM");
        ComTime.addItem("1:20PM");
        ComTime.addItem("1:21PM");
        ComTime.addItem("1:22PM");
        ComTime.addItem("1:23PM");
        ComTime.addItem("1:24PM");
        ComTime.addItem("1:25PM");
        ComTime.addItem("1:26PM");
        ComTime.addItem("1:27PM");
        ComTime.addItem("1:28PM");
        ComTime.addItem("1:29PM");
        ComTime.addItem("1:30PM");
        ComTime.addItem("1:31PM");
        ComTime.addItem("1:32PM");
        ComTime.addItem("1:33PM");
        ComTime.addItem("1:34PM");
        ComTime.addItem("1:35PM");
        ComTime.addItem("1:36PM");
        ComTime.addItem("1:37PM");
        ComTime.addItem("1:38PM");
        ComTime.addItem("1:39PM");
        ComTime.addItem("1:40PM");
        ComTime.addItem("1:41PM");
        ComTime.addItem("1:42PM");
        ComTime.addItem("1:43PM");
        ComTime.addItem("1:44PM");
        ComTime.addItem("1:45PM");
        ComTime.addItem("1:46PM");
        ComTime.addItem("1:47PM");
        ComTime.addItem("1:48PM");
        ComTime.addItem("1:49PM");
        ComTime.addItem("1:50PM");
        ComTime.addItem("1:51PM");
        ComTime.addItem("1:52PM");
        ComTime.addItem("1:53PM");
        ComTime.addItem("1:54PM");
        ComTime.addItem("1:55PM");
        ComTime.addItem("1:56PM");
        ComTime.addItem("1:57PM");
        ComTime.addItem("1:58PM");
        ComTime.addItem("1:59PM");
        ComTime.addItem("2:00PM");
        ComTime.addItem("2:01PM");
        ComTime.addItem("2:02PM");
        ComTime.addItem("2:03PM");
        ComTime.addItem("2:04PM");
        ComTime.addItem("2:05PM");
        ComTime.addItem("2:06PM");
        ComTime.addItem("2:07PM");
        ComTime.addItem("2:08PM");
        ComTime.addItem("2:09PM");
        ComTime.addItem("2:10PM");
        ComTime.addItem("2:11PM");
        ComTime.addItem("2:12PM");
        ComTime.addItem("2:13PM");
        ComTime.addItem("2:14PM");
        ComTime.addItem("2:15PM");
        ComTime.addItem("2:16PM");
        ComTime.addItem("2:17PM");
        ComTime.addItem("2:18PM");
        ComTime.addItem("2:19PM");
        ComTime.addItem("2:20PM");
        ComTime.addItem("2:21PM");
        ComTime.addItem("2:22PM");
        ComTime.addItem("2:23PM");
        ComTime.addItem("2:24PM");
        ComTime.addItem("2:25PM");
        ComTime.addItem("2:26PM");
        ComTime.addItem("2:27PM");
        ComTime.addItem("2:28PM");
        ComTime.addItem("2:29PM");
        ComTime.addItem("2:30PM");
        ComTime.addItem("2:31PM");
        ComTime.addItem("2:32PM");
        ComTime.addItem("2:33PM");
        ComTime.addItem("2:34PM");
        ComTime.addItem("2:35PM");
        ComTime.addItem("2:36PM");
        ComTime.addItem("2:37PM");
        ComTime.addItem("2:38PM");
        ComTime.addItem("2:39PM");
        ComTime.addItem("2:40PM");
        ComTime.addItem("2:41PM");
        ComTime.addItem("2:42PM");
        ComTime.addItem("2:43PM");
        ComTime.addItem("2:44PM");
        ComTime.addItem("2:45PM");
        ComTime.addItem("2:46PM");
        ComTime.addItem("2:47PM");
        ComTime.addItem("2:48PM");
        ComTime.addItem("2:49PM");
        ComTime.addItem("2:50PM");
        ComTime.addItem("2:51PM");
        ComTime.addItem("2:52PM");
        ComTime.addItem("2:53PM");
        ComTime.addItem("2:54PM");
        ComTime.addItem("2:55PM");
        ComTime.addItem("2:56PM");
        ComTime.addItem("2:57PM");
        ComTime.addItem("2:58PM");
        ComTime.addItem("2:59PM");
        ComTime.addItem("3:00PM");
        ComTime.addItem("3:01PM");
        ComTime.addItem("3:02PM");
        ComTime.addItem("3:03PM");
        ComTime.addItem("3:04PM");
        ComTime.addItem("3:05PM");
        ComTime.addItem("3:06PM");
        ComTime.addItem("3:07PM");
        ComTime.addItem("3:08PM");
        ComTime.addItem("3:09PM");
        ComTime.addItem("3:10PM");
        ComTime.addItem("3:11PM");
        ComTime.addItem("3:12PM");
        ComTime.addItem("3:13PM");
        ComTime.addItem("3:14PM");
        ComTime.addItem("3:15PM");
        ComTime.addItem("3:16PM");
        ComTime.addItem("3:17PM");
        ComTime.addItem("3:18PM");
        ComTime.addItem("3:19PM");
        ComTime.addItem("3:20PM");
        ComTime.addItem("3:21PM");
        ComTime.addItem("3:22PM");
        ComTime.addItem("3:23PM");
        ComTime.addItem("3:24PM");
        ComTime.addItem("3:25PM");
        ComTime.addItem("3:26PM");
        ComTime.addItem("3:27PM");
        ComTime.addItem("3:28PM");
        ComTime.addItem("3:29PM");
        ComTime.addItem("3:30PM");
        ComTime.addItem("3:31PM");
        ComTime.addItem("3:32PM");
        ComTime.addItem("3:33PM");
        ComTime.addItem("3:34PM");
        ComTime.addItem("3:35PM");
        ComTime.addItem("3:36PM");
        ComTime.addItem("3:37PM");
        ComTime.addItem("3:38PM");
        ComTime.addItem("3:39PM");
        ComTime.addItem("3:40PM");
        ComTime.addItem("3:41PM");
        ComTime.addItem("3:42PM");
        ComTime.addItem("3:43PM");
        ComTime.addItem("3:44PM");
        ComTime.addItem("3:45PM");
        ComTime.addItem("3:46PM");
        ComTime.addItem("3:47PM");
        ComTime.addItem("3:48PM");
        ComTime.addItem("3:49PM");
        ComTime.addItem("3:50PM");
        ComTime.addItem("3:51PM");
        ComTime.addItem("3:52PM");
        ComTime.addItem("3:53PM");
        ComTime.addItem("3:54PM");
        ComTime.addItem("3:55PM");
        ComTime.addItem("3:56PM");
        ComTime.addItem("3:57PM");
        ComTime.addItem("3:58PM");
        ComTime.addItem("3:59PM");
        ComTime.addItem("4:00PM");
        ComTime.addItem("4:01PM");
        ComTime.addItem("4:02PM");
        ComTime.addItem("4:03PM");
        ComTime.addItem("4:04PM");
        ComTime.addItem("4:05PM");
        ComTime.addItem("4:06PM");
        ComTime.addItem("4:07PM");
        ComTime.addItem("4:08PM");
        ComTime.addItem("4:09PM");
        ComTime.addItem("4:10PM");
        ComTime.addItem("4:11PM");
        ComTime.addItem("4:12PM");
        ComTime.addItem("4:13PM");
        ComTime.addItem("4:14PM");
        ComTime.addItem("4:15PM");
        ComTime.addItem("4:16PM");
        ComTime.addItem("4:17PM");
        ComTime.addItem("4:18PM");
        ComTime.addItem("4:19PM");
        ComTime.addItem("4:20PM");
        ComTime.addItem("4:21PM");
        ComTime.addItem("4:22PM");
        ComTime.addItem("4:23PM");
        ComTime.addItem("4:24PM");
        ComTime.addItem("4:25PM");
        ComTime.addItem("4:26PM");
        ComTime.addItem("4:27PM");
        ComTime.addItem("4:28PM");
        ComTime.addItem("4:29PM");
        ComTime.addItem("4:30PM");
        ComTime.addItem("4:31PM");
        ComTime.addItem("4:32PM");
        ComTime.addItem("4:33PM");
        ComTime.addItem("4:34PM");
        ComTime.addItem("4:35PM");
        ComTime.addItem("4:36PM");
        ComTime.addItem("4:37PM");
        ComTime.addItem("4:38PM");
        ComTime.addItem("4:39PM");
        ComTime.addItem("4:40PM");
        ComTime.addItem("4:41PM");
        ComTime.addItem("4:42PM");
        ComTime.addItem("4:43PM");
        ComTime.addItem("4:44PM");
        ComTime.addItem("4:45PM");
        ComTime.addItem("4:46PM");
        ComTime.addItem("4:47PM");
        ComTime.addItem("4:48PM");
        ComTime.addItem("4:49PM");
        ComTime.addItem("4:50PM");
        ComTime.addItem("4:51PM");
        ComTime.addItem("4:52PM");
        ComTime.addItem("4:53PM");
        ComTime.addItem("4:54PM");
        ComTime.addItem("4:55PM");
        ComTime.addItem("4:56PM");
        ComTime.addItem("4:57PM");
        ComTime.addItem("4:58PM");
        ComTime.addItem("4:59PM");
        ComTime.addItem("5:00PM");
        ComTime.addItem("5:01PM");
        ComTime.addItem("5:02PM");
        ComTime.addItem("5:03PM");
        ComTime.addItem("5:04PM");
        ComTime.addItem("5:05PM");
        ComTime.addItem("5:06PM");
        ComTime.addItem("5:07PM");
        ComTime.addItem("5:08PM");
        ComTime.addItem("5:09PM");
        ComTime.addItem("5:10PM");
        ComTime.addItem("5:11PM");
        ComTime.addItem("5:12PM");
        ComTime.addItem("5:13PM");
        ComTime.addItem("5:14PM");
        ComTime.addItem("5:15PM");
        ComTime.addItem("5:16PM");
        ComTime.addItem("5:17PM");
        ComTime.addItem("5:18PM");
        ComTime.addItem("5:19PM");
        ComTime.addItem("5:20PM");
        ComTime.addItem("5:21PM");
        ComTime.addItem("5:22PM");
        ComTime.addItem("5:23PM");
        ComTime.addItem("5:24PM");
        ComTime.addItem("5:25PM");
        ComTime.addItem("5:26PM");
        ComTime.addItem("5:27PM");
        ComTime.addItem("5:28PM");
        ComTime.addItem("5:29PM");
        ComTime.addItem("5:30PM");
        ComTime.addItem("5:31PM");
        ComTime.addItem("5:32PM");
        ComTime.addItem("5:33PM");
        ComTime.addItem("5:34PM");
        ComTime.addItem("5:35PM");
        ComTime.addItem("5:36PM");
        ComTime.addItem("5:37PM");
        ComTime.addItem("5:38PM");
        ComTime.addItem("5:39PM");
        ComTime.addItem("5:40PM");
        ComTime.addItem("5:41PM");
        ComTime.addItem("5:42PM");
        ComTime.addItem("5:43PM");
        ComTime.addItem("5:44PM");
        ComTime.addItem("5:45PM");
        ComTime.addItem("5:46PM");
        ComTime.addItem("5:47PM");
        ComTime.addItem("5:48PM");
        ComTime.addItem("5:49PM");
        ComTime.addItem("5:50PM");
        ComTime.addItem("5:51PM");
        ComTime.addItem("5:52PM");
        ComTime.addItem("5:53PM");
        ComTime.addItem("5:54PM");
        ComTime.addItem("5:55PM");
        ComTime.addItem("5:56PM");
        ComTime.addItem("5:57PM");
        ComTime.addItem("5:58PM");
        ComTime.addItem("5:59PM");
        ComTime.addItem("6:00PM");
        ComTime.addItem("6:01PM");
        ComTime.addItem("6:02PM");
        ComTime.addItem("6:03PM");
        ComTime.addItem("6:04PM");
        ComTime.addItem("6:05PM");
        ComTime.addItem("6:06PM");
        ComTime.addItem("6:07PM");
        ComTime.addItem("6:08PM");
        ComTime.addItem("6:09PM");
        ComTime.addItem("6:10PM");
        ComTime.addItem("6:11PM");
        ComTime.addItem("6:12PM");
        ComTime.addItem("6:13PM");
        ComTime.addItem("6:14PM");
        ComTime.addItem("6:15PM");
        ComTime.addItem("6:16PM");
        ComTime.addItem("6:17PM");
        ComTime.addItem("6:18PM");
        ComTime.addItem("6:19PM");
        ComTime.addItem("6:20PM");
        ComTime.addItem("6:21PM");
        ComTime.addItem("6:22PM");
        ComTime.addItem("6:23PM");
        ComTime.addItem("6:24PM");
        ComTime.addItem("6:25PM");
        ComTime.addItem("6:26PM");
        ComTime.addItem("6:27PM");
        ComTime.addItem("6:28PM");
        ComTime.addItem("6:29PM");
        ComTime.addItem("6:30PM");
        ComTime.addItem("6:31PM");
        ComTime.addItem("6:32PM");
        ComTime.addItem("6:33PM");
        ComTime.addItem("6:34PM");
        ComTime.addItem("6:35PM");
        ComTime.addItem("6:36PM");
        ComTime.addItem("6:37PM");
        ComTime.addItem("6:38PM");
        ComTime.addItem("6:39PM");
        ComTime.addItem("6:40PM");
        ComTime.addItem("6:41PM");
        ComTime.addItem("6:42PM");
        ComTime.addItem("6:43PM");
        ComTime.addItem("6:44PM");
        ComTime.addItem("6:45PM");
        ComTime.addItem("6:46PM");
        ComTime.addItem("6:47PM");
        ComTime.addItem("6:48PM");
        ComTime.addItem("6:49PM");
        ComTime.addItem("6:50PM");
        ComTime.addItem("6:51PM");
        ComTime.addItem("6:52PM");
        ComTime.addItem("6:53PM");
        ComTime.addItem("6:54PM");
        ComTime.addItem("6:55PM");
        ComTime.addItem("6:56PM");
        ComTime.addItem("6:57PM");
        ComTime.addItem("6:58PM");
        ComTime.addItem("6:59PM");
        ComTime.addItem("7:00PM");
        ComTime.addItem("7:01PM");
        ComTime.addItem("7:02PM");
        ComTime.addItem("7:03PM");
        ComTime.addItem("7:04PM");
        ComTime.addItem("7:05PM");
        ComTime.addItem("7:06PM");
        ComTime.addItem("7:07PM");
        ComTime.addItem("7:08PM");
        ComTime.addItem("7:09PM");
        ComTime.addItem("7:10PM");
        ComTime.addItem("7:11PM");
        ComTime.addItem("7:12PM");
        ComTime.addItem("7:13PM");
        ComTime.addItem("7:14PM");
        ComTime.addItem("7:15PM");
        ComTime.addItem("7:16PM");
        ComTime.addItem("7:17PM");
        ComTime.addItem("7:18PM");
        ComTime.addItem("7:19PM");
        ComTime.addItem("7:20PM");
        ComTime.addItem("7:21PM");
        ComTime.addItem("7:22PM");
        ComTime.addItem("7:23PM");
        ComTime.addItem("7:24PM");
        ComTime.addItem("7:25PM");
        ComTime.addItem("7:26PM");
        ComTime.addItem("7:27PM");
        ComTime.addItem("7:28PM");
        ComTime.addItem("7:29PM");
        ComTime.addItem("7:30PM");
        ComTime.addItem("7:31PM");
        ComTime.addItem("7:32PM");
        ComTime.addItem("7:33PM");
        ComTime.addItem("7:34PM");
        ComTime.addItem("7:35PM");
        ComTime.addItem("7:36PM");
        ComTime.addItem("7:37PM");
        ComTime.addItem("7:38PM");
        ComTime.addItem("7:39PM");
        ComTime.addItem("7:40PM");
        ComTime.addItem("7:41PM");
        ComTime.addItem("7:42PM");
        ComTime.addItem("7:43PM");
        ComTime.addItem("7:44PM");
        ComTime.addItem("7:45PM");
        ComTime.addItem("7:46PM");
        ComTime.addItem("7:47PM");
        ComTime.addItem("7:48PM");
        ComTime.addItem("7:49PM");
        ComTime.addItem("7:50PM");
        ComTime.addItem("7:51PM");
        ComTime.addItem("7:52PM");
        ComTime.addItem("7:53PM");
        ComTime.addItem("7:54PM");
        ComTime.addItem("7:55PM");
        ComTime.addItem("7:56PM");
        ComTime.addItem("7:57PM");
        ComTime.addItem("7:58PM");
        ComTime.addItem("7:59PM");
        ComTime.addItem("8:00PM");
        ComTime.addItem("8:01PM");
        ComTime.addItem("8:02PM");
        ComTime.addItem("8:03PM");
        ComTime.addItem("8:04PM");
        ComTime.addItem("8:05PM");
        ComTime.addItem("8:06PM");
        ComTime.addItem("8:07PM");
        ComTime.addItem("8:08PM");
        ComTime.addItem("8:09PM");
        ComTime.addItem("8:10PM");
        ComTime.addItem("8:11PM");
        ComTime.addItem("8:12PM");
        ComTime.addItem("8:13PM");
        ComTime.addItem("8:14PM");
        ComTime.addItem("8:15PM");
        ComTime.addItem("8:16PM");
        ComTime.addItem("8:17PM");
        ComTime.addItem("8:18PM");
        ComTime.addItem("8:19PM");
        ComTime.addItem("8:20PM");
        ComTime.addItem("8:21PM");
        ComTime.addItem("8:22PM");
        ComTime.addItem("8:23PM");
        ComTime.addItem("8:24PM");
        ComTime.addItem("8:25PM");
        ComTime.addItem("8:26PM");
        ComTime.addItem("8:27PM");
        ComTime.addItem("8:28PM");
        ComTime.addItem("8:29PM");
        ComTime.addItem("8:30PM");
        ComTime.addItem("8:31PM");
        ComTime.addItem("8:32PM");
        ComTime.addItem("8:33PM");
        ComTime.addItem("8:34PM");
        ComTime.addItem("8:35PM");
        ComTime.addItem("8:36PM");
        ComTime.addItem("8:37PM");
        ComTime.addItem("8:38PM");
        ComTime.addItem("8:39PM");
        ComTime.addItem("8:40PM");
        ComTime.addItem("8:41PM");
        ComTime.addItem("8:42PM");
        ComTime.addItem("8:43PM");
        ComTime.addItem("8:44PM");
        ComTime.addItem("8:45PM");
        ComTime.addItem("8:46PM");
        ComTime.addItem("8:47PM");
        ComTime.addItem("8:48PM");
        ComTime.addItem("8:49PM");
        ComTime.addItem("8:50PM");
        ComTime.addItem("8:51PM");
        ComTime.addItem("8:52PM");
        ComTime.addItem("8:53PM");
        ComTime.addItem("8:54PM");
        ComTime.addItem("8:55PM");
        ComTime.addItem("8:56PM");
        ComTime.addItem("8:57PM");
        ComTime.addItem("8:58PM");
        ComTime.addItem("8:59PM");
        ComTime.addItem("9:00PM");
        ComTime.addItem("9:01PM");
        ComTime.addItem("9:02PM");
        ComTime.addItem("9:03PM");
        ComTime.addItem("9:04PM");
        ComTime.addItem("9:05PM");
        ComTime.addItem("9:06PM");
        ComTime.addItem("9:07PM");
        ComTime.addItem("9:08PM");
        ComTime.addItem("9:09PM");
        ComTime.addItem("9:10PM");
        ComTime.addItem("9:11PM");
        ComTime.addItem("9:12PM");
        ComTime.addItem("9:13PM");
        ComTime.addItem("9:14PM");
        ComTime.addItem("9:15PM");
        ComTime.addItem("9:16PM");
        ComTime.addItem("9:17PM");
        ComTime.addItem("9:18PM");
        ComTime.addItem("9:19PM");
        ComTime.addItem("9:20PM");
        ComTime.addItem("9:21PM");
        ComTime.addItem("9:22PM");
        ComTime.addItem("9:23PM");
        ComTime.addItem("9:24PM");
        ComTime.addItem("9:25PM");
        ComTime.addItem("9:26PM");
        ComTime.addItem("9:27PM");
        ComTime.addItem("9:28PM");
        ComTime.addItem("9:29PM");
        ComTime.addItem("9:30PM");
        ComTime.addItem("9:31PM");
        ComTime.addItem("9:32PM");
        ComTime.addItem("9:33PM");
        ComTime.addItem("9:34PM");
        ComTime.addItem("9:35PM");
        ComTime.addItem("9:36PM");
        ComTime.addItem("9:37PM");
        ComTime.addItem("9:38PM");
        ComTime.addItem("9:39PM");
        ComTime.addItem("9:40PM");
        ComTime.addItem("9:41PM");
        ComTime.addItem("9:42PM");
        ComTime.addItem("9:43PM");
        ComTime.addItem("9:44PM");
        ComTime.addItem("9:45PM");
        ComTime.addItem("9:46PM");
        ComTime.addItem("9:47PM");
        ComTime.addItem("9:48PM");
        ComTime.addItem("9:49PM");
        ComTime.addItem("9:50PM");
        ComTime.addItem("9:51PM");
        ComTime.addItem("9:52PM");
        ComTime.addItem("9:53PM");
        ComTime.addItem("9:54PM");
        ComTime.addItem("9:55PM");
        ComTime.addItem("9:56PM");
        ComTime.addItem("9:57PM");
        ComTime.addItem("9:58PM");
        ComTime.addItem("9:59PM");
        ComTime.addItem("10:00PM");
        ComTime.addItem("10:01PM");
        ComTime.addItem("10:02PM");
        ComTime.addItem("10:03PM");
        ComTime.addItem("10:04PM");
        ComTime.addItem("10:05PM");
        ComTime.addItem("10:06PM");
        ComTime.addItem("10:07PM");
        ComTime.addItem("10:08PM");
        ComTime.addItem("10:09PM");
        ComTime.addItem("10:10PM");
        ComTime.addItem("10:11PM");
        ComTime.addItem("10:12PM");
        ComTime.addItem("10:13PM");
        ComTime.addItem("10:14PM");
        ComTime.addItem("10:15PM");
        ComTime.addItem("10:16PM");
        ComTime.addItem("10:17PM");
        ComTime.addItem("10:18PM");
        ComTime.addItem("10:19PM");
        ComTime.addItem("10:20PM");
        ComTime.addItem("10:21PM");
        ComTime.addItem("10:22PM");
        ComTime.addItem("10:23PM");
        ComTime.addItem("10:24PM");
        ComTime.addItem("10:25PM");
        ComTime.addItem("10:26PM");
        ComTime.addItem("10:27PM");
        ComTime.addItem("10:28PM");
        ComTime.addItem("10:29PM");
        ComTime.addItem("10:30PM");
        ComTime.addItem("10:31PM");
        ComTime.addItem("10:32PM");
        ComTime.addItem("10:33PM");
        ComTime.addItem("10:34PM");
        ComTime.addItem("10:35PM");
        ComTime.addItem("10:36PM");
        ComTime.addItem("10:37PM");
        ComTime.addItem("10:38PM");
        ComTime.addItem("10:39PM");
        ComTime.addItem("10:40PM");
        ComTime.addItem("10:41PM");
        ComTime.addItem("10:42PM");
        ComTime.addItem("10:43PM");
        ComTime.addItem("10:44PM");
        ComTime.addItem("10:45PM");
        ComTime.addItem("10:46PM");
        ComTime.addItem("10:47PM");
        ComTime.addItem("10:48PM");
        ComTime.addItem("10:49PM");
        ComTime.addItem("10:50PM");
        ComTime.addItem("10:51PM");
        ComTime.addItem("10:52PM");
        ComTime.addItem("10:53PM");
        ComTime.addItem("10:54PM");
        ComTime.addItem("10:55PM");
        ComTime.addItem("10:56PM");
        ComTime.addItem("10:57PM");
        ComTime.addItem("10:58PM");
        ComTime.addItem("10:59PM");
        ComTime.addItem("11:00PM");
        ComTime.addItem("11:01PM");
        ComTime.addItem("11:02PM");
        ComTime.addItem("11:03PM");
        ComTime.addItem("11:04PM");
        ComTime.addItem("11:05PM");
        ComTime.addItem("11:06PM");
        ComTime.addItem("11:07PM");
        ComTime.addItem("11:08PM");
        ComTime.addItem("11:09PM");
        ComTime.addItem("11:10PM");
        ComTime.addItem("11:11PM");
        ComTime.addItem("11:12PM");
        ComTime.addItem("11:13PM");
        ComTime.addItem("11:14PM");
        ComTime.addItem("11:15PM");
        ComTime.addItem("11:16PM");
        ComTime.addItem("11:17PM");
        ComTime.addItem("11:18PM");
        ComTime.addItem("11:19PM");
        ComTime.addItem("11:20PM");
        ComTime.addItem("11:21PM");
        ComTime.addItem("11:22PM");
        ComTime.addItem("11:23PM");
        ComTime.addItem("11:24PM");
        ComTime.addItem("11:25PM");
        ComTime.addItem("11:26PM");
        ComTime.addItem("11:27PM");
        ComTime.addItem("11:28PM");
        ComTime.addItem("11:29PM");
        ComTime.addItem("11:30PM");
        ComTime.addItem("11:31PM");
        ComTime.addItem("11:32PM");
        ComTime.addItem("11:33PM");
        ComTime.addItem("11:34PM");
        ComTime.addItem("11:35PM");
        ComTime.addItem("11:36PM");
        ComTime.addItem("11:37PM");
        ComTime.addItem("11:38PM");
        ComTime.addItem("11:39PM");
        ComTime.addItem("11:40PM");
        ComTime.addItem("11:41PM");
        ComTime.addItem("11:42PM");
        ComTime.addItem("11:43PM");
        ComTime.addItem("11:44PM");
        ComTime.addItem("11:45PM");
        ComTime.addItem("11:46PM");
        ComTime.addItem("11:47PM");
        ComTime.addItem("11:48PM");
        ComTime.addItem("11:49PM");
        ComTime.addItem("11:50PM");
        ComTime.addItem("11:51PM");
        ComTime.addItem("11:52PM");
        ComTime.addItem("11:53PM");
        ComTime.addItem("11:54PM");
        ComTime.addItem("11:55PM");
        ComTime.addItem("11:56PM");
        ComTime.addItem("11:57PM");
        ComTime.addItem("11:58PM");
        ComTime.addItem("11:59PM");
        ComTime.addItem("12:00AM");
        ComTime.addItem("12:01AM");
        ComTime.addItem("12:02AM");
        ComTime.addItem("12:03AM");
        ComTime.addItem("12:04AM");
        ComTime.addItem("12:05AM");
        ComTime.addItem("12:06AM");
        ComTime.addItem("12:07AM");
        ComTime.addItem("12:08AM");
        ComTime.addItem("12:09AM");
        ComTime.addItem("12:10AM");
        ComTime.addItem("12:11AM");
        ComTime.addItem("12:12AM");
        ComTime.addItem("12:13AM");
        ComTime.addItem("12:14AM");
        ComTime.addItem("12:15AM");
        ComTime.addItem("12:16AM");
        ComTime.addItem("12:17AM");
        ComTime.addItem("12:18AM");
        ComTime.addItem("12:19AM");
        ComTime.addItem("12:20AM");
        ComTime.addItem("12:21AM");
        ComTime.addItem("12:22AM");
        ComTime.addItem("12:23AM");
        ComTime.addItem("12:24AM");
        ComTime.addItem("12:25AM");
        ComTime.addItem("12:26AM");
        ComTime.addItem("12:27AM");
        ComTime.addItem("12:28AM");
        ComTime.addItem("12:29AM");
        ComTime.addItem("12:30AM");
        ComTime.addItem("12:31AM");
        ComTime.addItem("12:32AM");
        ComTime.addItem("12:33AM");
        ComTime.addItem("12:34AM");
        ComTime.addItem("12:35AM");
        ComTime.addItem("12:36AM");
        ComTime.addItem("12:37AM");
        ComTime.addItem("12:38AM");
        ComTime.addItem("12:39AM");
        ComTime.addItem("12:40AM");
        ComTime.addItem("12:41AM");
        ComTime.addItem("12:42AM");
        ComTime.addItem("12:43AM");
        ComTime.addItem("12:44AM");
        ComTime.addItem("12:45AM");
        ComTime.addItem("12:46AM");
        ComTime.addItem("12:47AM");
        ComTime.addItem("12:48AM");
        ComTime.addItem("12:49AM");
        ComTime.addItem("12:50AM");
        ComTime.addItem("12:51AM");
        ComTime.addItem("12:52AM");
        ComTime.addItem("12:53AM");
        ComTime.addItem("12:54AM");
        ComTime.addItem("12:55AM");
        ComTime.addItem("12:56AM");
        ComTime.addItem("12:57AM");
        ComTime.addItem("12:58AM");
        ComTime.addItem("12:59AM");
       
        
          ComTime.setBounds(100, 270, 100, 25);
          
     One_Hour = new JRadioButton("1");
     Two_Hour= new JRadioButton("2");
     Three_Hour= new JRadioButton("3");
     Four_Hour= new JRadioButton("4");
     Five_Hour= new JRadioButton("5");
     Six_Hour= new JRadioButton("6");
     Seven_Hour= new JRadioButton("7");
     Eight_Hour= new JRadioButton("8");
     Nine_Hour= new JRadioButton("9");
     Ten_Hour= new JRadioButton("10");
     elven_Hour= new JRadioButton("11");
     twelve_Hour= new JRadioButton("12");
     thirteen_Hour= new JRadioButton("13");
     Fourteen_Hour= new JRadioButton("14");
     Fiveteen_Hour= new JRadioButton("15");
     Sixteen_Hour= new JRadioButton("16");
     Seventeen_Hour= new JRadioButton("17");
     Eightteen_Hour= new JRadioButton("18");
     Nineteen_Hour= new JRadioButton("19");
     Twenty_Hour= new JRadioButton("20");
     TwentyOne_Hour= new JRadioButton("21");
     TwentyTwo_Hour= new JRadioButton("22");
     TwentyThree_Hour= new JRadioButton("23");
     TwentyFour_Hour= new JRadioButton("24");
     
      //Hour.setBounds(100, 330, 100, 25);
     
     One_Hour.setBounds(100, 330, 50, 25);
     Two_Hour.setBounds(150, 330, 50, 25);
     Three_Hour.setBounds(200, 330, 50, 25);
     Four_Hour.setBounds(250, 330, 50, 25);
     Five_Hour.setBounds(100, 370, 50, 25);
     Six_Hour.setBounds(150, 370, 50, 25);
     Seven_Hour.setBounds(200, 370, 50, 25);
     Eight_Hour.setBounds(250, 370, 50, 25);
     Nine_Hour.setBounds(100, 410, 50, 25);
     Ten_Hour.setBounds(150, 410, 50, 25);
     elven_Hour.setBounds(200, 410, 50, 25);
     twelve_Hour.setBounds(250, 410, 50, 25);
     thirteen_Hour.setBounds(250, 410, 50, 25);
     Fourteen_Hour.setBounds(100, 450, 50, 25);
     Fiveteen_Hour.setBounds(150, 450, 50, 25);
     Sixteen_Hour.setBounds(200, 450, 50, 25);
     Seventeen_Hour.setBounds(250, 450, 50, 25);
     Eightteen_Hour.setBounds(100, 490, 50, 25);
     Nineteen_Hour.setBounds(150, 490, 50, 25);
     Twenty_Hour.setBounds(200, 490, 50, 25);
     TwentyOne_Hour.setBounds(250, 490, 50, 25);
     TwentyTwo_Hour.setBounds(120, 530, 50, 25);
     TwentyThree_Hour.setBounds(170, 530, 50, 25);
     TwentyFour_Hour.setBounds(220, 530, 50, 25);
     
       Hour = new ButtonGroup();
       Hour.add(One_Hour);
       Hour.add(Two_Hour);
       Hour.add(Three_Hour);
       Hour.add(Four_Hour);
       Hour.add(Five_Hour);
       Hour.add(Six_Hour);
       Hour.add(Seven_Hour);
       Hour.add(Eight_Hour);
       Hour.add(Nine_Hour);
       Hour.add(Ten_Hour);
       Hour.add(elven_Hour);
       Hour.add(twelve_Hour);
       Hour.add(thirteen_Hour);
       Hour.add(Fourteen_Hour);
       Hour.add(Fiveteen_Hour);
       Hour.add(Sixteen_Hour);
       Hour.add(Seventeen_Hour);
       Hour.add(Eightteen_Hour);
       Hour.add(Nineteen_Hour);
       Hour.add(Twenty_Hour);
       Hour.add(TwentyOne_Hour);
       Hour.add(TwentyTwo_Hour);
       Hour.add(TwentyThree_Hour);
       Hour.add(TwentyFour_Hour);
       
        
        
       
            
            JScrollPane pane = new JScrollPane(tableSP);
            pane.setBounds(0, 0, 880, 200);
            
               frameSP.setLayout(null);
        
               frameSP.add(pane);
             
             frameSP.add(labDate);
             frameSP.add(labTime);
             frameSP.add(labHours);
             frameSP.add(labCost);
    
             frameSP.add(txtCost);
             frameSP.add(txtDate);
             frameSP.add(ComTime);
             
    
    
    
             frameSP.add(ComDayIN);
             frameSP.add(ComMonthIN);
             frameSP.add(ComYearIN);
    
             frameSP.add(One_Hour);
             frameSP.add(Two_Hour);
             frameSP.add(Three_Hour);
             frameSP.add(Four_Hour);
              frameSP.add(Five_Hour);
             frameSP.add(Six_Hour);
             frameSP.add(Seven_Hour);
             frameSP.add(Eight_Hour);
              frameSP.add(Nine_Hour);
             frameSP.add(Ten_Hour);
             frameSP.add(elven_Hour);
             frameSP.add(twelve_Hour);
              frameSP.add(thirteen_Hour);
             frameSP.add(Fourteen_Hour);
             frameSP.add(Fiveteen_Hour);
             frameSP.add(Sixteen_Hour);
              frameSP.add(Seventeen_Hour);
             frameSP.add(Eightteen_Hour);
             frameSP.add(Nineteen_Hour);
             frameSP.add(Twenty_Hour);
              frameSP.add(TwentyOne_Hour);
              frameSP.add(TwentyTwo_Hour);
              frameSP.add(TwentyThree_Hour);
              frameSP.add(TwentyFour_Hour);
        
        
             frameSP.add(btnDate);
             frameSP.add(btnCost);
              frameSP.add(btnAdd);
             frameSP.add(btnDelete);
             frameSP.add(btnUpdate);
             frameSP.add(btnBack);
             frameSP.add(btnExit);
             frameSP.add(btnSave);
             btnDate.addActionListener(new ActionListener() 
             {
               @Override
               public void actionPerformed(ActionEvent ae) 
               {
                   
              String str = (String)ComDayIN.getSelectedItem()+"/"+(String)ComMonthIN.getSelectedItem()+"/"+(String)ComYearIN.getSelectedItem();
     
                   if (ae.getSource()==btnDate)
                    {
                        txtDate.setText(str);
                    }
                  
                  
            
               }
               
           });
             
             btnCost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = btnCost.getText();
             
                if (ae.getSource()==btnCost)
                {
                   if(One_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_One_Hour));
     
                   }
                   if(Two_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Two_Hour));
     
                   }
                   if(Three_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Three_Hour));
     
                   }
                   if(Four_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Four_Hour));
     
                   }
                   if(Five_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Five_Hour));
     
                   }
                   if(Six_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Six_Hour));
     
                   }
                   if(Seven_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Seven_Hour));
     
                   }
                   if(Eight_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Eight_Hour));
     
                   }
                   if(Nine_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Nine_Hour));
     
                   }
                   if(Ten_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Ten_Hour));
     
                   }
                   if(elven_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_elven_Hour));
     
                   }
                   if(twelve_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_twelve_Hour));
     
                   }
                   if(thirteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_thirteen_Hour));
     
                   }
                   if(Fourteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Fourteen_Hour));
     
                   }
                   if(Fiveteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Fiveteen_Hour));
     
                   }
                   if(Sixteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Sixteen_Hour));
     
                   }
                   if(Seventeen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Seventeen_Hour));
     
                   }
                   if(Eightteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Eightteen_Hour));
     
                   }
                   if(Nineteen_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Nineteen_Hour));
     
                   }
                   if(Twenty_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_Twenty_Hour));
     
                   }
                   if(TwentyOne_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_TwentyOne_Hour));
     
                   }
                   if(TwentyTwo_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_TwentyTwo_Hour));
     
                   }
                   if(TwentyThree_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_TwentyThree_Hour));
     
                   }
                   if(TwentyFour_Hour.isSelected())
                   {    

                        txtCost.setText(String.valueOf(price_TwentyFour_Hour));
     
                   }
                  
                   
                   btnCost.setText(price);
                }
            }
                });
             

              final Object[] row = new Object[4];
             btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Object ODate = txtDate.getText();
                Object OTime = ComTime.getSelectedItem();
                Object OCost = txtCost.getText();
                Object OOne_Hour = One_Hour.getText();
                Object OTwo_Hour = Two_Hour.getText();
                Object OThree_Hour = Three_Hour.getText();
                Object OFour_Hour = Four_Hour.getText();
                Object OFive_Hour = Five_Hour.getText();
                Object OSix_Hour = Six_Hour.getText();
                Object OSeven_Hour = Seven_Hour.getText();
                Object OEight_Hour = Eight_Hour.getText();
                Object ONine_Hour = Nine_Hour.getText();
                Object OTen_Hour = Ten_Hour.getText();
                Object Oelven_Hour = elven_Hour.getText();
                Object Otwelve_Hour = twelve_Hour.getText();
                Object Othirteen_Hour = thirteen_Hour.getText();
                Object OFourteen_Hour = Fourteen_Hour.getText();
                Object OFiveteen_Hour = Fiveteen_Hour.getText();
                Object OSixteen_Hour = Sixteen_Hour.getText();
                Object OSeventeen_Hour = Seventeen_Hour.getText();
                Object OEightteen_Hour = Eightteen_Hour.getText();
                Object ONineteen_Hour = Nineteen_Hour.getText();
                Object OTwenty_Hour = Twenty_Hour.getText();
                Object OTwentyOne_Hour = TwentyOne_Hour.getText();
                Object OTwentyTwo_Hour = TwentyTwo_Hour.getText();
                Object OTwentyThree_Hour = TwentyThree_Hour.getText();
                Object OTwentyFour_Hour = TwentyFour_Hour.getText();
                
                Object n = "";
                if( !OCost.equals(n) &&!OTime.equals(n) &&!ODate.equals(n) && !OOne_Hour.equals(n) 
                        && !OTwo_Hour.equals(n) && !OThree_Hour.equals(n)
                        && !OFour_Hour.equals(n)&& !OFive_Hour.equals(n)
                        && !OSix_Hour.equals(n)&& !OSeven_Hour.equals(n)
                        && !OEight_Hour.equals(n)&& !ONine_Hour.equals(n)
                        && !OTen_Hour.equals(n)&& !Oelven_Hour.equals(n)
                        && !Otwelve_Hour.equals(n)&& !Othirteen_Hour.equals(n)
                        && !OFourteen_Hour.equals(n)&& !OFiveteen_Hour.equals(n)
                        && !OSixteen_Hour.equals(n)&& !OSeventeen_Hour.equals(n)
                        && !OEightteen_Hour.equals(n)&& !ONineteen_Hour.equals(n)
                        && !OTwenty_Hour.equals(n)&& !OTwentyOne_Hour.equals(n)
                        && !OTwentyTwo_Hour.equals(n)&& !OTwentyThree_Hour.equals(n)
                        && !OTwentyFour_Hour.equals(n))
                        
                {
                    row[0] = txtDate.getText();
                    row[1] = ComTime.getSelectedItem();
                    
                    
                 if (One_Hour.isSelected())
                {
                    row[2] = One_Hour.getText();
                }
              else if (Two_Hour.isSelected())
                {
                    row[2] = Two_Hour.getText();
                }
              else if (Three_Hour.isSelected())
                {
                     row[2] = Three_Hour.getText();
                }
              else if (Four_Hour.isSelected())
                {
                      row[2] = Four_Hour.getText();
                }
  
              
              else if (Five_Hour.isSelected())
                {
                     row[2] = Five_Hour.getText();
                }
              else if (Six_Hour.isSelected())
                {
                     row[2] = Six_Hour.getText();
                }
              else if (Seven_Hour.isSelected())
                {
                     row[2] = Seven_Hour.getText();
                }
                 
                  else if (Eight_Hour.isSelected())
                {
                    row[2] = Eight_Hour.getText();
                }
              else if (Nine_Hour.isSelected())
                {
                     row[2] = Nine_Hour.getText();
                }
              else if (Ten_Hour.isSelected())
                {
                      row[2] = Ten_Hour.getText();
                }
  
              
              else if (elven_Hour.isSelected())
                {
                    row[2] = elven_Hour.getText();
                }
              else if (twelve_Hour.isSelected())
                {
                     row[2] = twelve_Hour.getText();
                }
              else if (thirteen_Hour.isSelected())
                {
                      row[2] = thirteen_Hour.getText();
                }
  
              
              else if (Fourteen_Hour.isSelected())
                {
                     row[2] = Fourteen_Hour.getText();
                }
              else if (Fiveteen_Hour.isSelected())
                {
                     row[2] = Fiveteen_Hour.getText();
                }
              else if (Sixteen_Hour.isSelected())
                {
                     row[2] = Sixteen_Hour.getText();
                }
                 
                  else if (Seventeen_Hour.isSelected())
                {
                    row[2] = Seventeen_Hour.getText();
                }
              else if (Eightteen_Hour.isSelected())
                {
                     row[2] = Eightteen_Hour.getText();
                }
              else if (Nineteen_Hour.isSelected())
                {
                      row[2] = Nineteen_Hour.getText();
                }
                 else if (Twenty_Hour.isSelected())
                {
                     row[2] = Twenty_Hour.getText();
                }
              else if (TwentyOne_Hour.isSelected())
                {
                     row[2] = TwentyOne_Hour.getText();
                }
                 
                  else if (TwentyTwo_Hour.isSelected())
                {
                    row[2] = TwentyTwo_Hour.getText();
                }
              else if (TwentyThree_Hour.isSelected())
                {
                     row[2] = TwentyThree_Hour.getText();
                }
              else if (TwentyFour_Hour.isSelected())
                {
                      row[2] = TwentyFour_Hour.getText();
                }
                
                  row[3] = txtCost.getText();

               modelG.addRow(row);
            }
                else
                {
                    JOptionPane.showMessageDialog(null,"Add Error","error",JOptionPane.ERROR_MESSAGE);
                }
              
           
                // add row to the model
//               
          }
        });
             
              btnDelete.addActionListener(new ActionListener()
            {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
            
                // i = the index of the selected row
                int i = tableSP.getSelectedRow();
                if(i >= 0)
                {
                    // remove a row from jtable
                    modelG.removeRow(i);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Delete Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
              
              
              btnUpdate.addActionListener(new ActionListener()
            {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
             
                // i = the index of the selected row
                int i = tableSP.getSelectedRow();
                
                if(i >= 0) 
                {
                   modelG.setValueAt(txtDate.getText(), i, 0);
                   modelG.setValueAt(ComTime.getSelectedItem(), i, 1);
                   
                    if (One_Hour.isSelected())
                {
                     modelG.setValueAt(One_Hour.getText(), i, 2);
                }
              else if (Two_Hour.isSelected())
                {
                    modelG.setValueAt(Two_Hour.getText(), i, 2);
                }
              else if (Three_Hour.isSelected())
                {
                     modelG.setValueAt(Three_Hour.getText(), i, 2);
                }
              else if (Four_Hour.isSelected())
                {
                      modelG.setValueAt(Four_Hour.getText(), i, 2);
                }
  
              
              else if (Five_Hour.isSelected())
                {
                      modelG.setValueAt(Five_Hour.getText(), i, 2);
                }
              else if (Six_Hour.isSelected())
                {
                     modelG.setValueAt(Six_Hour.getText(), i, 2);
                }
              else if (Seven_Hour.isSelected())
                {
                    modelG.setValueAt(Seven_Hour.getText(), i, 2);
                }
                 
                  else if (Eight_Hour.isSelected())
                {
                     modelG.setValueAt(Eight_Hour.getText(), i, 2);
                }
              else if (Nine_Hour.isSelected())
                {
                     modelG.setValueAt(Nine_Hour.getText(), i, 2);
                }
              else if (Ten_Hour.isSelected())
                {
                      modelG.setValueAt(Ten_Hour.getText(), i, 2);
                }
  
              
              else if (elven_Hour.isSelected())
                {
                    modelG.setValueAt(elven_Hour.getText(), i, 2);
                }
              else if (twelve_Hour.isSelected())
                {
                    modelG.setValueAt(twelve_Hour.getText(), i, 2);
                }
              else if (thirteen_Hour.isSelected())
                {
                      modelG.setValueAt(thirteen_Hour.getText(), i, 2);
                }
  
              
              else if (Fourteen_Hour.isSelected())
                {
                     modelG.setValueAt(Fourteen_Hour.getText(), i, 2);
                }
              else if (Fiveteen_Hour.isSelected())
                {
                     modelG.setValueAt(Fiveteen_Hour.getText(), i, 2);
                }
              else if (Sixteen_Hour.isSelected())
                {
                     modelG.setValueAt(Sixteen_Hour.getText(), i, 2);
                }
                 
                  else if (Seventeen_Hour.isSelected())
                {
                    modelG.setValueAt(Seventeen_Hour.getText(), i, 2);
                }
              else if (Eightteen_Hour.isSelected())
                {
                      modelG.setValueAt(Eightteen_Hour.getText(), i, 2);
                }
              else if (Nineteen_Hour.isSelected())
                {
                      modelG.setValueAt(Nineteen_Hour.getText(), i, 2);
                }
                 else if (Twenty_Hour.isSelected())
                {
                     modelG.setValueAt(Twenty_Hour.getText(), i, 2);
                }
              else if (TwentyOne_Hour.isSelected())
                {
                     modelG.setValueAt(TwentyOne_Hour.getText(), i, 2);
                }
                 
                  else if (TwentyTwo_Hour.isSelected())
                {
                    modelG.setValueAt(TwentyTwo_Hour.getText(), i, 2);
                }
              else if (TwentyThree_Hour.isSelected())
                {
                     modelG.setValueAt(TwentyThree_Hour.getText(), i, 2);
                }
              else if (TwentyFour_Hour.isSelected())
                {
                      modelG.setValueAt(TwentyFour_Hour.getText(), i, 2);
                }
                
       
             
                  
                   modelG.setValueAt(txtCost.getText(), i, 3);
                   
//                   if (btnUpdate.equals(NoOfNights.getText()))
//                   {
//                       JOptionPane.showMessageDialog(null,"you can't update number of night","error",JOptionPane.ERROR_MESSAGE);
//                   }
                   
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Update Error","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
              
                         
                     
//         btnBack.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               
////            Choose_User secondform = new Choose_User();
//          //  secondform.setVisible(true);
//            dispose();
//    
//           //frameG.setVisible(false);
//            }
//       });
         

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
        
        txtDate.addActionListener(new SaveDate());
ComTime.addActionListener(new SaveTime());
One_Hour.addActionListener(new SaveOne_Hour());
Two_Hour.addActionListener(new SaveTwo_Hour());
Three_Hour.addActionListener(new SaveThree_Hour());
Four_Hour.addActionListener(new SaveFour_Hour());
Five_Hour.addActionListener(new SaveFive_Hour());
Six_Hour.addActionListener(new SaveSix_Hour());
Seven_Hour.addActionListener(new SaveSeven_Hour());
Eight_Hour.addActionListener(new SaveEight_Hour());
Nine_Hour.addActionListener(new SaveNine_Hour());
Ten_Hour.addActionListener(new SaveTen_Hour());
elven_Hour.addActionListener(new Saveelven_Hour());
twelve_Hour.addActionListener(new Savetwelve_Hour());
thirteen_Hour.addActionListener(new Savethirteen_Hour());
Fourteen_Hour.addActionListener(new SaveFourteen_Hour());
Fiveteen_Hour.addActionListener(new SaveFiveteen_Hour());
Sixteen_Hour.addActionListener(new SaveSixteen_Hour());
Seventeen_Hour.addActionListener(new SaveSeventeen_Hour());
Eightteen_Hour.addActionListener(new SaveEightteen_Hour());
Nineteen_Hour.addActionListener(new SaveNineteen_Hour());
Twenty_Hour.addActionListener(new SaveTwenty_Hour());
TwentyOne_Hour.addActionListener(new SaveTwentyOne_Hour());
TwentyTwo_Hour.addActionListener(new SaveTwentyTwo_Hour());
TwentyThree_Hour.addActionListener(new SaveTwentyThree_Hour());
TwentyFour_Hour.addActionListener(new SaveTwentyFour_Hour());



btnSave.addActionListener(new Save());

                 frameSP.setSize(900, 700);
                 frameSP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSP.setVisible(true);

      }   
       private class SaveDate implements ActionListener 
       {

             @Override
	     public void actionPerformed(ActionEvent arg0) 
             {
                CSP.Date=txtDate.getText();
        
	     }
      }
       private class SaveTime implements ActionListener 
       {

        @Override
	public void actionPerformed(ActionEvent arg0) 
        {
            CSP.Time= (String) ComTime.getSelectedItem();
        
	}
      }
      private class SaveOne_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.One_Hour=One_Hour.getText();
        
	}
}
      private class SaveTwo_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Two_Hour= Two_Hour.getText();
        
	}
}
      private class SaveThree_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Three_Hour=(String) Three_Hour.getText();
        
	}
}
  private class SaveFour_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Four_Hour=Four_Hour.getText();
        
	}
}
       private class SaveFive_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Five_Hour=Five_Hour.getText();
        
	}
	}
         private class SaveSix_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Six_Hour=Six_Hour.getText();
        
	}
	}
          private class SaveSeven_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Seven_Hour=Seven_Hour.getText();
        
	}
	}
           private class SaveEight_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Eight_Hour=Eight_Hour.getText();
        
	}
	}
            private class SaveNine_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Nine_Hour=Nine_Hour.getText();
        
	}
	}
            
             private class SaveTen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Ten_Hour=Ten_Hour.getText();
        
	}
	}
             
             private class Saveelven_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.elven_Hour=elven_Hour.getText();
        
	}
}
      private class Savetwelve_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.twelve_Hour= twelve_Hour.getText();
        
	}
}
      private class Savethirteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.thirteen_Hour= thirteen_Hour.getText();
        
	}
}
  private class SaveFourteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Fourteen_Hour=Fourteen_Hour.getText();
        
	}
}
       private class SaveFiveteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Fiveteen_Hour=Fiveteen_Hour.getText();
        
	}
	}
         private class SaveSixteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Sixteen_Hour=Sixteen_Hour.getText();
        
	}
	}
          private class SaveSeventeen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Seventeen_Hour=Seventeen_Hour.getText();
        
	}
	}
           private class SaveEightteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Eightteen_Hour=Eightteen_Hour.getText();
        
	}
	}
            private class SaveNineteen_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Nineteen_Hour=Nineteen_Hour.getText();
        
	}
	}
            
             private class SaveTwenty_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.Twenty_Hour=Twenty_Hour.getText();
        
	}
	}
              private class SaveTwentyOne_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.TwentyOne_Hour=TwentyOne_Hour.getText();
        
	}
	}
               private class SaveTwentyTwo_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.TwentyTwo_Hour=TwentyTwo_Hour.getText();
        
	}
	}
                private class SaveTwentyThree_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.TwentyThree_Hour=TwentyThree_Hour.getText();
        
	}
	}
                 private class SaveTwentyFour_Hour implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CSP.TwentyFour_Hour=TwentyFour_Hour.getText();
        
	}
	}

        private class Save implements ActionListener 
        {

                @Override
                public void actionPerformed(ActionEvent arg0) 
                {
                        ObjectOutputStream bin = null;
                    try 
                    {
                        Contant_of_Spa.add(CSP);
                        bin = new ObjectOutputStream(new FileOutputStream("Spa.txt"));
                        bin.writeObject(Contant_of_Spa.add(CSP));
                        bin.close();
                        JOptionPane.showMessageDialog(null, " Saved");
                    } catch (IOException ex) 
                    {

                    } finally 
                    {
                        try 
                        {
                            bin.close();
                        } 
                        catch (IOException ex) 
                        {

                        }
                    }

                }
        }
}
   
