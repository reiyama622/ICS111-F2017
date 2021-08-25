/**
 * 
 */
package edu.ics111.h01;

/** A program that randomly selects two sided of two die and adds the two sides together
 * @author Rei Yamamoto
 *
 */
public class SixSidedDieSimulator {

	/**A program that randomly selects two sided of two die and adds the two sides together
	 * @param args
	 */
	public static void main(String[] args) {
		int d1 = (int) (Math.random() * 6 + 1);
		int d2 = (int) (Math.random() * 6 + 1);
		System.out.println("The first die is " + d1);
		System.out.println("The second die is " + d2);
		System.out.println("Your total roll is " + (d1 + d2));
	}

}
