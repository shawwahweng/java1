/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args)
    {
        int room=0,g=0;
        double matriculation=30.00,food=400.00,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student room type(R or A):");
        String roomType=input.nextLine();
        System.out.print("Enter student in four digits:");
        int digit=input.nextInt();
        System.out.print("Enter student credit hours:");
        int creditHours=input.nextInt();
        System.out.print("Enter student graduation status (T or F):");
        String graduation=input.next();
        
        if(roomType.equalsIgnoreCase("r")||roomType.equalsIgnoreCase("R"))
        {
           room=200; 
        } 
        else if (roomType.equalsIgnoreCase("a")||roomType.equalsIgnoreCase("A")) 
        {
            room=250;
        }
        else
            System.out.println("Enter error roomType");
        if(creditHours<12&&creditHours>12)
        {
            System.out.println("Failed the subjet");
        }
        else 
        {
            creditHours=creditHours*90;
        }
        
        if(graduation.equalsIgnoreCase("t")||graduation.equalsIgnoreCase("T"))
        {
           g=35; 
        } 
        else if (graduation.equalsIgnoreCase("f")||graduation.equalsIgnoreCase("F")) 
        {
            g=0;
        }
        else
            System.out.println("Enter error graduation");
        
        total = matriculation + food + room + creditHours + g;
        
        
        System.out.printf("%n%nStudent number:%d%n",digit);
        System.out.printf("Student room type fee:$%d%n",room);
        System.out.printf("Student credit hours:$%d%n",creditHours);
        System.out.printf("Student graduation status:$%d%n",g);
        System.out.printf("Student food+matriculation:$%.2f%n",food+matriculation);
        System.out.printf("Student total fee:$%.2f%n",total);
    }
}
