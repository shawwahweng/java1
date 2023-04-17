/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q038 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number;
        
        System.out.print("Enter five numbers between 1 and 30:");

        for(int count=1;count<=5;count++)
        {
            number=input.nextInt();
            if(number>=1&&number<=30)
            {
                for(int asterisks=1;asterisks<=number;asterisks++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("Please enter five numbers between 1 and 30:");
                count--;
            }
            System.out.println();
        }
    }
}
