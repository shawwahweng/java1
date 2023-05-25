/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook_Week_10;

/**
 *
 * @author user
 */
public class UsingExceptionsFig11 {
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch(Exception exception)
        {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
        }
        
        StackTraceElement[] traceElements = Exception.getStackTrace();
        System.out.printf("%nStack trace from getStackTrace:%n");
        System.out.println("Class\t\tFile\t\t\tLine\tMethod");
        
        for (StackTraceElement element : traceElements) 
        {
            System.out.printf("%s\t",element.getClassName());
            System.out.printf("%s\t", element.getFileName());
            System.out.printf("%s\t", element.getLineNumber());
            System.out.printf("%s%n", element.getMethodName());
        }
    }
    
    public static void method1() throws Exception
    {
        method2();
    }
        
    public static void method2() throws Exception
    {
        method3();
    }
    
    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");    
    }
}
