/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_15 {
    public static void main(String[] args)
    {
        int[] gradesArray ={87,68,94,100,83,78,85,91,76,87};
        
        Fig7_14 myGradeBook = new Fig7_14("CS101 Introduction to java programming",gradesArray);
        
        System.out.printf("welcome to the grade book for %n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
