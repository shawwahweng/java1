/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART5;
import java.security.SecureRandom;
/**
 *
 * @author user
 */
   

public class Q057 {
   public static void main(String[] args) {
      int heads = 0;
      int tails = 0;
      for (int i = 1; i<= 10; i++) {
         if (flip().equals("tails")) {
            tails++;
         } else {
            heads++;
         }
      }
      System.out.printf("Heads:%d%n" , heads);
      System.out.printf("Tails:%d%n" , tails);
   }
   public static String flip() {
      SecureRandom r = new SecureRandom();
      int chance = r.nextInt(2);
      if (chance == 1) {
         return"tails";
      } else {
         return"heads";
      }
   }
}
