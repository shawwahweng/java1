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
public class Q033 {
    public static void main(String[] args)
    {
        int smallest;
        Scanner input=new Scanner(System.in);
        
        System.out.print("How many integers:");
        int integer=input.nextInt();
        
        System.out.print("Enter number:");
        int number=input.nextInt();
        smallest=number;
        if(integer>1)
        {
             for(int count=1;count<integer;count++)
                {
                    System.out.print("Enter number:");
                    number=input.nextInt();

                    if(number<=smallest)
                    {
                        smallest=number;
                    }
                }
        }
        System.out.printf("Output smallest number:%d",smallest);
    }
}
