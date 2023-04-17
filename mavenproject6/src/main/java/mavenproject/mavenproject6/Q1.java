/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1 {

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [20] ;
        int i,even=0,zero=0,odd = 0,count=0;

        System.out.println("Please enter a set of numbers, positive, negative, or zeros.");
        for( i=0;i<arr.length;i++)
        {
            
            arr[i]=input.nextInt();
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i]==0)
                zero++;
            else if(arr[i]%2==0)
                even++;
            else if(arr[i]%2==1)
                odd++;
        }
        for ( i = 0; i < arr.length; i++)
	{
            if (Prime(arr[i]))
            {
                count++;
            }
	}
        System.out.printf("- %d zeros%n",zero);
        System.out.printf("- %d evens number%n",even);
        System.out.printf("- %d odd numbers%n",odd);
        System.out.printf( "- %d odd numbers%n",count);
    
    }
    public static boolean Prime(int n)
    {
	if (n <= 1)
            return false;
        int i = 2;
	while (i <= n / 2)
	{
	if ((n % i) == 0)
		return false;
		i++;
	}

	return true;
    }
}
