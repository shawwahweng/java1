/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_4;

/**
a               b               c                       d
*             **********     **********                   *
**            *********       *********                  **
***           ********         ********                 ***
****          *******           *******                ****
*****         ******             ******               *****
******        *****               *****              ******
*******       ****                 ****             *******
********      ***                   ***            ********
*********     **                     **           *********
**********    *                       *          **********
 */
public class Q037 {
    public static void main(String[] args)
    {
        System.out.print("A");
        for(int a=1;a<=10;a++)
        {
            System.out.println();
            for(int z=1;z<=a;z++)
            {
                System.out.print('*');
            }
        }
        System.out.println();
         System.out.println();
        System.out.print("B");
        
        System.out.println();
        
        for(int a=1;a<=10;a++)
        {
            System.out.println();
            
            for(int z=10;z>=a;z--)
            {
                System.out.print('*');
            }
            
        }
        System.out.println();
        System.out.println();
        System.out.println("C");
        System.out.println();
        for(int a=1;a<=10;a++)
        {
            for(int z=0;z<=a;z++)
            {
                System.out.print(" ");
            }
            for(int z=0;z<=10-a;z++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("D");
        System.out.println();
        int z;
        for(int a=0;a<=10;a++)
        {
            for( z=0;z<=10-a;z++)
            {
                System.out.print(" ");
            }
            for(z=0;z<=a;z++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
}
