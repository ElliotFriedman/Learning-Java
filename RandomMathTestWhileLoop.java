/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5learnings;

/**
 *
 * @author ElliotFriedman
 */
import java.util.Scanner;
public class RandomMathTestWhileLoop {
    
    public static void main(String[] args) {
        
       int number1 = (int) (Math.random() * (99 - 10 + 1)) + 10;
       int number2 = (int) (Math.random() * (99 - 10 + 1)) + 10;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("What is " + number1 + " plus " 
               + number2 + " equal to?");
       int answer = input.nextInt();
       
       while(answer != (number1 + number2)){
           System.out.println("Wrong answer try again");
           answer = input.nextInt();
           
       }      
        System.out.println("Congratz, u have a brain");            
    }
    
}