
package textbook1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        Class myAccount= new Class();
        
        System.out.printf("Initial name is :%s%n%n",myAccount.getName());
        System.out.println("Please enter the name:");
        String theName=input.nextLine();
        myAccount.setName(theName);
        
       System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
