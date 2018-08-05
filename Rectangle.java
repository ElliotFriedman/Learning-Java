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
public class Rectangle {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter a width and height of a rectangle to find the area");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        System.out.println("Area of rectangle = "+((int)x*y));
        
    }
}
