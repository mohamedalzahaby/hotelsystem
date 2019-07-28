//package hotelsystem;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
//public class CheckOutDate implements IDate
//{
//    private int day; 
//    private int month;
//    private int year;
//    private int mySize;
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
//        if (month >0)
//        {
//            this.month=month;
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
//        if(year>0)
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
//    public CheckOutDate()
//    {
//        int DAY =0;
//        int MONTH =0;
//        int YEAR=0;
//    }
//    
//    public CheckOutDate (int day,int month,int year)
//    {
//        this.day = day;
//        this.month =month;
//        this.year=year;
//    }
//    
//    
//    public ArrayList<CheckInDate>DateO = new ArrayList<>();
//    int index =0;
//    
//    public ArrayList Select(int choose)
//    {
//        return DateO;
//    }
//    
//    
//    
//    
//   
//    @Override
//    public void InsertDay() throws FileNotFoundException
//    {
//      File myFile = new File ("Date.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(DateO);
//      for (int i =0; i<DateO.size();i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//     
//    }
//    
//    @Override
//     public void InsertMonth() throws FileNotFoundException
//    {
//      File myFile = new File ("Date.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(DateO);
//      for (int i =0; i<DateO.size();i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//    }
//     
//    @Override
//     public void InsertYear() throws FileNotFoundException
//    {
//      File myFile = new File ("Date.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(DateO);
//      for (int i =0; i<DateO.size();i++)
//      {
//          pr.print(" "+i);
//      }
//      
//      pr.close();
//    }
//      
//    
//     
//    
//      @Override
//      public void Check()
//      {
//          DateO.isEmpty();
//      }
//   
//    
//    
//    @Override
//    public void Update()throws FileNotFoundException
//    {
//      File myFile = new File ("Date.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(DateO);
//      for (int i =0; i<DateO.size();i++)
//      {//hy3ml ma ben kol 7aga space
//          pr.print(" " +i);
//      }
//      
//      pr.close();
//    
//       DateO.addAll(DateO);
//      
//    }
//    
//    
//    
//    @Override
//    public int SeqSearch(int valuesearch)throws FileNotFoundException
//    {
//        return valuesearch;
//    }
//    
//    @Override
//    public void ShowList() throws FileNotFoundException
//    {
//        File myFile = new File ("Date.txt");
//      PrintWriter pr = new PrintWriter(myFile);
//      pr.print(DateO);
//      for (int i =0; i<DateO.size();i++)
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
