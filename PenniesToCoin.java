
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dehkhoda_abbas
 */
public class PenniesToCoin 
{
//  static  Scanner input = new Scanner(System.in); 
    
    
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        pennyToNickle(input);
        System.exit(0);
    }
    public static void pennyToNickle(Scanner x)
    {
       
       String out = "";
       String mess= "Enter pennies";
       System.out.print(mess);
       int numPennies  = x.nextInt();
       out+= numPennies + " Consist of\n";
       int q = numPennies / 25;
       numPennies = numPennies - q * 25;
       int d =  numPennies / 10;       
       numPennies = numPennies % 10;
       int n =  numPennies / 5;       
       numPennies = numPennies % 5;
       
       out+= q + " Quarters\n";
       out+= d + " Dimes\n";
       out+= n + " Nickles\n";
       out+= numPennies + " Pennies\n";
       
       JOptionPane.showMessageDialog(null,out);
    }
    
    
}
