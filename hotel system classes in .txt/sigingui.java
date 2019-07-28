/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class sigingui extends JFrame{
  JButton sg=new JButton("signin");
    
    JButton s1=new JButton("name");
   JButton s2=new JButton("ID");
    JButton s3=new JButton("password");
    JButton s4=new JButton("conpassword");
    JButton s5=new JButton("Finish");
    JButton s6=new JButton("cancel");
     // final JFrame frame = new JFrame("Logain_System");
  Container cp=getContentPane();
       public sigingui() throws IOException {
          
           
        
      
       
        setLayout(new FlowLayout());
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        add(s6);
//           s1.addActionListener(new name() );
//           s2.addActionListener(new ID());
//           s3.addActionListener(new password ());
//           s4.addActionListener(new conpassword());
           s5.addActionListener(new Finished() );
           s6.addActionListener(new cancel() );
//   
//   
       }
//       private class name implements ActionListener{
//          signin sq =new signin();
//        @Override
//        public void actionPerformed (ActionEvent ae) {
//        Object buttonPressed=ae.getSource();
//        if(buttonPressed.equals(s1)){  
//            sq.setVisible(true);
//        }
//        }
//        }
//        private class ID implements ActionListener{
//          signin sqe =new signin();
//        @Override
//        public void actionPerformed (ActionEvent ae) {
//        Object buttonPressed=ae.getSource();
//        if(buttonPressed.equals(s2)){  
//            sqe.setVisible(true);
//        }
//        }
//        }
      private class cancel implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        Object butonPressed=ae.getSource();
        if(butonPressed.equals(s6)){
            System.exit(0);
        }
        }

  
        
         
     }
     private  class Finished implements ActionListener{
          

            
        @Override
         public void actionPerformed (ActionEvent ae) {
        Object buttonPressed=ae.getSource();
        if(buttonPressed.equals(s5)){ 
            System.exit(0);
            
        
     
 
        }

       
        }
     }
}


    

    

  

