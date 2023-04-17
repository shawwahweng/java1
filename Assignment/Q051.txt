/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q051 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter a Fahrenheit(F) temperature or a Celsius(C) temperature:");

       char Temparature = input.next().charAt(0);
        
        if(Temparature=='F' || Temparature=='f')
        {
            System.out.print("Enter a Fahrenheit temperature number:");
            double fahrenheit=input.nextDouble();
            double celsius = 5.0 / 9.0 * ( fahrenheit - 32 );
            System.out.printf("Output the Celsius:%.2f[C]%n", celsius);
        }else if(Temparature=='C' || Temparature=='c')
        {
            System.out.print("Enter a Celsius temperature number:");
            double Celsius=input.nextDouble();
            double fahrenheit = 9.0 / 5.0 * ( Celsius + 32 );
            System.out.printf("Output the Celsius:%.2f[F]%n", fahrenheit);
        }
        
    }
}
