/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_3;

/**
 *
 * @author user
 */
public class Q024 {
    public static void main(String[] args)
    {
        
        System.out.print("N     10*N     100*N    1000*N");
        for(int count=1;count<=5;count++)
        {
            int ten=count*10;
            int hundred=100*count;
            int thousands=count*1000;
            System.out.printf("%n%d\t%d\t%d\t%d",count,ten,hundred,thousands);
        }
    }
}
//System.out.printf("%d%t%d%t%d%t%d%n",count,count*1o,100*count,count*1000);