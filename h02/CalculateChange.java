/**
 * 
 */
package edu.ics111.h02;

import edu.ics111.h07.TextIO;

/** A program that asks how much the item costs then asks how much was paid then tells the user how many dollars, quarters, dimes, nickels, and pennies should be used to give change. 
 * @author Rei Yamamoto
 *
 */
public class CalculateChange {

	/** A program that asks how much the item costs then asks how much was paid then tells the user how many dollars, quarters, dimes, nickels, and pennies should be used to give change. 
	 * @param args
	 */
	public static void main(String[] args) {
  double cost;
		double paid;
		System.out.println("How much does the item cost?");
		cost = TextIO.getlnDouble();
		System.out.println("How much was paid?");
		paid = TextIO.getlnDouble();
		double change;
		change = (paid - cost);
		int dollars;
		dollars = (int) ((change * 100) / 100);
		System.out.println(dollars + " dollars");
		int remainder1;
		remainder1 = (int) ((change * 100) % 100);
		int quarters;
		quarters = (int) (remainder1 / 25);
		System.out.println(quarters + " quarters");
		int remainder2;
		remainder2 = (int)( remainder1 % 25);
		int dimes;
		dimes = (int)(remainder2 / 10);
		System.out.println(dimes + " dimes");
		int remainder3;
		remainder3 = (int) (remainder2 % 10);
		int nickels;
		nickels = (int) (remainder3 / 5);
		System.out.println(nickels + " nickels");
		int remainder4;
		remainder4 = (int)(remainder3 % 5);
		int pennies;
		pennies = (int) (remainder4 / 1);
		System.out.println(pennies + " pennies");
		
		;

}
}
