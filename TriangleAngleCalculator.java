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
import java.util.*;
public class TriangleAngleCalculator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three points on a graph of a triangle to calculate the angle");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double a = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2-y1)));
        double b = Math.sqrt(((x3 - x2)*(x3 - x2)) + ((y3 - y2) * (y3-y2)));
        double c = Math.sqrt(((x1 - x3)*(x1 - x3)) + ((y1 - y3) * (y1-y3)));
        

        double angleA = (int) (Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)))*100);
        double angleB = (int) (Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)))*100);
        double angleC = (int) (Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)))*100);

        System.out.println("angle a is " + angleA/100.0 + " degrees");
        System.out.println("angle b is " + angleB/100.0 + " degrees");
        System.out.println("angle c is " + angleC/100.0 + " degrees");
        
    }
    
}
