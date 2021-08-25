package edu.ics111.h11;

/**Taken from ICS 111 website
 * @author Cam Moore
 *
 */
public interface ICS111List {
  /**
   * return the number of strings in the array.
   * 
   * @return the size of the array
   */
  int size();

  /**
   * Adds s to the end of the array. Returns true.
   * 
   * @param s
   *          item to be added to the array
   * @return true
   */
  boolean add(String s);

  /**
   * Inserts s into position index
   * 
   * @param index
   *          the position where the item will be added
   * @param s
   *          the item to be added
   * @return false
   */
  boolean add(int index, String s);

  /**
   * Returns the string at index.
   * 
   * @param index
   *          the position we want to get
   * @return the string at index
   */
  String get(int index);

  /**
   * Replaces the string at index with s. Returns old value.
   * 
   * @param index
   *          the position of the item we want to replace
   * @param s
   *          the item to replace it with
   * @return the old value at position index
   */
  String set(int index, String s);

  /**
   * Removes the string at index. Returns string.
   * 
   * @param index
   *          place of the item we want to remove
   * @return the string at the given position
   */
  String remove(int index);

  /**
   * Removes s from the array, returns true if s was in the array.
   * 
   * @param s
   *          item to be removed from the array
   * @return true if s was in the array
   */
  boolean remove(String s);

  int indexOf(String s); // Returns the index of s or -1 if s is not in the array.

  /**
   * Returns a string representation of the array.
   * 
   * @return
   */
  String toString();
}