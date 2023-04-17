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
public class Q049 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        final double Pi=3.1415;
        System.out.print("Enter the user for the radius:");
        double radius = input.nextDouble();
        
        double area=Math.pow(radius, 2)*Pi;
        System.out.printf("the area of the circle:%.2f%n", area);
    }
    
}
