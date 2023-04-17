/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fig4_12 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int passes=0;
        int failures=0;
        int studentCounter=1;
    
    while(studentCounter<=10)
    {
        System.out.print("Enter result(1 =pass,0 =fail):");
        int result = input.nextInt();
        
        if(result==1)
            passes=passes+1;
        else
            failures=failures+1;
            studentCounter=studentCounter+1;
    }
    System.out.printf("Passed: %d%nFailed: %d%n",passes,failures);
    
    if(passes>8)
        System.out.printf("Bonus to instructor");
   }
}
 