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
public class Q047 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Integer value of side from the user:");
        int value=input.nextInt();
        int total=(int) Math.pow(value,2);
        System.out.printf("Total asterisks:%d%n",total);
        for(int column=1;column <=value;column++)
        {
            
            for(int row=1;row<=value;row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
