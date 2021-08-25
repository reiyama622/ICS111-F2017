/**
 * 
 */
package edu.ics111.h03;

import edu.ics111.h07.TextIO;

/** Program that rolls a pair of six sided dies then calculates the amount of tries it took to get the two dies to equal the number that the user chose. 
 * @author Rei Yamamoto
 *
 */
public class UserChoosesNumber {

  /** Program that rolls a pair of six sided dies then calculates the amount of tries it took to get the two dies to equal the number that the user chose. 
   * @param args
   */
public static void main(String[] args) {    
  int userInput;
  System.out.println("Pick a number 2 - 12");
  userInput = TextIO.getlnInt(); 
  int d1;
  int d2;
  d1 = (int) (Math.random()* 6 + 1);
  d2 = (int) (Math.random()* 6 + 1);
  int roll;
  roll = (d1+d2);
  int count;
  count = 1;
  while(roll != userInput) {
    if(userInput <= 12 && userInput >= 2){
      System.out.println(d1 + " + " + d2 + " = " + roll);
      d1 = (int) (Math.random()* 6 + 1);
      d2 = (int) (Math.random()* 6 + 1);
      roll = (d1+d2);
      count++;
    }
    else if(userInput > 12 || userInput < 2) {
      System.out.println("Type a number between 2 and 12");
      userInput = TextIO.getlnInt();
    }

}
  System.out.println(d1 + " + " + d2 + " = " + roll);
  System.out.println("Number of tries it took to get the number you chose: " + count);
}
}