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
public class Quiz {
    
    public static void main(String[] args) {
        
        System.out.println("You display the backslash by typing two "
                + "backslashes at once \\");
        
        System.out.println("You display double quotation marks by "
                + " typing a backslash followed by a double quotat"
                + "ion mark"
                + "\"");
        
        eval();
        conversion();
        
    }
    
    public static int eval(){
        
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a'; 
        int k = 'a';
        char c = 90;
        
        System.out.println("int j = '1' + '2' * ('4' - '3') + 'b' / 'a'; = " + j 
                + "\nk = " + k
                + "\ni = " + i);

    return(0);
    
    }
    
    public static int conversion(){
        
        char c = 'A'; 
        int i = (int)c;
        float f = 1000.34f; 
        i = (int)f;
        double d = 1000.34; 
        i = (int)d;
        i = 122;
        char b = (char)i;
       
        System.out.println("char b = " + b);
                
        return(0);
    }
    
}