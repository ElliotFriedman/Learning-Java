
package Math;

import java.util.*;
public class BooleanOps {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        
       System.out.println("Enter the year, this program will check if that " +
               "year is a leap year");
       int year = input.nextInt(); 
       
       boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0 ;
       
       System.out.println(year + " is a leap year " + leapYear);
    }
}