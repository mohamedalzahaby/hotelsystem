/*
package hotelsystem;
import java.util.*;

public class ArrayListMethods 
{
    private int index;
    private String x;
    private String app;
    //private List<String> list1 = new ArrayList<String>(); 
    
    public void empty(List listA)
    {
        if(listA.isEmpty())
        {
            System.out.println("list is empty");
        }
    }
    public void search(List listA , String x)
    {
        Iterator<String> it = listA.iterator();
        while(it.hasNext())
        {
            if(x.equals(it.next()))
            {
                System.out.println("found"+"  "+" is "+x);
            }
        }
    }
    public void delete(List listA , String x)
    {
        Iterator<String> it = listA.iterator();
        while(it.hasNext())
        {
            if(x.equals(it.next()))
            {
                //remove ll value wla ll index w shift ezay
                it.remove();
            }
        }
    }
    
    //find and update
    public void update(List listA , String x , String update)
    {
        Iterator<String> it = listA.iterator();
        while(it.hasNext())
        {
            if(x.equals(it.next()))
            {
                update = it.next();
            }
        }
    }
  
    public void Add(List listA, String x)
    {
        listA.add(x);
    }
    public void insert(List listA, String x , int a)
    {
        listA.add(a, x);
    }
    
    
    
    public void append(List listA, String x  , String app , int index)
    {
        this.x = x;
        this.app = app;
        this.index = index;
        this.x = this.x +this.app;
        listA.set(index, this.x);
    }
    
    //only update
    public void update(List listA, String x , int index)
    {
        this.index = index;
        listA.set(index, x);
    }
    //outputing
    public void display(List listA, int index)
    {
        this.index = index;
        listA.get(index);
    }
     
    
    
}
*/