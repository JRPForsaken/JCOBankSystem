/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasper Rey P.
 */
public class Customer {
     String accNum,name;
     double balance;
     int pin;  // 4 digits
     String regRef;
     String card;   // like 8888 3333 3332 3333

    public Customer() {
    }

    public Customer(String accNum, String name, double balance, int pin, String regRef, String card) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.regRef = regRef;
        this.card = card;
    }

  

      public boolean withdraw(double amount)
      {
              if(this.balance-amount>=0)
              {
              this.balance-=amount;
              return true;
              
              }
              
              return false;
      
      }
     
     
    
      public void deposit(double amount)
      {
              this.balance+=amount;
       
      }

    public String getCnic() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getAccountNo() {
        return regRef;
    }

    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return accNum+";"+name+";"+ balance+";"+pin+ ";" + regRef + ";"+card ;
    }
      
      
      
      
     
     
     
}
