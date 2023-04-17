/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part6;

/**
 *
 * @author user
 */
public class Q078 {
    public static void main(String []args){
         double alpha[] = new double[51];
         for(int i =1;i<25;i++){
             alpha[i]= i*i;
         }
         for(int i = 25;i<51;i++){
             alpha[i]= 3*i;  
         }
         System.out.println( "The values are: ");

         print(alpha); 
    }
    public static void print(double array[]){
      for(int i=1; i < array.length; ++i){ 
            System.out.printf("%.2f , ",array[i] ); 
            if(i==0)
            {
                
            }
            else if(i%10==0){
              System.out.println();
            }
        }
    }   
}
