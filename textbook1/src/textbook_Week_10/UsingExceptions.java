/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook_Week_10;

/**
 *
 * @author user
 */
public class UsingExceptions{
    public static void main(String[] args)
    {
        try
        { 
            throwException(); 
        } 
            catch (Exception exception) // exception thrown by throwException
        {
            System.err.println("Exception handled in main");
        } 

        doesNotThrowException();
    }
    
    public static void throwException() throws Exception
    {
        try
        {
            System.out.println("Method throwException");
            throw new Exception();
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally
        {
            System.err.println("Finally executed in throwException");
        }
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method doesNotThrowException");
        }
        catch(Exception exception)
        {
            System.err.println(exception);
        }
        finally // executes regardless of what occurs in try...catch
        { 
            System.err.println( 
            "Finally executed in doesNotThrowException"); 
        }
        System.out.println("End of method doesNotThrowException");
    }
}
