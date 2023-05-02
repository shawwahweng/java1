/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author user
 */
public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

