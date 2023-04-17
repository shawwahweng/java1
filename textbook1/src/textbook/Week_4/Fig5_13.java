/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;

/**
 *
 * @author user
 */
public class Fig5_13 {
    public static void main(String[] args)
    {
        int count;
        
        for (count=1;count<=10;count++)
        {
            if(count==5)
                break;      //break停止
                            //continue跳过5然后继续
                
            System.out.printf("%d",count);
        }
        System.out.printf("%nBroke out of loop at count= %d%n",count);
    }
}
