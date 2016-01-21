/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessor;

import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class CashRegister {
    
    Sale sale;
    Return storeReturn;
    Customer currentCustomer;
    ArrayList<Item> checkoutItems;
    BusinessAccount till;
    
    public CashRegister(){
    
     currentCustomer = new Customer(); 
      checkoutItems = new ArrayList();  
        
    }
    
   
   
    
  
    
    public void addItemToCheckout(Item item){
        
        checkoutItems.add(item);
        
    }
    
      public void removeItemFromCheckout(Item item){
        
        checkoutItems.remove(item);
        
    }
      
      
       public void processTransaction(){
        
        
        
    }
      
} // end
