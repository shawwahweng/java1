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
public class Q031 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side 1:");
        int sideOne=input.nextInt();
        System.out.print("Enter side 2:");
        int sideTwo=input.nextInt();
        System.out.print("Enter side 3:");
        int sideThree=input.nextInt();
        
        int rigthTriangle=sideThree*sideThree;
        sideThree=(sideOne*sideOne)+(sideTwo*sideTwo);
        if(rigthTriangle==sideThree)
        {
            System.out.println("Yes,the sides of a general right triangle.");
        }
        else
        {
             System.out.println("NO,the sides of a general right triangle.");
        }
    }
}
