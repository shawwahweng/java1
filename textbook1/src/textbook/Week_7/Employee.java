/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public class Employee {
    private static int count = 0; // number of Employees created
    private String firstName;
    private String lastName;
    
    public Employee(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;

    System.out.printf("Employee constructor: %s %s; count = %d%n",
    firstName, lastName, count);
}
    
public String getFirstName() 
 { 
    return firstName; 
 }
public String getLastName() { 
    return lastName; 
} 

public static int getCount() 
{ 
    return count; 
}
}
