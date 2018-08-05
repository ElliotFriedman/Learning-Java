import java.util.*;
class scanner{
    public static void main(String[] args){
        int choice = 1;
        Scanner s1 = new Scanner(System.in);
        while(choice == 1){
            
            int a;
            
            System.out.println("Enter a number to check odd or even");
            a = s1.nextInt();
            
            if(a%2==0){
              System.out.println("This number is even");
            }
              else{
                      System.out.println("This number is odd");
                      }
            
        System.out.println("Do you want to check more numbers? 1 for yes 0 for no");
        choice = s1.nextInt();
        }
        System.out.println("Have a nice a day");
        
        }
    }
