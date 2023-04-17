/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textbook.Week_4;

/**
 *
 * @author user
 */
public class Fig5_12 {
    public static void main(String[] args)
    {
        Fig5_11 policy1= new Fig5_11(11111111,"Toyota camry","NJ");
        Fig5_11 policy2= new Fig5_11(22222222,"Ford Fusion","ME");
        
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    public static void policyInNoFaultState(Fig5_11 policy)
    {
        System.out.println("The Auto Policy:");
        System.out.printf("Account #: %d ; Car : %s; State %s%s a no-fault atate%n%n",
                            policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),
                            (policy.isNoFaultState() ? "is" :"is not"));
    }
}
