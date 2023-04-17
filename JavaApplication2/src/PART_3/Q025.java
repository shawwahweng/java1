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
public class Q025 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int largest=0,larger=0;
        System.out.println("You may input each number only once");
        System.out.println("Enter 10 number:");
        for(int count=1;count<=10;count++)
        {
            int number=input.nextInt();
            if(number>largest)
            {
                largest=number;
            }
            else if(number>larger)
            {
                larger=number;
            }
        }
        
        System.out.printf("largest number:%d%n",largest);
        System.out.printf("largest number:%d%n",larger);
    }
}
