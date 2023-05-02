/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.newpackage;

/**
 *
 * @author user
 */
public class TrafficLightTest {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + " - " + light.getDurationInSeconds() + " seconds");
        }
    }
}
