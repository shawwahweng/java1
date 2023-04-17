/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class b2_15 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        int number1;
        int number2;
        
        System.out.print("Enter first integer:");
        number1=input.nextInt();
        
        System.out.print("Enter second integer:");
        number2=input.nextInt();
        
        if(number1==number2)
            System.out.printf("%d==%d%n", number1,number2);
        if(number1 !=number2)
            System.out.printf("%d!=%d%n", number1,number2);
        if(number1 <number2)
            System.out.printf("%d<%d%n", number1,number2);
        if(number1 >number2)
           System.out.printf("%d>%d%n", number1,number2);
        if(number1 <=number2)
            System.out.printf("%d<=%d%n", number1,number2);
        if(number1 >=number2)
           System.out.printf("%d>=%d%n", number1,number2);
    }
}
