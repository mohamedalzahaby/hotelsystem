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
public class FoodBoards extends CostFunction {
  private int Type;
    private int NightsNum;
    private double boardCost;
    private String boardType;
    
    public void setBooked (String boardType , Object daysnumber)
    {
        this.boardType = boardType;
        int x = Integer.parseInt((String) daysnumber);
        NightsNum = x;
        switch(boardType)
        {
            case"none":
            {
                boardCost = 0;
                break;
            }
            case"Half Board" :
            {
                boardCost = NightsNum*100;
                break;
            }
            case"Full Board":
            {
                boardCost = NightsNum*200;
                break;
            }
            case"All Inclusive":
            {
                boardCost = NightsNum*300;
                break;
            }
    
        }
    }
    
    public double getBooked ()
    {
        return boardCost;
    }
    
}
