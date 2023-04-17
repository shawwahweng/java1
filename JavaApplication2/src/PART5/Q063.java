/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q063 {
    public static void main(String[] args)
	{
	   int answerNumber ; 
	   
	   SecureRandom integer1 = new SecureRandom();
           SecureRandom integer2 = new SecureRandom();
	   Scanner input =new Scanner(System.in);
           
           int number1= 1+integer1.nextInt(10);
           int number2= 1+integer2.nextInt(10);
           
           answerNumber=number2*number1;
           System.out.printf("%d*%d=%n", number1,number2);//System.out.printf("%d*%d=%d%n", number1,number2,answerNumber);
           System.out.print("Student input the answer number:");
           int answer =input.nextInt();

           
           while(answer!=-1)
            {
                if(answer==answerNumber)
                {
                    System.out.println("Very good");
                    
                }
                else
                {
                    
                    while(answer!=answerNumber)
                    {
                        System.out.println("No,Please try again");
                        System.out.printf("%d*%d=%n", number1,number2);
                        System.out.print("Student input the answer number:");
                        answer =input.nextInt();
                    }
                    if(answer==answerNumber)
                    {
                        System.out.println("Very good");
                    
                    }
                }
                number1= 1+integer1.nextInt(10);
                number2= 1+integer2.nextInt(10);
                answerNumber=number2*number1;
                System.out.printf("%d*%d=%n", number1,number2);
                System.out.print("Student input the answer number:");
                answer =input.nextInt();
            }
        }
     
}

