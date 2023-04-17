/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;

/**
 *
 * @author user
 */
public class Fig6_10 {
    public static void main(String[] args)
    {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }
    
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argament:%d%n", intValue);
        return intValue*intValue;
    }
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argament:%f%n", doubleValue);
        return doubleValue*doubleValue;
    }
}
