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
import java.util.*;
public class TwoCities {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter the names of two different cities");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
     
        city1 = city1.toLowerCase();
        city2 = city2.toLowerCase();
        
        int city1Char = (int)city1.charAt(0);
        int city2Char = (int)city2.charAt(0);
        
        System.out.println("The cities in alphabetical order are ");
        if(city1Char > city2Char){
            System.out.println(city2 + "\n" + city1);
        }
        else {
            System.out.println(city1 + "\n" + city2);
        }
        */
        System.out.print("Enter a city: ");      
        String city1 = input.nextLine();
        
        System.out.print("Enter another city: ");
        String city2 = input.nextLine();
        
        System.out.println("The cities in alphabetical order:");
        
        if(city1.compareTo(city2) < 0)
            System.out.println(city1 + "\n" + city2);
        
        else 
            System.out.println(city2 + "\n" + city1);
        
        
    }
    
}
