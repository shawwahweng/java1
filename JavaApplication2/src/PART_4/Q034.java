/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;

/*
Write an application that calculates the product of the odd 
integers from 1 to 15.
*/
public class Q034 {
    public static void main(String[] args)
    {
        int total=1;
        System.out.print("Calculates the product of the odd");
        
       for(int number=1;number<=15;number+=2)
       {
           total=total*number;
       }
       System.out.printf("%nProduct of the odd integers from 1 to 15:%d%n", total);
    }
}
