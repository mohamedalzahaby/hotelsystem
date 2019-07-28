/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class ProductCost extends JFrame 
{
    private final int Cribs_and_Crib_Accessories = 300;
    private final int  Alarm_Clocks_Radios=300;
    private final int Room_Coffee_Makers=300;
    private final int Hair_Dryers=200;
    private final int Ironing_and_Laundry_Supplies =130;
    private final int Service_Trays = 300;
    private final int  Coffee_Condiment_Kits=200;
    private final int Folding_Luggage_Racks_and_Hotel_Luggage_Racks=300;
   private final int Air_Purifiers =700;
   private final int  Cookware_Sets=100;
    private final int Kitchen_Appliances=300;
   private final int Towel_Trays =700;
   
   
   
   
   
   
    private final int Tables =600;
    private final int Tissue_Box_Covers =150;
     private final int Tumbler_Glasses =150;
      private final int Trash_Cans =150;
   
    private int result;
    
    JFrame frameCN ;
   
    
    JLabel labview;
    //JLabel labtyperoom;
     JRadioButton Trash_Can;
    JRadioButton Table;
    JRadioButton Tissue_Box_Cover;
    JRadioButton Tumbler_Glasse;
   
    ButtonGroup View;

    JCheckBox Cribs_and_Crib_Accessoriess;
    JCheckBox Alarm_Clocks_Radio;
    JCheckBox Room_Coffee_Maker;
    JCheckBox Hair_Dryer;
    JCheckBox Ironing_and_Laundry_Suppliess;
      JCheckBox Service_Tray;
    JCheckBox Coffee_Condiment_Kit;
    JCheckBox Folding_Luggage_Racks_and_Hotel_Luggage_Rack;
    JCheckBox Air_Purifier;
    JCheckBox Cookware_Set;
     JCheckBox Kitchen_Appliance;
    JCheckBox Towel_Tray;
    
    JScrollPane pane;
   // JButton  btnToCal;
    JButton ok;
     JButton Save;
    JTextField t;
     
    public ProductCost() throws Exceptions 
    {
      
        frameCN = new JFrame("Product_COst");
      
         labview = new JLabel("Choose what you need : ");
         
         
         
         try{
           
       BufferedImage myImage = ImageIO.read(new File("C:\\Users\\pc\\Desktop\\PressGoldRising1-e1406834734836.jpg"));
        
        frameCN.setContentPane(new ImagePanel(myImage));
       
            
        }catch(Exception e)
        {
            
           int exit= JOptionPane.showConfirmDialog(null,"No Image", "Exit", JOptionPane.YES_NO_OPTION);
             if (exit == JOptionPane.YES_OPTION)
             {
                 System.exit(0);
             }
 
        }
          
    
       t=new JTextField(10);
  

       
        //create JRadioButton
         Table = new JRadioButton("Tables");
         Tissue_Box_Cover = new JRadioButton("Tissue_Box_Covers");
         Tumbler_Glasse = new JRadioButton("Tumbler_Glasses ");
          Trash_Can = new JRadioButton("Trash_Cans ");
    
        
        
        
        View = new ButtonGroup();
        View.add(Table);
        View.add(Tissue_Box_Cover);
        
        View.add(Tumbler_Glasse);
       View.add(Trash_Can);
     
        //create JComboBox
         JButton btnExit = new JButton("Exit");
        JButton btnBack = new JButton("Back");
         Cribs_and_Crib_Accessoriess = new JCheckBox("Cribs_and_Crib_Accessoriess");
         Alarm_Clocks_Radio = new JCheckBox("Alarm_Clocks_Radio");
         Room_Coffee_Maker = new JCheckBox("Room_Coffee_Maker");
         Hair_Dryer = new JCheckBox("Hair_Dryer");
         Ironing_and_Laundry_Suppliess = new JCheckBox("Ironing_and_Laundry_Suppliess");
         Service_Tray = new JCheckBox("Service_Tray");
         Coffee_Condiment_Kit = new JCheckBox("Coffee_Condiment_Kit");
         Folding_Luggage_Racks_and_Hotel_Luggage_Rack = new JCheckBox("Folding_Luggage_Racks_and_Hotel_Luggage_Rack");
         Air_Purifier = new JCheckBox("Air_Purifier");
         Cookware_Set = new JCheckBox("Cookware_Set");
          Kitchen_Appliance = new JCheckBox("Kitchen_Appliance");
         Towel_Tray = new JCheckBox("Towel_Tray");
        
        
        frameCN.setLayout(new FlowLayout());
        
         pane = new JScrollPane();
         pane.setBounds(0, 0, 880, 200);
         
         
         // create JButtons

          
         ok= new JButton("Calculate Price");
        
        
        frameCN.add(pane);
         
         //Add JLabel to the jframe
        frameCN.add(labview);
      
   
         //Add JRadioButton to the jframe
         frameCN.add(Table);
         frameCN.add(Tissue_Box_Cover);
        frameCN.add(Tumbler_Glasse);
          frameCN.add(Trash_Can);

        //add JCheckBox to the jframe
        frameCN.add(Cribs_and_Crib_Accessoriess);
        frameCN.add(Alarm_Clocks_Radio);
        frameCN.add(Room_Coffee_Maker);
        frameCN.add(Hair_Dryer);
         frameCN.add(Ironing_and_Laundry_Suppliess);
          frameCN.add(Service_Tray);
        frameCN.add(Coffee_Condiment_Kit);
        frameCN.add(Folding_Luggage_Racks_and_Hotel_Luggage_Rack);
        frameCN.add(Air_Purifier);
         frameCN.add(Cookware_Set);
          frameCN.add(Kitchen_Appliance);
         frameCN.add(Towel_Tray);
        
    
        frameCN.add(t);
        frameCN.add(ok);
           frameCN.add(btnBack);
        frameCN.add(btnExit);
//        frameCN.add(Save);

          ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = ok.getText();
                
                if (ae.getSource()==ok)
                {
                   if(Table.isSelected() && Cribs_and_Crib_Accessoriess.isSelected() )
                   {    
                       
                           result =Cribs_and_Crib_Accessories+Tables;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
               
                   
                   if(Table.isSelected() && Alarm_Clocks_Radio.isSelected() )
                   {
                       
                            result =Alarm_Clocks_Radios+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Table.isSelected() && Room_Coffee_Maker.isSelected() )
                   {
                       
                            result =Room_Coffee_Makers+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Table.isSelected() && Hair_Dryer.isSelected() )
                   {
                       
                            result =Hair_Dryers+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Table.isSelected() && Ironing_and_Laundry_Suppliess.isSelected() )
                   {
                       
                            result =Ironing_and_Laundry_Supplies+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
            
                   if(Table.isSelected() && Service_Tray.isSelected() )
                   {
                       
                            result =Service_Trays+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Table.isSelected() && Coffee_Condiment_Kit.isSelected() )
                   {
                       
                            result =Coffee_Condiment_Kits+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                   if(Table.isSelected() && Folding_Luggage_Racks_and_Hotel_Luggage_Rack.isSelected() )
                   {
                       
                            result =Folding_Luggage_Racks_and_Hotel_Luggage_Racks+Tables;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(Table.isSelected() && Air_Purifier.isSelected() )
                   {
                       
                            result =Air_Purifiers+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                  
                   if(Table.isSelected() && Cookware_Set.isSelected() )
                   {
                       
                            result =Cookware_Sets+Tables;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                           
            
                   if(Table.isSelected() && Kitchen_Appliance.isSelected() )
                   {
                       
                            result =Kitchen_Appliances+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Table.isSelected() && Towel_Tray.isSelected() )
                   {
                       
                            result =Towel_Trays+Tables;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                
                   
                   
                   
                   
                   
                   
                   
                   if(Tissue_Box_Cover.isSelected() && Cribs_and_Crib_Accessoriess.isSelected() )
                   {    
                       
                           result =Cribs_and_Crib_Accessories+Tissue_Box_Covers;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
               
                   
                   if(Tissue_Box_Cover.isSelected() && Alarm_Clocks_Radio.isSelected() )
                   {
                       
                            result =Alarm_Clocks_Radios+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tissue_Box_Cover.isSelected() && Room_Coffee_Maker.isSelected() )
                   {
                       
                            result =Room_Coffee_Makers+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tissue_Box_Cover.isSelected() && Hair_Dryer.isSelected() )
                   {
                       
                            result =Hair_Dryers+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tissue_Box_Cover.isSelected() && Ironing_and_Laundry_Suppliess.isSelected() )
                   {
                       
                            result =Ironing_and_Laundry_Supplies+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
            
                   if(Tissue_Box_Cover.isSelected() && Service_Tray.isSelected() )
                   {
                       
                            result =Service_Trays+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tissue_Box_Cover.isSelected() && Coffee_Condiment_Kit.isSelected() )
                   {
                       
                            result =Coffee_Condiment_Kits+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                   if(Tissue_Box_Cover.isSelected() && Folding_Luggage_Racks_and_Hotel_Luggage_Rack.isSelected() )
                   {
                       
                            result =Folding_Luggage_Racks_and_Hotel_Luggage_Racks+Tissue_Box_Covers;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(Tissue_Box_Cover.isSelected() && Air_Purifier.isSelected() )
                   {
                       
                            result =Air_Purifiers+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                  
                   if(Tissue_Box_Cover.isSelected() && Cookware_Set.isSelected() )
                   {
                       
                            result =Cookware_Sets+Tissue_Box_Covers;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                           
            
                   if(Tissue_Box_Cover.isSelected() && Kitchen_Appliance.isSelected() )
                   {
                       
                            result =Kitchen_Appliances+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tissue_Box_Cover.isSelected() && Towel_Tray.isSelected() )
                   {
                       
                            result =Towel_Trays+Tissue_Box_Covers;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                    if(Tumbler_Glasse.isSelected() && Cribs_and_Crib_Accessoriess.isSelected() )
                   {    
                       
                           result =Cribs_and_Crib_Accessories+Tumbler_Glasses;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
               
                   
                   if(Tumbler_Glasse.isSelected() && Alarm_Clocks_Radio.isSelected() )
                   {
                       
                            result =Alarm_Clocks_Radios+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tumbler_Glasse.isSelected() && Room_Coffee_Maker.isSelected() )
                   {
                       
                            result =Room_Coffee_Makers+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tumbler_Glasse.isSelected() && Hair_Dryer.isSelected() )
                   {
                       
                            result =Hair_Dryers+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tumbler_Glasse.isSelected() && Ironing_and_Laundry_Suppliess.isSelected() )
                   {
                       
                            result =Ironing_and_Laundry_Supplies+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
            
                   if(Tumbler_Glasse.isSelected() && Service_Tray.isSelected() )
                   {
                       
                            result =Service_Trays+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tumbler_Glasse.isSelected() && Coffee_Condiment_Kit.isSelected() )
                   {
                       
                            result =Coffee_Condiment_Kits+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                   if(Tumbler_Glasse.isSelected() && Folding_Luggage_Racks_and_Hotel_Luggage_Rack.isSelected() )
                   {
                       
                            result =Folding_Luggage_Racks_and_Hotel_Luggage_Racks+Tumbler_Glasses;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(Tumbler_Glasse.isSelected() && Air_Purifier.isSelected() )
                   {
                       
                            result =Air_Purifiers+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                  
                   if(Tumbler_Glasse.isSelected() && Cookware_Set.isSelected() )
                   {
                       
                            result =Cookware_Sets+Tumbler_Glasses;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                           
            
                   if(Tumbler_Glasse.isSelected() && Kitchen_Appliance.isSelected() )
                   {
                       
                            result =Kitchen_Appliances+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Tumbler_Glasse.isSelected() && Towel_Tray.isSelected() )
                   {
                       
                            result =Towel_Trays+Tumbler_Glasses;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   if(Trash_Can.isSelected() && Cribs_and_Crib_Accessoriess.isSelected() )
                   {    
                       
                           result =Cribs_and_Crib_Accessories+Trash_Cans;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
               
                   
                   if(Trash_Can.isSelected() && Alarm_Clocks_Radio.isSelected() )
                   {
                       
                            result =Alarm_Clocks_Radios+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Trash_Can.isSelected() && Room_Coffee_Maker.isSelected() )
                   {
                       
                            result =Room_Coffee_Makers+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Trash_Can.isSelected() && Hair_Dryer.isSelected() )
                   {
                       
                            result =Hair_Dryers+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Trash_Can.isSelected() && Ironing_and_Laundry_Suppliess.isSelected() )
                   {
                       
                            result =Ironing_and_Laundry_Supplies+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
            
                   if(Trash_Can.isSelected() && Service_Tray.isSelected() )
                   {
                       
                            result =Service_Trays+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Trash_Can.isSelected() && Coffee_Condiment_Kit.isSelected() )
                   {
                       
                            result =Coffee_Condiment_Kits+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                   if(Trash_Can.isSelected() && Folding_Luggage_Racks_and_Hotel_Luggage_Rack.isSelected() )
                   {
                       
                            result =Folding_Luggage_Racks_and_Hotel_Luggage_Racks+Trash_Cans;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(Trash_Can.isSelected() && Air_Purifier.isSelected() )
                   {
                       
                            result =Air_Purifiers+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                  
                   if(Trash_Can.isSelected() && Cookware_Set.isSelected() )
                   {
                       
                            result =Cookware_Sets+Trash_Cans;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                           
            
                   if(Trash_Can.isSelected() && Kitchen_Appliance.isSelected() )
                   {
                       
                            result =Kitchen_Appliances+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(Trash_Can.isSelected() && Towel_Tray.isSelected() )
                   {
                       
                            result =Towel_Trays+Trash_Cans;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                 
                  
                        ok.setText(price);
                }        
                             
            }

            }

                 );
          
                 btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Stock secondform = new Stock ();
                    secondform.setVisible(true);
                    dispose();
                    
                    frameCN. setVisible(false);
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
         
  

        frameCN.setSize(900, 750);
      frameCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCN.setVisible(true);
        
    }
}