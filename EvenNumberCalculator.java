
    import java.util.*;
    class EvenNumberCalculator{
        public static void main(String[] args){
            System.out.println("Enter a number");
            Scanner s1 = new Scanner(System.in);
            int n=s1.nextInt();
            
            if( n%2 == 0 ) 
                System.out.println("The number is even");
            else
                System.out.println("The number is odd");
           
        }
        
    }
        