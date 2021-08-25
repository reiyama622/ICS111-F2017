/**
 * 
 */
package LabWork;

import java.util.ArrayList;

/** compares two arrays and if they are the same prints out true and if they are not the same prints out false
 * @author Rei Yamamoto
 *
 */
public class CompareArray {
  /**compares the two arrays to see if they are the same 
   * @param a1 string array
   * @param a2 array list
   * @return true or false
   */
  public static boolean compare(String[] a1, ArrayList<String> a2) {
    if (a1.length != a2.size()) {
      return false;
    }
    for (int i = 0; i < a2.size(); i++) {
      if (a1[i] == a2.get(i)) {
      } else {
        return false;
      }
    }
    return true;
  }

  /** checks to see if compareArray method works
   * @param args not used
   */
  public static void main(String[] args) {
    String[] a1 = { "a", "b", "c", "d" };
    ArrayList a2 = new ArrayList();
    a2.add("a");
    a2.add("b");
    a2.add("c");
    a2.add("d");
    System.out.println(compare(a1, a2));
  }
}
