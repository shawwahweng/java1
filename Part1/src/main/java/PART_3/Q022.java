/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;

/**
 *
 * @author user
 */
/**
 *
 * @author user
 */

import java.util.Scanner;


public class Q022 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int salary;
        double total = 0;
        
        for(int employee=1;employee<=3;employee++)
        {
            System.out.printf("Enter last week hours employee%d:",employee);
            int lastWeekHours= input.nextInt();
            
            System.out.printf("Enter hourly rate employee%d:",employee);
            int hourlyRate= input.nextInt();
            
            if(lastWeekHours>40)
            {
                salary=(((lastWeekHours-40)*50/100)+lastWeekHours)*hourlyRate;
                System.out.printf("Salary employee%d:%d%n",employee,salary);
            }
            else
            {
                salary=lastWeekHours*hourlyRate;
                System.out.printf("Salary employee%d:%d%n",employee,salary);
            }
            total+=salary;
        }
      
        
        System.out.printf("That salesperson's earning:RM%f%n", total);
    }
}