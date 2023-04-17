/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_3;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class Fig4_19 {
    public static void main(String[] args)
    {
        Fig4_18 panel =new Fig4_18();
        JFrame application =new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);
    }
}
