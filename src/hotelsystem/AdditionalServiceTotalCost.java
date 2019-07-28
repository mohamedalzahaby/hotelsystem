package hotelsystem;
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
