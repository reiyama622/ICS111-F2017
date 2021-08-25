package LabWork;

/**
 * 
 */

/**
 * @author Rei Yamamoto
 *
 */
public class UserInteger {

 /**Java class that reads in two integers from the user, and shows the results of adding, subtracting, multiplying, and dividing the numbers.
  * @param args
  */
 public static void main(String[] args) {
  int firstinput;
  int secondinput;
  System.out.println("pick one number");
  firstinput= TextIO.getInt();
  System.out.println("pick another number");
  secondinput= TextIO.getInt();
  System.out.println("Addition:" + (firstinput + secondinput));
  System.out.println("Subtraction:" + (firstinput - secondinput));
  System.out.println("Multiplication:" + (firstinput * secondinput));
  System.out.println("Modulus Division:" + (firstinput % secondinput));
  System.out.println("Integer  Division:" + (firstinput / secondinput));
  System.out.println("Floating Point Division:" + ((float)firstinput / (float)secondinput));

 }

}
