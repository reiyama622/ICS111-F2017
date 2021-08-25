/**
 * 
 */
package LabWork;

/** Program that asks the user to input a series of positive integers then determines how many numbers are even and odd 
 * prints out the total number of even and the total number of odd.
 * @author Rei Yamamoto
 *
 */
public class EvenOrOdd {

  /**Program that asks the user to input a series of positive integers then determines how many numbers are even and odd
   *prints out the total number of even and the total number of odd.
   * @param args
   */
  public static void main(String[] args) {
    int userInput;
    System.out.println("Enter a positive integer.");
    userInput = TextIO.getInt();
    int oddCount;
    oddCount=0;
    int evenCount;
    evenCount=0;
    while(userInput > 0) {
      if(userInput % 2 == 0) {
        evenCount++;
      }
      else {
        oddCount++;
      }
      System.out.println("Enter more positive numbers.To stop entering numbers enter a negative number");
      userInput = TextIO.getInt();
    }
    System.out.println("number of even: "+ evenCount );
    System.out.println("Number of odd: "+ oddCount);

  }

}
