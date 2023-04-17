/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee employee1=new Employee("www","eee",1000);
        Employee employee2=new Employee("abc","xyz",2000);
        System.out.printf("Employee1%nFirst Name=%s%nLast name=%s%nMonth salary=%f%n%n",
                employee1.getFisrtNames(),employee1.getLastNames(),employee1.getMonthSalary());
        System.out.printf("Employee2%nFirst Name=%s%nLast name=%s%nMonth salary=%f%n%n",
                employee2.getFisrtNames(),employee2.getLastNames(),employee2.getMonthSalary());
        System.out.println("After raise:employee1 one month ");
        employee1.setRaise(10);
        employee2.setRaise(10);
        
        System.out.printf("Employee1%nFirst Name=%s%nLast name=%s%nMonth salary=%f%n%n",
                employee1.getFisrtNames(),employee1.getLastNames(),employee1.getYearlySalary());
        System.out.printf("Employee2%nFirst Name=%s%nLast name=%s%nMonth salary=%f%n%n",
                employee2.getFisrtNames(),employee2.getLastNames(),employee2.getYearlySalary());
    }
}
