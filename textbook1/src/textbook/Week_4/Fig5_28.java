/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Fig5_28 {
    public static void main(String[] args)
    {
        String input =JOptionPane.showInputDialog("Enter 1 to draw rectangles\nEnter 2 to draw ovals");
        
        int choice = Integer.parseInt(input);
        
        Shapes panel =new Shapes(choice);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(100,300);
        application.setVisible(true);
    }
}
