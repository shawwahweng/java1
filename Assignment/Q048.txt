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
public class Q048 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer value of base:");
        int base = input.nextInt();
        System.out.print("Enter exponent:");
        char fill = input.next().charAt( 0 );
        
        for(int count=1;count<=base;count++)
        {
            for(int row =1 ; row <=base;row++)
            {
                 System.out.print(fill);
            }
            System.out.println();
        }
   
    }
}
