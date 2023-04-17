/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class Invoice {
    private String number;
    private String desciption;
    private int quantity;
    private double price;
    
   
    public Invoice (String number,String desciption,int quantity,double price)
    {
        this.number=number;
        this.desciption=desciption;
        this.quantity=(quantity<0)?0:quantity;
        this.price=(price<0)?0:price;
        
        
    }
  
    
    public void setnumber(String number)
    {
        this.number=number;
    }
    public void setdesciption(String desciption)
    {
        this.desciption=desciption;
    }
    public void setquantity(int quantity)
    {
       this.quantity=(quantity<0)?0:quantity;
    }
    public void setprice(double price)
    {
        this.price=(price<0)?0:price;
    }
    public String getNumber()
    {
        return number;
    }
    public String getDesciption( )
    {
        return desciption;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public double getInVoiceAmount()
    {
        return getQuantity()*getPrice();
    }
}

