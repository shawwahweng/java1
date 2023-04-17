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
public class Q055 {
    public static void main(String[] args)
    {
        int revers=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value:");
        int value = input.nextInt();
        
        
        while(value > 0)
        {
            revers = revers * 10 + value % 10;
            value = value / 10;
        }
        
        System.out.printf("Reversing digit:%d%n", revers);
    }
}
