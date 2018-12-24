package com.fang.dreamer.strings;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 * <p>stringSplosion("Code") → "CCoCodCode" stringSplosion("abc") → "aababc" stringSplosion("ab") →
 * "aab"
 *
 * References :
 * https://codingbat.com/prob/p117334
 * https://techdevguide.withgoogle.com/paths/foundational/stringsplosion-problem-ccocodcode/#!
 */
public class StringSplosion {
  public static void main(String[] args) {
    System.out.println(stringSplosion("Sankara"));
  }

  /**
   * Get the sring splosion for the given string.
   * @param str
   * @return
   */
  public static String stringSplosion(String str){
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
      stringBuffer.append(str.substring(0,i+1));
    }
    return stringBuffer.toString();
  }
}
