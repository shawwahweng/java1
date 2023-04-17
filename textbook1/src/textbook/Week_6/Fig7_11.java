/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_11 {
    public static void main(String[]  args)
    {
        Fig7_11 myDeckOfCards = new Fig7_11();
        Fig7_11.shuffle();
        
        for(int i=1;i<=52;i++)
        {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            
            if(i%4==0)
            System.out.println();
        }
    }
}
