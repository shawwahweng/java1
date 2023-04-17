
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
public class Q069 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int element = 0;
        int number=0;
        int b=0,count;
        boolean flag=false;
        System.out.print("Enter the 5 array number:");
        System.out.print("Between 10-100:");
        for( count=0;count<array.length;count++)
        {
            
            number=input.nextInt();
            
            if(number==-1)
            {
                System.out.print("Stop running");
            }
            for( element=0;element<=count;element++)
            {
                if(array[element]==number)
                {
                    flag=true;
                    break;
                }
                
            }
             array[count]=number;
            if(flag)
                break;
            b++;
        
        }
            if(!flag&&b>0)
            {
                System.out.printf("The complete set of unique values:%d%n",b);
                for(count=0;count<b;count++)
                {
                    System.out.printf("%d,",array[count]);
                }
            }
            else if(flag&& b>0)
            {

                System.out.printf("The complete set of unique values:%d%n",b);
                System.out.println("Worst case!");
                for(count=0;count<b;count++)
                {
                    System.out.printf("%d ",array[count]);
                }
            }
        System.out.println();
    }
}


