/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public enum Book {
    JHTP("Java How to Program", "2015"), 
    CHTP("C How to Program", "2013"), 
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"), 
    VBHTP("Visual Basic How to Program", "2014"), 
    CSHARPHTP("Visual C# How to Program", "2014");
    
    private final String title; // book title
    private final String copyrightYear; // copyright year
    
    Book(String title, String copyrightYear) { 
        this.title = title;
        this.copyrightYear = copyrightYear;}
    
    public String getTitle(){
    return title;}
    
     public String getCopyrightYear(){
        return copyrightYear;}
}
