/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_3;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author user
 */
public class Fig4_18 extends JPanel
{
  public void paintComponent(Graphics g)
  {
     super.paintComponent(g);
    
    int width=getWidth();
    int height=getHeight();
    g.drawLine(0,0,width,height);
    g.drawLine(0,height,width,0);
  }
}
 