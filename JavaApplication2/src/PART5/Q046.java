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
public class Q046 {
    public static void main(String[] agrs)
    {
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("Enter a sequence of integer:");
        int sequence=input.nextInt();
        
         if(sequence%2==1)
        {
            System.out.println("True");
        }
         else if(sequence%2==0)
        {
             System.out.println("False");
        }
    }
}
