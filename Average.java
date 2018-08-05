import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.println("Enter 3 numbers to find the average");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        
        double average = ((x+y+z)/3);
        
        System.out.println("Average of " +x+ " " +y+ " " +z+ " is " +average);
        
    }
}
