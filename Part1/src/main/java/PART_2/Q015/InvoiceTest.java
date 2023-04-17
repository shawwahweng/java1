/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class InvoiceTest {
   
    public static void main(String[] args)
    {
        Invoice account1=new Invoice("123","abc",12,50.00);
        Invoice account2=new Invoice("23","zxc",8,7.00);
        
        System.out.printf("Account1%nProduct number =%s%nProduct name=%s%nQuantity number=%d%nUnit per price%f%n%n",account1.getNumber(),
                account1.getDesciption(),account1.getQuantity(),account1.getPrice());
        System.out.printf("Account2%nProduct number =%s%nProduct name=%s%nQuantity number=%d%nUnit per price=%f%n%n",
                account2.getNumber(),account2.getDesciption(),account2.getQuantity(),account2.getPrice());
    
        System.out.println("After run");
        
        System.out.printf("Account1%nProduct number =%s%nProduct name=%s%nAmount=%f%n%n",account1.getNumber(),
                account1.getDesciption(),account1.getInVoiceAmount());
        System.out.printf("Account1%nProduct number =%s%nProduct name=%s%nAmount=%f%n%n",account2.getNumber(),
                account2.getDesciption(),account2.getInVoiceAmount());
        
    }
}
