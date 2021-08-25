/**
 * 
 */
package LabWork;

/**
 * @author Rei Yamamoto
 *
 */
public class GuiltyNotGuilty {

  /** Program that inputs the jurer number, name of the jurer and the verdict into a table.
   * @param args
   */
  public static void main(String[] args) {
    printJurorTable(1, "Paul E. Gone", "Guilty");
    printJurorTable(2, "Sandy Beech", "Guilty");
    printJurorTable(3, "Marcus Absent", "Guilty");
    printJurorTable(4, "Hugh Blewitt", "Guilty");
    printJurorTable(5, "Robin Banks", "Guilty");
    printJurorTable(6, "Dewey Havtoo", "Guilty");
    printJurorTable(7, "Ira Fuse", "Guilty");
    printJurorTable(8, "Reed Rights", "Not Guilty");
    printJurorTable(9, "Izzy Lyon", "Guilty");
    printJurorTable(10, "Luke Out", "Guilty");
    printJurorTable(11, "Ema Nymton", "Guilty");
    printJurorTable(12, "Toby R. Notabee", "Guilty");

  }
  /** Format a table for the jurer number, name of the jurer and the verdict
   * @param number
   * @param name
   * @param verdict
   */
  public static void printJurorTable(int number, String name, String verdict) {
    System.out.printf("%2d | %-16s | %s\n", number, name, verdict);
  }
}
