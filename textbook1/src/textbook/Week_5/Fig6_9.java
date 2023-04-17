/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;

/**
 *
 * @author user
 */
public class Fig6_9 {
    private static int x =1;
    
    public static void main(String[] args)
    {
        int x=5;
        
        System.out.printf("local x in main is %d%n" ,x);
        useLocalVariable();
        useField();
        useLocalVariable();
        useField();
        System.out.printf("%nlocal x in main is %d%n",x);
    }
    
    public static void useLocalVariable()
    {
        int x =25;
        
        System.out.printf("%nlocal x on entering method uselocalVariable is %d%n", x);
        ++x;
        System.out.printf("local x before exiting method uselocalVariable is %d%n", x);
    }
    
    public static void useField()
    {
        System.out.printf("%nfield xon entering method usefied is %d%n", x);
        x*=10;
        System.out.printf("field x before exiting method usefield is %d%n", x);
    }
}
