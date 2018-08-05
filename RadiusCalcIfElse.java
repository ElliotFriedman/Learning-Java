/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2review;

/**
 *
 * @author ElliotFriedman
 */
import java.util.Scanner;
public class RadiusCalcIfElse {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final double PIE = 3.14159;
        
        System.out.println("Enter the radius of a circle to calculate area");
        double radius = input.nextDouble();
        
        double area = radius * radius * PIE;
        
        if (radius <= 0){
            System.out.println("Error enter a radius above 0");     
        }
        else { 
            System.out.println("Area of circle is " + area);
        }
        
    }    
}
