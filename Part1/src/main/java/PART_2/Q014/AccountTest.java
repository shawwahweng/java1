/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AccountTest {
    public static void main(String args[]) {
        // TODO code application logic here
        Account account1=new Account("John Green",50.00);
        Account account2=new Account("John Blue",-7.53);
        
        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter amount for account1: ");
        double Amount=input.nextDouble();
        System.out.printf("minus %.2f to account1 balance%n", Amount);
        account1.deposit(Amount);
        
        System.out.printf("%n%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
        
        System.out.print("Enter amount for account2:");
        Amount=input.nextDouble();
        System.out.printf("minus %.2f to account2 balance %n", Amount);
        account2.deposit(Amount);

        
        System.out.printf("%n%n%s balance:$%.2f", account1.getName(),account1.getBalance());
        System.out.printf("%n%s balance:$%.2f%n", account2.getName(),account2.getBalance());
    }
}
