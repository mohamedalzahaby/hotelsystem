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
public class Exceptions extends Exception {
    public Exceptions(){
      super();  
        }
    public Exceptions(String m){
      super(m);  
        }
    public Exceptions( Throwable t){
      super(t);  
        }
    public Exceptions(String m , Throwable t){
      super(m,t);  
        }
   
}
