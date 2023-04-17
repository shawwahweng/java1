/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q039 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int quantity;
        double total = 0;
        double product1=2.98,product2=4.50,product3=9.98,product4=4.49,product5=.87;
        System.out.println("Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49, product 5, $6.87 and end=-1");
        System.out.print("Enter product Number:");
        int productNumber=input.nextInt();
        
        while(productNumber!=-1)
        {
            switch(productNumber)
            {
                case 1:
                    System.out.print("Enter quantity sold:");
                    quantity=input.nextInt();
                    total=total+(product1*quantity);
                    break;
                case 2:
                    System.out.print("Enter quantity sold:");
                    quantity=input.nextInt();
                    total=total+(product2*quantity);
                    break;
                case 3:
                    System.out.print("Enter quantity sold:");
                    quantity=input.nextInt();
                    total=total+(product3*quantity);
                    break;
                case 4:
                    System.out.print("Enter quantity sold:");
                    quantity=input.nextInt();
                    total=total+(product4*quantity);
                    break;
                case 5:
                    System.out.print("Enter quantity sold:");
                    quantity=input.nextInt();
                    total=total+(product5*quantity);
                    break;
                    
                default:
                    System.out.print("Please enter product number between 1 dan 5");
            }
            System.out.println("Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 product 5, $6.87 and end=-1");
            System.out.print("Enter product Number:");
            productNumber=input.nextInt();
        }
        System.out.printf("Total:$%f%n",total);
    }
}
