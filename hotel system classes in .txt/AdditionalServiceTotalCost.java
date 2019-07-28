/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

/**
 *
 * @author pc
 */
import java.io.Serializable;

public class AdditionalServiceTotalCost extends CostFunction implements Serializable
{
    public void setcost(double gymcost , double spacost , double safaricost )
    {
        cost = gymcost +  spacost + safaricost;
    }    
    public double getcost()
    {
        return cost;
    }
}
