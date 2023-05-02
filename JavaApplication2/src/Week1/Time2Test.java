/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author user
 */
public class Time2Test {
    public static void main(String[] args) {

        Time2 t = new Time2(00, 00, 00);

        t.tick();
        System.out.println(t); 

        t = new Time2(23, 50, 30);
        for (int i = 0; i < 10*60 + 30; i++) {
            t.tick();
        }
        System.out.println(t);

        t = new Time2(23, 59, 50);
        for (int i = 0; i < 10; i++) {
            t.tick();
        }
        System.out.println(t); 
    }
}

