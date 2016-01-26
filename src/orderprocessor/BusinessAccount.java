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
public class BusinessAccount {
    
    double bankAccount;
    double creditLimit;
    
    public BusinessAccount(){
   
        bankAccount = 0.00;
        
    }

    
    
   public void addMoney(double amount){
       
       bankAccount = bankAccount + amount;
   } 
    
    
   public void withdrawMoney(){
       
       
   }  
    
    
    public void extendCredit(){
        
        
    }
    
    
    
    
    
    
} // end program
