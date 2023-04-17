/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;
import java.security.SecureRandom;
/**
 *
 * @author user
 */
public class Fig7_7 {
    public static void main(String[] args)
    {
        SecureRandom randomNumber =new SecureRandom();
        int[] frequency = new int[7];
        
        for(int roll = 1; roll<= 10 ; roll++)
        {
            ++frequency[1 + randomNumber.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Face","frequency");
        
        for(int face =1;face<frequency.length;face++)
            System.out.printf("%4d%10d%n", face,frequency[face]);
    }
}
