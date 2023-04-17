/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q076 {
    public static void main(String[] args){
     boolean[] economyClass = new boolean[5];
                int numFirstClass = 0;
                int numEconomyClass = 0;
                boolean[] firstClass = new boolean[5];

        Scanner input = new Scanner(System.in);

        System.out.print("Press 1 for economy and 2 for first class:");
        int choice = input.nextInt();
        while(choice!=-1){
            if (choice == 1)
            {
                
            if (numFirstClass < 5){            
                for (int i = 0; i < firstClass.length; i++){                
                    if(!firstClass[i]){
                        firstClass[i] = true;
                        System.out.printf("First Class. Seat number:%d ",(1+i)); 

                        numFirstClass++;
                        break;
                    }

                }
            }        
            else if (numEconomyClass < 5){
                System.out.println("No more 1st class. Press 1 if you would like to book an economy class ticket.");
                 choice = input.nextInt();            
                if (choice == 1)
                   if (numFirstClass < 5){            
                        for (int i = 0; i < firstClass.length; i++){                
                            if(!firstClass[i]){
                                firstClass[i] = true;
                                System.out.printf("First Class. Seat number:%d ",(1+i)); 
                                numFirstClass++;
                                break;
                            }
                        }
                }
                else 
                    System.out.println("The next flight leaves in 3 hours.");
            }        
            else
                System.out.println("All booked, the next flight leaves in 3 hours.");        


            }
            else if (choice == 2)
            {
               
                if (numEconomyClass < 5){            
                    for (int i = 0; i < economyClass.length; i++){                
                        if(!economyClass[i]){
                            economyClass[i] = true;
                            System.out.println("Economy Class. Seat number: "+(i+6)); 
                            numEconomyClass++;
                            break;
                        }
                    }
                }        
                else if (numFirstClass < 5){
                    System.out.println("No more economy. Press 1 if you would like to book an first class ticket.");
                     choice = input.nextInt();            
                    if (choice == 1)
                       if (numFirstClass < 5){            
                        for (int i = 0; i < firstClass.length; i++){                
                            if(!firstClass[i]){
                                firstClass[i] = true;
                                System.out.printf("First Class. Seat number:%d ",(1+i)); 
                                numFirstClass++;
                                break;
                            }
                        }
                }
                    else 
                        System.out.println("The next flight leaves in 3 hours.");
                }        
                else
                    System.out.println("All booked, the next flight leaves in 3 hours.");
                }
            else
            {
                System.out.println("Invalid selection");
            }                 
            System.out.printf("%n%nEnd program enter -1, else any key to continue.%n");
            System.out.print("Press 1 for economy and 2 for first class:");
            choice = input.nextInt();
        }
    }
}



