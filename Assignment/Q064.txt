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
public class Q064 {
    public static void main(String[] args)
	{
	   int answerNumber ; 
	   SecureRandom randomNumbers = new SecureRandom();
	   SecureRandom integer1 = new SecureRandom();
           SecureRandom integer2 = new SecureRandom();
	   Scanner input =new Scanner(System.in);
           int correct = 1 + randomNumbers.nextInt(4); 
	   
           final String correct1 = "Very good!";
           final String correct2 = "Excellent!";
           final String correct3 = "Nice work!";
           final String correct4 = "Keep up the good work!";
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
                    switch (correct){
                    case 1:
                            System.out.println(correct1);
                            break;
                    case 2:
                            System.out.println(correct2);
                            break;
                    case 3:
                            System.out.println(correct3);
                            break;
                    case 4:
                            System.out.println(correct4);
                            break;				
                    }
                }
                else
                {                   
                    while(answer!=answerNumber)
                    {
                        int incorrect = 1 + randomNumbers.nextInt(4); 
                        final String incorrect1 = "No. Please try again.";
                        final String incorrect2 = "Wrong. Try once more.";
                        final String incorrect3 = "Don't give up!";
                        final String incorrect4 = "No. Keep trying.";

			switch (incorrect){
			case 1:
				System.out.println(incorrect1);
                                System.out.printf("%d*%d=%n", number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;
			case 2:
				System.out.println(incorrect2);
                                System.out.printf("%d*%d=%n", number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;
			case 3:
				System.out.println(incorrect3);
                                System.out.printf("%d*%d=%n", number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;
			case 4:
				System.out.println(incorrect4);
                                System.out.printf("%d*%d=%n", number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;				
			}
                        if(answer==answerNumber)
                        {                   
                            switch (correct){
                                case 1:
                                        System.out.println(correct1);
                                        break;
                                case 2:
                                        System.out.println(correct2);
                                        break;
                                case 3:
                                        System.out.println(correct3);
                                        break;
                                case 4:
                                        System.out.println(correct4);
                                        break;				
                            }
                        }
                        
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

