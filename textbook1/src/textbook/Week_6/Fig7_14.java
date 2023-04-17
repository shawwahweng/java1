/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_6;

/**
 *
 * @author user
 */
public class Fig7_14 {
    private String courseName;
    private int[] grades;
    
    public Fig7_14(String courseName,int[] grades)
    {
        this.courseName = courseName;
        this.grades = grades;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void processGrades()
    {
        outputGrades();
        System.out.printf("%nClass avarage is %.2f%n",getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMininum(),getMaximum());
        outputBarChart();
    }
    public int getMininum()
    {
        int lowGrade =grades[0];
        
        for(int grade:grades)
        {
            if(grade<lowGrade)
                lowGrade=grade;
        }
        return lowGrade;
    }
    public int getMaximum()
    {
        int highGrade = grades[0];
        
        for(int grade : grades)
        {
            if(grade>highGrade)
                highGrade = grade;
        }
        return highGrade ;
    }
    public double getAverage()
    {
        int total=0;
        for(int grade : grades)
            total+=grade;
        return (double)total/grades.length;
    }
    public void outputBarChart()
    {
        System.out.println("Grade distribution:");
        int[] frequency = new int[11];
        for(int grade : grades)
            ++frequency[grade/10];
        
        for(int count=0;count<frequency.length;count++)
        {
            if(count==10)
                System.out.printf("%5d:", 100);
            else 
                System.out.printf("%02d-%02d:", count*10,count*10+9);
            
            for(int stars=0;stars<frequency[count];stars++)
                System.out.print("*");
            
            System.out.println();
        }
    }
    public void outputGrades()
    {
        System.out.printf("The grades are:%n%n");
        for(int student=0;student<grades.length;student++)
            System.out.printf("Student %2d: %3d%n", student+1,grades[student]);
    }
}
