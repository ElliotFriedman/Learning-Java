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
import java.util.*;
public class SubtractionQuizWhileIfElseLoop {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        
        while(count < 5) {
            
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);  
        
        if (y>=x){
            x += y;  
        }
                
        System.out.println("What is " + x + " - " + y + "?\nEnter your answer");
        int answer = input.nextInt();
        int correctAnswer = x - y;
        
        if (answer == correctAnswer) { 
            System.out.println("Your answer is correct");
            ++correctCount;
        } 
        
        else {   
            System.out.println("Your answer is incorrect " + x + " - " + y + " = " 
                    + (x-y));   

        }  
        count++;
    }
        
        System.out.println("You scored " + correctCount + "/ 5 \nYour time was " +
                (System.currentTimeMillis() - startTime)/1000 + " seconds" );
        
        System.exit(0);
    } 
  
}
