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
public class Q044 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double side1,side2;
        
        System.out.print("Enter double value side 1:");
        side1=input.nextDouble();
        System.out.print("Enter double value side 2:");
        side2=input.nextDouble();
        double total= Math.pow(side1,2)+Math.pow(side2,2);
        double hypotense=Math.sqrt(total);
        System.out.printf("the length of the hypotense is:%.2f%n",hypotense);
    }
}
