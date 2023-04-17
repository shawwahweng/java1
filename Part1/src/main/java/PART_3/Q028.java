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
public class Q028 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int binary;
        int decimal = 0, place = 0;  
        int lastDigit;

        System.out.print("Enter binary number for conversion: ");
        binary = input.nextInt();
        int binarys=binary;
        while(binary != 0){

            lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, place);
            binary /= 10;
            place++;
        }

        System.out.printf("binary %d = decimal %d\n", binarys, decimal);
    }
}
