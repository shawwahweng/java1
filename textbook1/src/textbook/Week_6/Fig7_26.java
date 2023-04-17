/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class Fig7_26 {
    public static void main(String[] args)
    {
        Fig7_25 panel = new Fig7_25();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400,250);
        application.setVisible(true);
    }
}
