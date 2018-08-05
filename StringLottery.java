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
public class StringLottery {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 99");
        int answer = input.nextInt();
        
        String stringAnswer = answer + "";
        
        int randomAnswer = (int)(Math.random() * 100);
        String ranAnswer = randomAnswer + "";
        
        if(ranAnswer.equals(stringAnswer)){
            System.out.println("Congratz bro u won 10,000 buckaroonies");
            
        }
        
        char answer1 = stringAnswer.charAt(0);
        char answer2 = stringAnswer.charAt(1);
        
        char genAnswer1 = ranAnswer.charAt(0);
        char genAnswer2 = ranAnswer.charAt(1);
        
        else if 
        
        
    }
    
}
