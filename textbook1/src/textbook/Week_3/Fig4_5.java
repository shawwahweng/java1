/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_3;

/**
 *
 * @author user
 */
public class Fig4_5 {
    public static void main(String[] args)
    {
        Fig4_4 account1=new Fig4_4("Jane Green",93.5);
        Fig4_4 account2=new Fig4_4("Jone Blue",72.75);
        
        System.out.printf("%s 's letter grade is:%s%n", account1.getName(),account1.getLetterGrade());
        System.out.printf("%s 's letter grade is:%s%n", account2.getName(),account2.getLetterGrade());
    }
}
