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
public class Q077 {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [18] ;
        int [] count = new int[100];

        int i,tmp = 0;

        for( i=0;i<arr.length;i++)
        {
            System.out.printf("Enter the array[%d]:",i);
            arr[i]=input.nextInt();
        }
        for(i = 0; i < arr.length; i++){
            tmp = arr[i];
            count[tmp]++;
        }
        System.out.println("Number      Count");
        for(i=1; i < count.length; i++){
            if(count[i] > 0 && count[i] == 1){
                System.out.printf("%d    %9d %n",i, count[i]);
             }
            else if(count[i] >= 2){
                System.out.printf("%d    %9d %n",i, count[i]);
            }
         }
    }
}
