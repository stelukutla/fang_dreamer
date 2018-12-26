package com.fang.dreamer.strings;

/**
 *
 Fix this duplicate collapsing code: public String collapseDuplicates(String a) { int i = 0; String result = ""; while (i < a.length()) { char ch = a.charAt(i); result += ch; while (a.charAt(i+1) == ch) { i++; } i++; } return result; }


 collapseDuplicates("a") → "a"
 collapseDuplicates("aa") → "a"
 collapseDuplicates("abc") → "abc"

 References :
 https://codingbat.com/prob/p256268
 https://techdevguide.withgoogle.com/paths/foundational/collapseduplicates-problem-fix/#!

 */
public class CollapseDuplicates {

  public static void main(String[] args) {
    System.out.println(collapseDuplicates("aaabbacaaabbbaaa"));
  }

  public static String collapseDuplicates(String a) {
    int i = 0;
    String result = "";

    while (i < a.length()) {
      char ch = a.charAt(i);
      result += ch;
      while (i + 1 < a.length() && a.charAt(i + 1) == ch) {
        i++;
      }
      i++;
    }
    return result;
  }
}

//        collapseDuplicates("a") → "a"	"a"	OK
//        collapseDuplicates("aa") → "a"	"a"	OK
//        collapseDuplicates("abc") → "abc"	"abc"	OK
//        collapseDuplicates("abbbc") → "abc"	"abc"	OK
//        collapseDuplicates("abbbcaaa") → "abca"	"abca"	OK
//        collapseDuplicates("abbbcaaaccc") → "abcac"	"abcac"	OK
//        other tests
//        OK
