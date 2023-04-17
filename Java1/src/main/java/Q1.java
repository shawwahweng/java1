import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
		
		// Initialize variable
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int sum;	// sum of num1 and num2
		int product;	// product of num1 and num2
		int difference;	// difference of num1 and num2
		int quotient;	// quotient of num1 and num2
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt();	// read first number from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second number from user
		
		sum	= num1 + num2;	// add numbers
		product	= num1 * num2;	// multiply numbers
		difference = num1 - num2;	// difference of numbers
		quotient = num1 / num2;	// division of numbers
		
		System.out.printf("Sum is %d\n", +sum);	// display sum
		System.out.printf("Product is %d\n", +product);	// display product
		System.out.printf("Difference is %d\n", +difference);	// display difference
		System.out.printf("Quotient is %d\n", +quotient);	// display quotient
    }
}
