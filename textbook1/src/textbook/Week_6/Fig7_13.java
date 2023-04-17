/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_13 {
    public static void main(String[] args)
    {
        int[] array= {1,2,3,4,5};
        System.out.printf("Effects of passing reference to entire array:%n"+
                "The value of the original array are:%n");
        for(int value :array)
            System.out.printf("      %d", value);
        modityArray(array);
        System.out.printf("%n%nThe value of the modified array are:%n");
        
        for(int value : array)
            System.out.printf("     %d", value);
        
        System.out.printf("%n%nEffects of passing array element value:%n"+
                "array[3] before modityElement:%d%n", array[3]);
        
        modityElement(array[3]);
        System.out.printf("array[3] after modityElement %d%n",array[3]);
    }
    public static void modityArray(int[] array2)
    {
        for(int counter =0;counter<array2.length;counter++)
            array2[counter]*=2;
    }
    public static void modityElement(int element)
    {
        element*=2;
        System.out.printf("Value of element in modifyelement:%d%n",element);
    }
}
