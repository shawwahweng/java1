/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;


public class Fig5_11 {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public Fig5_11(int accountNumber,String makeAndModel,String state)
    {
        this.accountNumber=accountNumber;
        this.makeAndModel=makeAndModel;
        this.state=state;
    }
    public void setAccountNUmber(int acccountNumber)
    {
        this.accountNumber=accountNumber;
    } 
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getMakeAndModel()
    {
        return makeAndModel;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
    
    public boolean isNoFaultState()
    {
        boolean noFaultState;
        
        switch(getState())
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState=true;
                break;
            default:
                noFaultState=false;
                break;
        }
        return noFaultState;
    }
}

