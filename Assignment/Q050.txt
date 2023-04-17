/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q050 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int divisor=10000;
        
        System.out.print("Enter the (between 1 and 99999):");
        int number=input.nextInt();
        
        while (number!=0)
        {
            if(Quotient(number,divisor)!=0)
            {
                System.out.printf("%d  ", Quotient(number,divisor));
                number=Ramainder(number,divisor);
            }
            divisor/=10;
        }
        System.out.println();
    }
    public static int Quotient(int number,int divisor)
    {
        return number/divisor;
    }
    
    public static int Ramainder(int number,int divisor)
    {
        return number%divisor;
    }
}
