/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElliotFriedman
 */
import java.util.*;
public class MonthlyPaymentsCorrect {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will calculate your loan payments");
        System.out.println("Enter the amount you wish to borrow");
        double loanAmount = input.nextDouble();
        
        System.out.println("Enter the interest rate");
        double interestRate = input.nextDouble();
        
        System.out.println("Enter the amount of time you wish to borrow for");
        double loanYears = input.nextDouble();
        
        double mPay = (loanAmount*interestRate);
        mPay = mPay /1-(1/(1+interestRate)Math.pow(loanYears,12));
                                       //1-(1/(1+interestRate(Math.pow(loanYears,12))
        
        System.out.println("Monthly payment = " +mPay);
        
        
    }
    
    
}
