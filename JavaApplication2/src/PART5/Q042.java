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
public class Q042 {
    public static void main(String[] main)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value by rounding number:");
        double x=input.nextDouble();
        double roundToInteger = Math.floor( x * 1 + 0.5 ) / 1;
        double roundToTenths = Math.floor( x * 10 + 0.5 ) / 10;
        double roundToHundreths = Math.floor( x * 100 + 0.5 ) / 100;
        double roundToThousandths = Math.floor( x * 1000 + 0.5 ) / 1000;
        
        System.out.printf("%nRounding to the nearest one is %f%n", roundToInteger);
        System.out.printf("Rounding to the nearest one is %f%n", roundToTenths);
        System.out.printf("Rounding to the nearest one is %f%n", roundToHundreths);
        System.out.printf("Rounding to the nearest one is %f%n", roundToThousandths);
    }
}
