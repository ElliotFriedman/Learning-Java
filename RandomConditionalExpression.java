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
public class RandomConditionalExpression {
    
    public static void main(String[] args){
        int x = 2;
       
        int random = (int)(Math.random()* (5 + 1));
       
        System.out.println((x > random)? "-1" : "1");
        
    }
    
}
