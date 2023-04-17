/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q02 {
    public static void main(String []args)
    {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter the array[%d]:",i);
            array[i]=input.nextInt();
        }
        System.out.printf("The smallest index position is:%d",lastLargestIndex(array));
        System.out.println();
    }
    public static int lastLargestIndex(int[] array)
    {
        if (array.length == 0)
            return -1;
        int index = 0;
        int max = array[index];
        for (int i = 1; i < array.length; i++){
            if (array[i] >= max)
            {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
