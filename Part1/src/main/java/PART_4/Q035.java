/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;

/**
 *
 * @author user
 */
public class Q035 {
    public static void main(String[] args)
    {
        
        long total=1;
        System.out.println("Calculates the factorials of 1 through 20");
        System.out.println("Print the result intabular format");
        System.out.println("n\tn!");
       for(int number=1;number<=20;number++)
       {
           total=total*number;
           System.out.printf("%n%02d\t%d%n",number, total);
       }
    }
}
