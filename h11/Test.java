package edu.ics111.h11;

import java.util.Random;

/**
 * Some basic tests of the DynamicArrayOfStrings class.
 * 
 * @author Cam Moore
 */

public class Test {

  /** Holds the symbols for random strings. */
  private static final char[] symbols;
  /** Generates random numbers. */
  private static final Random random = new Random();

  /* Initialize the characters to use in random Strings. */
  static {
    StringBuilder tmp = new StringBuilder();
    for (char ch = '0'; ch <= '9'; ++ch)
      tmp.append(ch);
    for (char ch = 'a'; ch <= 'z'; ++ch)
      tmp.append(ch);
    for (char ch = 'A'; ch <= 'Z'; ++ch)
      tmp.append(ch);
    symbols = tmp.toString().toCharArray();
  }

  /**
   * Tests the DynamicArrayOfStrings class.
   * 
   * @param args
   *          not used.
   */
  public static void main(String[] args) {
    DynamicArrayOfStrings array = new DynamicArrayOfStrings();
    int size = array.size();
    if (size != 0) {
      System.err.printf("1Got wrong size %d expecting 0\n", size);
    }
    array.add(randomString(random.nextInt(10) + 1));
    size = array.size();
    if (size != 1) {
      System.err.printf("2Got wrong size %d expecting 1\n", size);
    }
    for (int i = 0; i < 9; i++) {
      array.add(randomString(random.nextInt(10) + 1));
    }
    size = array.size();
    if (size != 10) {
      System.err.printf("3Got wrong size %d expecting 10\n", size);
    }
    array.sort();
    for (int i = 0; i < array.size() - 1; i++) {
      if (array.get(i).compareTo(array.get(i + 1)) > 0) {
        System.err.printf("Array not sorted properly");
      }
    }
    System.out.println(array);
    array.remove(5);
    size = array.size();
    if (size != 9) {
      System.err.printf("4Got wrong size %d expecting 9\n", size);
    }
    for (int i = 0; i < array.size() - 1; i++) {
      if (array.get(i).compareTo(array.get(i + 1)) > 0) {
        System.err.printf("Array not sorted properly");
      }
    }
    String s = array.get(7);
    int index = array.indexOf(s);
    if (index != 7) {
      System.err.printf("5Got the wrong index %d should be 7\n", index);
    }
    array.remove(s);
    index = array.indexOf(s);
    if (index != -1) {
      System.err.printf("6Got the wrong index %d should be -1\n", index);
    }
    size = array.size();
    if (size != 8) {
      System.err.printf("7Got wrong size %d expecting 8\n", size);
    }
  }

  /**
   * Generates a random String of the given length.
   * 
   * @param length
   *          the length of the String.
   * @return A random String.
   */
  private static String randomString(int length) {
    if (length < 1)
      throw new IllegalArgumentException("length < 1: " + length);
    char[] buf = new char[length];
    for (int idx = 0; idx < buf.length; ++idx)
      buf[idx] = symbols[random.nextInt(symbols.length)];
    return new String(buf);
  }
}
