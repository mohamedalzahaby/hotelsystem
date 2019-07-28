package hotelsystem;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JFrame;

    public class Hotelsystem
    {
        public static void main(String[] args) //throws FileNotFoundException
        {
            
            
            //this is for rating class
            JFrame frame = new JFrame("A Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new rate());
            frame.pack();
            frame.setSize(600, 700);
            frame.setVisible(true); 
            

            //GymFrame v = new GymFrame();
           
           
            
            
            
            
            
            
            
            
            
            
            
         /*javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            // Set up main window (using Swing's Jframe)
            JFrame frame = new JFrame("A Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new BouncingBallSimple());
            frame.pack();
            frame.setVisible(true);
            
      */
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
//        String num1 , num2;
//        int numNights = 10;
//        num1 = JOptionPane.showInputDialog("enter number of days you want at gym");
//        int NO1 = Integer.parseInt(num1);
//        while (NO1 < 0 || NO1 > 10)
//        {
//            num1 = JOptionPane.showInputDialog("error booking should be within the long you will stay in hotel \n please enter again");
//            NO1 = Integer.parseInt(num1);
//        }
//        Gym g = new Gym();
//        g.booked(NO1);//booked gym cost calculated
//        gym.add(g);
//        try
//        { 
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gym.bin"));
//            out.writeObject(gym);
//        }  
//      // catch any file creation errors
//      catch(FileNotFoundException e)
//      {  
//          System.out.println("Error opening file: Staff.bin");
//          System.exit(0);
//      }
//      catch(IOException e)
//        {  
//          System.out.println("Error writing file: Staff.bin");
//          System.exit(0);
//        }
//        
//        num1 = JOptionPane.showInputDialog("enter number of days you want at spa");
//        int NO2 = Integer.parseInt(num1);
//        while (NO2 < 0 || NO2 > 10)
//        {
//            num1 = JOptionPane.showInputDialog("error booking should be within the long you will stay in hotel \n please enter again");
//            NO2 = Integer.parseInt(num1);
//        }
//        
//        Spa sp = new Spa();
//        sp.booked(NO2);//booked spa cost calculated
//        spalist.add(sp);
//        try
//        {
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("spa.bin"));
//            out.writeObject(spalist);
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println("Error opening file: Staff.bin");
//            System.exit(0);
//        }
//        catch(IOException e)
//        {  
//          System.out.println("Error writing file: Staff.bin");
//          System.exit(0);
//        }
//        num1 = JOptionPane.showInputDialog("enter number of days you want at safari");
//        int NO3 = Integer.parseInt(num1);
//        while (NO3 < 0 || NO3 > 10)
//        {
//            num1 = JOptionPane.showInputDialog("error booking should be within the long you will stay in hotel \n please enter again");
//            NO3 = Integer.parseInt(num1);
//        }
//        Safari sf = new Safari();
//        sf.booked(NO3);
//        saflist.add(sf);
//        try    
//      { 
//       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("safari.bin"));
//         out.writeObject(saflist);
//      }  
//      // catch any file creation errors
//      catch(FileNotFoundException e)
//      {  
//          System.out.println("Error opening file: Staff.bin");
//          System.exit(0);
//      }
//        catch(IOException e)
//        {  
//          System.out.println("Error writing file: Staff.bin");
//          System.exit(0);
//        }
//        //>>>>>>>>>>>>>>>>BINARY>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        AdditionalServiceTotalCost t = new AdditionalServiceTotalCost();
//        t.setcost(g.booked(NO1),sp.booked(NO2),sf.booked(NO3));
//        JOptionPane.showMessageDialog(null, "total cost =  "+ t.GetCost() , "additionl service cost" , JOptionPane.PLAIN_MESSAGE);
//        totaladd.add(t);
//        try
//        {
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("additionl_service_cost.bin"));
//            out.writeObject(saflist);
//        }
//        // catch any file creation errors
//        catch(FileNotFoundException e)
//        {
//            System.out.println("Error opening file: Staff.bin");
//            System.exit(0);
//        }
//        catch(IOException e)
//        {
//            System.out.println("Error writing file: Staff.bin");
//            System.exit(0);
//        }
//
//
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>all of the above run good >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>all of the above run good >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>all of the above run good >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//
//        num2 = JOptionPane.showInputDialog("enter <0> for no Board \n<1> for fullBoard \n<2> for half Board \n<3> for All inclusive");
//        int NO4 = Integer.parseInt(num2);
//        while (NO4 < 0 || NO4 > 3)
//        {
//            num1 = JOptionPane.showInputDialog("error booking should be within 0-3 \n please enter again");
//            NO4 = Integer.parseInt(num1);
//        }
//        
//        FoodBoards fbb = new FoodBoards();
//        fbb.setBooked(NO4, numNights);
//        //FoodBill tc = new FoodBill();
//        //double unbookedFood = 0.0;
//        //tc.setCost(fbb.getBooked(), unbookedFood );
//        JOptionPane.showMessageDialog(null, "total cost =  "+ fbb.getBooked() , "food bill" , JOptionPane.PLAIN_MESSAGE);
//        boardlist.add(fbb);
//        try
//        {
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("food_bill.bin"));
//            out.writeObject(saflist);
//        }
//        // catch any file creation errors
//        catch(FileNotFoundException e)
//        {
//            System.out.println("Error opening file: Staff.bin");
//            System.exit(0);
//        }
//        catch(IOException e)
//        {
//            System.out.println("Error writing file: Staff.bin");
//            System.exit(0);
//        }
        
        
        
        
        
        
//        GymFrame gf = new GymFrame("the gym");
//        gf.setVisible(true);
//        gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        FoodBoards fb = new FoodBoards("food board");
//        fb.setVisible(true);
//        fb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

        
        
        
        
    }
}




//        Scanner sc = new Scanner(System.in);
//        int numofnights = 10;
//        int NumOfTimeUsed = 5;
//        int ask = 0;
//        Spa sp = new Spa();
//        if (numofnights <4)
//        {
//            sp.booked(numofnights, 1);
//        }
//        else 
//        {
//            System.out.println("do u want daily or 3/WEEK program ? 1/2");
//            ask = sc.nextInt();
//            while (ask != 1 && ask != 2)
//            {
//                System.out.println("error please enter 1 or 2");
//                ask = sc.nextInt();
//            }
//            if(ask == 1 ){NumOfTimeUsed = 0;}
//            sp.booked(numofnights, ask);
//        }
//        sp.Unbooked(NumOfTimeUsed);
//        sp.SetCost(sp.booked(numofnights, ask), sp.Unbooked(NumOfTimeUsed));
//        System.out.println(sp.GetCost());

//        Gym g = new Gym();
//        System.out.println("did the user booked gym 1 for yes 2 for no ");
//        int yesNo = sc.nextInt();
//        if(yesNo == 1)
//        {
//            g.SetCost(g.booked(numofnights));
//            System.out.println(g.GetCost());
//        }
//        if(yesNo == 2)
//        {
//            g.SetCost(g.Unbooked(NumOfTimeUsed));
//            System.out.println(g.GetCost());
//        }
        
//        BookedAddService a = new BookedAddService();
//        a.gym(10);
//        System.out.println("press <1> for daily program or <2> for 3/week program");
//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        while( x != 1 && x != 2 )
//        {
//            System.out.println("error please enter 1 or 2 ");
//            x = s.nextInt();
//        }
//        a.Spa(10 , x);
//        System.out.println("press <1> for daily program or <2> for 3/week program");
//        x = s.nextInt();
//        while( x != 1 && x != 2 )
//        {
//            System.out.println("error please enter 1 or 2 ");
//            x = s.nextInt();
//        }
//        a.safari(10, x);
//        System.out.println( a.Cost() );
