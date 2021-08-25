/**
 * 
 */
package LabWork;

/**
 * Calculates the average of a 2D double array and prints out each line's
 * average
 * 
 * @author Rei Yamamoto
 *
 */

public class TwoDimensionalArray {
  /**
   * Calculates the average of each row in a 2D array
   * 
   * @param list
   *          a double array
   */
  public static void arrayAverage(double[][] list) {
    for (int i = 0; i < list.length; i++) {
      double sum = 0.0;
      for (double value : list[i]) {
        sum += value;

      }
      double average = sum / list[i].length;
      System.out.println(average);
    }

  }

  /**
   * gives the numbers to put into arrayAverage
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    double[][] array = new double[][] { { 1.8, 1.9, 7.7 }, { 2.9, 7.4 }, { 7.0 }, { 0.8, 9.2, 2.5 }, { 4.4, 2.2 },
        { 3.1 } };
    arrayAverage(array);
  }
}
