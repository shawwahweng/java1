/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public class Time1 {
    int hour;
    int minute;
    int second;
    
    public void setTime (int hour , int minute ,int second)
    {
        if(hour<0 || hour >=24 || minute<0 || minute >=24 || second<0 || second>=24)
        {
            throw new IllegalArgumentException("hour,minute and/or second was out of range");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s", 
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
             minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
