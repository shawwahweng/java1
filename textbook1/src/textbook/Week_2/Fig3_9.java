/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_2;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fig3_9 {
    public static void main(String args[]) {
        // TODO code application logic here
        Fig3_8 account1=new Fig3_8("John Green",50.00);
        Fig3_8 account2=new Fig3_8("John Blue",-7.53);
        
        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
        
        System.out.print("Enter deposit amount for account2:");
        depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s balance:$%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance:$%.2f%n", account2.getName(),account2.getBalance());
    }
}
