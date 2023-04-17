/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;

   public HeartRates (String firstName,String lastName,int birthYear)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        
        this.birthYear=(birthYear<0)?0:birthYear;
    }
   public void setFirstNames(String firstName){
       this.firstName = firstName;
   }

   public void setLastNames(String lastName){
       this.lastName = lastName;
   }
   public void setOld(int birthYear){
       this.birthYear=(birthYear<0)?0:birthYear;
   }
  
   public String getFirstName(){
       return firstName;
   }
    public String getLastName(){
       return lastName;
   }
   public int getOld(){
       return birthYear;
   }
   public int maxHeartRate()
   {
        int maxHeartRate = 220 -getOld() ;
        System.out.printf("maximum Heart Rate: %d%n", maxHeartRate);
        double targetMin = maxHeartRate * 0.50;
        double targetMax = maxHeartRate * 0.85; 
        
        System.out.printf("target heart rate range: %.0f", targetMin);
        System.out.printf(" - %.0f%n", targetMax);
        return 0;
   }
}
