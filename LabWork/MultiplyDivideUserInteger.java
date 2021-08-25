package LabWork;

/**
 * 
 */

/**Program that asks the user to input an integer then multiplies it by 10.
 * Then asks for two floating point numbers and prints the first number divided by the second.
 * @author Rei Yamamoto
 *
 */
public class MultiplyDivideUserInteger {

 /**Program that asks the user to input an integer then multiplies it by 10.
  * Then asks for two floating point numbers and prints the first number divided by the second.
  * @param args
  */
 public static void main(String[] args) {
  int userInteger;
  double floatingPtOne;
  double floatingPtTwo;
  int temp;
  System.out.println("Please input a whole number");
  userInteger= TextIO.getInt();
  System.out.println(userInteger * 10);
  System.out.println("Please input a number that includes a decimal");
  floatingPtOne= TextIO.getlnDouble();
  System.out.println("Please input a number that includes a decimal");
  floatingPtTwo= TextIO.getlnFloat();
  System.out.println(floatingPtOne / floatingPtTwo);
  System.out.println(floatingPtOne % floatingPtTwo);
  temp= (int) (floatingPtOne / floatingPtTwo);
  System.out.println(temp);
  

 }

}