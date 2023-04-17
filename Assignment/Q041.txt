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
public class Q041 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x,y;
        
        System.out.print("Enter double value by x:");
        x=input.nextDouble();
        
        y= Math.floor(x+0.5);
        
        System.out.printf("original number:%.2f%nrounded number:%f%n",x,y);
    }
}
