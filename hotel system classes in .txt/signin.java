/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;


import java.io.*;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class signin implements Serializable {
    private String name;
    private String password;
    private String conpassword;
    private String ID;
    
 ArrayList<signin> list=new ArrayList<signin>();

    public void add(String id,String password) throws FileNotFoundException, IOException, ClassNotFoundException
    {
   HashMap<String,String> table1 = new HashMap<String,String>();
        ObjectInputStream out=new ObjectInputStream( new FileInputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication4.bin"));
         table1=(HashMap<String, String>) out.readObject();
          System.out.print(table1.size());
           
        out.close();
       
        table1.put(id, password);
        ObjectOutputStream input= new ObjectOutputStream
        (new FileOutputStream
        ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication4.bin"));
     input.writeObject(table1);
     input.close();
 
     
     
        
    }
    public boolean check(String id,String password) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        HashMap<String,String> table1 = new HashMap<String,String>();
        ObjectInputStream out=new ObjectInputStream( new FileInputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication4.bin"));
         table1=(HashMap<String, String>) out.readObject();
          System.out.print(table1.size());
           
        out.close();
//System.out.println(password);
//System.out.println(table1.get(id));
    if(table1.get(id).equalsIgnoreCase(password))
            {
                return true;
            }
     else
            {
                return false;
            }

       
    }
  public  void display(String id) throws IOException, ClassNotFoundException
  {
      HashMap<String,String> table1 = new HashMap<String,String>();
         ObjectInputStream out=
               new ObjectInputStream
        ( new FileInputStream
        ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication4.bin"));
         table1=(HashMap<String, String>) out.readObject();
         
         for(int i=0;i<table1.size();i++)
         {
            System.out.print(table1.size());
            System.out.print(table1.get(id));
         }
         out.close();
  }
     public  int check2(String id)
     {
        char x=id.charAt(0);
        char m='m';
          char c='c';
          char s='s';
          char t='t';
         if(x==m)
         {
             return 1;
         } 
         else if(x==c)
         {
             return 2;
         }
          else if (x==s)
         {
             return 3;
         }
         else if (x==t)
         {
             return 4;
         }
         else{
                 JOptionPane.showMessageDialog(null, "enter right id");

         }
        return 0;
         
     }
public String GetName()
{
    return this.name;
}
public void setname(String n)
{
    n=name;
    
}
public void Setpassword(String password){
    this.password=password;
}
public String Getpassword(){
    return this.password;
}
public void Setconpassword(String password){
    this.password=password;
}
public String Getconpassword(){
    return this.password;
}
public void SetID(String password){
    this.password=password;
}
public String GetId(){
    return this.password;
 
    }

}


    

    

