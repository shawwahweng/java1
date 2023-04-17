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
public class Q056 {
    public static int result(int qualityPoints)
    {
        if (qualityPoints>= 90 && qualityPoints<=100)
            return 4;

        else if (qualityPoints >= 80 && qualityPoints<=89)
            return 3;

        else if (qualityPoints >= 70 && qualityPoints<=79)
            return 2;
        
        else if  (qualityPoints >= 60 && qualityPoints<=69) 
            return 1;
        
        else 
            return 0;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputs a students average:");
        int qualityPoints=input.nextInt();
        
        System.out.printf("Result %d", result(qualityPoints));
        
        System.out.println();
    }
}
