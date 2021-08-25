/**
 * 
 */
package edu.ics111.h03;

/** Program that rolls a pair of six sided dies then calculates the amount of tries it took to get the two dies to equal seven. 
 * @author Rei Yamamoto
 *
 */
public class TriesToGetSeven {

  /**
   * @param args
   */
public static void main(String[] args) {
  int d1;
  int d2;
  d1 = (int) (Math.random()* 6 + 1);
  d2 = (int) (Math.random()* 6 + 1);
  int roll;
  roll = (d1+d2);
  int count;
  count = 1;
  while(roll != 7) {
    System.out.println(d1 + " + " + d2 + " = " + roll);
    d1 = (int) (Math.random()* 6 + 1);
    d2 = (int) (Math.random()* 6 + 1);
    roll = (d1+d2);
    count++;

}
  System.out.println(d1 + " + " + d2 + " = " + roll);
  System.out.println("Number of tries it took to get the number seven: " + count);
}
}