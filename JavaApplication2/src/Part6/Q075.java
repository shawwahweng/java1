package Part6;

import java.util.Scanner;

public class Q075 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int[] votes = new int[5];
        int total = 0;
        int winner = 0;
        int max =0;
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the last name of five candidates: ");
            names[i] = input.next();
            System.out.print("Enter the number of received votes: ");
            votes[i] = input.nextInt();
            total += votes[i];
            if (votes[i] > max) {
                max = votes[i];
                winner = i;
            }
        }
        System.out.printf("%n%-12s%-18s%-18s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-12s%-18d%-18.2f%n", names[i], votes[i], (double) votes[i] / total * 100);
        }
        System.out.printf("%nTotal %9d" , total);
        System.out.printf("%nThe Winner of the Election is %s%n" , names[winner]);
    
    }
}