package hotelsystem;
import java.io.*;

public abstract class AdditionalServices extends CostFunction implements Serializable
{  
    public int addservice,numofservices, numofnights , numOFtimeUsed ;
    public double bookedCost , UnBookedCost ;
    public double getCost()
    {
        return  cost;
    }
    //public abstract double booked(int numofnights);
//    public abstract double Unbooked(int x);
//    public void SetCost(double bookedCost , double UnBookedCost)
//    {
//        cost = bookedCost + UnBookedCost;
//    } 
}