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

public class TypesOfScanners {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a byte value");
        byte aByte = input.nextByte();
        
        System.out.println("Enter a short value");
        short aShort = input.nextShort();
        
        System.out.println("Enter an integer");
        int anInteger = input.nextInt();
        
        System.out.println("Enter a long");
        long aLong = input.nextLong();
        
        System.out.println("Enter a float");
        float aFloat = input.nextFloat();
        
        System.out.println("Enter a double");
        double aDouble = input.nextDouble();
        
    }
    
}
