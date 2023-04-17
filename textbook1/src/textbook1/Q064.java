/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook1;

/**
 *
 * @author user
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class Q064 {
     static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number one number :");
        int n=input.nextInt();
        
        while(n!=-1)
        {
            if (isPrime(n))
             {
            int correct = 1 + randomNumbers.nextInt(4); 
	   
		final String correct1 =  "Very good!";
		final String correct2 =  "Excellent!";
		final String correct3 = "Nice work!";
                final String correct4 = "Keep up the good work!";

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
                while (isPrime(n) == false)
                {
                    int incorrect = 1 + randomNumbers.nextInt(4); 
                    final String incorrect1 =  "No. Please try again.";
                    final String incorrect2 =  "Wrong. Try once more.";
                    final String incorrect3 = "Don't give up!";
                    final String incorrect4 = "No. Keep trying.";

			switch (incorrect){
			case 1:
				System.out.println(incorrect1);
                                System.out.print("Enter number one number :");
                                n=input.nextInt();
				break;
			case 2:
				System.out.println(incorrect2);
                                System.out.print("Enter number one number :");
                                n=input.nextInt();
				break;
			case 3:
				System.out.println(incorrect3);
                                System.out.print("Enter number one number :");
                                n=input.nextInt();
				break;
			case 4:
				System.out.println(incorrect4);
                                System.out.print("Enter number one number :");
                                n=input.nextInt();
				break;				
			}
                }
            }
             System.out.print("Enter number one number :");
             n=input.nextInt();
        }
    }
}