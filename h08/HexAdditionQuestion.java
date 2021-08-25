package edu.ics111.h08;

/**
 * Class from ICS 111 website
 * 
 * @author Carleton Moore
 *
 */
public class HexAdditionQuestion {
  /**
   * @param args
   *          the string [] containing command line arguments; not used
   */
  public static void main(String[] args) {

  }

  /**
   * two integers a and b
   */
  private int a, b; // The numbers in the problem.

  /**
   * Generates two random numbers
   */
  public HexAdditionQuestion() { // constructor
    a = (int) (Math.random() * 50 + 1);
    b = (int) (Math.random() * 50);
  }

  /**
   * Creates the hexadecimal question
   * 
   * @return What is asHex(a) + asHex(b)? the hex addition question
   */
  public String getQuestion() { // creates the question
    return "What is " + asHex(a) + " + " + asHex(b) + " ?";
  }

  /**
   * gets the correct answer
   * 
   * @return a+b the answer to the hexadecimal question
   */
  public int getCorrectAnswer() { // gives the correct answer
    return a + b;
  }

  /**
   * converts the answer to a hexadecimal value
   * 
   * @return Integer.toHexString(a + b) the answer to the question in hexadecimal
   */
  public String correctAnswerAsHex() { // converts answer into hexadecimal
    return Integer.toHexString(a + b);
  }

  /**
   * converts the users answer
   * 
   * @param val
   *          the
   * @return Integer.toHexString(val) users answer converted
   */
  private String asHex(int val) {
    return Integer.toHexString(val);
  }

}
