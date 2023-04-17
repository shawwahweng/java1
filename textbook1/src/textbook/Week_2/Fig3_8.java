/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package textbook.Week_2;

/**
 *
 * @author user
 */
public class Fig3_8 {
    private String name;
    private double balance;
    public Fig3_8 (String name,double balance)
    {
        this.name=name;
        
        if(balance>0.0)
            this.balance=balance;
    }
    public void deposit(double depositAmount)
    {
        if(depositAmount>0.0)
        {
            balance=balance+depositAmount;
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
