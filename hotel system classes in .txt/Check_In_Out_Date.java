/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

  
import hotelsystem.newpackage.Contact_of_Date;
import hotelsystem.newpackage1.Choose;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.Action;
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
public class Check_In_Out_Date extends JFrame
{
    private final int priceSingal = 50;
    private final int priceDouble=100;
    private final int priceMultiple=130;
    private final int priceFamily=200;
    //private final int priceChild =30;
    
    private final int SeaView =50;
    private final int GardenView =20;
    private final int SwimmingPoolView =30;
    private final int NoView = 10;
    private int result;
    
    JFrame frameD;
    JLabel labCheckInDate;
    JLabel labCheckOutDate;
    JLabel labNights;
    JLabel labCost;
    
    JTextField txtCheckInDate;
    JTextField txtCheckOutDate;
    JTextField txtNoOfNights;
    JTable tableD;
    
      JLabel labview;
    JLabel labtyperoom;
    JRadioButton seaview;
    
    JRadioButton gardenview;
    JRadioButton swimmingpoolview;
    JRadioButton noseaview;
    ButtonGroup View;
    
    JRadioButton Single;
    JRadioButton Double;
    JRadioButton Multiple;
    JRadioButton Family;
    ButtonGroup TypeRoom;
    
    JScrollPane pane;
    
    JTextField txtCostOfNights;
    JLabel labcostOfNights;
    JTextField txtCostPerNight;
    
    JComboBox ComDayIN;
    JComboBox ComMonthIN;
    JComboBox ComYearIN;
    JComboBox ComDayOUT;
    JComboBox ComMonthOUT;
    JComboBox ComYearOUT;
    
    
    JButton btnNights;
    JButton  btnToCal;
    JButton btnCostPerNight;
    JButton btnCostOfNights;
    JButton btnFullDateIN; 
    JButton btnFullDateOUT; 
    JButton btnAdd;
    JButton btnDelete;
    JButton btnUpdate;
    JButton btnBack;
    JButton btnExit;
    JButton btnSave;
    
    ArrayList <Contact_of_Date> Contact_of_Date = new ArrayList<>();
    Contact_of_Date CD=new Contact_of_Date(); 
       public Check_In_Out_Date() throws Exceptions
       {
           frameD = new JFrame("Date");
           try{
           
         BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25436225_2254547534771773_1820980543_n.jpg"));
//        
            frameD.setContentPane(new ImagePanel(myImage));
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
//           BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\25436225_2254547534771773_1820980543_n.jpg"));
//        
//           frameD.setContentPane(new ImagePanel(myImage));
           
           tableD = new JTable();
     
    // create a table model and set a Column Identifiers to this model
    Object [] columnsG = {"Check In Date","Check Out Date" , "Number of Nights","Room Type","View","Cost of Nights"};
    final DefaultTableModel modelG = new DefaultTableModel();
    modelG.setColumnIdentifiers(columnsG);
    
    
    // set the model to the table
        tableD.setModel(modelG);
       
       
       tableD.setBackground(Color.YELLOW);
            labCheckInDate = new JLabel("Check-In Date: ");
            labCheckOutDate = new JLabel("Check-Out Date: ");
            labNights = new JLabel("Nights: ");
            

             labCheckInDate.setBounds(5, 220, 100, 25);
             labCheckOutDate.setBounds(5, 300, 150, 25);
             labNights.setBounds(5, 350, 150, 25);
             
             ComDayIN = new JComboBox();
             ComDayIN.addItem("Day");
             int daysbegins = 0;
             for(int i=0 ; i<31 ;i++)
             {
                 String x ="";
                 daysbegins++;
                 x = Integer.toString(daysbegins);
                 ComDayIN.addItem(x);  
             }
             
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
             int yeardate = 2015;
             for(int i=0 ; i<45;i++)
             {
                 String x = "";
                 yeardate++;
                 x=Integer.toString(yeardate);
                 ComYearIN.addItem(x);
             }
             
             
            ComYearIN.setBounds(270, 220, 100, 25);
             
            
            ComDayOUT = new JComboBox();
             ComDayOUT.addItem("Day");
             ComDayOUT.addItem("1");
             ComDayOUT.addItem("2");
             ComDayOUT.addItem("3");
             ComDayOUT.addItem("4");
             ComDayOUT.addItem("5");
             ComDayOUT.addItem("6");
             ComDayOUT.addItem("7");
             ComDayOUT.addItem("8");
             ComDayOUT.addItem("9");
             ComDayOUT.addItem("10");
             ComDayOUT.addItem("11");
             ComDayOUT.addItem("12");
             ComDayOUT.addItem("13");
             ComDayOUT.addItem("14");
             ComDayOUT.addItem("15");
             ComDayOUT.addItem("16");
             ComDayOUT.addItem("17");
             ComDayOUT.addItem("18");
             ComDayOUT.addItem("19");
             ComDayOUT.addItem("20");
             ComDayOUT.addItem("21");
             ComDayOUT.addItem("22");
             ComDayOUT.addItem("23");
             ComDayOUT.addItem("24");
             ComDayOUT.addItem("25");
             ComDayOUT.addItem("26");
             ComDayOUT.addItem("27");
             ComDayOUT.addItem("28");
             ComDayOUT.addItem("29");
             ComDayOUT.addItem("30");
             ComDayOUT.addItem("31");
             
             ComDayOUT.setBounds(100, 300, 50, 25); 
             
             
             ComMonthOUT= new JComboBox();
             ComMonthOUT.addItem("Month");
             ComMonthOUT.addItem("1");
             ComMonthOUT.addItem("2");
             ComMonthOUT.addItem("3");
             ComMonthOUT.addItem("4");
             ComMonthOUT.addItem("5");
             ComMonthOUT.addItem("6");
             ComMonthOUT.addItem("7");
             ComMonthOUT.addItem("8");
             ComMonthOUT.addItem("9");
             ComMonthOUT.addItem("10");
             ComMonthOUT.addItem("11");
             ComMonthOUT.addItem("12");
             
             ComMonthOUT.setBounds(160, 300, 100, 25); 
             
             
             ComYearOUT = new JComboBox();
             ComYearOUT.addItem("Year");
             ComYearOUT.addItem("2016"); 
             ComYearOUT.addItem("2017");
             ComYearOUT.addItem("2018");
             ComYearOUT.addItem("2020");
             ComYearOUT.addItem("2021");
             ComYearOUT.addItem("2022");
             ComYearOUT.addItem("2023");
             ComYearOUT.addItem("2024");
             ComYearOUT.addItem("2025");
             ComYearOUT.addItem("2026");
             ComYearOUT.addItem("2027");
             ComYearOUT.addItem("2028");
             ComYearOUT.addItem("2029");
             ComYearOUT.addItem("2030");
             ComYearOUT.addItem("2031");
             ComYearOUT.addItem("2032");
             ComYearOUT.addItem("2033");
             ComYearOUT.addItem("2034");
             ComYearOUT.addItem("2035");
             ComYearOUT.addItem("2036");
             ComYearOUT.addItem("2037");
             ComYearOUT.addItem("2038");
             ComYearOUT.addItem("2039");
             ComYearOUT.addItem("2040");
             ComYearOUT.addItem("2041");
             ComYearOUT.addItem("2042");
             ComYearOUT.addItem("2043");
             ComYearOUT.addItem("2044");
             ComYearOUT.addItem("2045");
             ComYearOUT.addItem("2046");
             ComYearOUT.addItem("2047");
             ComYearOUT.addItem("2048");
             ComYearOUT.addItem("2049");
             ComYearOUT.addItem("2050");
             ComYearOUT.addItem("2051");
             ComYearOUT.addItem("2052");
             ComYearOUT.addItem("2053");
             ComYearOUT.addItem("2054");
             ComYearOUT.addItem("2055");
             ComYearOUT.addItem("2056");
             ComYearOUT.addItem("2057");
             ComYearOUT.addItem("2058");
             ComYearOUT.addItem("2059");
             ComYearOUT.addItem("2060");
             
             
            ComYearOUT.setBounds(270, 300, 100, 25);
             txtCheckInDate=new JTextField(); 
             txtCheckOutDate=new JTextField();
             txtNoOfNights=new JTextField();
             
             btnFullDateIN = new JButton("Date In"); 
             btnFullDateIN.setBounds(400, 220, 100, 25);
             
              btnFullDateOUT = new JButton("Date Out"); 
              btnFullDateOUT.setBounds(400, 300, 100, 25);
              
             txtCheckInDate.setBounds(550, 220, 100, 25); 
             txtCheckOutDate.setBounds(550, 300, 100, 25);
             txtNoOfNights.setBounds(230, 350, 100, 25);
             //btnNights.setBounds(70, 350, 130, 25);
             
       //create JLabel
       labtyperoom = new JLabel("Choose type room: ");
        labview = new JLabel("Choose view: ");
        labCost = new JLabel("Cost per night: ");
        labcostOfNights = new JLabel("Cost of nights: ");
        
        
        labtyperoom.setBounds(5, 400, 150, 25);
        labview.setBounds(5, 450, 100, 25);
        labCost.setBounds(5, 500, 100, 25);
        labcostOfNights.setBounds(5, 550, 100, 25);
        
       txtCostPerNight=new JTextField();
       txtCostPerNight.setBounds(230, 500, 100, 25);
       //ok.setBounds(70, 500, 250, 25);
       
        
        //create JRadioButton
         Single = new JRadioButton("Single");
         Double = new JRadioButton("Double");
         Multiple = new JRadioButton("Multiple");
         Family = new JRadioButton("Family");
        
       Single.setBounds(150, 400, 100, 25);
       Double.setBounds(250, 400, 100, 25);
       Multiple.setBounds(350, 400, 100, 25);
       Family.setBounds(450, 400, 100, 25);
       
       TypeRoom = new ButtonGroup();
       TypeRoom.add(Single);
       TypeRoom.add(Double);
       TypeRoom.add(Multiple);
       TypeRoom.add(Family);
       
       
       //create JRadioButton
         seaview = new JRadioButton("Sea");
         gardenview = new JRadioButton("Garden");
         swimmingpoolview = new JRadioButton("Swimming Pool");
         noseaview = new JRadioButton("No Sea View");
        
         seaview.setBounds(100, 450, 100, 25);
        gardenview.setBounds(200, 450, 100, 25);
        swimmingpoolview.setBounds(300, 450, 150, 25);
        noseaview.setBounds(450, 450, 100, 25);
        
        
        View = new ButtonGroup();
        View.add(seaview);
        View.add(gardenview);
        View.add(swimmingpoolview);
        View.add(noseaview);
           
         
         
         // create JButtons
         btnCostPerNight= new JButton("Calculate");
         btnCostOfNights = new JButton("Calculate");
         txtCostOfNights = new JTextField();
         btnCostPerNight.setBounds(100, 500, 100, 25);
        btnCostOfNights.setBounds(100, 550, 100, 25);
        txtCostOfNights.setBounds(230, 550, 100, 25);
        //txtCostPerNight.setBounds(230, 500, 100, 25); 
       
             
             btnNights = new JButton("No. Nights");
             btnAdd = new JButton("Add");
             btnDelete = new JButton("Delete");
             btnUpdate = new JButton("Update");   
             btnBack = new JButton("Back") ;
         btnExit = new JButton ("Exit");
        btnSave = new  JButton ("Save");
             
        btnNights.setBounds(70, 350, 130, 25);
        btnAdd.setBounds(700, 265, 100, 25);
        btnUpdate.setBounds(700, 300, 100, 25);
        btnDelete.setBounds(700, 340, 100, 25);
        btnSave.setBounds(620, 510, 100, 25);
        btnBack.setBounds(620, 550, 100, 25);
        btnExit.setBounds(620, 590, 100, 25);
             
            JScrollPane pane = new JScrollPane(tableD);
            pane.setBounds(0, 0, 880, 200);
        
        frameD.setLayout(null);
        
        frameD.add(pane);
             
        
        
        
        
             //Add JLabel to the jframe
             frameD.add(labCheckInDate);
             frameD.add(labCheckOutDate);
             frameD.add(labNights);
             frameD.add(btnNights);
             frameD.add(labcostOfNights);
             
              //Add JLabel to the jframe
         frameD.add(labview);
         frameD.add(labtyperoom);
         frameD.add(labCost);
         
         //Add JRadioButton to the jframe
         frameD.add(seaview);
         frameD.add(gardenview);
        frameD.add(swimmingpoolview);
        frameD.add(noseaview);
        
        //add JCheckBox to the jframe
        frameD.add(Single);
        frameD.add(Double);
        frameD.add(Multiple);
        frameD.add(Family);
        
        //add JButtons to the jframe
  
        //frameCN.add(btnToCal);
        frameD.add(txtCostPerNight);
        frameD.add(btnCostPerNight); 
             
             frameD.add(btnCostOfNights);
             frameD.add(txtCostOfNights);
             frameD.add(btnAdd);
        frameD.add(btnDelete);
        frameD.add(btnUpdate);
        frameD.add(btnBack);
        frameD.add(btnExit);
        frameD.add(btnSave);
             
         frameD.add(btnFullDateOUT);    
        frameD.add(btnFullDateIN);
        frameD.add(ComDayIN);
        frameD.add(ComMonthIN);
        frameD.add(ComYearIN);
         frameD.add(ComDayOUT);
        frameD.add(ComMonthOUT);
        frameD.add(ComYearOUT);
        
             //Add JTextField to the jframe
             frameD.add(txtCheckInDate);
             frameD.add(txtCheckOutDate);
             frameD.add(txtNoOfNights);
             
             btnFullDateIN.addActionListener(new ActionListener() 
             {
               @Override
               public void actionPerformed(ActionEvent ae) 
               {
                   
              String str = (String)ComDayIN.getSelectedItem()+"/"+(String)ComMonthIN.getSelectedItem()+"/"+(String)ComYearIN.getSelectedItem();
     
                   if (ae.getSource()==btnFullDateIN)
                    {
                        txtCheckInDate.setText(str);
                    }
                  
                  
            
               }
               
           });
             
              btnFullDateOUT.addActionListener(new ActionListener() 
             {
               @Override
               public void actionPerformed(ActionEvent ae) 
               {
                   
              String str = (String)ComDayOUT.getSelectedItem()+"/"+(String)ComMonthOUT.getSelectedItem()+"/"+(String)ComYearOUT.getSelectedItem();
     
                   if (ae.getSource()==btnFullDateOUT)
                    {
                        txtCheckOutDate.setText(str);
                    }
                  
                  
            
               }
               
           });
                     
                     
             
             
             
              final Object[] row = new Object[6];
               btnNights.addActionListener(new ActionListener() {
               
             @Override
               public void actionPerformed(ActionEvent ae) {
                   SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
                 //  String str;
	            String InDateString = txtCheckInDate.getText();
	            String OutDateString = txtCheckOutDate.getText();
                    String Nights;
                    String year = "1/1/2017";
               
   
              
               
   
              

	 try {

             
	       Date InDate = myFormat.parse(InDateString);
	       Date OutDate = myFormat.parse(OutDateString);
               Date y = myFormat.parse(year);
	       long difference = OutDate.getTime() - InDate.getTime();
               
	       long daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween = 
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
               if (OutDate.before(InDate))
               {
                   JOptionPane.showMessageDialog(null,"Error: Check out date before check in date","Wrong",JOptionPane.ERROR_MESSAGE);
                   
                   
                   
               }
               else if (InDate.before(y))
               {
                         JOptionPane.showMessageDialog(null,"Error: Check in date before the day in the year","Wrong",JOptionPane.ERROR_MESSAGE);  
               }
               else if (OutDate.before(InDate) && InDate.before(y))
               {
                   JOptionPane.showMessageDialog(null,"Error: Check out date before check in date and Check in date before the day in the year","Wrong",JOptionPane.ERROR_MESSAGE);
               }
               else
               {
                    Nights= txtNoOfNights.getText()+ daysBetween;
                    txtNoOfNights.setText(String.valueOf(Nights));
                    row[2] = txtNoOfNights.getText();
               }
               
	 }
         catch (Exception e) 
         {
	       
	 }


               }
               });
                  
              //btnNights* ok;
               btnCostPerNight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = btnCostPerNight.getText();
             
             
                if (ae.getSource()==btnCostPerNight)
                {
                   if(seaview.isSelected() && Single.isSelected() )
                   {    
                       
                           result =priceSingal+SeaView;
                           
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                    
                
                   
                   if(seaview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+SeaView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(seaview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+SeaView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(seaview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+SeaView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+GardenView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Double.isSelected())
                   {
                       
                            result =priceDouble+GardenView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+GardenView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+GardenView;
                           
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(swimmingpoolview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+SwimmingPoolView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+SwimmingPoolView;
                           
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+SwimmingPoolView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+SwimmingPoolView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                    if(noseaview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+NoView;
                           
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+NoView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+NoView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+NoView;
                            
                            txtCostPerNight.setText(String.valueOf(result));
                       
                           
                   }
                        btnCostPerNight.setText(price);
                }        
                          
                 }    

            
            });  
               
               
             btnCostOfNights.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent ae) {
                   //String total = cost.getText();
                   
                   int NoOfNights = Integer.parseInt(txtNoOfNights.getText());
                   int CostPerNight = Integer.parseInt(txtCostPerNight.getText());
                   int total = NoOfNights * CostPerNight;
                  txtCostOfNights.setText(total + "");
//                  String string1 = ".5";//Double in a string
//String string2 = "6"; //Integer in a string
//double multiplied = Double.parseDouble(string1) * Integer.parseInt(string2) * 3; 
//                   Integer.valueOf(jtextField1.getText()) * Integer.valueOf(jtextField.getText());
                   row[5] = txtCostOfNights.getText();
               }
           });
               
              btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Object InDate = txtCheckInDate.getText();
                Object OutDate = txtCheckOutDate.getText();
                Object OSingle = Single.getText();
                Object ODouble = Double.getText();
                Object OMultiple = Single.getText();
                Object OFamily = Double.getText();
                Object Oseaview = seaview.getText();
                Object Ogardenview = gardenview.getText();
                Object Oswimmingpoolview = swimmingpoolview.getText();
                Object Onoseaview = noseaview.getText();
                
                Object n = "";
                if( !InDate.equals(n) && !OutDate.equals(n) 
                        && !OSingle.equals(n) && !ODouble.equals(n)
                        && !OMultiple.equals(n)&& !OFamily.equals(n)
                        && !Oseaview.equals(n)&& !Ogardenview.equals(n)
                        && !Oswimmingpoolview.equals(n)&& !Onoseaview.equals(n))
                {
                    row[0] = txtCheckInDate.getText();
                  row[1] = txtCheckOutDate.getText(); 
                 if (Single.isSelected())
                {
                    row[3] = Single.getText();
                }
              else if (Double.isSelected())
                {
                    row[3] = Double.getText();
                }
              else if (Multiple.isSelected())
                {
                     row[3] = Multiple.getText();
                }
              else if (Family.isSelected())
                {
                      row[3] = Family.getText();
                }
              
              
              
              
              
               if (seaview.isSelected())
                {
                     row[4] = seaview.getText();
                }
              else if (gardenview.isSelected())
                {
                     row[4] = gardenview.getText();
                }
              else if (swimmingpoolview.isSelected())
                {
                     row[4] = swimmingpoolview.getText();
                }
              else if (noseaview.isSelected())
                {
                     row[4] = noseaview.getText();
                }
                

                    
               
            
              row[0] = txtCheckInDate.getText();
              row[1] = txtCheckOutDate.getText(); 
              if (Single.isSelected())
                {
                    row[3] = Single.getText();
                }
              else if (Double.isSelected())
                {
                    row[3] = Double.getText();
                }
              else if (Multiple.isSelected())
                {
                     row[3] = Multiple.getText();
                }
              else if (Family.isSelected())
                {
                      row[3] = Family.getText();
                }
              
              
              
              
              
               if (seaview.isSelected())
                {
                     row[4] = seaview.getText();
                }
              else if (gardenview.isSelected())
                {
                     row[4] = gardenview.getText();
                }
              else if (swimmingpoolview.isSelected())
                {
                     row[4] = swimmingpoolview.getText();
                }
              else if (noseaview.isSelected())
                {
                     row[4] = noseaview.getText();
                }
                modelG.addRow(row);
            }
                else
                {
                    JOptionPane.showMessageDialog(null,"Add Error","error",JOptionPane.ERROR_MESSAGE);
                }
              
           
                // add row to the model
               
            }

        });
            btnDelete.addActionListener(new ActionListener()
            {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
            
                // i = the index of the selected row
                int i = tableD.getSelectedRow();
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
                int i = tableD.getSelectedRow();
                
                if(i >= 0) 
                {
                   modelG.setValueAt(txtCheckInDate.getText(), i, 0);
                   modelG.setValueAt(txtCheckOutDate.getText(), i, 1);
                   modelG.setValueAt(txtNoOfNights.getText(), i, 2);
                   if (Single.isSelected())
                {
                     modelG.setValueAt(Single.getText(), i, 3);
                }
              else if (Double.isSelected())
                {
                    modelG.setValueAt(Double.getText(), i, 3);
                }
              else if (Multiple.isSelected())
                {
                     modelG.setValueAt(Multiple.getText(), i, 3);
                }
              else if (Family.isSelected())
                {
                     modelG.setValueAt(Family.getText(), i, 3);
                }
              
              
              
              
              
               if (seaview.isSelected())
                {
                     modelG.setValueAt(seaview.getText(), i, 4);
                }
              else if (gardenview.isSelected())
                {
                     modelG.setValueAt(gardenview.getText(), i, 4);
                }
              else if (swimmingpoolview.isSelected())
                {
                     modelG.setValueAt(swimmingpoolview.getText(), i, 4);
                }
              else if (noseaview.isSelected())
                {
                      modelG.setValueAt(noseaview.getText(), i, 4);
                }
       
             
                  
                   modelG.setValueAt(txtCostOfNights.getText(), i, 5);
                   
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
           
                     
         btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Choose secondform = new Choose();
                    secondform.setVisible(true);
                    dispose();
                    
                    frameD.setVisible(false);
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
        
 
 txtCheckInDate.addActionListener(new SaveCheckInDate());
txtCheckOutDate.addActionListener(new SaveCheckOutDate());
txtNoOfNights.addActionListener(new SaveNoOfNights());
Single.addActionListener(new SaveSingle());
Double.addActionListener(new SaveDouble());
Multiple.addActionListener(new SaveMultiple());
Family.addActionListener(new SaveFamily());
seaview.addActionListener(new Saveseaview());
gardenview.addActionListener(new Savegardenview());
swimmingpoolview.addActionListener(new Saveswimmingpoolview());
noseaview.addActionListener(new Savenoseaview());



btnSave.addActionListener(new Save());

                 frameD.setSize(900, 700);
                 frameD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameD.setVisible(true);

      }   
       private class SaveCheckInDate implements ActionListener 
       {

             @Override
	     public void actionPerformed(ActionEvent arg0) 
             {
                CD.CheckInDate=txtCheckInDate.getText();
        
	     }
      }
       private class SaveCheckOutDate implements ActionListener 
       {

        @Override
	public void actionPerformed(ActionEvent arg0) 
        {
            CD.CheckOutDate= txtCheckOutDate.getText();
        
	}
      }
      private class SaveNoOfNights implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.NoOfNights=txtNoOfNights.getText();
        
	}
}
      private class SaveSingle implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.Single= Single.getText();
        
	}
}
      private class SaveDouble implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.Double=(String) Double.getText();
        
	}
}
  private class SaveMultiple implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.Multiple=Multiple.getText();
        
	}
}
       private class SaveFamily implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.Family=Family.getText();
        
	}
	}
         private class Saveseaview implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.seaview=seaview.getText();
        
	}
	}
          private class Savegardenview implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.gardenview=gardenview.getText();
        
	}
	}
           private class Saveswimmingpoolview implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.swimmingpoolview=swimmingpoolview.getText();
        
	}
	}
            private class Savenoseaview implements ActionListener {

   
        @Override
	public void actionPerformed(ActionEvent arg0) {
            CD.noseaview=noseaview.getText();
        
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
private class Save implements ActionListener 
{

        @Override
	public void actionPerformed(ActionEvent arg0) 
        {
                ObjectOutputStream bin = null;
            try 
            {
                Contact_of_Date.add(CD);
                bin = new ObjectOutputStream(new FileOutputStream("Date.txt"));
                bin.writeObject(Contact_of_Date.add(CD));
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



