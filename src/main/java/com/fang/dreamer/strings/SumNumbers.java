package com.fang.dreamer.strings;

/**
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other
 * characters. A number is a series of 1 or more digit chars in a row. (Note:
 * Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 *
 * <p>sumNumbers("abc123xyz") → 123 sumNumbers("aa11b33") → 44 sumNumbers("7 11") → 18
 *
 * <p>References : https://codingbat.com/prob/p121193
 * https://techdevguide.withgoogle.com/paths/foundational/subnumbers-problem-string-return-sum/#!
 */
public class SumNumbers {
  public static void main(String[] args) {
    String sample = "aa11b33";
    System.out.println("Output : " + sumNumbers(sample));
  }

  /**
   * Sum the numbers in the given string.
   * @param str
   * @return
   */
  public static int sumNumbers(String str) {
    int sum = 0;
    StringBuffer str_number = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        str_number.append(str.charAt(i));
      } else if (str_number.length() > 0) {
        sum = sum + Integer.parseInt(str_number.toString());
        str_number = new StringBuffer();
      }
    }
    if (str_number.length() > 0) {
      sum = sum + Integer.parseInt(str_number.toString());
      return sum;
    }
    return sum;
  }
}
