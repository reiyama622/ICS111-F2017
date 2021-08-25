/**
 * 
 */
package LabWork;

import java.util.Arrays;

/** returns the median of the array
 * @author Rei Yamamoto (driver)
 * @author Zack Harano (navigator)
 */
public class Median {

  /** returns the median of the array
   * @param args
   */
  public static void main(String[] args) {
    int numbers[] = new int[] {6,9,4};
    Arrays.sort(numbers);
    System.out.print(numbers[1]);
  }
}
