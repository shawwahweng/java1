/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class HealthProfileTest {
    public static void main(String[] args){

        
        HealthProfile patient1=new HealthProfile("John","Green","Boy",22,8,5,23.5,34.8);
        HealthProfile patient2=new HealthProfile("John","Blue","Boy",22,9,11,40.2,23.2);
        
        System.out.printf("Patient1%nFirst name=%s%nLast name=%s%nGender=%s%ndate:%d/%d/%d%nheight=%f%nweigth=%f%n%n",
                patient1.getFirstName(),patient1.getLastName(),patient1.getGender(),
                patient1.getYear(),patient1.getMonth(),patient1.getDay(),
                patient1.getHeight(),patient1.getWeight());
        System.out.printf("Patient1%nFirst name=%s%nLast name=%s%nGender=%s%ndate:%d/%d/%d%nheight=%f%nweigth=%f%n%n",
                patient2.getFirstName(),patient2.getLastName(),patient2.getGender(),
                patient2.getYear(),patient2.getMonth(),patient2.getDay(),
                patient2.getHeight(),patient2.getWeight());
      
        System.out.print("After run%n");
        System.out.printf("Patient1%nFirst name=%s %s%nGender=%s%ndate:%d/%d/%d%nmaximum Heart Rate:%d%n",
                patient1.getFirstName(),patient1.getLastName(),patient1.getGender(),
                patient1.getYear(),patient1.getMonth(),patient1.getDay(),
                patient1.getMaximumHeartRate());
        patient1.getTargetHeartRange();
        patient1.calculateBMI(0);
        System.out.printf("%nPatient2%nFirst name=%s %s%nGender=%s%ndate:%d/%d/%d%nmaximum Heart Rate:%d%n",
                patient2.getFirstName(),patient2.getLastName(),patient2.getGender(),
                patient2.getYear(),patient2.getMonth(),patient2.getDay(),
                patient2.getMaximumHeartRate());
        patient2.getTargetHeartRange();
        patient2.calculateBMI(0);
    }           
}
