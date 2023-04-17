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
public class Q058 {
    public static void main(String[] args)
    {
        int number;
        boolean a=false;
        Scanner input = new Scanner(System.in);
        SecureRandom r = new SecureRandom();
        System.out.print("Guess a number between 1 and 1000:");
        number =input.nextInt();
        
        int guess= 1+r.nextInt(1000);
        //System.out.printf("%d%n", guess);
        
        while(!a)
        {
            if (number > guess) {
                System.out.println("Too high, try again");
            }
            else if (number < guess) {
                System.out.println("Too low, try again");
            }

            else {

                System.out.println("Congratulations. You guessed the number!");
                System.out.println("Would you like to play again? (Y/N) : ");
                String option = input.next();
                
                if (option.equals("Y") || option.equals("y")) {
                    System.out.print("Guess a number between 1 and 1000:");
                    guess= 1+r.nextInt(1000);
                    
                }
                else {
                    System.out.println("Good Bye!");
                    break;
               }
            }
            number =input.nextInt();
        }
    }
}
