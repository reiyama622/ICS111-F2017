/**
 * 
 */
package edu.ics111.h04;

import LabWork.TextIO;

/** Program that reads a file and calculates the average amount spent by visitors 
 * @author Rei Yamamoto assisted by Carleton Moore
 *
 */
public class ProcessInputFile {

  /** Program that reads a file and calculates the average amount spent by visitors 
   * @param args
   */
  public static void main(String[] args) {
    TextIO.readFile("./src/edu/ics111/h04/visitors.dat");
    int totalVisitors = 0;
    double totalMoney = 0.0;
    int missingCountries = 0;

    while (!TextIO.eof()) {
      TextIO.getWord();
      try{
        int numVisitors = TextIO.getInt();
        TextIO.getChar();
        double moneySpent = TextIO.getlnDouble();
        totalVisitors = numVisitors + totalVisitors;
        totalMoney = moneySpent + totalMoney;
        
      }
      catch (IllegalArgumentException x) {
        TextIO.getln();
        missingCountries++;
      }     
    }
    double average = (double) totalMoney/totalVisitors;
    System.out.println("Total number of missing countries "+ missingCountries);
    System.out.println("Average is " + average);
    
  }
}

