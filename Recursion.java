/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author ElliotFriedman
 */
public class Recursion {

    public static int factorial(int a)
    {
        if (a < 0)
            return -1;
        else if (a == 0)
            return 1;
        return a * (factorial(a - 1));
    }
    public static void main(String[] args) {
       
        System.out.println("factorial of 15 is " + factorial(15));  
        
    }
    
}
