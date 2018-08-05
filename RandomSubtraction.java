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
public class RandomSubtraction {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will test your basic subtraction skills");
        
        int randomNumber1 = (int)(Math.random() * 10);
        int randomNumber2 = (int)(Math.random() * 10);
        int temp = 0;
        int correctAnswer = 0;
        
        if (randomNumber2 > randomNumber1) {
            temp = randomNumber2; 
            randomNumber2 = randomNumber1;
            correctAnswer = temp - randomNumber1;
        }
        else {
            correctAnswer = randomNumber1 - randomNumber2;
        }
            
        System.out.println("What is " + randomNumber1 + " - " + randomNumber2 + "?");
        int userAnswer = input.nextInt();
        
        boolean answer = userAnswer == correctAnswer;
        
        if (answer) {    
            System.out.println("Correct");
        }
        else
            System.out.println("False");
        
    }
    
}
