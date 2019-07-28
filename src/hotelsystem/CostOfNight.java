package hotelsystem;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;


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
    JCheckBox Single;
    JCheckBox Double;
    JCheckBox Multiple;
    JCheckBox Family;
    JScrollPane pane;
    JButton  btnToCal;
    JButton ok;
    JTextField t;
     
    public CostOfNight()
    {
      
        frameCN = new JFrame("Cost Of Night");
        JTable tableCN = new JTable();
        
        
        
       
       
       //create JLabel
        labview = new JLabel("Choose view: ");
        labtyperoom = new JLabel("Choose type room: ");
      
        
       t=new JTextField(10);
  
       
       
        //create JRadioButton
         seaview = new JRadioButton("Sea");
         gardenview = new JRadioButton("Garden");
         swimmingpoolview = new JRadioButton("Swimming Pool");
         noseaview = new JRadioButton("No Sea View");
        
        
        
        View = new ButtonGroup();
        View.add(seaview);
        View.add(gardenview);
        View.add(swimmingpoolview);
        View.add(noseaview);
        
        //create JComboBox
         Single = new JCheckBox("Single");
         Double = new JCheckBox("Double");
         Multiple = new JCheckBox("Multiple");
         Family = new JCheckBox("Family");
        
        
        frameCN.setLayout(new FlowLayout());
        
         pane = new JScrollPane();
         pane.setBounds(0, 0, 880, 200);
         
         
         // create JButtons

          
         ok= new JButton("Calculate Price");
        
        
        frameCN.add(pane);
         
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
                       
                           result =priceDouble+SeaView;
                           
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
                             
            }

            }

                 );
         
        
         
         
         
         
         // get selected row data From table to textfields 
         
        
         
        
        
        frameCN.setSize(900, 400);
      frameCN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCN.setVisible(true);
        
    }
}
