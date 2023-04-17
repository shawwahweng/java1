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
public class Q011 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number;
        
        for(int count=1;count<=5;count++){
            
            System.out.print("Enter number:");
            number=input.nextInt();
            
            if(number<0){
                System.out.println("negative");
            }else if(number==0){
                System.out.println("zero values");
            }else if(number>0){
                System.out.println("positive");
            }
        }
    }
}

