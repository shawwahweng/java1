/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PART_2;

/**
 *
 * @author user
 */
public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private int age;
    private double height;
    private double weight;

    public HealthProfile (String firstName, String lastName, String gender, int year, int month, int day, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (year > 0) {
            this.year = year;
        }
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        if (day > 0) {
            this.day = day;
        }
        if (height > 0) {
            this.height = height;
        }
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   public void setGender(String gender) { this.gender = gender; }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay(){
        return day;
    }
    public void setHeight(double height) { this.height = height; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() { return gender; }



    public double getHeight() { return height; }

    public double getWeight() { return weight; }

    public void setAge() {
        this.age = 2022 - year;
    }

    public int getAge(){
        return age;
    }

    public int getMaximumHeartRate() {
        int maximumHeartRate;
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }

    public void getTargetHeartRange() {
        int heart = 50 * getMaximumHeartRate() / 100;
        int rate = 85 * getMaximumHeartRate() / 100;

        System.out.printf("Target heart rate is %d to %d bpm%n", heart, rate);
    }
    public void calculateBMI(double BMI) {
        
            BMI=(getWeight()*703)/(getHeight()*getHeight());
            System.out.printf("Output BMI Values:%f%n",BMI);
        
        
        if(BMI<18.5){
            System.out.println("Underweight");
        }else if(BMI>18.5&&BMI<24.9){
            System.out.println("Normal");
        } else if(BMI>25&&BMI<29.9){
            System.out.println("Overweight");
        } else if(BMI>30){
            System.out.println("Obese");
        } 
    }
}
