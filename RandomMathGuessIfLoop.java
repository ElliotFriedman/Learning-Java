package chapter5learnings;
import java.util.*;
public class RandomMathGuessIfLoop {
    
    public static void main(String[] args) {
        
        int ranGen = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the randomly generated " +
                "number between 1 and 100");
        
        int myGuess = input.nextInt();

        myGuess = -4;
        while(myGuess != ranGen)
            
        if (myGuess == ranGen)           
            System.out.println("Congrats u got it right");

        else if(myGuess < ranGen) 
        System.out.println("Your guess is less than the number" +
                " guess again");
            myGuess = input.nextInt();
                    
        }  
    }