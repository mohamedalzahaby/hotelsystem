//package hotelsystem;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
//public class CheckInDate implements IDate{
//   private int day; 
//    private int month;
//    private int year;
//    private int mySize;
//    private int myFirstYear;
//    private int pos;
//    public int myArray[];
//    private int choose;
//    
//    public void SetChoose(int choose)
//    {
//        this.choose=choose;
//    }
//    
//    public int GetChoose()
//    {
//        return this.choose;
//    }
//    
//    
//    public void SetmyFirstYear(int myFirstYear)
//    {
//        this.myFirstYear=myFirstYear;
//    }
//    
//    public int GetmyFirstYear()
//    {
//        return this.myFirstYear;
//    }
//    
//    @Override
//    public void SetSize(int mySize)
//    {
//        this.mySize=mySize;
//    }
//    @Override
//    public int GetSize()
//    {
//        return this.mySize;
//    }
//   
//    
//    @Override
//    public void SetDay(int day)    
//    {
//        if (day > 0)
//        {
//        this.day=day;
//        }
//    }
//    
//    
//    @Override
//    public int GetDay()
//    {
//        return this.day;
//    }
//    
//    
//    @Override
//    public void SetMonth(int month)
//    {
//        if (month > 0){
//        this.month=month;
//        }
//    }
//    
//     
//    @Override
//    public int GetMonth()    
//    {
//       return this.month;        
//    }
//    
//    
//    @Override
//    public void SetYear(int year)  
//    {
//        if(year >0)
//        {
//        this.year=year;   
//        }
//    }
//    
//    
//    @Override
//    public int GetYear()    
//    {
//       return this.year;
//    }
//    
//    public  CheckInDate()
//    {
//        int DAY =0;
//        int MONTH =0;
//        int YEAR=0;
//    }
//    
//    public CheckInDate (int day,int month,int year)
//    {
//        this.day = day;
//        this.month =month;
//        this.year=year;
//    }
//    
//    public ArrayList Select(int choose)
//    {
//        return Date;
//    }
//    
//    public ArrayList<CheckInDate>Date = new ArrayList<>();
//    int index =0;
//    
//    
//   
//    @Override
//    public void InsertDay() throws FileNotFoundException
//    {
//      File myFile = new File ("outputDate.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(Date);
//      for (int i =0; i<Date.size();i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//      
//    }
//    
//    @Override
//     public void InsertMonth()throws FileNotFoundException
//    {
//      File myFile = new File ("outputDate.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(Date);
//      for (int i=0; i<Date.size(); i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//    }
//     
//    @Override
//     public void InsertYear()throws FileNotFoundException
//    {
//      File myFile = new File ("outputDate.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(Date);
//      
//      for(int i=0; i<Date.size(); i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//    }
//      
//    
//    @Override
//      public void Check()
//      {
//          Date.isEmpty();
//      }
//    
//   
//    
//    @Override
//    public void Update() throws FileNotFoundException
//    {
//        File myFile = new File ("outputDate.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(Date);
//      
//      for(int i=0; i<Date.size(); i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//        Date.addAll(Date);
//       
//    }
//    
//    
//    public void Delete(int pos)
//    {
//        Date.remove(pos);
//        
//    }
//   
//    @Override
//    public int SeqSearch(int valuesearch)throws FileNotFoundException
//    {
//        return valuesearch;
//    }
//    
//    
//    @Override
//    public void ShowList()throws FileNotFoundException
//    {
//      File myFile = new File ("outputDate.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(Date);
//      
//      for(int i=0; i<Date.size(); i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//    }
//    
//
//}
//
