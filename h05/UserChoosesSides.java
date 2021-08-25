/**
 * 
 */
package edu.ics111.h05;

import edu.ics111.h07.TextIO;

/** Program that averages the number of times it takes to get to the sum of two numbers on a six sided die to equal the given number
 * @author Rei Yamamoto
 *
 */
public class UserChoosesSides {
  /**Program that averages the number of times it takes to get to the sum of two numbers on a six sided die to equal the given number
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Choose the number of sides you wish the dice had");
    int userChooses = TextIO.getInt();
    double averageFinal;
    System.out.println("     Number              Average");
    for (int dice = 2; dice <= userChooses; dice++) { //repeat for all numbers 2-12
      averageFinal = averageRoll( dice); //gets the number you wanted to roll
      System.out.printf("%10d%22.4f\n", dice, averageFinal);
    }
    //System.out.println(numberWanted(5));
  }
  /**Generates the average of the number of times it took to get a certain number 1000 times
   * @param roll
   * @return
   */
  public static double averageRoll(int roll) {
    int rollsToGetNumOnce;//number of times it takes to get the number
    int sumOfAll; //sum of all the tries
    double average;
    sumOfAll = 0;
    for ( int y = 0; y < 1000; y++) { //loops only until the certain amount
      rollsToGetNumOnce = numberWanted( roll); //have to get the number of times it took to get the certain number once
      sumOfAll = sumOfAll + rollsToGetNumOnce; //sum of number of times it took to get desired number
    }
     average = ((double)sumOfAll) / 1000; //calculate the average
     return average; 
  }
  /** Randomly rolls the dice until wanted number is reached and keeps track of number of times it took to get to the number
   * @param userChooses 
   * @param N
   * @return the number of times it took to get the desired number
   */
  public static int numberWanted( int X) {
    //System.out.println("count "+ X);
    int count = 0;
    if ( X >= 2 && X <12) {
      int roll;
      int d1;
      int d2;
      count = 0;
      do {
        d1 = (int) (Math.random()*6 + 1); //randomly roll die
        d2 = (int) (Math.random()*6 + 1);
        roll = d1 + d2; //total of both die
        count++; //add up the number of tries it took to get desired number
        //System.out.println(roll);
    } while (roll != X );
  }
    return count++;
  }
}
