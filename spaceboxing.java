import java.util.*;
public class spaceboxing
{
	public static void main(String[] args)
	{
		int weight;
		int planet;
		double gravity;
		
		gravity = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your current earth weight: ");
		weight = input.nextInt();
		System.out.println("I have information for the following planets: \n" 
				+ "	1. Venus	2. Mars		3. Jupiter\n"
				+ "	4. Saturn	5. Uranus	6. Neptune\n\n"
				+ "Which planet are you visiting?");
		try(){
			planet = input.nextInt();
		}
		catch(){
				System.out.print("Not a valid entry. Please enter an integer value between 1 and 6\n");
		}
		 System.out.print("Your weight on: ");  
		switch(planet)
		{
			case 1:
				gravity = 0.78;
				System.out.print("Venus ");
				break;
			case 2:
				gravity = 0.39;
				System.out.print("Mars ");
				break;
			case 3:
				gravity = 2.65;
				System.out.print("Jupiter ");
				break;
			case 4:
				gravity = 1.17;
				System.out.print("Saturn ");
				break;
			case 5:
				gravity = 1.05;
				System.out.print("Uranus ");
				break;
			case 6:
				gravity = 1.23;
				System.out.print("Neptune ");
				break;
		}
		double newWeight = gravity * weight;
		System.out.print(newWeight + " pounds.\n");

	}

}
