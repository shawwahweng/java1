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
public class DateTest {
    	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		
                 System.out.print("Enter day:");
                 int day=input.nextInt();
                 System.out.print("Enter month:");
                 int month=input.nextInt();
                 System.out.print("Enter year:");
                 int year=input.nextInt();
                 
                 Date d=new Date(day,month,year);
                 System.out.print("You entered ");
                 d.displayDate();
	}
}
