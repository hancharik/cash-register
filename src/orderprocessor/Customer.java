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
public class Customer {
    
    double accountBalance;
    String personalInfo;
    
    public Customer(){
    
       createCustomer(); 
        
    }
    
    
   public void createCustomer(){
       
       accountBalance = 100.00;
       personalInfo = "test";
       
   } 
    
    
   public void chargeCustomer(double amount){
       accountBalance = accountBalance - amount;
   } 
    
    public void refundCustomer(double amount){
       accountBalance = accountBalance + amount;
   }  
    
    
}
