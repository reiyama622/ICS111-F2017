package LabWork;

/** Swaps the values of the first and second array
 * @author Rei Yamamoto
 *
 */
public class SwapArrays {
  
  
  /**Swaps the values of the first and second array
   * @param args
   */
  public static void main(String[] args) {
    int first[] = {1, 2, 3};
    int second[] = {4, 5, 6};
    swap(first, second);
  }
  /** Puts the values of first[] into holder[]. Then second[] into first[]. Then holder[] into second[]
   * 
   */
  public static void swap(int first[], int second[]) {
    int holder[] = new int[first.length];
    int i;
    for (i = 0; i < first.length; i++) {
      holder[i] = first[i];
      //System.out.println(holder[i]);
    }
    System.out.println("First array is ");
    for (i = 0; i < second.length; i++) {
      first[i] = second[i];
      System.out.println(first[i]);
    }
    System.out.println();
    System.out.println("Second array is ");
    for (i = 0; i < holder.length; i++) {
     second[i] = holder[i];
     System.out.println(second[i]);
     
    }
  }
}
