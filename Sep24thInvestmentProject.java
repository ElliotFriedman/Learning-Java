package sep24th.investment.project;
//author Elliot Friedman

import java.util.Scanner;
public class Sep24thInvestmentProject {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount you are investing");
        double investment = input.nextDouble();
        //prompts the user to enter the amount they are investing
        
        System.out.println("Enter the annual interest rate");
        double annualInterest = input.nextDouble(); 
        //prompts the user to enter the annual interest rate
        
        double monthlyInterest = annualInterest/1200;
        /*monthly interest is calculated by first dividing the interest by 100
        to get the fraction that can be used unlike the percentage. 
        then that number is divided by 12 to find how much interest is payed
        on a monthly basis */
        
        System.out.println("Enter the number of years you are investing");
        double timeFrame = input.nextDouble();
        //prompts the user to enter the amount of years in their investment
  
        double future = investment * (Math.pow((1 + monthlyInterest), (timeFrame * 12)));
        
        System.out.println("The amount you will receive is " +(int)(future*100)/100.0);
    } 
}