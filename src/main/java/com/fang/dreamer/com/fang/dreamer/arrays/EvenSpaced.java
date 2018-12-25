package com.fang.dreamer.com.fang.dreamer.arrays;

import java.util.Arrays;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the
 * three values are evenly spaced, so the difference between small and medium is the same as the
 * difference between medium and large.
 *
 * <p>evenlySpaced(2, 4, 6) → true evenlySpaced(4, 6, 2) → true evenlySpaced(4, 6, 3) → false
 *
 * <p>References : https://codingbat.com/prob/p198700
 */
public class EvenSpaced {
  public static void main(String[] args) {
    System.out.println(evenlySpaced(6, 2, 4));
  }

  /**
   * Find the if the provided numbers are evenly spaced.
   *
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static boolean evenlySpaced(int a, int b, int c) {
    int[] tempArr = new int[] {a, b, c};
    Arrays.sort(tempArr);
    if (tempArr[0] - tempArr[1] == tempArr[1] - tempArr[2]) return true;
    else return false;
  }
}
