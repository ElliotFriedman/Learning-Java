/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class SwitchLoop {
    public static int Loop(){
       int x;
        
        for (x = 5; x<10;) {
            System.out.println("x<10, x = "+x);
            x++;
        }  
        return 0; 
    }

    public static int x() {
        
       Scanner s = new Scanner(System.in);
       int x;
       
        for(;;) {
            System.out.println("Enter 0 to stop");
                x = s.nextInt();
                if (x == 0){
                    break;    
            }
        } 
     return 0;   
    } 
    
    public static double y() {
        
        int x;
        
            for (x = 1; x<8;) {
                System.out.println("x = " +x);
                    x++; 
        }
     return 0;   
    }
    
    
    public static void main(String[] args){
        Loop();
        x();   
        y();

    }   
}

