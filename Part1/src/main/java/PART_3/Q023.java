/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q023 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double largest=0;
        
        System.out.println("You may input each number only once");
        System.out.println("Enter 10 number:");
        for(float count=1;count<=10;count++)
        {
            int number=input.nextInt();
            if(number>largest)
            {
                largest=number;
            }
            
        }
        
        System.out.printf("largest number:%f%n",largest);

    }
}

