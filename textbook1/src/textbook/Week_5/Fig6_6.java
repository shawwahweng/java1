/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;
import java.security.SecureRandom;
/**
 *
 * @author user
 */
public class Fig6_6 {
    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();
        
        for(int counter =1; counter<=20;counter++)
        {
            int face=1+randomNumbers.nextInt(6);
            
            System.out.printf("%d  ",face);
            
            if(counter%5==0)
                System.out.println();
        }
    }
}
