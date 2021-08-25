/**
 * 
 */
package labWork1025;

/**
 * sub class of person
 * 
 * @author Rei Yamamoto
 *
 */
public class Employee extends Person {
  /**
   * their salary
   */
  private int salary;
  /**
   * the student's id number
   */
  private int studentId;

  /**
   * Sets name to a string, id to an int, and pay, to an int
   * 
   * @param name
   *          from the class person
   * @param id
   *          the person's id number
   * @param pay
   *          the person's pay
   */
  public Employee(String name, int id, int pay) {
    super(name);
    studentId = id;
    salary = pay;
  }

  /**
   * get the salary
   * 
   * @return salary the amount that they make
   */
  public int getSalary() {
    return salary;
  }

  /**
   * set the salary
   * 
   * @param salary
   *          their updated salary
   */
  public void setSalary(int salary) {
    this.salary = salary;
  }

  /**
   * gets the student id
   * 
   * @return studentId their student id number
   */
  public int getStudentId() {
    return studentId;
  }

  /**
   * set the student id
   * 
   * @param studentId
   *          the updated student id number
   */
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  /*
   * (non-Javadoc)
   * 
   * @see labWork1025.Person#toString()
   */
  public String toString() {
    return "ID  number: " + studentId + " " + "Salary is :" + salary;

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
      Employee student = (Employee) obj;
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
