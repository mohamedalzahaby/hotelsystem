/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class CostOfNight extends JFrame 
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
    
    JFrame frameCN ;
   
    
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
    JButton  btnToCal;
    JButton ok;
    JButton save;
    JTextField t;
    ArrayList<CostOfNight> CostOfNightlist = new ArrayList<>();
    public CostOfNight()
    {
      
         
        frameCN = new JFrame("Cost Of Night");
        JTable tableCN = new JTable();
        
        
        
       
       
       //create JLabel
        labview = new JLabel("Choose view: ");
        labtyperoom = new JLabel("Choose type room: ");
      
        labview.setBounds(5, 30, 100, 25);
        labtyperoom.setBounds(5, 100, 150, 25);
        
       t=new JTextField();
       t.setBounds(200, 200, 100, 25);
       
       
        //create JRadioButton
         seaview = new JRadioButton("Sea");
         gardenview = new JRadioButton("Garden");
         swimmingpoolview = new JRadioButton("Swimming Pool");
         noseaview = new JRadioButton("No Sea View");
        
         seaview.setBounds(100, 30, 100, 25);
        gardenview.setBounds(200, 30, 100, 25);
        swimmingpoolview.setBounds(300, 30, 150, 25);
        noseaview.setBounds(450, 30, 100, 25);
        
        
        View = new ButtonGroup();
        View.add(seaview);
        View.add(gardenview);
        View.add(swimmingpoolview);
        View.add(noseaview);
        
        //create JRadioButton
         Single = new JRadioButton("Single");
         Double = new JRadioButton("Double");
         Multiple = new JRadioButton("Multiple");
         Family = new JRadioButton("Family");
        
       Single.setBounds(150, 100, 100, 25);
       Double.setBounds(250, 100, 100, 25);
       Multiple.setBounds(350, 100, 100, 25);
       Family.setBounds(450, 100, 100, 25);
       
       TypeRoom = new ButtonGroup();
       TypeRoom.add(Single);
       TypeRoom.add(Double);
       TypeRoom.add(Multiple);
       TypeRoom.add(Family);
       
        frameCN.setLayout(null);
          
         
         
         // create JButtons
         ok= new JButton("Calculate Cost Of Night");
         save = new JButton ("save in binary file");
         ok.setBounds(400, 200, 250, 25);
         save.setBounds(650, 200, 250, 25);
        
         
         //Add JLabel to the jframe
         frameCN.add(labview);
         frameCN.add(labtyperoom);
         
         //Add JRadioButton to the jframe
         frameCN.add(seaview);
         frameCN.add(gardenview);
        frameCN.add(swimmingpoolview);
        frameCN.add(noseaview);
        
        //add JCheckBox to the jframe
        frameCN.add(Single);
        frameCN.add(Double);
        frameCN.add(Multiple);
        frameCN.add(Family);
        
        //add JButtons to the jframe
  
        //frameCN.add(btnToCal);
        frameCN.add(t);
        frameCN.add(ok);
        
        //valueOf btrg3 al value hya eh bzabt
        //getsource bt3ml generate ll object ae elly hwa bta3 ActionEvent
        //btrg3 al object elly event 3mlo inizilate 
         // button add row
         
         
           
          ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String price = ok.getText();
             
                if (ae.getSource()==ok)
                {
                   if(seaview.isSelected() && Single.isSelected() )
                   {    
                       
                           result =priceSingal+SeaView;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                    
                
                   
                   if(seaview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+SeaView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(seaview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+SeaView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(seaview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+SeaView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+GardenView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+GardenView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+GardenView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(gardenview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+GardenView;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                     if(swimmingpoolview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+SwimmingPoolView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+SwimmingPoolView;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+SwimmingPoolView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(swimmingpoolview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+SwimmingPoolView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                    if(noseaview.isSelected() && Single.isSelected() )
                   {
                       
                            result =priceSingal+NoView;
                           
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Double.isSelected() )
                   {
                       
                            result =priceDouble+NoView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Multiple.isSelected() )
                   {
                       
                            result =priceMultiple+NoView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                   
                   if(noseaview.isSelected() && Family.isSelected() )
                   {
                       
                            result =priceFamily+NoView;
                            
                            t.setText(String.valueOf(result));
                       
                           
                   }
                        ok.setText(price);
                }        
                             
                   

            
            save.addActionListener(new ActionListener() 
            {
            @Override
            public void actionPerformed(ActionEvent a) 
            {
                CostOfNight objCN = new CostOfNight();
        objCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        CostOfNightlist.add(objCN);
     try    
      { 
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CostOfNight.bin"));
         out.writeObject(CostOfNightlist);
      }  
      // catch any file creation errors
      catch(FileNotFoundException e)
      {  
      JOptionPane.showMessageDialog(null, "Error opening file: CostOfNight.bin", "Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
      }
      catch(IOException U)
      {  
          JOptionPane.showMessageDialog(null, "Error writing file: CostOfNight.bin", "Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
      }
               
 
            
                  
            }     
            });
            
            }    
                 
         
            
            });
          
          
           frameCN.setSize(900, 400);
      frameCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCN.setVisible(true);
           
          }
                  
         
        
         
         
         // get selected row data From table to textfields 
         
        
}
        
        
       
        
    

                  


    
    

    

