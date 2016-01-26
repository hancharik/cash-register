/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessor;

/**
 *
 * @author Mark
 */
public class Item {
    
    private int amount;
    private double price;
    
    public Item(){
        
        amount = 1000;
        price = 10.00;
    }
  
    
  public double getItemPrice(){
      
     return price; 
      
      
  } 
    
    
    
      public void setItemPrice( double newPrice){
      
    price = newPrice;
      
      
    } 
    
    
    
    
    
    
    
    
    
    
    
    
}  //end
