/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Boards  extends CostMoethods {
    private int Type;
    private int NightsNum;
    private double boardCost;
    private JRadioButton fullBoard ;
    private JRadioButton halfBoard ;
    private JRadioButton allInclusive;
    private ButtonGroup languageGroup;

    public void setBooked (int boardType , int numnight)
    {
        Type = boardType;
        NightsNum = numnight;
        if(Type==0)
        {
            boardCost = 0;
        }
        if (Type==1)    
        {
            boardCost = NightsNum*100;
        }
        if (Type==2)    
        {
            boardCost = NightsNum*200;
        }
        if (Type==3) 
        {
            boardCost = NightsNum*300;
        }
    }
    
    public double getBooked ()
    {
        return boardCost;
    }
    
}
