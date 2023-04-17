package com.mycompany.part1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number1,number2;
        int sum,product,difference,division;
        
        System.out.print("Enter First integer:");
        number1=input.nextInt();
        System.out.print("Enter second integer:");
        number2=input.nextInt();
        sum=number1+number2;
        product=number1*number2;
        difference=number1-number2;
        division=number1/number2;
        
        System.out.printf("sum is: %d%n", sum);
        System.out.printf("product is: %d%n", product);
        System.out.printf("differences is: %d%n", difference);
        System.out.printf("division is: %d%n", division);
    }
}