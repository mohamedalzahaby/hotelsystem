/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

public class MenuList {
    
   private double itemCost;
   private int Num;
   //private String ItemName;
   

    public MenuList()
     {
        itemCost = 0;
        Num = 0;
     }
     
    public void setCost(String ItemName , Object OrderedHowManyTimes)
    {
        int x = Integer.parseInt((String) OrderedHowManyTimes);
        Num = x;
        switch(ItemName)
        {
            case"none":
            {
                itemCost = 0;
                break;
            }
            case"Drinks" :
            {
                itemCost = Num*100;
                break;
            }
            case"Aspagati":
            {
                itemCost = Num*200;
                break;
            }
            case"Chicken":
            {
                itemCost = Num*300;
                break;
            }
            case"Meat":
            {
                itemCost = Num*400;
                break;
            }
    
        }
    }
    
    public double getCost()
    {
        return itemCost;
    }    
}





//    public boolean Search(String search)
//    {
//        this.search = search;
//        boolean found = false;
//        for(String x : FoodList.keySet())
//        {
//            if(this.search.equals(x))
//                found = true;
//        }
//        return found;
//    }


//public double getitemCost(String search)
//    {
//        
//        this.search = search;
//        if(Search(this.search) == true)
//        { 
//            this.item_cost = FoodList.get(search);//value of key in hashmap = itemcost
//        }
//        else
//        {this.item_cost = -1;} //// -1means there is no item with name thus found= false
//        
//        return item_cost; 
//    }



    
    
   /* 
//   HashMap<String, Double> FoodList=new HashMap<String, Double>();
//    ArrayList<String> name = new ArrayList<>();


public void AddItems(String NameOfItem , double item_cost )
    {
        this.item_cost = item_cost;
        this.ItemName = NameOfItem;
        FoodList.put(ItemName, item_cost);
    }
    
    public void SetItems()
    {
        FoodList.put( "sandwich1" , 10.0);
        FoodList.put( "sandwich2" , 12.0);
        FoodList.put( "sandwich3" , 13.0);
        FoodList.put( "sandwich4" , 14.0);
        FoodList.put( "sandwich5" , 15.0);
        FoodList.put( "sandwich6" , 16.0);
    }
    public boolean Search(String search)
    {
        this.search = search;
        boolean found = false;
        for(String x : FoodList.keySet())
        {
            if(this.search.equals(x))
                found = true;
        }
        return found;
    }*/