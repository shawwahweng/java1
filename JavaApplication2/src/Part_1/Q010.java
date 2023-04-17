/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part_1;



/**
 *
 * @author user
 */
public class Q010 {
     public static void main(String[] args){
        
        
        int number ,square,cube;
        
        System.out.print("number     square     cube ");
        
        for(number=0;number<=10;number++){
            square=number*number;
            cube=number*number*number;
             System.out.printf("%n%d %11d %11d   ",number,square,cube);
        }

    }

}