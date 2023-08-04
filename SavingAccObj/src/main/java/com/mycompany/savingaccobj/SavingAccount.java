package com.mycompany.savingaccobj;
public class SavingAccount 
{
    static double annualInterRate;
    private double savingbalance;
    
    public SavingAccount(float savingbalance)
    {
        this.savingbalance=savingbalance;
    }
    public void calMonthlyInterest()
    {
        double MonthlyInterestRate=(savingbalance*annualInterRate)/12;
        savingbalance=savingbalance+MonthlyInterestRate;
    }
    public void calModifyInterestRate(float newRate)
    {
        annualInterRate=newRate;
    }
    public double getbalance()
    {
        return savingbalance;
    }
}
