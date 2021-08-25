/**
 * 
 */
package edu.ics111.h07;

/**
 * gets the players names and scores and then sets their scores
 * 
 * @author Rei Yamamoto
 *
 */
public class Player {
  /**
   * player's name
   */
  private String name;
  /**
   * player's score
   */
  private int score;
  /**
   * player's updated score
   */
  public int setScore;

  /**
   * sets name to p and score to 0
   * 
   * @param p
   *          the name
   */
  public Player(String n) {
    this.name = n;
    this.score = 0;
  }

  /**
   * gets the players names
   * 
   * @return name the name given
   */
  public String getName() {
    return name;
  }

  /**
   * gets the players score
   * 
   * @return the score given
   */
  public int getScore() {
    return score;
  }

  /**
   * sets their score
   * 
   * @param score
   *          the updated score
   */
  public void setScore(int score) {
    this.score = score;
  }

}
