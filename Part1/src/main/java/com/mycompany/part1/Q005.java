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
public class Q005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int Secondnum,firstnum,m;
        System.out.print("Enter  second number:");
        Secondnum=input.nextInt();
        System.out.print("Enter  first number:");
        firstnum=input.nextInt();
        
        m=Secondnum%firstnum;
        if (m==0)
                System.out.print("Yes");
            else 
                    System.out.print("No");

    }
}
