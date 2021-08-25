/**
 * 
 */
package labWork1025;

/**
 * gets and sets a name
 * 
 * @author Rei Yamamoto
 *
 */
public class Person {
  /**
   * person's name
   */
  private String name;

  /**
   * Sets name as a string
   * 
   * @param name
   *          the name of the person
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * get the name
   * 
   * @return name the name that was given
   */
  public String getName() {
    return name;
  }

  /**
   * set the name
   * 
   * @param name
   *          the updated name
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return "name: " + name;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj instanceof Person) {
      Person person = (Person) obj;
      if (this.name == person.getName()) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
