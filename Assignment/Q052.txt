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
public class Q052 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter three value:");
        float value1 = input.nextFloat();
        float value2 = input.nextFloat();
        float value3 = input.nextFloat();
        
        float min= (float) Math.min(value1,Math.min(value2, value3));
        
        System.out.printf("Smallest value:%.3f%n", min);
    }
}
