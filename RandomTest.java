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
public class RandomTest {
    
    public static void main(String[] args) {
        
        for(int x = 1; x < 100; x++) {
        int random = (int)(Math.random() *(8));
        
        System.out.println(random);
    }
  }   
}