/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Scanner;


public class Q007 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
         double diameter;
         double radius;
         double Pi=3.14159;
         float circumference,area;
         

        System.out.print("Enter radius:");
        radius=input.nextInt();
        
        diameter=2*radius;
        circumference=(float) (2*radius*Pi);
        area=(float) (Pi*radius*radius);
        
        System.out.printf("diameter is: %.2f%n", diameter);
        System.out.printf("circumference is: %.2f%n", circumference);
        System.out.printf("area is: %.2f%n", area);
    }
}