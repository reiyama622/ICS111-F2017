/**
 * 
 */
package LabWork;

/** Program that puts the 12 names that the user inputed into an array and outputs them to the screen
 * @author Zack Harano (Driver)
 * @author Rei Yamamoto (Navigator)
 * 
 */
public class UserIntegerTable {
  /**Program that outputs the 12 names that the user inputed into an array and outputs them to the screen
   * @param args
   */
  public static void main(String[] args) {
    String[] names = new String[12];//array of length 12
    for (int i = 0; i < names.length; i ++) {
      System.out.println("Enter up to 12 names");
      names[i] = TextIO.getln();   
    }
    printJurorTable(1, names[0]);
    printJurorTable(2, names[1]);
    printJurorTable(3, names[2]);
    printJurorTable(4, names[3]);
    printJurorTable(5, names[4]);
    printJurorTable(6, names[5]);
    printJurorTable(7, names[6]);
    printJurorTable(8, names[7]);
    printJurorTable(9, names[8]);
    printJurorTable(10, names[9]);
    printJurorTable(11, names[10]);
    printJurorTable(12, names[11]);
  }
 /**Format a table for the number and name
 * @param number
  * @param name
 */
  public static void printJurorTable(int number, String name) {
   System.out.printf("%2d | %s\n", number, name);
  }
}