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
public class RandomLowerCaseLetter 
{
   
    //97 - 122 range for lowercase letters
    public static void main(String[] args){
        
        int x = 1;
        
        while(x < 100){
        
        int randomLetter = (int)((Math.random()*26 - 1 + 1) + 97);
        
        char intToLetter = (char)randomLetter;
        
        System.out.println(intToLetter);
        
        x++;
        
        }
        
    }
    
}
