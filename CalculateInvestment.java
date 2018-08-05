/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElliotFriedman
 */
import java.util.Scanner;
public class CalculateInvestment {
    
    public static void main(String[] args){
        
        //year is in int
        //all other variables are double
        //user inputs data on the console and the console outputs the investment value
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will calculate a return on your investment");
        
        System.out.println("Enter the amount of your investment");
        double investmentAmount = input.nextDouble();
        
        System.out.println("Enter the amount of years for your investment");
        int timeFrame = input.nextInt();
        
        System.out.println("Enter the annual interest rate");
        double annualInterestRate = input.nextDouble();
        
        double monthlyInterestRate = annualInterestRate/1200;
        //dividing the annual interest rate by 12 gives us the monthly interest rate, the problem here is the interest rate is in a percentage and not a decimal
        
        double futureInvestmentValue = (int)(investmentAmount*((Math.pow((1 + monthlyInterestRate), (timeFrame*12)))*100.0));
        
        System.out.println(futureInvestmentValue/100.0);
        
    }
    
}
