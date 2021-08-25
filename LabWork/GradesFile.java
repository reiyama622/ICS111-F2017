/**
 * 
 */
package LabWork;

/** Program that reads a file with names and grades and calculates the average of the grades
 * @author Rei Yamamoto
 *
 */
public class GradesFile {

  /**Program that reads a file with names and grades and calculates the average of the grades
   * @param args
   */
  public static void main(String[] args) {
    TextIO.readFile("./src/LabWork/grades.txt");
    double sum = 0;
    int count = 0;
    double average = 0;
    while (!TextIO.eof()) {
        TextIO.getWord();
        double grades = TextIO.getlnDouble();
        sum = grades + sum;
        count++;
    }
    average = (double) sum / count;
    System.out.println("average: " + average);
  }
}
