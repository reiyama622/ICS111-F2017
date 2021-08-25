/**
 * 
 */
package labWork1025;

/**
 * sub class of person gets and sets the id number and the number of credits
 * 
 * @author Rei Yamamoto
 *
 */
public class Student extends Person {
  /**
   * student's id number
   */
  private int studentId;
  /**
   * number of credits the person has
   */
  private int credits;

  /**
   * sets name to a string, id number to an int, and credits to an int
   * 
   * @param name
   *          the name from the class person
   * @param id
   *          the given id number
   * @param c
   *          the number of credits
   */
  public Student(String name, int id, int c) {
    super(name);
    studentId = id;
    credits = c;
  }

  /**
   * get the student id
   * 
   * @return studentId their id number
   */
  public int getStudentId() {
    return studentId;
  }

  /**
   * set the student id
   * 
   * @param studentId
   *          the updated id number
   */
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  /**
   * get the number of credits
   * 
   * @return credits the number of credits that they have
   */
  public int getCredits() {
    return credits;
  }

  /**
   * set the number of credits
   * 
   * @param credits
   *          the updated number of credits that they have
   */
  public void setCredits(int credits) {
    this.credits = credits;
  }

  /*
   * (non-Javadoc)
   * 
   * @see labWork1025.Person#toString()
   */
  public String toString() {
    return "ID  number: " + studentId + " " + "Number of Credits: " + credits;

  }

  /*
   * (non-Javadoc)
   * 
   * @see labWork1025.Person#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj instanceof Student) {
      Student student = (Student) obj;
      if (this.studentId == student.getStudentId()) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
