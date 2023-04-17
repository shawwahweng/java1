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
public class Q045 {
    public static void main(String[] args)
    {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first=input.nextInt();
        System.out.print("Enter the second number:");
        int second=input.nextInt();
        
        if(second%first==0)
            System.out.println(second + " is a multiple of " + first);
        else 
            System.out.println(second + " is not a multiple of " + first);
        
        
    }
    
}
