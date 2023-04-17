/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double milesPerDay, costPerGallon, milesPerGallon;
        double parkingFees, tollsPerDay, dailyDrivingCost;
        
       
            System.out.print("Enter miles per day:");
            milesPerDay= input.nextInt();
            System.out.print("Enter cost per gallon:");
            costPerGallon= input.nextInt();
            System.out.print("Enter miles per gallon:");
            milesPerGallon= input.nextInt();
            System.out.print("Enter parking fees:");
            parkingFees= input.nextInt();
            System.out.print("Enter tolls per day:");
            tollsPerDay= input.nextInt();
            
            dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees + tollsPerDay;
            
            System.out.printf("Daily driving cost = %.2f\n", dailyDrivingCost);
    }
}