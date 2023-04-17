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
public class Q043 {
    public static void main(String[] args)
    {
        int value =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer value of base:");
        int base = input.nextInt();
        System.out.print("Enter exponent:");
        int exponent = input.nextInt();
        
        for(int count=1;count<=base;count++)
        {
            value =value + exponent;
        }
        System.out.printf("Output the integer power method:%d%n", value);
    }
}
