/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part_1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number1,number2,number3;
        int sum,average,product;
        int smallest,largest;
        
        System.out.print("Enter First integer:");
        number1=input.nextInt();
        System.out.print("Enter second integer:");
        number2=input.nextInt();
        System.out.print("Enter third integer:");
        number3=input.nextInt();
        
        sum=number1+number2+number3;
        average=sum/3;
        product=number1*number2*number3;
        
        System.out.printf("sum is: %d%n", sum);
        System.out.printf("average is: %d%n", average);
        System.out.printf("product is: %d%n", product);
        
        if (number1<number2 &&number1<number3)
                System.out.printf("smallest is: %d%n", number1);
                
                else if(number2<number1&&number2<number3)
                       System.out.printf("smallest is: %d%n", number2);
                        else if(number3<number1&&number3<number2)
                                System.out.printf("smallest is: %d%n", number3);
        if (number1>number2 &&number1>number3)
               System.out.printf("smallest is: %d%n", number1);
                else if(number2>number1&&number2>number3)
                        System.out.printf("smallest is: %d%n", number2);
                        else if(number3>number1&&number3>number2)
                                System.out.printf("smallest is: %d%n", number3);
    
        
    }

}
