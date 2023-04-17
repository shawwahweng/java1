/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;

/**
 *
 * @author user
 */
public class Q029 {
    public static void main(String[] args)
    {
        int length = 15;
        int height = 7;

        for (int i = 0; i <= height; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(" ");
                }
                else if (j != length || i % 2 != 0)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}