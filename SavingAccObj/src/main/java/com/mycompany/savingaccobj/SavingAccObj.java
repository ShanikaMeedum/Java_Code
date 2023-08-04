package com.mycompany.savingaccobj;
public class SavingAccObj 
{

    public static void main(String[] args) 
    {
        SavingAccount saver1=new SavingAccount(2000);
        SavingAccount saver2=new SavingAccount(3000);
        SavingAccount.annualInterRate=0.04;
        saver2.calMonthlyInterest();
        saver1.calMonthlyInterest();
        System.out.println("Saver1 balance: "+saver1.getbalance());
        System.out.println("Saver2 balance: "+saver2.getbalance());
       
       SavingAccount.annualInterRate=0.05;
       saver1.calMonthlyInterest();
       saver2.calMonthlyInterest();
        System.out.println("Nextmonth saver1 balance: "+saver1.getbalance());
        System.out.println("Nextmonth saver2 balance: "+saver2.getbalance());
       
        
        
        
       
                
    }
}
