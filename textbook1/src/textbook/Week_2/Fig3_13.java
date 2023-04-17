/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_2;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Fig3_13 {
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("What is your name?");
        String message=String.format("Welcome, %s,to java programming", name);
    
    
        JOptionPane.showMessageDialog(null,message);
    }
    
}
