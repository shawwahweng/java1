/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class DrawSmiletTest {
    public static void main(String[] args)
    {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
        
    }
}
