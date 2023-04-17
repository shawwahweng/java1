/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;

/**
 *
 * @author user
 */
public class Q036 {
    public static void main(String[] args)
    {
        double amount;
        double principal=1000;
        double rate=0.05;
        int interest=5;
        System.out.printf("%s  %8s%20s%n","YEAR","Interest","amount and deposit");
        
        for(int year=1;year<=10;year++)
        {
            amount=principal*Math.pow(1.0+rate,year);
            rate=rate+0.005;
            System.out.printf("%4d %8d%% %18.2f%n", year,interest,amount);
            interest++;
        }
    }
}
