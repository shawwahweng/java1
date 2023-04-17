/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part_1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q004 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter  integer:");
        number=input.nextInt();
        
        number=number%2;
        if (number==0)
            System.out.println("Even");
            else if (number==1)
                    System.out.println("Odd");

    }
}
