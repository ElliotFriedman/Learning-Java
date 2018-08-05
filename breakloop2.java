import java.util.*;
public class breakloop2{
    public static void main(String[] args){
        int x;
        Scanner s = new Scanner(System.in);
    
        for (;;){
            System.out.println("Enter 0 to stop");
            x = s.nextInt();
            if (x == 0){
                break;
            }
            
           
        }  
    }
}