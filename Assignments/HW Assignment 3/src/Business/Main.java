/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Yash
 */
public class Main {
    
    public static void main(String[] args) {
        TravelAgency trav = new TravelAgency();
        int BAflight1=trav.BAflight1();
        System.out.println("The revenue from British Airways flight BA101 is: $" +BAflight1);
        int BAflight2= trav.BAFlight2();
        System.out.println("The revenue from British Airways flight BA202 is: $" +BAflight2);
        int JBflight1 = trav.JBFlight1();
        System.out.println("The revenue from Jet Blue flight JB101 is: $" +JBflight1);
        int JBflight2 = trav.JBFlight2();
        System.out.println("The revenue from Jet Blue flight JB202 is: $" +JBflight2);
        
        int BA = BAflight1 + BAflight2;
        System.out.println();
        System.out.println("The revenue from British Airways airliners is : $" + BA);
        
        int JB = JBflight1 + JBflight2;
        System.out.println();
        System.out.println("The revenue from Jet Blue airliners is : $" + JB);
        
        int total = BA + JB;
        System.out.println();
        System.out.println("The total revenue from all the flights by all airliners is : $" +total);
    }
    
}
