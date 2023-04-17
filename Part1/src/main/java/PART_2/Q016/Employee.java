/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class Employee {
    private String FisrtName;
    private String LastName;
    private double monSalary;
    
    public Employee(String FisrtName,String LastName,double monSalary)
    {
        this.FisrtName=FisrtName;
        this.LastName=LastName;
        
        if(monSalary>0.0)
            this.monSalary=monSalary;
    }
    public void setFisrtNames(String FisrtName)
    {
        this.FisrtName=FisrtName;
    }
    public void setLastNames(String LastName)
    {
        this.LastName=LastName;
    }
    public void setMonthSalary(double monSalary)
    {
        this.monSalary=(monSalary<0)?0:monSalary;
    }
    public void setRaise(double percentage)
    {
        setMonthSalary(monSalary+=(monSalary/100)*percentage);
    }
    public String getFisrtNames()
    {
        return FisrtName;
    }
    public String getLastNames()
    {
        return LastName;
    }
    public double getMonthSalary()
    {
        return monSalary;
    }
    public double getYearlySalary()
    {
        return getMonthSalary()*12;
    }
}
