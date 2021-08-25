/**
 * 
 */
package LabWork;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Creates the layout for a hexadecimal question
 * 
 * @author Rei Yamamoto
 *
 */
public class HexadecimalLayout {

  /**
   * creates the window
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    JFrame window = new JFrame("Hexadecimal Question");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(200, 200);
    window.setLocation(100, 100);
    window.setContentPane(new Question());
    window.setVisible(true);
  }

  /**
   * extends JPanel to create question, text field and button
   * 
   * @author Rei Yamamoto
   *
   */
  public static class Question extends JPanel {
    /**
     * creates the question, text field, and button
     */
    public Question() {
      JLabel question = new JLabel("A + 6 =");
      add(question);
      question.setLayout(new BorderLayout());
      JTextField inputArea = new JTextField(5);
      add(inputArea);
      JButton answer = new JButton("Answer");
      add(answer);
    }

  }
}
