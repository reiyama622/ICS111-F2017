
package edu.ics111.h09;

/**
 * Program the simulates rolling a pair of dice
 * 
 * @author Rei Yamamoto
 *
 */
public class PairOfDice {

  /**
   * number of die1
   */
  private int die1; // Number showing on the first die.
  /**
   * number of die2
   */
  private int die2; // Number showing on the second die.

  /**
   * rolls the two dice
   */
  public PairOfDice() {
    // Constructor. Rolls the dice, so that they initially
    // show some random values.
    roll(); // Call the roll() method to roll the dice.
  }

  /**
   * shows the two values of the two dies
   * 
   * @param val1
   *          value of the first die
   * @param val2
   *          value of the second die
   */
  public PairOfDice(int val1, int val2) {
    // Constructor. Creates a pair of dice that
    // are initially showing the values val1 and val2.
    setDie1(val1); // Assign specified values
    setDie2(val2); // to the instance variables.
  }

  /**
   * rolls die 1 and 2
   */
  public void roll() {
    // Roll the dice by setting each of the dice to be
    // a random number between 1 and 6.
    setDie1((int) (Math.random() * 6) + 1);
    setDie2((int) (Math.random() * 6) + 1);
  }

  /**
   * gets value of die1
   * 
   * @return die1 the value of die1
   */
  public int getDie1() {
    return die1;
  }

  /**
   * sets die1 to updated value
   * 
   * @param die1
   *          updated value of die1
   */
  public void setDie1(int die1) {
    this.die1 = die1;
  }

  /**
   * gets the value of die2
   * 
   * @return die 2 the value of die2
   */
  public int getDie2() {
    return die2;
  }

  /**
   * sets die2 to updated value
   * 
   * @param die2
   *          updated value of die2
   */
  public void setDie2(int die2) {
    this.die2 = die2;
  }
  /*
   * public static void main(String[] args) { PairOfDice dice = new PairOfDice();
   * System.out.println(dice.getDie1()); System.out.println(dice.getDie2()); }
   */
} // end class PairOfDice