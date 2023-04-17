/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class HeartRatesTest {
    public static void main(String[] args) {
       
        
        HeartRates patient1=new HeartRates("John","Green",50);
        HeartRates patient2=new HeartRates("John","Blue",10);
        
        System.out.printf("Patient1%nFirst name=%s%nLast name=%s%nbirth year=%d%n%n",patient1.getFirstName(),
                patient1.getLastName(),patient1.getOld());
        System.out.printf("Patient2%nFirst name=%s%nLast name=%s%nbirth year=%d%n%n",patient2.getFirstName(),
                patient2.getLastName(),patient2.getOld());
        
        System.out.println("After run");
        System.out.printf("%nPatient 1%n%s%s%n", patient1.getFirstName(),patient1.getLastName());
        patient1.maxHeartRate();
        System.out.printf("%nPatient 2%n%s%s%n",patient2.getFirstName(),patient2.getLastName());
        patient2.maxHeartRate();
    }

}
