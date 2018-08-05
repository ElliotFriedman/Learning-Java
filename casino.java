/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

/**
 *
 * @author ElliotFriedman
 */
public class casino {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		for(int i = 1; i < 100; i++){
			int dice1 = (int)(Math.random() * (6 - 1 + 1)) + 1;
			int dice2 = (int)(Math.random() * (6 - 1 + 1)) + 1;
			int diceRoll = dice1 + dice2;

			System.out.println("Dice 1 is " + dice1);
			System.out.println("Dice 2 is " + dice2);
			System.out.println("Total roll is " + diceRoll);

		}

	}

}
