/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q3 {
    public static void main(String[] args)
    {
        double childrenDessert,person=1,room = 0,totalperson,balance;
        double totalAdultsDessert,totalChildrenDessert,totalper,foodCost,totalTax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adults to be served:");
        double adults=input.nextDouble();
        System.out.print("Enter the number of children to the served:");
        double children=input.nextDouble();
        System.out.print("Enter Cost per adult withount dessert:$");
        double adultsDessert=input.nextDouble();
        childrenDessert=adultsDessert*60/100;
        System.out.printf("Enter Cost per childern withount dessert:$%.2f",childrenDessert);
        System.out.printf("%nEnter Cost for person desert:$%.2f%n",person);
        System.out.print("Enter student room type(small , big or home):");
        String roomType=input.next();
        if(roomType.equalsIgnoreCase("s")||roomType.equalsIgnoreCase("S"))
        {
           room=45.00; 
        } 
        else if (roomType.equalsIgnoreCase("B")||roomType.equalsIgnoreCase("b")) 
        {
            room=50.00;
        }
        else if (roomType.equalsIgnoreCase("H")||roomType.equalsIgnoreCase("h")) 
        {
            room=0.00;
        }
        else
            System.out.println("Enter error roomType");
        
        System.out.print("a percentage for tip and tax:");
        double tax=input.nextDouble();
        System.out.print("Enter the deposit:");
        double deposit=input.nextDouble();
        totalAdultsDessert=adults*adultsDessert;
        System.out.printf("%n%nTotal const for adult meals:   $%8.2f%n",totalAdultsDessert);
        totalChildrenDessert=children*childrenDessert;
        System.out.printf("Total const for children meals:$%8.2f%n",totalChildrenDessert);
        totalperson=adults+children;
        totalper=totalperson*person;
        System.out.printf("Total const for dessert:       $%8.2f%n",totalper);
        foodCost=totalChildrenDessert+totalAdultsDessert+totalperson;
        System.out.printf("Total food cost:               $%8.2f%n",foodCost);
        totalTax=foodCost*tax/100;
        System.out.printf("Plus tip and tax:              $%8.2f%n",totalTax);
        System.out.printf("Plus room fee:                 $%8.2f%n",room);
        System.out.printf("Less deposit:                  $%8.2f%n",deposit);
        balance=foodCost+totalTax+room-deposit;
        System.out.printf("Less deposit:                  $%8.2f%n",balance);
    }
}
