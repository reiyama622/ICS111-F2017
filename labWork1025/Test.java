/**
 * 
 */
package labWork1025;

/**
 * Tests and compares the instance of the classes student, person and employee
 * 
 * @author Rei Yamamoto
 *
 */
public class Test {
  /**
   * Compares and tests the instance of the classes student person and employee
   * 
   * @param args
   *          the string [] containing command line arguments; not used
   */
  public static void main(String[] args) {
    Person x = new Person("Rei");
    Student y = new Student("Rei", 12345, 23);
    Employee z = new Employee("Yama", 67890, 70000);
    if (x.equals(y)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    if (y.equals(z)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    if (x.equals(z)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
