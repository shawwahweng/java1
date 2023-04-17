/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public class Fig8_2 {
    public static void main(String[] args)
    {
        Time1 time = new Time1();
        
        displayTime("After time object is created",time);
        System.out.println();
        
        time.setTime(13,27,6);
        displayTime("After calling setTime",time);
        System.out.println();
        
        try
        {
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n",e.getMessage());
        }
        displayTime("After calling setTime with invalid value",time);
        
       
    }
    private static void displayTime(String header, Time1 t)
        {
            System.out.printf("%s%nUniverdal time :%s%nStandard time:%s%n",
                    header,t.toUniversalString(),t.toString());
        }
}
