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
public class Q068 {
    public static void main(String[] args)
    {
        int gross;
        int salary;
        int[] number=new int[9];
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the grosses in sales in a weak:");
        gross = input.nextInt();
        salary=200+(int)(gross*0.09);
        System.out.printf("Salary :$%d%n", salary);
        if(salary>=200&&salary<=299)
        {
            number[0]++;
        }
        else if(salary>=300&&salary<=399)
        {
            number[1]++;
        }
        else if(salary>=400&&salary<=499)
        {
            number[2]++;
        }
        else if(salary>=500&&salary<=599)
        {
            number[3]++;
        }
        else if(salary>=600&&salary<=699)
        {
            number[4]++;
        }
        else if(salary>=700&&salary<=799)
        {
            number[5]++;
        }
        else if(salary>=800&&salary<=899)
        {
            number[6]++;
        }
        else if(salary>=900&&salary<=999)
        {
            number[7]++;
        }
        else{
            number[8]++;
        }
        System.out.println("Salary           counter");
        for(int counter=2;counter<=11;counter++)
        {
            if(counter<=9)
            {
                System.out.printf("$ %d-%d%15d%n", counter*100,counter*100+99,number[10-counter]);
            }
            else if(counter==10)
            {
                System.out.printf("$ %dandover%11d%n", counter*100,number[10-counter]);
            }
        }
    }
}
