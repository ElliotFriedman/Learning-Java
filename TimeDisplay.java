/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElliotFriedman
 */
import java.util.Scanner;
public class TimeDisplay {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Enter the amount of seconds to convert to minutes ");
        int seconds = s.nextInt();
        int minutes = seconds/60;
        int remainingseconds = seconds%60;
                
        System.out.println("The amount of minutes is "+minutes+" and the amount of seconds is " +remainingseconds);

    }
    
}
