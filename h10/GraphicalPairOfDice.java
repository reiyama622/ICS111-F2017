/**
 * 
 */
package edu.ics111.h10;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.ics111.h09.PairOfDice;

/**
 * Program that simulates a pair of dice
 * 
 * @author Rei Yamamoto
 *
 */
public class GraphicalPairOfDice extends PairOfDice {
  /**
   * Creates the window
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    DiceDisplay dice = new DiceDisplay();
    JFrame window = new JFrame("Dice");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(dice);
    window.setSize(200, 200);
    window.setLocation(100, 100);
    window.setVisible(true);

  }

  /**
   * Draws the dice
   * 
   * @author Rei Yamamoto
   *
   */
  public static class DiceDisplay extends JPanel {
    /**
     * shows 4 at the beginning
     */
    private int die1 = 4; // The values shown on the dice.
    /**
     * shows 3 at the beginning
     */
    private int die2 = 3;

    /**
     * based off of the text book exercise 6.3 activates the mouse clicker
     */
    public DiceDisplay() {
      addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent evt) {
          roll();
        }
      });
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    public void paintComponent(Graphics g) {
      PairOfDice dice = new PairOfDice();
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();
      int width1 = width / 3 - 25;
      int height1 = height / 3 - 25;
      int width2 = width * 2 / 3 - 25;
      int height2 = height * 2 / 3 - 25;
      drawDie(g, die1, width1, height1);
      drawDie(g, die2, width2, height2);
    }

    /**
     * draws the dots on the dice from the textbook exercise 6.3
     * 
     * @param g
     *          the number drawn
     * @param dieNum
     *          die 1 or die 2
     * @param x
     *          width
     * @param y
     *          height
     */
    public void drawDie(Graphics g, int dieNum, int x, int y) {
      g.setColor(Color.white);
      g.fillRect(x, y, 35, 35);
      g.setColor(Color.black);
      g.drawRect(x, y, 34, 34);
      if (dieNum > 1) // upper left dot
        g.fillOval(x + 3, y + 3, 9, 9);
      if (dieNum > 3) // upper right dot
        g.fillOval(x + 23, y + 3, 9, 9);
      if (dieNum == 6) // middle left dot
        g.fillOval(x + 3, y + 13, 9, 9);
      if (dieNum % 2 == 1) // middle dot (for odd-numbered val's)
        g.fillOval(x + 13, y + 13, 9, 9);
      if (dieNum == 6) // middle right dot
        g.fillOval(x + 23, y + 13, 9, 9);
      if (dieNum > 3) // bottom left dot
        g.fillOval(x + 3, y + 23, 9, 9);
      if (dieNum > 1) // bottom right dot
        g.fillOval(x + 23, y + 23, 9, 9);
    }

    /**
     * calls the PairOfDice to generate random rolls from the textbook exercise 6.3
     */
    void roll() {
      PairOfDice newRoll = new PairOfDice();
      newRoll.roll();
      die1 = newRoll.getDie1();
      die2 = newRoll.getDie2();
      repaint();
    }
  }

}
