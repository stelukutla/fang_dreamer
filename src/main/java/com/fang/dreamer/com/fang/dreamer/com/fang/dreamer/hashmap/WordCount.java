package com.fang.dreamer.com.fang.dreamer.com.fang.dreamer.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a
 * key for each different string, with the value the number of times that string appears in the
 * array.
 *
 * <p>wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1} wordCount(["c", "b", "a"]) →
 * {"a": 1, "b": 1, "c": 1} wordCount(["c", "c", "c", "c"]) → {"c": 4}
 *
 * <p>References : 1) https://codingbat.com/prob/p117630 2)
 * https://techdevguide.withgoogle.com/paths/foundational/wordcount-problem-classic-algorithm-hard/#!
 */
public class WordCount {

  public static void main(String[] args) {
    System.out.println(wordCount(new String[] {"a", "b", "a", "c", "b"}).toString());
  }

  /**
   * Do the word count for the given stings list and store in HashMap.
   *
   * @param strings
   * @return
   */
  public static Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i])) {
        map.put(strings[i], map.get(strings[i]) + 1);
      } else map.put(strings[i], 1);
    }
    return map;
  }
}

//
//        Expected	Run
//        wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}	{"a": 2, "b": 2, "c": 1}
//	OK
//        wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}	{"a": 1, "b": 1, "c": 1}	OK
//        wordCount(["c", "c", "c", "c"]) → {"c": 4}	{"c": 4}	OK
//        wordCount([]) → {}	{}	OK
//        wordCount(["this", "and", "this", ""]) → {"": 1, "and": 1, "this": 2}	{"": 1, "and": 1,
// "this": 2}	OK
//        wordCount(["x", "y", "x", "Y", "X"]) → {"x": 2, "X": 1, "y": 1, "Y": 1}	{"x": 2, "X": 1,
// "y": 1, "Y": 1}	OK
//        wordCount(["123", "0", "123", "1"]) → {"0": 1, "1": 1, "123": 2}	{"0": 1, "1": 1, "123":
// 2}	OK
//        wordCount(["d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f",
// "x", "two", "b", "one", "two"]) → {"a": 4, "b": 5, "d": 3, "e": 1, "f": 1, "one": 1, "x": 2, "z":
// 2, "two": 2}	{"a": 4, "b": 5, "d": 3, "e": 1, "f": 1, "one": 1, "x": 2, "z": 2, "two": 2}	OK
//        wordCount(["apple", "banana", "apple", "apple", "tea", "coffee", "banana"]) → {"banana":
// 2, "apple": 3, "tea": 1, "coffee": 1}	{"banana": 2, "apple": 3, "tea": 1, "coffee": 1}	OK
//        other tests
//        OK
//
//        All Correct
