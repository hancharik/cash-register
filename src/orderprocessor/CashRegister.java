/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessor;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mark
 */
public class CashRegister {

    Sale sale;
    Return storeReturn;
    Customer currentCustomer;
    ArrayList<Item> inventory;
    ArrayList<Item> cart;
    BusinessAccount till;
    int transactions = 0;
    int itemsSold = 0;
    int lostSales = 0;
    
    
    Item i = new Item();
    public CashRegister() {

        till = new BusinessAccount();
        inventory = new ArrayList();
        cart = new ArrayList();
        setInventory(1000);

    
        roboCashier(10);
        
        checkTillForErrors();
        
    }

    public void getCustomer() {
        Customer c = new Customer();
        currentCustomer = c;

    }

    
    public void roboCashier(int numberOfTransactions){
        
           getCustomer();
           Random random = new Random();
           int randomItemCount;// = 1 + random.nextInt( 1000 );
           
           for(int i = 0; i < numberOfTransactions; i++){
              // if(inventory.size()<1){
                   //System.out.println("out of inventory... the store is closed"); break;
                   // System.out.println("out of inventory... lost sale");
              // }else{
            randomItemCount = 1 + random.nextInt( 300 );
            if( randomItemCount > inventory.size()){
                randomItemCount =  offerLesserAmount(randomItemCount , inventory.size());
            }
            addItemToCheckout( randomItemCount);
            processTransaction();
            showValues("" + cart.size());
           }
           
           
           
           }
        
        
  
    
    
    
    public void addItemToCheckout(int howManyItems) {

        
        System.out.println("Transaction #" + (transactions + 1));
        System.out.println(" items ordered: " + howManyItems+ " on hand inventory: " + inventory.size());
        
        
        if (howManyItems <= inventory.size()){
           System.out.println("transaction allowed to complete"); 
        
        for (int i = 0; i < howManyItems; i++) {

            cart.add(inventory.get(inventory.size()-1));
            inventory.remove(inventory.size()-1);  //remove the last element from the array
       
                }
         }else{
          System.out.println("transaction NOT allowed to complete - we don't have that many widgets left in inventory.");
          lostSales = lostSales + howManyItems;
        }
    }

    public void removeItemFromCheckout(Item item) {

        cart.remove(item);
        inventory.add(item);
    }

    public void processTransaction() {

        int counter = cart.size() - 1;
        
        for (int i = counter; i >= 0; i--) {
            //showValues("pre cart size: " + cart.size());
            currentCustomer.accountBalance = currentCustomer.accountBalance - cart.get(i).getItemPrice();
            till.addMoney(cart.get(i).getItemPrice());
            cart.remove(i);
           itemsSold++;

           // System.out.println("items in cart: " + cart.size());
            //showValues("post cart size: " + cart.size());
        }
         transactions++;
    }

    public void showValues(String identifier) {

        System.out.println(identifier + ", after " + transactions + " transactions, we sold " + itemsSold + " items. Customer balance: " + currentCustomer.accountBalance + ", till: " + till.bankAccount);

    }

    public void setInventory(int unitsInInventory) {

        for (int i = 0; i < unitsInInventory; i++) {
            Item item = new Item();
            inventory.add(item);
        }

    } // END SET INVENTORY
    
    public void checkTillForErrors(){
        System.out.println("\nRobo cashier counting the drawer at the end of it's shift...");
        if((itemsSold*i.getItemPrice())==till.bankAccount){
         System.out.println("the money is correct");
        }else{
           System.out.println("the money is NOT correct - something is wrong");
        }
        
        System.out.println("we lost $" + lostSales*i.getItemPrice() + " due to insufficient inventory");
    }

  public int offerLesserAmount(int amountOrdered, int inventoryOnHand){
      
      int lesserAmount;
      
      Random random = new Random();
           int r = 1 + random.nextInt( 1000 );
        if(r%2==0 && inventoryOnHand > 0){ //33% chance the customer won't complete the order if there isn't enough
         lesserAmount = inventoryOnHand;  
          System.out.println("Customer needs " + amountOrdered + " units, but is willing to take the last " + lesserAmount+ " units that we have on hand");
        } else{
          
          lesserAmount = amountOrdered; 
         System.out.println("LOST SALE - (Customer needs the " + amountOrdered + " units)");
         lostSales = lostSales + amountOrdered;
        }  
           
        // otherwise, sell them everything that we have!   
      
      return lesserAmount;
  }  
    
    
    
    
} // end
