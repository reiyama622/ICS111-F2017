/**
 * 
 */
package LabWork;
/**Program that reads integers from an input file then calculates and print the average of the integers.
 * @author Rei Yamamoto
 *
 */
public class ReadInputFile {

  /**Program that reads integers from an input file then calculates and print the average of the integers.
   * @param args
   */
  public static void main(String[] args) {
    TextIO.readFile("./src/LabWork/numbers.txt");
    int sum = 0;
    int count = 0;
    double average = 0;
    while(!TextIO.eof()) {
      try {
        sum += TextIO.getInt();
        count++;
      }
     catch (IllegalArgumentException x) {
       TextIO.getln();
     }     
    }
    average = (double) sum / count;
    System.out.println("average: " + average);

}
}