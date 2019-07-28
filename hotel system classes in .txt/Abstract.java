/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.io.Serializable;



/**
 *
 * @author pc
 */
public abstract class Abstract  extends CostMoethods  implements Serializable
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