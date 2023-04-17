/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class text2_7 {
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number,number2,sum;
        
        System.out.print("Enter first integer");
        number=input.nextInt();
        
        System.out.print("Enter second integer");
        number2=input.nextInt();
        sum=number+number2;
        System.out.printf("Sum is %d%n", sum);
    }
}
