/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.newpackage;

/**
 *
 * @author user
 */
public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(45);

    private int durationInSeconds;

    TrafficLight(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}




