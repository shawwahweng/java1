/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fig6_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-point value separated by spaces:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double result = Math.max(number1,Math.max(number2,number3));       //maximum(number1,number2,number3);
        
        System.out.println("Maximum is:"+result);
    }
    /*
    public static double maximum(double x,double y,double z)
    {
        double maximumValue=x;
        
        if(y>maximumValue)
            maximumValue =y;
        
        if(z>maximumValue)
            maximumValue=z;
        
        return maximumValue;
        
    }
    */
}
