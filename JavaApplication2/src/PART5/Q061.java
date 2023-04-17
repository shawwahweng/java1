/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.security.SecureRandom;
import java.util.Scanner;

public class Q061{
     private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{CONTINUE,WON,LOST};
    
    private static final int SNAKE_EYES =2;
    private static final int TREY =3;
    private static final int SEVEN =7;
    private static final int YO_LEVEN =11;
    private static final int BOX_CARS =12;
    
    public static void main(String[] main)
    {
        Scanner input = new Scanner(System.in);
        int myPoint =0;
        Status gameStatus;
        int sumOfDice= rollDice();
        int playFlag;
        int bankBalance = 1000;
	int wager = 0;
        do {
            System.out.print("Enter 1 is continue craps game ,-1 quit");	
            playFlag = input.nextInt();
            if(playFlag ==-1)
		{System.out.print("Quit");
                break;
            }
            chat();
            System.out.printf("Now wager:%d%nEnd enter -1", bankBalance);
            wager = input.nextInt();
	while(wager <0 || wager > bankBalance)
	{
            System.out.print("Enter the wager:");
            wager = input.nextInt();
	}
        switch(sumOfDice)
        {
            case SEVEN:
            case YO_LEVEN:
                gameStatus=Status.WON;
                bankBalance+=wager;
                break;
                
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus=Status.LOST;
                if(bankBalance-wager>=0)
                    bankBalance-=wager;
                else
                    bankBalance=0;
                break;
                
            default:
                gameStatus=Status.CONTINUE;
                myPoint=sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice= rollDice();
            
            if(sumOfDice==myPoint)
            {
                gameStatus= Status.WON;
                bankBalance+=wager;
            }
            else 
            {
                if (sumOfDice == SEVEN)
                {
                    gameStatus = Status.LOST;
                    if(bankBalance-wager>=0)
                        bankBalance-=wager;
                    else
                        bankBalance=0;
                }
            }
        }
        if(gameStatus== Status.WON)
            System.out.println("Player wins");
        else 
            System.out.println("Player loses");
        if(bankBalance ==0)
            System.out.printf("%n no money",bankBalance);
        System.out.println();
        }while(playFlag != -1&& bankBalance>0);
        input.close();
}
        
    public static int rollDice()
    {
        int die1 =1+randomNumbers.nextInt(6);
        int die2 =1 +randomNumbers.nextInt(6);
        
        int sum=die1+die2;
        System.out.printf("PLayer rolled %d+%d=%d%n",die1,die2,sum);
        
        return sum;
    }
    public static void chat()
	{
	   int msgNum = 1 + randomNumbers.nextInt(4); 
	   
		final String MSG1 =  "Oh, you're going for broke, huh?";
		final String MSG2 =  "Aw c'mon, take a chance!";
		final String MSG3 = "You're up big. Now,s the time to cash in your chips!";


			switch (msgNum){
			case 1:
				System.out.println(MSG1);
				break;
			case 2:
				System.out.println(MSG2);
				break;
			case 3:
				System.out.println(MSG3);
				break;
							
			}
        }
 }
