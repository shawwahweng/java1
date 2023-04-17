
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
public class Q066 {
    public static void main(String[] args)
	{
	    int answerNumber ;
            int counter=1,number=0;
            int total = 1;
	    SecureRandom randomNumbers = new SecureRandom();
	    SecureRandom integer1 = new SecureRandom();
            SecureRandom integer2 = new SecureRandom();
	    Scanner input =new Scanner(System.in);
            int correct = 1 + randomNumbers.nextInt(4); 
	    final String correct1 = "Very good!";
            final String correct2 = "Excellent!";
            final String correct3 = "Nice work!";
            final String correct4 = "Keep up the good work!";
            
            System.out.print("Enter the different level:");
            int level = input.nextInt();

            for(int count=1;count<=level;count++)
            {
                total*=10;
            }
            System.out.printf("1 to %d%n", total);
            while(counter<10)
            { 
                int number1= 1+integer1.nextInt(total);
                int number2= 1+integer2.nextInt(total);
                answerNumber=number2*number1;
                System.out.printf("%d)%d*%d=%n",counter,number1,number2);
                System.out.print("Student input the answer number:");
                int answer =input.nextInt();
                if(answer==answerNumber)
                {                   
                    switch (correct){
                    case 1:
                            counter++;
                            System.out.println(correct1);
                            number++;
                            break;
                    case 2:
                            counter++;
                            System.out.println(correct2);
                            number++;
                            break;
                    case 3:
                            counter++;
                            System.out.println(correct3);
                            number++;
                            break;
                    case 4:
                            counter++;
                            System.out.println(correct4);
                            number++;
                            break;				
                    }   
                }
                else
                {
                    while(answer!=answerNumber)
                    {
                        int incorrect = 1 + randomNumbers.nextInt(4); 
                        final String incorrect1 =  "No. Please try again.";
                        final String incorrect2 =  "Wrong. Try once more.";
                        final String incorrect3 = "Don't give up!";
                        final String incorrect4 = "No. Keep trying.";
                        
			switch (incorrect){
			case 1:
                                counter++;          
				System.out.println(incorrect1);
                                System.out.printf("%d)%d*%d=%n",counter,number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();  
				break;
			case 2:
                                counter++;        
				System.out.println(incorrect2);
                                System.out.printf("%d)%d*%d=%n",counter,number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();    
				break;
			case 3:
                                counter++;
				System.out.println(incorrect3);
                                System.out.printf("%d)%d*%d=%n",counter,number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;
			case 4:
                                counter++;
				System.out.println(incorrect4);
                                System.out.printf("%d)%d*%d=%n",counter,number1,number2);
                                System.out.print("Student input the answer number:");
                                answer =input.nextInt();
				break;				
                        }
                        if(answer==answerNumber)
                        {                  
                            switch (correct){
                                case 1:
                                        counter++;
                                        System.out.println(correct1);
                                        number++;
                                        break;
                                case 2:
                                        counter++;
                                        System.out.println(correct2);
                                        number++;
                                        break;
                                case 3:
                                        counter++;
                                        System.out.println(correct3);
                                        number++;
                                        break;
                                case 4:
                                        counter++;
                                        System.out.println(correct4);
                                        number++;
                                        break;				
                            }
                        }
                        if(counter==10 || counter>=10)
                        {
                            break;
                        }
                    }
                }    
            }
            int percentage=number*10;
            int f =counter-number;
            if(percentage<=75)
            {
                System.out.printf("True:%d%nFalse:%d%n", number,f);
                System.out.print("How many pencentage:"+percentage+"%");
                System.out.printf("%nPlease ask your teacher for extra help.%n");
            }
            else
            {
                System.out.printf("True:%d%nFalse:%d%n", number,f);
                System.out.print("How many pencentage:"+percentage+"%");
                System.out.printf("%nCongratulations, you are ready to go to the next level!%n");
            }
        }
}




