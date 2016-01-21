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
public class Return extends TransactionProcessor{
    
    
        public Return( Customer c, ArrayList<Item>  i){
        
        super();
        
        getCustomer(c);
        getInventory(i);
        
    }
    
    public void getCustomer(Customer c){
      this.customer = c;
  }  
    
 
       public void getInventory(ArrayList<Item>  i){
      this.items = i;
  }
   
         public void processOrder(){
      
  }
           public void updateInventory(){
      
  }
    
     public void updateCustomerBalance(){
      
  }   
    
    
    
    
}
