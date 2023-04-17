/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_19 {
    public static void main(String[] args)
    {
        int[][] gradeArray={{87,96,70},
                            {68,87,90},
                            {94,100,90},
                            {100,81,87},
                            {83,65,85},
                            {78,87,65},
                            {85,75,83},
                            {91,94,100},
                            {76,72,84},
                            {87,93,73}};
        
        Fig7_18 myGradeBook =new Fig7_18("Cs101 introduction to java programming",gradeArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
        
                
    }
}
