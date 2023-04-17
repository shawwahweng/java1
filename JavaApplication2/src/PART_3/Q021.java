/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;

/**
 *
 * @author user
 */

import java.util.Scanner;

/**
 *   week=200
 * commission=final9%  5000*9/100=450
 * @author user
 */
public class Q021 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        final double commissionPercent=9,week=200;        
        int item;
        double value,total = 0,totalOneItem,commission,salary;
        
        for(int count=1;count<=4;count++)
        {
            System.out.printf("Entern item%d:",count);
            item= input.nextInt();
            System.out.printf("Enter value%d:",count);
            value= input.nextDouble();
        
            totalOneItem=item*value;
            total=total+totalOneItem;
            
        }
        System.out.printf("That total:RM%f%n", total);
        commission=commissionPercent*total/100;
        System.out.printf("That commission:RM%f%n", commission);
        salary=commission+week;
        
        System.out.printf("That salesperson's earning:RM%f%n", salary);
    }
}
