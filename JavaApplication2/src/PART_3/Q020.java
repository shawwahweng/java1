/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package PART_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q020 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
                
        int accountNumber;
        int balance,beginningBalance,charges,credit,creditLimit;
        
        System.out.print("Enter Account number:");
        accountNumber= input.nextInt();
        System.out.print("Enter Balance at the beginning of the month:");
        beginningBalance= input.nextInt();
        System.out.print("Enter Total of all items charged by the customer this month:");
        charges= input.nextInt();
        System.out.print("Enter Total of all credits applied to the customer's account this month:");
        credit= input.nextInt();
        System.out.print("Enter account credit limit:");
        creditLimit= input.nextInt();
        
        balance=beginningBalance+charges-credit;
        
        if(balance>creditLimit)
        {
            System.out.printf("%nAccount number:%d%n",accountNumber);
            System.out.println("Credit limit exceeded");
        }
        else
        {
            System.out.printf("%nAccount number:%d%n",accountNumber);
            System.out.println("NO");
        }
    }
}