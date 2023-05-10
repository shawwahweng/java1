/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author user
 */
public class Rectangle { //8.3
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0.0 || length >= 20.0) {
            throw new IllegalArgumentException("Length must be a floating-point number between 0.0 and 20.0.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0.0 || width >= 20.0) {
            throw new IllegalArgumentException("Width must be a floating-point number between 0.0 and 20.0.");
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
