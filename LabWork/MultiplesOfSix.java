/**
 * 
 */
package LabWork;

/** Prints out all the multiples of 6 from 1 to 100
 * @author Rei
 *
 */
public class MultiplesOfSix {

  /** Prints out all the multiples of 6 from 1 to 100
   * @param args
   */
  public static void main(String[] args) {
    for ( int i = 1; i <= 100; i++) {
      if ( i % 6 == 0) {
        System.out.println(i);
      }
    }

  }

}
