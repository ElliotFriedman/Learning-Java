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
public class PrintASCII {
    
    //ASCII code for '1', 'A', 'B', 'a', and 'b'
    public static void main(String[] args){
        
        int a = 'A';
        int b = 'B';
        int one = '1';
        int A = 'A';
        int B = 'B';
        
        System.out.println("ASCII code for a is " + a
                + "\nASCII code for b is " + b +
                "\nASCII code for 1 is " + one +
                "\nASCII code for A is " + A +
                "\nASCII code for B is " + B);
        
        
        //find character value for 40, 59, 79, 85
        
        int w = 41;
        int x = 59;
        int y = 79;
        int z = 85;
        
        System.out.println("41 is character " +(char)w + " in unicode "
                         +"\n59 is character " +(char)x + " in unicode "
                         +"\n79 is character " +(char)y + " in unicode "
                         +"\n85 is character " +(char)z + " in unicode ");
        
    }
    
}
