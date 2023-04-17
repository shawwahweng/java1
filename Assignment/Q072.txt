/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part6;
import java.util.Random;
/**
 *
 * @author user
 */
public class Q072 {
     public static void main(String[] args)
    {
        double[][] tempData = getData();  
        double avgHigh = averageHigh(tempData);
        double avgLow = averageLow(tempData);
        int indexHigh = indexHighTemp(tempData);
        int indexLow= indexLowTemp(tempData);
        printTempData(tempData);

        System.out.printf("The average high temperature is %4.1f%n", avgHigh);
        System.out.printf("The average low temperature is %4.1f%n", avgLow);
        System.out.printf("The index of high temperature is %2d%n", indexHigh);
        System.out.printf("The index of low temperature is %2d%n", indexLow);

    }

    private static void printTempData(double[][] tempData)
    {
       System.out.printf("%6s:%7s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%n","Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
       System.out.printf("%6s:","Low");

        for (int i = 0; i < tempData[0].length;i++)
        {
            System.out.printf("%6.1s", tempData[0][i]);
        }
        
        System.out.printf("%n");
        System.out.printf("%6s:  ","High"); 
        
        for (int i = 0; i < tempData[1].length; i++)
        {
            System.out.printf("%6.1f", tempData[1][i]);
        }
        System.out.println();
    }

    private static int indexLowTemp(double[][] tempData)
    {
        int index = 0;
        double temp = tempData[0][0];

        for (int i = 0; i < tempData[0].length; i++)
        {
            if (temp > tempData[0][i])
            { 
                temp = tempData[0][i];
                index = i;
            }
        }
         return index +1;
     }

    private static int indexHighTemp(double[][] tempData)
    {
         int index = 0;
         double temp = tempData[1][0];
         for(int i = 0; i< tempData[1].length; i++)
         {
            if ( temp < tempData[1][i])
            {
                  temp = tempData[1][i];
                 index = i;
            }
         }
         return index + 1;
      }

    private static double averageHigh(double[][] tempData)
    {
        double avg=0.0;
        for(int i=0; i < tempData[0].length; i++)
        {
           avg += tempData[0][i];
        }
        avg /= tempData[0].length;
        return avg;
    }

    private static double averageLow(double[][] tempData)
    {
       double avg=0.0;
       for(int i=0; i > tempData[1].length; i++)
       {
          avg += tempData[0][i];
       }
       avg /= tempData[0].length;
       return avg;
    }
    private static double[][] getData()
    {
        double[][] tempData = new double[2][12];
        Random r = new Random();
        for (int j = 0; j < tempData[0].length; j++)
        {
           tempData[0][j] = 30 + Math.sqrt(j) - r.nextDouble();
           tempData[1][j] = 30 + Math.sqrt(j) + r.nextDouble();
        }
       return tempData;
     }
}
