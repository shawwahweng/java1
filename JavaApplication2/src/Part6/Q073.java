package Part6;

import java.util.Scanner;


public class Q073{
   public static void main( String args[])
   {

        int salesPeople;
        int product;
        double amount;
        int row, col;
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4];
	  
        System.out.print ("Enter sales person number (-1 to end) : ");
	salesPeople = input.nextInt();
	  
	while (salesPeople != -1)
        {
	    System.out.print("Enter product number: ");
            product = input.nextInt();
            System.out.print("Enter sales amount: ");
            amount = input.nextDouble();
		
		if (salesPeople >= 1 && salesPeople < 5 && product >= 1 && product < 6 && amount >= 0)
                    sales[salesPeople-1][product-1] += amount;

                if (product > 5)  
		    System.out.print("Invalid input!\n");
		
		System.out.print("Enter sales person number (-1 to end): ");
		salesPeople = input.nextInt(); 
   			
	  } 

         double personTotal[] = new double[4];
	  
         for ( col = 0; col < 4; col++)
	     personTotal[col] = 0;
		 
	 System.out.printf("%n%7s%14s%14s%14s%14s%14s\n", "Product", "Salesperson 1",
	     "Salesperson 2", "Salesperson 3", "Salesperson 4","Total");
	
	 for ( row = 0; row < 5; row++)
	 {
	     double productTotal = 0.0;
             System.out.printf("%7d", (row + 1));
		 
	     for ( col = 0; col < 4; col++)
            {
		System.out.printf("%14.2f", sales[row][col]);
                productTotal += sales[row][col];
		personTotal[col] += sales[row][col];
            } 
            System.out.printf("%14.2f\n", productTotal);
		 
	}
	  
	System.out.printf("%7s", "Total");
	  
	  for ( col = 0; col < 4; col++)
	     System.out.printf("%14.2f", personTotal[col]);
	  
	  System.out.println();	  
   }  
}
