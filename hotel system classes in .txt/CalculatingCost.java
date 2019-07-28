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
public class CalculatingCost extends Abstract  {
        
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
