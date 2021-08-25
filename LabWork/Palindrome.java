/**
 * 
 */
package LabWork;

/**
 * checks to see if the string is a palindrome and prints out true or false to
 * the screen
 * 
 * @author Rei Yamamoto
 *
 */
public class Palindrome {

  /**
   * tests out the isPalindrome method
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));

  }

  /**
   * tests to see if the word is a palindrome
   * 
   * @param s
   *          the string you want to test
   * @return true if if it is a palindrome false if it is a palindrome
   */
  public static boolean isPalindrome(String s) {
    if (s.length() == 1 || s.length() == 0) {
      return true;
    } else {
      if (s.charAt(0) == s.charAt(s.length() - 1)) {
        return true && isPalindrome(s.substring(1, s.length() - 1));
      } else {
        return false;
      }

    }

  }
}
