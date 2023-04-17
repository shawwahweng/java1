/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_9 {
    private final String face;
    private final String suit;
    
    public Fig7_9(String cardFace,String cardSuit)
    {
        this.face=cardFace;
        this.suit=cardSuit;
    }
    public String toString()
    {
        return face + "of" +suit;
                
    }
}
