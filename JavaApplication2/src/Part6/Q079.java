/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q079 {
    public static void main(String []args)
    {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter the array[%d]:",i);
            array[i]=input.nextInt();
        }
        System.out.printf("The smallest index position is:%d",smallestIndex(array));
        System.out.println();
    }
    public static int smallestIndex(int[] array)
    {
        if (array.length == 0)
            return -1;
        int index = 0;
        int min = array[index];
        for (int i = 1; i < array.length; i++){
            if (array[i] <= min)
            {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
