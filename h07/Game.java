/**
 * 
 */
package edu.ics111.h07;

import LabWork.TextIO;

/**
 * program that lets the user play a pig dice game textIO from the textbook
 *  TextIO from the textbook
 * @author Rei Yamamoto
 *
 */
public class Game {

  /**
   * runs the subroutine playersTurn for each player until someone gets 100 or
   * more
   * 
   * @param args
   *          the string [] containing command line arguments; not used
   */
  public static void main(String[] args) {
    System.out.println("This is the pig dice game");
    Player[] players = createPlayers();
    int playersTurn = 0;
    do {
      playersTurn = (playersTurn + 1) % players.length;
      playerTurn(players[playersTurn]);
    } while (players[playersTurn].setScore < 100);
  }

  /**
   * simulates one turn until you cannot roll anymore
   * 
   * @param p
   *          which player is currently playing
   */
  private static void playerTurn(Player p) {
    System.out.println("It is player " + p.getName() + " turn");
    System.out.println();
    boolean gameOver = false;
    int turnScore = 0;
    // Player[] userName = createPlayers();
    // System.out.println("It is " + userName+"'s" + " turn");
    while ((gameOver == false) && (p.setScore < 100)) {
      PairOfDice dice = new PairOfDice();
      dice.roll();
      if (dice.getDie1() == 1 && dice.getDie2() == 1) {
        turnScore = 0;
        p.setScore = 0;
        System.out.println("you rolled two ones. Your total score is 0");
        System.out.println("You do not get to roll again.");
        System.out.println();
        gameOver = true;
      } else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
        turnScore = 0;
        System.out.println("You rolled one one. You scored nothing this round");
        System.out.println("You do not get to roll again.");
        System.out.println("Your total score is " + p.setScore);
        System.out.println();
        gameOver = true;
      } else if (dice.getDie1() == dice.getDie2()) {
        turnScore = (dice.getDie1() + dice.getDie2());
        p.setScore += turnScore;
        System.out.println("Your turn score is " + turnScore);
        System.out.println("Your total score is " + p.setScore);
        System.out.println();
        gameOver = false;
      } else if (dice.getDie1() != 1 && dice.getDie2() != 1) {
        turnScore = (dice.getDie1() + dice.getDie2());
        p.setScore += turnScore;
        System.out.println("Your turn score is " + turnScore);
        System.out.println("Your total score is " + p.setScore);
        System.out.println("Do you want to roll again? 1= yes and 2= no");
        System.out.println();
        int playMore = TextIO.getlnInt();
        if (playMore == 1) {
          gameOver = false;
        } else {
          gameOver = true;
        }

      }
      if (p.setScore >= 100) {
        System.out.println("Game Over!" + p.getName() + " wins");
        gameOver = true;
      }
    }

    // int oldScore = p.1getScore();
    // p.setScore(oldScore + turnScore);
  }

  /**
   * asks the user for the number of people playing and their names
   * 
   * @return names the users names
   */
  private static Player[] createPlayers() {
    System.out.println("How many people are playing?");
    int playerNum = TextIO.getlnInt();
    Player[] names = new Player[playerNum];
    int i;
    for (i = 0; i < names.length; i++) {
      System.out.println("Enter the names");
      String name = TextIO.getln();
      names[i] = new Player(name);
    }
    return names;
  }
}
