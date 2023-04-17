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
public class Q027 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int count=0,remainder,reverse=0;
        System.out.print("Enter a five digit number:");
        int number=input.nextInt();
        
        int palindrome=number;
        
        while(number>0)
        {
            remainder=number%10;
            reverse=remainder+reverse*10;
            number=number/10;
            count++;
        }
        if(count==5)
        {
            if(palindrome==reverse)
            {
                System.out.printf("The given number %d is palindrome%n", palindrome);
            }
            else
            {
                System.out.printf("The given number %d is not palindrome%n", palindrome);
            }
        }
        else 
        {
            System.out.printf("The given %d number is not five digit number%n", palindrome);
            System.out.println("error message and allow the user to enter a new value");
        }
    }
    
}
