
package PART_3;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Q026 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter squares of all side lengths between 1 and 20:");
        int asterisks=input.nextInt();
        
        for (int j = 1; j <= asterisks; j++) {
            for (int i = 1; i <= asterisks; i++) {
                if (j == 1 || j == asterisks || i == 1 || i == asterisks) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
