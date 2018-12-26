package com.fang.dreamer.arrays;

import java.util.Arrays;

/**
 * Return an array that contains the sorted values from the input array with duplicates removed.
 *
 * <p>sort([]) → [] sort([1]) → [1] sort([1, 1]) → [1]
 *
 * <p>References : https://codingbat.com/prob/p262890
 * https://techdevguide.withgoogle.com/paths/foundational/array-sort-problem-sorted-values/#!
 */
public class RemoveDupFromSortedArray {
  public static void main(String[] args) {
    int[] a = new int[] {1, 1, 2, 2, 3, 3};

    System.out.println(Arrays.toString(removeDuplicatesFromSortedArray(a)));
  }

  /**
   * Remove the duplicates from the given sorted integer array.
   *
   * Time Complexity O(n)
   * Space Complexity O(n)
   *
   * @param a
   * @return
   */
  public static int[] removeDuplicatesFromSortedArray(int[] a) {

    int duplicateCount = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] == a[i - 1]) {
        duplicateCount++;
      }
    }

    int[] temp = new int[a.length - duplicateCount];

    if (a.length > 0) {
      temp[0] = a[0];
    }

    int tempIndex = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] != temp[tempIndex]) {
        temp[++tempIndex] = a[i];
      }
    }

    return temp;
  }
}
