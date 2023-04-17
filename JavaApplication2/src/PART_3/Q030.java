/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q030 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter three nonzero value:");
        int valueOne=input.nextInt();
        int valueTwo=input.nextInt();
        int valueThree=input.nextInt();
        
        if(valueOne==valueTwo && valueOne==valueThree && valueTwo==valueThree)
        {
            System.out.println("Yes,sides of a triangle");
        }
        else
        {
            System.out.println("No,sides of a triangle");
        }
    }
}
