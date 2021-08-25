/**
 * 
 */
package edu.ics111.h01;

import edu.ics111.h07.TextIO;

/** User chooses the number of sided then the program rolls the two sided then adds the total of the two sides
 * @author Rei
 *
 */
public class UserChoosesSides {

	/**User chooses the number of sided then the program rolls the two sided then adds the total of the two sides
	 * @param args
	 */
	public static void main(String[] args) {
		int inputOne;
		System.out.println("Please pick the number of sides the dies have.");
		inputOne = TextIO.getlnInt();
			int d1 = (int) (Math.random() * inputOne + 1);
			int d2 = (int) (Math.random() * inputOne + 1);
			System.out.println("The first die is " + d1);
			System.out.println("The second die is " + d2);
			System.out.println("Your total roll is " + (d1 + d2));
	}

}
