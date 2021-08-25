/**
 * 
 */
package LabWork;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import LabWork.BlackCircle.BlackCircleDisplay;

/** Draws six circles
 * @author Rei Yamamoto
 *
 */
public class ColorCircle {

  /** creates the window
   * @param args
   */
  public static void main(String[] args) {
    ColorCircleDisplay circle = new ColorCircleDisplay();
    JFrame window = new JFrame("Circle");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(circle);
    window.setSize(200, 200);
    window.setLocation(100, 100);
    window.setVisible(true);
  }

  /**extends JPanel and draws the circles
   * @author Rei Yamamoto
   *
   */
  public static class ColorCircleDisplay extends JPanel {

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    public void paintComponent(Graphics g) {
      super.paintComponents(g);
      int width = getWidth();
      int height = getHeight();
      height = height / 2 - 64;
      width = width / 2 - 64;
      g.drawOval(width, height, 128, 128);
      g.drawOval(width + 10, height + 10, 128, 128);
      g.drawOval(width + 30, height + 10, 128, 128);
      g.drawOval(width + 50, height + 10, 128, 128);
      g.drawOval(width + 70, height + 10, 128, 128);
      g.drawOval(width + 90, height + 10, 128, 128);
    }
  }
}
