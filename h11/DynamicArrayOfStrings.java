/**
 * 
 */
package edu.ics111.h11;

/**
 * Dynamic array of Strings that adds, removes, sets, gets, gets the index of,
 * converts to string, and sorts the array
 * 
 * @author Rei Yamamoto
 *
 */
public class DynamicArrayOfStrings implements ICS111List, Sortable {
  /** string array
   * 
   */
  private String[] array;
  /** size of the array
   * 
   */
  private int size;

  /**array of strings with 10 spots and 0 things in the array
   * 
   */
  public DynamicArrayOfStrings() {
    array = new String[10];
    size = 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#size()
   */
  @Override
  public int size() {
    return size;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#add(java.lang.String)
   */
  @Override
  public boolean add(String s) {
    if (size == array.length) {
      String[] temp = new String[(array.length * 2)];
      for (int i = 0; i < size; i++) {
        temp[i] = array[i];
      }
      array = temp;
    }
    array[size] = s;
    size++;
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#add(int, java.lang.String)
   */
  @Override
  public boolean add(int index, String s) {
    if (size == array.length) {
      String[] temp = new String[(array.length * 2)];
      for (int i = 0; i < size; i++) {
        temp[i] = array[i];
        temp[index] = s;
        size++;

      }
    }
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#get(int)
   */
  @Override
  public String get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Illegal index, " + index);
    }
    return array[index];
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#set(int, java.lang.String)
   */
  @Override
  public String set(int index, String s) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Illegal index, " + index);
    }
    String x = array[index];
    array[index] = s;
    return x;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#remove(int)
   */
  @Override
  public String remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Illegal index, " + index);
    }
    String x = array[index];
    for (int j = index - 1; j < size; j++)
      array[j - 1] = array[j];
    size--;
    // System.out.println(remove(array));
    return x;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#remove(java.lang.String)
   */
  @Override
  public boolean remove(String s) {
    for (int i = 0; i <= size; i++) {
      if (array[i].equals(s)) {
        for (int j = i - 1; j < size;) {
          array[i] = array[j];
          size--;
          return true;
        }
      }

    }
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.ICS111List#indexOf(java.lang.String)
   */
  @Override
  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    String str = "array: ";
    for (int i = 0; i < size; i++) {
      str += array[i] + ", ";
    }
    return str;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.ics111.h11.Sortable#sort()
   */
  public void sort() {
    // Sort the array A into increasing order.

    int itemsSorted; // Number of items that have been sorted so far.

    for (itemsSorted = 1; itemsSorted < array.length; itemsSorted++) {
      // Assume that items A[0], A[1], ... A[itemsSorted-1]
      // have already been sorted. Insert A[itemsSorted]
      // into the sorted part of the list.

      String temp = array[itemsSorted]; // The item to be inserted.
      int loc = itemsSorted - 1; // Start at end of list.

      while (loc >= 0 && array[loc].compareTo(temp) > 0) {
        array[loc + 1] = array[loc]; // Bump item from A[loc] up to loc+1.
        loc = loc - 1; // Go on to next location.
      }

      array[loc + 1] = temp; // Put temp in last vacated space.
    }
  }
}
