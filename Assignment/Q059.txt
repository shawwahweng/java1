/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author user
 */
public class Q059 {
    public static void main(String[] args)
    {
        int number,counter=0;
        boolean a=false;
        Scanner input = new Scanner(System.in);
        SecureRandom r = new SecureRandom();

        int guess= 1+r.nextInt(1000);
            
        System.out.print("Guess a number between 1 and 1000:");
        number =input.nextInt();

        System.out.printf("%d%n", guess);  
        while(!a)
        {
            if (number > guess) {
                System.out.println("Too high, try again");
                counter++;

            }
            else if (number < guess) {
                System.out.println("Too low, try again");
                counter++;
           }else {
                if(counter < 10)
                    System.out.println("Either you know the secret or you got lucky!");
                else if(counter == 10)
                    System.out.println("Ahah! You know the secret!");
                else
                    System.out.println("You should be able to do better!");
                System.out.println("Congratulations. You guessed the number!");
                System.out.println("Would you like to play again? (Y/N) : ");
                String option = input.next();

                if (option.equals("Y") || option.equals("y")) {
                    System.out.print("Guess a number between 1 and 1000:");
                    guess= 1+r.nextInt(1000);

                }else {
                    System.out.println("Good Bye!");
                    break;
                }
            }
           number =input.nextInt();
        }
        
            
    }
}
