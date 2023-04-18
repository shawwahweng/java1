/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;

/**
 *
 * @author user
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
 // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n",Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");
        
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n",e1.getCount());
        System.out.printf("via e2.getCount(): %d%n",e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

       System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
       e1.getFirstName(), e1.getLastName(), 
       e2.getFirstName(), e2.getLastName());
    }  
}
