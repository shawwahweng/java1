/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;

/**
 *
 * @author user
 */
public class Q060 {
    static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2) * 1.0);
    }

    public static void main(String[] args)
    {
        System.out.println(
            Math.round(distance(9, 5, 8, 2) * 10)/ 10);
    }
}


