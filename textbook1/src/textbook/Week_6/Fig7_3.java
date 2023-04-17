/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**fig7_2 public static void main(String[] args)
    {
        int[] array = new int[10];
        
        System.out.printf("%s%8s%n","Index","Value");
        for(int counter=0;counter<array.length;counter++)
        {
            System.out.printf("%5d%8d%n", counter,array[counter]);
        }
    }
 Index   Value
    0       0
    1       0
    2       0
    3       0
    4       0
    5       0
    6       0
    7       0
    8       0
    9       0
 */
public class Fig7_3 {
    public static void main(String[] args)
    {
        int[] array = {32,27,64,18,95,14,90,70,60,37};
        
        System.out.printf("%s%8s%n","Index","Value");
        for(int counter=0;counter<array.length;counter++)
        {
            System.out.printf("%5d%8d%n", counter,array[counter]);
        }
    }
}
