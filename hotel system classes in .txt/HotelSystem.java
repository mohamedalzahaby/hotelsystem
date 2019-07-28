package hotelsystem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class HotelSystem  {
    
    

    public static void main(String[] args) throws IOException {
//        String id =  JOptionPane.showInputDialog("name");
//         String pass =  JOptionPane.showInputDialog("Password");
//         sigingui enter = new sigingui();
    
        try {
            //TODO code application logic here
            //Make frame
            Logain_System f = new Logain_System();
            
            f.addWindowListener(
                    new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            
                            JOptionPane.showMessageDialog(null,"Exit via windowClosing.","error",JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
            );
        } // end of main
        catch (Exceptions ex) {
           
        }



    }
}

