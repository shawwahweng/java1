/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;

/**
 *
 * @author user
 */
public class Fig5_6 {
     public static void main(String[] args)
    {
        double amount;
        double principal=1000;
        double rate=0.05;
        
        System.out.printf("%s%20s%n","YEAR","amount and deposit");
        
        for(int year=1;year<=20;++year)
        {
            amount=principal*Math.pow(1.0+rate,year);
            rate=rate+0.005;
            System.out.printf("%4d%,20.2f%n", year,amount);
            
        }
    }
}
