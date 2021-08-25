/**
 * 
 */
package LabWork;

/** Program that asks the user to input an integer then increments the integer by 1 then multiplies it by eight.
 * It then prints out the updated integer then indicates whether the updated integer is equal to 0 or greater than 111
 * @author Rei Yamamoto
 *
 */
public class IncrementByOneMultiplyByEight {

	/** Program that asks the user to input an integer then increments the integer by 1 then multiplies it by eight.
	 * It then prints out the updated integer then indicates whether the updated integer is equal to 0 or greater than 111
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
  System.out.println("please input an integer");
		userInput = TextIO.getlnInt();
		userInput = (++ userInput);
	 userInput = (userInput * 8);
		System.out.println(userInput);
		System.out.println((userInput == 0)||(userInput > 111));
	}
	

}
