/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;

public class Q053{
    public static void perfect(int n)
    {
       int j = 0;

       for(int i = 1; i < n; i++)
       {
          if(n % i == 0)
          {
             j = j + i;
          }
       }
       if(n == j)
       {
          System.out.printf( "%d  ",n);
       }
       
    }

public static void main (String[] args)
{
    System.out.println("All the perfect numbers between 1 and 1000.");
    for (int n = 2; n < 1000; n++)
       perfect(n);
    System.out.println();
}
}
