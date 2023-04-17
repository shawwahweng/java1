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
/**
 *
 * @author user
 */
public class Q002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number1,number2;
        
        System.out.print("Enter First integer:");
        number1=input.nextInt();
        System.out.print("Enter second integer:");
        number2=input.nextInt();
        
        if(number1>number2)
            System.out.printf("%n%d is larger %d",number1,number2);
        else if(number1==number2)
           System.out.printf("%n%d These numbers are equal %d",number1,number2);     
        
    }
}
