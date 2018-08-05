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
public class StringComparison {
    
    public static void main(String[] args){
        
        

    String s1 = "my name is string s1, nice to meet you";
    String s2 = "my name is string s1, nice to meet you";
    
    String s3 = new String("my name is string s4, nice to meet you");
    String s4 = new String("my name is string s4, nice to meet you");
    
    
      
    //this series of if else statements will test the equivalence of string s1 & s2
        if (s1 == s2 ){
        System.out.println("String 1 equals string 2 according to the == operator");
        }
        
        else {
        System.out.println("String s1 does not equal string 2 according to the == operator");
            
        }
    
        if (s1.equals(s2)){
        System.out.println("String 1 equals string 2 according to the equals() method");    
          
        }
        
        else {
        System.out.println("String 1 does not equal string 2 according to the equals() method");    
           
        }
        
    //this series of if else statement will test the equivalence of string s1, s2, s3 & s4
        
            if (s1.equals(s4)) {
            System.out.println("String 1 equals string 4 according to the equals() method");
            
            }
        
            else {
            System.out.println("String 1 does not equal string 4 according to the equals() method");   
              
            }
        
            
            if(s3 == s4){
            System.out.println("String 3 and 4 are equal according to the == operator");
                
            }
            
            else {
            System.out.println("String 3 and 4 are not equal according to the == operator");
                
            }
        
            if(s3.equals(s4)){
            System.out.println("String 3 equals string 4 according to the equals() method");    
                
            }
            
            else {
            System.out.println("String 3 does not equal string 4 according to the equals() operator");    
                
            }
            
            System.out.println(s1.endsWith("you"));
    
    }   
}
