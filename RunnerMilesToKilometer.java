/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg1.test;

/**
 *
 * @author ElliotFriedman
 */
import java.util.*;
public class RunnerMilesToKilometer {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will convert your mph while running to kilometers per hour");
        System.out.println("Enter the number of miles ran");
        double miles = input.nextDouble();
        
        System.out.println("Enter the hours it took you");
        double hours = input.nextDouble();
        
        System.out.println("Enter the minutes it took you");
        double minutes = input.nextDouble();
        
        System.out.println("Enter the number of seconds it took you");
        double seconds = input.nextDouble();
        
        double milesPerHour = (miles/(hours+(minutes/60)+(seconds/3600)));
        
        double kilometersPerHour = (milesPerHour*1.6);
        
        System.out.println("Kilomters per hour = "+kilometersPerHour);
    }
    
}
