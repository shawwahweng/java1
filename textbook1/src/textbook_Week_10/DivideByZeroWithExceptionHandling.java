/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook_Week_10;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throw ArithmeticException
    { 
        return numerator/denominator;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        
        
        do 
        { 
         try // read two numbers and calculate quotient 
         { 
         System.out.print("Please enter an integer numerator: "); 
         int numerator = scanner.nextInt(); 
         System.out.print("Please enter an integer denominator: "); 
         int denominator = scanner.nextInt(); 

         int result = quotient(numerator, denominator); 
         System.out.printf("%nResult: %d / %d = %d%n", numerator, 
         denominator, result); 
         continueLoop = false; // input successful; end looping 
         } 
         catch (InputMismatchException inputMismatchException) 
         { 
         System.err.printf("%nException: %s%n", 
         inputMismatchException); 
         scanner.nextLine(); // discard input so user can try again 
         System.out.printf( 
         "You must enter integers. Please try again.%n%n"); 
         } 
         catch (ArithmeticException arithmeticException) 
         { 
         System.err.printf("%nException: %s%n", arithmeticException);
         System.out.printf( 
         "Zero is an invalid denominator. Please try again.%n%n"); 
         } 
        } while (continueLoop);
    }
}
