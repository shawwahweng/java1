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
public class Q032 {

    public static void main(String[] args)
    {
        int factorial=1;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a nonnegative integer:");
        int number=input.nextInt();
        
        if(number>=0)
        {
            for(int count=1;count<=number;count++)
            {
                factorial=factorial*count;
                System.out.printf("That factorial:RM%d%n", factorial);
            }
        }
        else
        {
            System.out.println("Redo");
        }
        
        
    }
}
