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
public class Fig7_10 {
    private Fig7_9[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARD =52;
    private static final int SecureRandom randomNumbers = new SecureRandom();
    
    public DeckOfCards()
    {
        String[] faces={"Ace","Deuce","Three","Four","Five","Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" }; 
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        
        deck = new Fig7_9[NUMBER_OF_CARDS];
        currentCard =0;
        
        for(int count = 0;count<deck.length;count++)
            deck[count]=new Fig7_9(faces[count%13],suits[count/13]);
    }
    public void shuffle()
    {
        currentCard=0;
        for(int first =0; first <deck.length;first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Fig7_9 temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Fig7_9 dealCard()
    {
        if(currentCard < deck.length)
            return deck[currentCard++];
        else 
            return null;
    }
}