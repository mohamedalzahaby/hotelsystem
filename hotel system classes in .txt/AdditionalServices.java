/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import java.io.*;

public abstract class AdditionalServices extends CostFunction implements Serializable
{  
    public int addservice,numofservices, numofnights , numOFtimeUsed ;
    public double bookedCost , UnBookedCost ;
    public abstract double booked(int numofnights);
    public abstract double Unbooked(int x);
    public void SetCost(double bookedCost , double UnBookedCost)
    {
        cost = bookedCost + UnBookedCost;
    }
    
}