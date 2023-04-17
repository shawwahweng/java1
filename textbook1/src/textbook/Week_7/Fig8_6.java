/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public class Fig8_6 {
    public static void main(String[] args)
    {
        Fig8_5 t1 = new Fig8_5(); // 00:00:00 
        Fig8_5 t2 = new Fig8_5(2); // 02:00:00 
        Fig8_5 t3 = new Fig8_5(21, 34); // 21:34:00 
        Fig8_5 t4 = new Fig8_5(12, 25, 42); // 12:25:42
        Fig8_5 t5 = new Fig8_5(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);


        try
        {
                Fig8_5 t6 = new Fig8_5(27, 74, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n",
            e.getMessage());
        } 
        } 

        private static void displayTime(String header, Fig8_5 t)
        {
            System.out.printf("%s%n %s%n %s%n",
            header, t.toUniversalString(), t.toString());
        } 
}

