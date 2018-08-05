package chapter5learnings;
import java.util.*;
public class RandomMathGuess {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ranGen = (int) (Math.random() * (100 - 10 + 1) );
       
        System.out.println("Guess the number the computer generated");
        int myGuess = input.nextInt();
        
        while (ranGen != myGuess) {
            
            //larger than your number
            if(ranGen > myGuess) {
            System.out.println("The computer's number is larger than" +
                    " your number. Guess again");
            myGuess = input.nextInt();
            }
            
            //smaller than your number
            else if (myGuess > ranGen) {
            System.out.println("The computer's number is smaller than" +
                    " your number. Guess again");
            myGuess = input.nextInt();
            }
        }
        System.out.println("Congrats the number was " + ranGen);
        }  
    }