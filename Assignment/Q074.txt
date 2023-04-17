package Part6;

import java.util.Scanner;

public class Q074 {
      public static void main(String[] args) {
        int size;
        String result = null;
        System.out.print("Please enter the size of the array: ");
        Scanner input=new Scanner(System.in);
        size=input.nextInt();
        String[] str=new String[size];
        System.out.println("Please enter the sritngs:");
        for(int i=0;i<str.length;i++){
            str[i]=input.next();
        }
         System.out.println("After converting to uppercase the string is:");
        for (String item : str) {
            result = item.toUpperCase();
             System.out.println(result);
        }
    }
}