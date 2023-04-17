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
public class Q012 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int weight;
        int weightInProunds,heightInInches;
        int weightInKilograms,heightInMeters;
        int BMI = 0;
        
        System.out.print("Select weight in prounds(1) or weight in kilograms(2):");
        weight=input.nextInt();
        
        if(weight==1){
            System.out.print("Enter weight in prounds :");
            weightInProunds= input.nextInt();
            System.out.print("Enter height In Inches :");
            heightInInches= input.nextInt();
            BMI=(weightInProunds*703)/(heightInInches*heightInInches);
            System.out.printf("Output BMI Values:%d%n",BMI);
        }else if(weight==2){
            System.out.print("Enter weight in kilograms :");
            weightInKilograms= input.nextInt();
            System.out.print("Enter height In Inches :");
            heightInMeters= input.nextInt();
            BMI=weightInKilograms/(heightInMeters*heightInMeters);
            System.out.printf("Output BMI Values:%d%n",BMI);
        }
        
        if(BMI<18.5){
            System.out.print("Underweight");
        }else if(BMI>18.5&&BMI<24.9){
            System.out.print("Normal");
        } else if(BMI>25&&BMI<29.9){
            System.out.print("Overweight");
        } else if(BMI>30){
            System.out.print("Obese");
        } 
      

    }
}