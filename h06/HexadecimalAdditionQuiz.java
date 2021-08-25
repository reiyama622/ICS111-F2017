package edu.ics111.h06;

import edu.ics111.h07.TextIO;

/**
 * Gives you a hexadecimal addition quiz and grades your quiz.
 * 
 * @author Rei Yamamoto assisted by Branden Ogata
 *
 */
public class HexadecimalAdditionQuiz {
  /**
   * Gives you an addition quiz with Hexadecimal numbers It provides, grades, and
   * returns your score
   */
  private static int[] firstNumbers; // The first numbers in all ten questions.
  private static int[] secondNumbers; // The second numbers in all ten questions.
  private static int[] userAnswers; // The user's answers to the ten questions.

  /**
   * Creates, gives, and grades the addition quiz
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {

    System.out.println();
    System.out.println("This is the Hexadecimal Quiz");
    System.out.println();
    createQuiz();
    giveQuiz();
    gradeQuiz();
  }

  /**
   * Creates the questions for the quiz
   */
  private static void createQuiz() {
    firstNumbers = new int[10]; // first array of numbers
    secondNumbers = new int[10]; // second array of numbers
    for (int i = 0; i < 10; i++) { // assigns values to array
      firstNumbers[i] = (int) (Math.random() * 50 + 1);
      secondNumbers[i] = (int) (Math.random() * 50);
    }
  }

  /**
   * Gets the users answers and stores it in an array
   */
  private static void giveQuiz() {
    userAnswers = new int[10];
    for (int i = 0; i < 10; i++) {
      int questionNum = i + 1;
      System.out.printf("Q%2d: %2X + %2X  = ", questionNum, firstNumbers[i], secondNumbers[i]);
      userAnswers[i] = getHexValue(TextIO.getlnString());

    }
  }

  /**
   * converts characters into int
   * 
   * @param ch
   *          char is the character that you want to convert
   * @return integer value of the character
   */
  public static int hexValue(char ch) {
    switch (ch) {
    case '0':
      return 0;
    case '1':
      return 1;
    case '2':
      return 2;
    case '3':
      return 3;
    case '4':
      return 4;
    case '5':
      return 5;
    case '6':
      return 6;
    case '7':
      return 7;
    case '8':
      return 8;
    case '9':
      return 9;
    case 'a':
    case 'A':
      return 10;
    case 'b':
    case 'B':
      return 11;
    case 'c':
    case 'C':
      return 12;
    case 'd':
    case 'D':
      return 13;
    case 'e':
    case 'E':
      return 14;
    case 'f':
    case 'F':
      return 15;
    default:
      return -1;
    }
  }

  /**
   * gets the hexadecimal value of the string
   * 
   * @param str
   *          the string that you want to change
   * @return the value of the hexadecimal number
   */
  public static int getHexValue(String str) {
    int value = 0;
    for (int i = 0; i < str.length(); i++) {
      value = value * 16 + hexValue(str.charAt(i));
    }
    return value;
  }

  /**
   * grades the users answers and prints out how many the user got correct
   */
  private static void gradeQuiz() {
    System.out.println();
    System.out.println("Here are the correct answers:");
    int numberCorrect = 0;
    int grade;
    for (int i = 0; i < 10; i++) {
      int questionNum = i + 1;
      int correctAnswer = firstNumbers[i] + secondNumbers[i];
      System.out.printf("   Question %2d: %2X + %2X  =  %2d.  ", questionNum, firstNumbers[i], secondNumbers[i],
          correctAnswer);
      if (userAnswers[i] == correctAnswer) {
        System.out.println("Correct");
        numberCorrect++;
      } else {
        System.out.println(userAnswers[i] + " is not correct.");
      }
    }
    grade = numberCorrect * 10; // grade out of 100 percent
    System.out.println();
    System.out.println("You got " + numberCorrect + " correct.");
    System.out.println("You got a " + grade + "%");
    System.out.println();
  }
}
