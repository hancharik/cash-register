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
public abstract class TransactionProcessor {

    Customer customer;
    ArrayList<Item> items;
    Item item;

    public void getCustomer() {
        customer = new Customer();
    }

    public void getInventory() {
        item = new Item();
        items.add(item);
    }

    public void processOrder(Customer c, ArrayList i) {
        
        
        
        
       updateInventory(); 
       updateCustomerBalance();
        
    }

    public void updateInventory() {
        
    }

    public void updateCustomerBalance() {
        
    }


    
    
}
