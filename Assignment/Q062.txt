/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.util.Scanner;

public class Q062{
    public static void main(String[] main)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Decimal",
        "Binary", "Octal", "Hexadecimal");
        
        for ( int i = 1; i <= 256; i++ )
        {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexadecimal = Integer.toHexString(i);
            System.out.format("%-20d%-20s%-20s%-20s\n", i,
            binary, octal, hexadecimal);
        }
    }
    public String toBinaryString( int decimal )
    {
        String binary = " ";
        while (decimal >= 1 )
        {
            int value = decimal % 2;
            binary = value + binary;
            decimal /= 2;
        }
        return binary;
    }
    public String toOctalString( int decimal )
    {
        String octal = " ";
        while ( decimal >= 1 )
        {
            int value = decimal % 8;
            octal = value + octal;
            decimal /= 8;
        }
        return octal;
    }
    public String toHexString( int decimal )
    {
        String hexadecimal = " ";
        while ( decimal >= 1 )
        {
            int value = decimal % 16;
            switch (value)
            {
            case 10:
                hexadecimal = "A" + hexadecimal;
                break;
            case 11:
                hexadecimal = "B" + hexadecimal;
                break;
            case 12:
                hexadecimal = "C" + hexadecimal;
                break;
            case 13:
                hexadecimal = "D" + hexadecimal;
                break;
            case 14:
                hexadecimal = "E" + hexadecimal;
                break;
            case 15:
                hexadecimal = "F" + hexadecimal;
                break;
            default:
                hexadecimal = value + hexadecimal;
                break;
            }
            decimal /= 16;
        }
        return hexadecimal;
    }
 }
