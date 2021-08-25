/**
 * 
 */
package LabWork;

/** Program that asks the user to guess the number that the random number generated.
 * @author Rei Yamamoto
 *
 */
public class Loop {

  /** Program that asks the user to guess the number that the random number generated.
   * @param args
   */
  public static void main(String[] args) {
    int number;
    number= (int) (Math.random() * 10 +  1);
    System.out.println("Guess a number between 1 and 10");
    int userGuess;
    userGuess=TextIO.getlnInt();
    while (userGuess != number){
      if (userGuess < number) {
        System.out.println("Your guess is too low.");
      }
      else if (userGuess > number) {
        System.out.println("Your guess is too high.");
      }
      System.out.println("Guess again.");
      userGuess = TextIO.getInt();
    }
    System.out.print("Congratulations you guessed it!");

  }

}
