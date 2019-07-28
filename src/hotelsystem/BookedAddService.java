//package hotelsystem;
//import java.io.Serializable;
//
//
//public class BookedAddService extends   AdditionalServices   implements Serializable {
//    
//    private double gymCost;
//    private double SpaCost;
//    private double SafariCost;
//    public BookedAddService ()
//    {
//        numofnights = 0;
//        gymCost = 0;
//        SpaCost = 0;
//        SafariCost = 0;
//        cost = 0;
//    }
//    @Override
//    public double gym(int numofnights)
//    {
//        this.numofnights = numofnights;
//        gymCost = this.numofnights *200;
//        return gymCost;
//    }
//    
//    @Override
//    public double Spa(int numofnights , int ask) // you will ask the user first for which program he wants (daily or 3PER week)
//    {
//        this.numofnights = numofnights;
//        switch(ask)
//        {
//            case 1:
//            {
//                SpaCost = this.numofnights *300;
//                break;
//            }
//            case 2:
//            {
//                SpaCost = 3 *300;
//                break;
//            }            
//        } 
//        
//        return SpaCost;
//    }
//    @Override
//    public double safari(int numofnights , int ask) // you will ask the user first for which safari he wants (daily or 3PER week)
//    {
//        this.numofnights = numofnights;
//        switch(ask)
//        {
//            case 1:
//            {
//                SafariCost = this.numofnights *300;
//                break;
//            }
//            case 2:
//            {
//                SafariCost = 3 *300;
//                break;
//            }            
//        } 
//        
//        return SafariCost;
//    }
//    
//    
//    @Override
//    public double Cost()
//        {
//            //total cost service
//            cost = SpaCost + gymCost + SafariCost ;
//            return cost;
//        }
//}
