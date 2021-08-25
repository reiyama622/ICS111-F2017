/**
 * 
 */
package LabWork;

/**
 * checks to see if foo bar and baz are in the array. If all three are in the
 * array then it returns true if not then it returns false
 * 
 * @author Rei Yamamoto
 *
 */
public class FooBarBaz {
  /**
   * 
   */
  private String[] array;

  /**
   * checks to see if foo bar and baz are in the array. If all three are in the
   * array then it returns true if not then it returns false
   * 
   * @param array
   *          the string array
   * @return true or false depending if the array has foo bar and baz
   */

  public static boolean check(String[] array) {
    boolean foo = false;
    boolean bar = false;
    boolean baz = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == "foo") {
        foo = true;
      } else if (array[i] == "bar") {
        bar = true;
      } else if (array[i] == "baz") {
        baz = true;
      }
    }
    if (foo == true && bar == true && baz == true) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Tests the check method and prints it to the screen
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    String[] array = { "a", "foo", "b", "bar", "c", "baz" };
    System.out.println(check(array));
  }
}
