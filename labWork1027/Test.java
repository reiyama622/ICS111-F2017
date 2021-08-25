/**
 * 
 */
package labWork1027;

/**
 * Tests the class StrawHouse, WoodHouse, and SecureBrickHouse
 * 
 * @author Rei Yamamoto
 *
 */
public class Test {
  /**Tests the class StrawHouse, WoodHouse, and SecureBrickHouse and prints out the matieral
   * @param args
   *          the string [] containing command line arguments; not used
   */
  public static void main(String[] args) {
    House house1;
    house1 = new StrawHouse();
    System.out.println(house1.material());
    House house2;
    house2 = new WoodHouse();
    System.out.println(house2.material());
    House house3;
    house3 = new SecureBrickHouse();
    System.out.println(house3.material());
  }
}
