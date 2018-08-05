/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author ElliotFriedman
 */
public class PrintF2 {
    
    public static void main(String[] args){
        
        double amount = 1000;
        double interest = 0.04;
        double interestRate = amount * interest;
        
        System.out.printf("Interest is %4.5d", interestRate, interest);
    
        System.out.println();
        
        boolean b = false;
        System.out.printf("Boolean b is %b", b);
        
        System.out.println();
        
    }
    
}
