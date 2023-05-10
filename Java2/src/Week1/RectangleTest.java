/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author user
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();

        rect1.setLength(3.0);
        rect1.setWidth(4.0);
        System.out.println(rect1.getArea());      
        System.out.println(rect1.getPerimeter()); 


        try {
            rect1.setLength(-2.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }

        try {
            rect1.setWidth(25.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }
    }
}

