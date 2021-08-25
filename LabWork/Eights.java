/**
 * 
 */
package LabWork;

/**
 * Counts the number of 8s in a number
 * 
 * @author Rei Yamamoto
 *
 */
public class Eights {

  /**
   * prints out the number of eights
   * 
   * @param args not used
   */
  public static void main(String[] args) {
    int num = 878;
    System.out.println(countEightInterative(num));
    System.out.println(countEightRecursive(num));

  }

  /**
   * finds the number of eights in the given number
   * 
   * @param number
   *          number that you want to check
   * @return the count for the number of eights in the number
   */
  public static int countEightInterative(int number) {
    int eights = 0;
    while (number > 0) {
      if (number % 10 == 8) {
        eights++;
      }
      number = (number / 10);
    }
    return eights;
  }

  /**
   * finds the number of eights within the given number
   * 
   * @param number
   *          the number that you want to check
   * @return the count for the number of eights in the number
   */
  public static int countEightRecursive(int number) {
    if (number == 0) {
      return 0;
    }
    if (number % 10 == 8) {
      return 1 + countEightRecursive(number / 10);
    } else {
      return countEightRecursive(number / 10);
    }
  }
}
