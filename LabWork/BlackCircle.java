/**
 * 
 */
package LabWork;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates a black circle in the center of the window with a radius of 64
 * 
 * @author Rei Yamamoto
 *
 */
public class BlackCircle {
  /**
   * creates the window
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    BlackCircleDisplay circle = new BlackCircleDisplay();
    JFrame window = new JFrame("Black Circle");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(circle);
    window.setSize(200, 200);
    window.setLocation(100, 100);
    window.setVisible(true);
  }

  /** Draws the circle
   * @author Rei Yamamoto
   *
   */
  public static class BlackCircleDisplay extends JPanel {
    /* (non-Javadoc)
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();
      height = height / 2 - 64;
      width = width / 2 - 64;
      g.fillOval(width, height, 128, 128);
    }
  }
}