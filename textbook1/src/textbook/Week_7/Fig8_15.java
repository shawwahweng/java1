/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_7;
import java.math.BigDecimal;
import java.text.NumberFormat;
/**
 *
 * @author user
 */
public class Fig8_15 {
    public static void main(String args[])
    {
        BigDecimal principal = BigDecimal.valueOf(1000.0); 
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");


        for (int year = 1; year <= 10; year++) 
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        } 
    }
}
