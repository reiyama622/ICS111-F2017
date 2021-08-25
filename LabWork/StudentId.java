/**
 * 
 */
package LabWork;

/** Tests the Student.java file
 * @author Rei Yamamoto
 *
 */
public class StudentId {

  /** gets a name and id number credits and then prints that to the screen
   * if they have 120 credits or more then it will print either true or false 
   * @param args the string [] containing command line arguments; not used
   */
  public static void main(String[] args) {
    Student x = new Student("Rei", 12345, 10);
    System.out.println(x.getName());
    System.out.println(x.getIdNumber());
    System.out.println();
    x.setName("yamamoto");
    System.out.println(x.getName());
    x.setIdNumber(678910);
    System.out.println(x.getIdNumber());
    x.setCredits(125);
    System.out.println(x.getCredits());
    System.out.println(x.numCredits());
    System.out.println(x.toString());
  }
}
