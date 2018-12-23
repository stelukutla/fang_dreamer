package com.fang.dreamer.strings;

/**
 * Given two strings, base and remove, return a version of the base string where all instances of
 * the remove string have been removed (not case sensitive). You may assume that the remove string
 * is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
 * "x".
 *
 * <p>withoutString("Hello there", "llo") → "He there" withoutString("Hello there", "e") → "Hllo
 * thr" withoutString("Hello there", "x") → "Hello there"
 */
public class StringReplace_Non_CS {
  public static void main(String[] args) {
    String base = "Hi HoHo";
    String remove = "Ho";

    String text = withOutTex(base, remove);
    System.out.println("Input : "+ base + ", " + "Output : " + text);
  }

  /**
   * Remove the text from the given string
   *
   * @param base
   * @param remove
   * @return
   */
  public static String withOutTex(String base, String remove) {
      String returnString = base;
      int foundStrLen = 0;
      for (int i = 0; i < base.length(); i++) {
        for (int j = 0; j < remove.length(); j++) {
          if ((i + foundStrLen) < base.length()
                  && String.valueOf(base.charAt(i + foundStrLen))
                  .toUpperCase()
                  .equals(String.valueOf(remove.charAt(j)).toUpperCase())) {
            foundStrLen++;
          } else break;
        }
        if (foundStrLen == remove.length()) {
          String text = base.substring(i, i + foundStrLen);
          returnString = returnString.replace(text, "");
          foundStrLen = 0;
        } else foundStrLen = 0;
      }
      return returnString;
    }
}
