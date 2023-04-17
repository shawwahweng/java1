/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fig4_15 {
    public static void main(String[] args)
    {
        int c=5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("c  postincrement: %d%n", c++);
        System.out.printf("c after postincrement: %d%n", c);
        System.out.println();
        c=5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("c  postincrement: %d%n", ++c);
        System.out.printf("c after postincrement: %d%n", c);
        System.out.println();
    }
}
