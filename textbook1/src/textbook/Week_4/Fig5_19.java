/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;

/**
 *
 * @author user
 */
public class Fig5_19 {
    public static void main(String[] args)
    {
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional And (&&)","False && False",(false && false),
                "false && true",(false && true),"true && False",(true && false),
                "true && true",(true && true));
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional And (||)","False || False",(false || false),
                "false || true",(false || true),"true || False",(true || false),
                "true || true",(true || true));
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional And (&)","False & False",(false & false),
                "false & true",(false & true),"true & False",(true & false),
                "true & true",(true & true));
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional And (|)","False | False",(false | false),
                "false | true",(false | true),"true | False",(true | false),
                "true | true",(true | true));
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional And (^)","False ^ False",(false ^ false),
                "false ^ true",(false ^ true),"true ^ False",(true ^ false),
                "true ^ true",(true ^ true));
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT(I)",
                "!false",(!false),"!true",(!true));
    }
}
