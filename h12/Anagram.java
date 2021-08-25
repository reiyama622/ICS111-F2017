/**
 * 
 */
package edu.ics111.h12;

import edu.ics111.h07.TextIO;

/**
 * finds and prints all the anagrams of the given string
 * 
 * @author Rei Yamamoto
 * used code from https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
 *
 */
public class Anagram {

  /**
   * runs the printAnagrams method 
   * prints all the variations for the word car to the screen
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    System.out.println("Enter a word to find the anagram");
    String answer = TextIO.getln();
    printAnagrams("", answer);
  }

  /**
   * finds all the anagrams of a word
   * used code from https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
   * @param prefix
   *          the letters before the word
   *          does not switch around
   * @param word
   *          the word you would like to find all the anagrams of
   */
  public static void printAnagrams(String prefix, String word) {
    if (word.length() == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < word.length(); i++)
        printAnagrams(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
    }
  }
}
