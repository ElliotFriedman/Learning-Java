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
public class TriangleArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three points");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double side1 = Math.sqrt( ((x2 - x1)*(x2 - x1)) + (y2 - y1)*(y2 - y1));
        double side2 = Math.sqrt( ((x3 - x2)*(x3 - x2)) + (y3 - y2)*(y3 - y2));
        double side3 = Math.sqrt( ((x1 - x3)*(x1 - x3)) + (y1 - y3)*(y1 - y3));
        
        double s = (side1 + side2 + side3) / 2;
        
        double area = (int)(Math.sqrt(s*(s - side1) * (s - side2) * (s - side3)) * 100);
        
        System.out.println("Area = " + area / 100.0);
    }
    
}
