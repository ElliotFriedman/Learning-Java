/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author ElliotFriedman
 */
import java.util.Scanner;
public class TaxBracketCalculator {
    
    public static void main(String[] args) {   
        taxes();
    }
    

    public static int taxes() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will find what tax bracket you are in" +
                 "\nEnter 1 for single. \nEnter 2 for " + 
                 "married, filing jointly or qualifying widow(er)" +
                 "\nEnter 3 for Married Filing Separately" +
                 "\nEnter 4 for Head of Household");
        
        int taxBracket = input.nextInt();
        
        switch(taxBracket){
            case 1:
                
            System.out.println("How much money did you make");
            int singleIncome = input.nextInt();
          if(singleIncome < 8351){
              System.out.println("Your tax rate is 10%");
          }
          else if(singleIncome < 33950){
              System.out.println("Your tax rate is 15%");
          }
          else if(singleIncome < 82250){
              System.out.println("Your tax rate is 25%");
          }
          else if(singleIncome < 171550){
              System.out.println("Your tax rate is 28%");
          }
          else if(singleIncome < 372950){
              System.out.println("Your tax rate is 33%");
          }
          else{
              System.out.println("Your tax rate is 35%");
          } 
          break;
        }
        
        switch(taxBracket){
            case 2:
            System.out.println("How much money did you make");
            int widowedIncome = input.nextInt();
          if(widowedIncome < 16700){
              System.out.println("Your tax rate is 10%");
          }
          else if(widowedIncome < 67900){
              System.out.println("Your tax rate is 15%");
          }
          else if(widowedIncome < 137050){
              System.out.println("Your tax rate is 25%");
          }
          else if(widowedIncome < 208850){
              System.out.println("Your tax rate is 28%");
          }
          else if(widowedIncome < 372950){
              System.out.println("Your tax rate is 33%");
          }
          else{
              System.out.println("Your tax rate is 35%");
          } 
          break;
        }
            
            switch(taxBracket){
                case 3:
            System.out.println("How much money did you make");
            int marriedIncome = input.nextInt();
            
          if(marriedIncome < 16700){
              System.out.println("Your tax rate is 10%");
          }
          else if(marriedIncome < 67900){
              System.out.println("Your tax rate is 15%");
          }
          else if(marriedIncome < 137050){
              System.out.println("Your tax rate is 25%");
          }
          else if(marriedIncome < 208850){
              System.out.println("Your tax rate is 28%");
          }
          else if(marriedIncome < 372950){
              System.out.println("Your tax rate is 33%");
          }
          else{
              System.out.println("Your tax rate is 35%");          
        }
          break;
        }
            
         switch(taxBracket){
             case 4:      
            System.out.println("How much money did you make");
            int marriedIncome = input.nextInt();
            
          if(marriedIncome < 11950){
              System.out.println("Your tax rate is 10%");
          }
          else if(marriedIncome < 45500){
              System.out.println("Your tax rate is 15%");
          }
          else if(marriedIncome < 117450){
              System.out.println("Your tax rate is 25%");
          }
          else if(marriedIncome < 190200){
              System.out.println("Your tax rate is 28%");
          }
          else if(marriedIncome < 372950){
              System.out.println("Your tax rate is 33%");
          }
          else{
              System.out.println("Your tax rate is 35%");          
        }  
          break;
        }
        return 0;
    } 
}