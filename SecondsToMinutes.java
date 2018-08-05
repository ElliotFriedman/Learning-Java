/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElliotFriedman
 */

import java.util.*;
public class SecondsToMinutes {
    
    public static void main(String[] args){
        
        SecondsMinutes();
        
    }
    
    public static void SecondsMinutes() {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter seconds to find out how many minutes and seconds");
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        int currentSeconds = seconds%60;
        
        System.out.println("There are " + minutes + " minutes and " + (currentSeconds) + " seconds.");

    }
    
}
