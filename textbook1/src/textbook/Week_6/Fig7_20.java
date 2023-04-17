/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_20 {
    public static double average(double... number)
    {
        double total=0.0;
        for(double d:number)
            total+=d;
        return total/number.length;
    }
    public static void main(String[] args)
    {
        double d1=10.0;
        double d2=20.0;
        double d3=30.0;
        double d4=40.0;
        
        System.out.printf("d1=%.1f%nd2=%.1f%nd3=%.1f%nd4=%.1f%n%n",d1,d2,d3,d4);
        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1,d2));
        System.out.printf("Average of d1 , d2 and d3 is %.1f%n", average(d1,d2,d3));
        System.out.printf("Average of d1 , d2 ,d3 and d4is %.1f%n", average(d1,d2,d3,d4));
    }
}
