/**
 * 
 */
package LabWork;

/**
 * @author Rei Yamamoto
 *
 */
public class JurerTable {

  /** Program that inputs the jurer number,and the name of the jurer into a table.
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("enter a name");
    String name = TextIO.getln();
    printJurorTable(1, name);
    printJurorTable(2, "Sandy Beech");
    printJurorTable(3, "Marcus Absent");
    printJurorTable(4, "Hugh Blewitt");
    printJurorTable(5, "Robin Banks");
    printJurorTable(6, "Dewey Havtoo");
    printJurorTable(7, "Ira Fuse");
    printJurorTable(8, "Reed Rights");
    printJurorTable(9, "Izzy Lyon");
    printJurorTable(10, "Luke Out");
    printJurorTable(11, "Ema Nymton");
    printJurorTable(12, "Toby R. Notabee");
  }
  /**Format a table for the jurer number,and name of the jurer
   * @param number
   * @param name
   */
  public static void printJurorTable(int number, String name) {
    System.out.printf("%2d | %s\n", number, name);
  }
}
