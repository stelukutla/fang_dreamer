package com.fang.dreamer.strings;

/** String replacle with give the string and given string is non case sensitive. */
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
