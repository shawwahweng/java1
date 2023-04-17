/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class Account {
    private String name;
    private double balance;
    private double desit;
   
    public Account (String name,double balance)
    {
        this.name=name;
        
        if(balance>0.0)
            this.balance=balance;
    }
    public void deposit(double Amount)
    {
        if(Amount>0.0)
        {
            desit=balance;
            balance=balance-Amount;
            if(balance<0.0)
            {
                System.out.print("Withdrawal amount exceeded account balance");
                balance=desit;
            }
        }
        else
            {
                System.out.print("Withdrawal amount exceeded account balance");
                desit=balance;
            }
    }
        public void setName(String name)
    {
        this.name=name;
    }
    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }
}
