package hotelsystem;

public class CalculatingCost extends AdditionalServices   {
        
    public CalculatingCost ()
    {
        numofnights = 0;
        cost = 0;
    }

    public void SetCost(int numofnights)
    {
        this.numofnights = numofnights;
        cost = this.numofnights *200;
    }
}
