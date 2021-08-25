/**
 * 
 */
package LabWork;

/**
 * gets and sets a student's name and id number
 * 
 * @author Rei Yamamoto
 *
 */
public class Student {
  /**
   * name of the user
   */
  private String name;
  /**
   * user's id number
   */
  private int idNumber;
  /**
   * number of credits the user has
   */
  private int credits;
  /**
   * true or false if they will graduate
   */
  private boolean graduate;

  /**
   * sets your name to a string and sets the id number to an int
   * 
   * @param name
   *          string that has the name that you enter
   * @param idNumber
   *          integer that has the id number that you enter
   */
  public Student(String name, int idNumber, int credits) {
    this.name = name;
    this.idNumber = idNumber;
    this.credits = credits;
    graduate = false;

  }

  /**
   * if they have 120 credits return true if not then return false
   * 
   * @return boolean true or false if they will graduate or not
   */
  public boolean numCredits() {
    if (credits >= 120) {
      graduate = true;
      return true;
    } else {
      graduate = false;
      return false;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return "name: " + name + " " + "ID  number: " + idNumber + " " + "Number of Credits: " + credits + " "
        + "Will you Graduate? " + graduate;

  }

  /**
   * gets the name you entered
   * 
   * @return the name that you entered
   */
  public String getName() {
    return name;
  }

  /**
   * sets the name
   * 
   * @param name
   *          is what ever name you enter
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * gets the id number
   * 
   * @return the id number you entered
   */
  public int getIdNumber() {
    return idNumber;
  }

  /**
   * sets the id number
   * 
   * @param idNumber
   *          the id number that you entered
   */
  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  /**
   * gets the number of credits they have
   * 
   * @return credits the number of you have
   */
  public int getCredits() {
    return credits;
  }

  /**
   * sets the number of credits
   * 
   * @param credits
   *          number of credits you have after updating
   */
  public void setCredits(int credits) {
    this.credits = credits;
  }

  public static boolean credits() {

    return false;

  }

}
