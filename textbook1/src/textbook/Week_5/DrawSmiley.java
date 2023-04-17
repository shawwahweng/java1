/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_5;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class DrawSmiley extends JPanel{
    public void paintComponent(Graphics g)// 记得使用原本paintcomponent 包装
    {
        super.paintComponent(g);
        
        //draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //draw the mouth
        
        g.fillOval(50, 110, 120, 60);
        
        //"touch up" the mouth into a smile
        g.setColor(Color.YELLOW);
        g.fillRect(50,110,120,30);
        g.fillOval(50, 120, 120, 40);
    }
}
